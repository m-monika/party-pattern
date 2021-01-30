package mmonika.partypattern.organization;

import java.time.LocalDate;

class OrganizationName {
    private final String name;
    private final LocalDate validFrom;
    private final LocalDate validTo;

    OrganizationName(String name, LocalDate validFrom, LocalDate validTo) {
        this.name = name;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public String getName() {
        return name;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }
}
