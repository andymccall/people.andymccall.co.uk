package uk.co.andymccall.people.model;

import javax.persistence.*;

/**
 * The Gender enum contains details
 * about a customers gender
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

@Entity
@Table(name = "ppl_gender")
public enum Gender {
    UNKNOWN("U"),
    MALE("M"),
    FEMALE("F"),
    WITHHELD("W");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genderId", columnDefinition = "serial")
    private int genderId;

    private final String displayName;

    Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
