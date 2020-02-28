package Hyperskill.PatternsConstructorsOverloadMethods;

/*There are two classes: SuperClass and SubClass. Each class has a field and a method.
 */

public class SuperClass {
    protected int field;

    protected int getField() {
        return field;
    }

    protected void printBaseValue() {
        System.out.println(field);
    }
}

class SubClass extends SuperClass {

    protected int field;

    public SubClass() {
        this.field = 10;  // It initializes the field of SubClass
        field = 20;       // It also initializes the field of SubClass
        super.field = 30; // It initializes the field of SuperClass
    }

    /**
     * It prints the value of SuperClass and then the value of SubClass
     */
    public void printSubValue() {
        super.printBaseValue(); // It invokes the method of SuperClass, super is optional here
        System.out.println(field);
    }
}
