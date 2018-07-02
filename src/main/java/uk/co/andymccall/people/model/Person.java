package uk.co.andymccall.people.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Entity
@Table(name = "ppl_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personId", columnDefinition = "serial")
    private Long personId;

    @ManyToOne
    @JoinColumn(name = "titleId")
    private Title title;

    @Column(name = "firstName", length = 50)
    @Size(max = 50)
    private String firstName;

    @Column(name = "lastName", length = 50)
    @Size(max = 50)
    private String lastName;

    @Column(name = "preferredName", length = 50)
    @Size(max = 50)
    private String preferredName;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "height")
    int height;

    @Column(name = "weight")
    int weight;

    String eyeColour;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ppl_person_emailaddress", joinColumns = {@JoinColumn(name = "personId", referencedColumnName = "personId")}
            , inverseJoinColumns = {@JoinColumn(name = "emailAddressId", referencedColumnName = "emailAddressId")})
    Set<EmailAddress> emailAddresses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ppl_person_address", joinColumns = {@JoinColumn(name = "personId", referencedColumnName = "personId")}
            , inverseJoinColumns = {@JoinColumn(name = "addressId", referencedColumnName = "addressId")})
    private Set<Address> addresses;

    public Person() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        calendar.add(Calendar.HOUR, -24);

        this.dateOfBirth = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public LocalDate getBirthDate() {
        return dateOfBirth;
    }

    public int getAge() {

        // Calendar objects for "today" and "date of birth"...

        Calendar today = Calendar.getInstance();
        Calendar birthday = new GregorianCalendar();
        birthday.setTime(Date.from(dateOfBirth.atStartOfDay(ZoneId.systemDefault()).toInstant()));

        int yearDiff = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

        if (today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH))
            yearDiff = yearDiff - 1;
        else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) &&
                today.get(Calendar.DATE) < birthday.get(Calendar.DATE)) {
            yearDiff = yearDiff - 1;
        }

        return yearDiff;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public Set<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Set<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public void addEmailAddress(EmailAddress emailAddress) {
        if (this.emailAddresses == null) {
            emailAddresses = new HashSet<>();
        }
        this.emailAddresses.add(emailAddress);
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", title=" + title +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", preferredName='" + preferredName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age = " + getAge() +
                ", height=" + height +
                ", weight=" + weight +
                ", eyeColour='" + eyeColour + '\'' +
                ", emailAddresses=" + emailAddresses +
                '}';
    }
}

