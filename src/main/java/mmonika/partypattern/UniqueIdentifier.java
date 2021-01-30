package mmonika.partypattern;

import java.util.UUID;

public class UniqueIdentifier {
    public String getIdentifier() {
        return UUID.randomUUID().toString();
    }
}
