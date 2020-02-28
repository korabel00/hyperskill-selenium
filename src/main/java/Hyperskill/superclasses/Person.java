package Hyperskill.superclasses;

import java.util.Date;

class Person {

    protected String name;
    protected int yearOfBirth;
    protected String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Client extends Person {

    protected String contractNumber;
    protected boolean gold;

    // public getters and setters for all fields
}

class Employee extends Person {

    protected Date startDate;
    protected Long salary;

    // public getters and setters for all fields
}


class Run {

    public static void printNames(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {

        Person person = new Employee();
        person.setName("Ginger R. Lee");

        Person client = new Client();
        client.setName("Pauline E. Morgan");

        Person employee = new Employee();
        employee.setName("Lawrence V. Jones");

        Person[] persons = {person, client, employee};
        printNames(persons);
    }
}