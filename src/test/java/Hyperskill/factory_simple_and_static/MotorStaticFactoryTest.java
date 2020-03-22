package Hyperskill.factory_simple_and_static;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorStaticFactoryTest {

    @Test
    void makePneumaticCar() {
        Motor motor = MotorStaticFactory.make('P',"Ford F500", 500);

        assertEquals("Ford F500", motor.model);
        assertEquals(500, motor.power);
        assertTrue(motor instanceof PneumaticMotor);
        assertFalse(motor instanceof HydraulicMotor);
        assertEquals("PneumaticMotor", motor.getClass().getSimpleName());
        System.out.println(motor.getClass().getSimpleName());

        System.out.println(motor.model);
        System.out.println(motor.power);
        System.out.println(motor instanceof PneumaticMotor);
        System.out.println(motor instanceof HydraulicMotor);
    }
}