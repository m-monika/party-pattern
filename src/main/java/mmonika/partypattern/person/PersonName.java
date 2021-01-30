package mmonika.partypattern.person;

import java.time.LocalDateTime;

class PersonName {
    private final String givenName;
    private final String familyName;
    private final LocalDateTime validFrom;
    private final LocalDateTime validTo;

    public PersonName(String givenName, String familyName, LocalDateTime validFrom, LocalDateTime validTo) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public LocalDateTime getValidTo() {
        return validTo;
    }
}
