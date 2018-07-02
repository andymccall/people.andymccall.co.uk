package uk.co.andymccall.people.model;

import javax.persistence.*;

/**
 * The Address class contains information
 * about the persons address
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-26
 */


@Entity
@Table(name = "ppl_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId", columnDefinition = "serial")
    private Long addressId;

    @Column(name = "houseNumber")
    private int houseNumber;

    @Column(name = "houseName", length = 100)
    private String houseName;

    @Column(name = "streetName", length = 100)
    private String streetName;

    @ManyToOne
    @JoinColumn(name="townId")
    private Town town;

    @ManyToOne
    @JoinColumn(name="countyId")
    private County county;

    @Column(name = "postCode", length = 10)
    private String postCode;

    @Column(name = "contactType")
    private ContactType contactType = ContactType.PRIMARY;

    public Address() {

    }

    public Address(Long addressId,
                   int houseNumber,
                   String houseName,
                   String streetName,
                   Town town,
                   County county,
                   String postCode) {
        this.addressId = addressId;
        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.streetName = streetName;
        this.town = town;
        this.county = county;
        this.postCode = postCode;
    }

    public Long getAddressId() {
        return addressId;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", houseNumber=" + houseNumber +
                ", houseName='" + houseName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", town=" + town +
                ", county=" + county +
                ", postCode='" + postCode + '\'' +
                ", contactType=" + contactType +
                '}';
    }
}

