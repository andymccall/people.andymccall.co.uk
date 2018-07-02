package uk.co.andymccall.people.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "ppl_emailaddress")
public class EmailAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emailAddressId", columnDefinition = "serial")
    private Long emailAddressId;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "contactType")
    private ContactType contactType;

    @Column(name = "isVerified")
    private Boolean isVerified;

    @Column(name = "verificationKey")
    private UUID verificationKey;

    @Column(name ="verificationDate")
    private LocalDate verificationDate;

    public EmailAddress() {
        generateVerificationKey();
        setVerified(false);
    }

    public EmailAddress(String emailAddress, ContactType contactType) {
        this.emailAddress = emailAddress;
        this.contactType = contactType;
        generateVerificationKey();
        setVerified(false);
    }

    public Long getEmailAddressId() {
        return emailAddressId;
    }

    public void setEmailAddressId(Long emailAddressId) { this.emailAddressId = emailAddressId; }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
        if (this.isVerified) {
            setVerificationDate(LocalDate.now());
        }
    }

    public UUID getVerificationKey() {
        return verificationKey;
    }

    public void setVerificationKey(UUID verificationKey) {
        this.verificationKey = verificationKey;
    }

    public LocalDate getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(LocalDate verificationDate) {
        this.verificationDate = verificationDate;
    }

    public void generateVerificationKey() {
            setVerificationKey(UUID.randomUUID());

    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "emailAddressId=" + emailAddressId +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactType=" + contactType +
                ", isVerified=" + isVerified +
                ", verificationKey=" + verificationKey +
                ", verificationDate=" + verificationDate +
                '}';
    }
}
