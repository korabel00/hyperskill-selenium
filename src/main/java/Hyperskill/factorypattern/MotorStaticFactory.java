package Hyperskill.factorypattern;

import static java.lang.Character.toLowerCase;

class MotorStaticFactory {

    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or 'e' - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {
        // write your code here
        switch (toLowerCase(type)) {
            case 'p':
                return new PneumaticMotor(model, power);
            case 'h':
                return new HydraulicMotor(model, power);
            case 'e':
                return new ElectricMotor(model, power);
            case 'w':
                return new WarpDrive(model, power);
            default:
                return null;
        }
    }
}

/* Do not change code below */
abstract class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }
}

class PneumaticMotor extends Motor {

    public PneumaticMotor(String model, long power) {
        super(model, power);
    }
}

class HydraulicMotor extends Motor {

    public HydraulicMotor(String model, long power) {
        super(model, power);
    }
}

class ElectricMotor extends Motor {

    public ElectricMotor(String model, long power) {
        super(model, power);
    }
}

class WarpDrive extends Motor {

    public WarpDrive(String model, long power) {
        super(model, power);
    }
}