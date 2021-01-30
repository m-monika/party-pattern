package mmonika.partypattern.person;

import java.time.LocalDate;

public class Person {
     private LocalDate dateOfBirth;
     private PersonName personName;
     private ISOGender gender;

    public Person(LocalDate dateOfBirth, PersonName personName, ISOGender gender) {
        this.dateOfBirth = dateOfBirth;
        this.personName = personName;
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public ISOGender getGender() {
        return gender;
    }
}
