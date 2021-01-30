package mmonika.partypattern.organization;

public class Organization {
    private final OrganizationName organizationName;

    public Organization(OrganizationName organizationName) {
        this.organizationName = organizationName;
    }

    public OrganizationName getOrganizationName() {
        return organizationName;
    }
}
