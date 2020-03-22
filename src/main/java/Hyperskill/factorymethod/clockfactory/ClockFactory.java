package Hyperskill.factorymethod.clockfactory;

class ClockFactory {

    /* It produces concrete clocks corresponding their types : Digital, Sand or Mechanical */
    public Clock produce(String type) {

        switch (type) {
            case "Digital":
                return new DigitalClock();
            case "Sand":
                return new SandClock();
            case "Mech":
                return new MechanicalClock();
            default:
                System.out.println("There is no such type of clock");
        }
        return null;
    }
}