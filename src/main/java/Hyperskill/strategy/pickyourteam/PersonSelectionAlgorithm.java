package Hyperskill.strategy.pickyourteam;

import java.util.Arrays;

interface PersonSelectionAlgorithm {

    Person[] select(Person[] persons);
}

class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {

    private int step;

    public TakePersonsWithStepAlgorithm(int step) {
        // write your code here
        this.step = step;
    }

    @Override
    public Person[] select(Person[] persons) {

        // write your code here
        Person[] kpersons = new Person[persons.length];
        int j = 1;

        if (step == 1 || persons.length == 1) {
            return persons;
        } else {
                kpersons[0] = persons[0];
            for (int i = step; i < persons.length; i += step) {
                kpersons[j] = persons[i];
                j++;
            }
            return kpersons;
        }
    }
}


class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {

    private int count;

    public TakeLastPersonsAlgorithm(int count) {
        // write your code here
        this.count = count;
    }

    @Override
    public Person[] select(Person[] persons) {
            // write your code here
            return Arrays.copyOfRange(persons, persons.length - count, persons.length);
    }
}

