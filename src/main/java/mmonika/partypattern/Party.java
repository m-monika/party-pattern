package mmonika.partypattern;

public class Party {
    private PartyIdentifier identifier;

    public Party(PartyIdentifier identifier) {
        this.identifier = identifier;
    }

    public PartyIdentifier getIdentifier() {
        return identifier;
    }
}
