package Hyperskill.strategy.pickyourteam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionContextTest {

    private Person[] hyperskill = new Person[9];

    {
        hyperskill[0] = new Person("AshAllen");
        hyperskill[1] = new Person("Bailey Cox");
        hyperskill[2] = new Person("Danni Taylor");
        hyperskill[3] = new Person("Brett Matthews");
        hyperskill[4] = new Person("Hayden Osborne");
        hyperskill[5] = new Person("Maddox Weeks");
        hyperskill[6] = new Person("Fran Russo");
        hyperskill[7] = new Person("Haiden Garrison");
        hyperskill[8] = new Person("Val Harris");
    }

    private Person[] persons = new Person[7];

    {
       persons[0] = new Person("John");
       persons[1] = new Person("Maria");
       persons[2] = new Person("Zoe");
       persons[3] = new Person("Joe");
       persons[4] = new Person("Mark");
       persons[5] = new Person("Steve");
       persons[6] = new Person("Suzan");
    }

    @Test
    void hyperSkill() {
        SelectionContext selectionContext = new SelectionContext();
        selectionContext.setAlgorithm(new TakePersonsWithStepAlgorithm(3));
        Person[] result = selectionContext.selectPersons(hyperskill);
        assertEquals("AshAllen", result[0].toString());
        assertEquals("Brett Matthews", result[1].toString());
        assertEquals("Fran Russo", result[2].toString());
    }


    @Test
    void oneLastPerson() {
        SelectionContext selectionContext = new SelectionContext();
        selectionContext.setAlgorithm(new TakeLastPersonsAlgorithm(1));
        Person[] result = selectionContext.selectPersons(persons);
        assertEquals("Suzan", result[0].toString());
    }

    @Test
    void threeLastPeople() {
        SelectionContext selectionContext = new SelectionContext();
        selectionContext.setAlgorithm(new TakeLastPersonsAlgorithm(3));
        Person[] result = selectionContext.selectPersons(persons);
        assertEquals("Mark", result[0].toString());
        assertEquals("Steve", result[1].toString());
        assertEquals("Suzan", result[2].toString());
    }

    @Test
    void stepPerson() {
        SelectionContext selectionContext = new SelectionContext();
        selectionContext.setAlgorithm(new TakePersonsWithStepAlgorithm(2));
        Person[] result = selectionContext.selectPersons(persons);

        for (Person p : result) {
            if (p != null) {
                System.out.println(p.name);
            }
        }

        assertEquals("John", result[0].toString());
        assertEquals("Zoe", result[1].toString());
        assertEquals("Mark", result[2].toString());
        assertEquals("Suzan", result[3].toString());


    }

    @Test
    void stepPerson2() {
        SelectionContext selectionContext = new SelectionContext();
        selectionContext.setAlgorithm(new TakePersonsWithStepAlgorithm(13));
        Person[] result = selectionContext.selectPersons(persons);
        assertEquals("John", result[0].toString());
    }

}