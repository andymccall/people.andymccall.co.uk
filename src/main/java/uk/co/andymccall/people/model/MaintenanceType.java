package uk.co.andymccall.people.model;

public enum MaintenanceType {
    OK("OK"),
    DOWN("DOWN"),
    MAINTENANCE("MAINTENANCE");

    private final String displayName;

    MaintenanceType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
