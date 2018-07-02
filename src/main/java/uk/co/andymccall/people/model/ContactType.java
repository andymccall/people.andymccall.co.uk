package uk.co.andymccall.people.model;

/**
 * The ContactType enum contains details
 * about a customers contact type
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

public enum ContactType {
    PRIMARY("Primary"),
    SECONDARY("Secondary");

    private final String displayName;

    ContactType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
