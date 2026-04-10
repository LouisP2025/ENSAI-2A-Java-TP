package fr.ensai.elevator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ElevatorTest {

    @Test
    void testIsFull() {
        Elevator elevator = new Elevator(1,0,2);
        elevator.addPassenger(new Person(0));
        elevator.addPassenger(new Person(0));
        assertTrue(elevator.isFull());
    }

    @Test
    void testAddDestinaton(){

        Floor floor = new Floor(1);
        Elevator elevator = new Elevator(0, 0, 4);
        elevator.addDestination(3);

        assertTrue(elevator.containDestination(3));

        elevator.addDestination(3);
        assertFalse(elevator.containDestination(3));



    }

    
}
        
        
}
    

