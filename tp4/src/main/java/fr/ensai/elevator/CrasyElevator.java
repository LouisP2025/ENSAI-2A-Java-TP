package fr.ensai.elevator;

import static fr.ensai.elevator.Elevator.logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrasyElevator extends Elevator{

    /**
     * Constructs a new CrazyElevator .
     * 
     * @param id         the unique identifier for the elevator
     * @param startFloor the floor where the elevator starts
     * @param capacity   the maximum number of passengers the elevator can carry
     */
    public CrasyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }

    private Random random = new Random();

    @Override
    public void move() {
        if (!destinationQueue.isEmpty()){
            
            int alea = random.nextInt(3);
            if (alea == 0) {      
                this.currentFloor = destinationQueue.removeFirst();}
            else if (alea == 1){
                this.currentFloor = destinationQueue.removeFirst();
                this.currentFloor = destinationQueue.removeFirst();
            }
        }
    }
    
    @Override
    public int unloadPassengers(Floor floor) {
        
        this.lastUnloaded.clear();

        List<Person> remaining = new ArrayList<>();
        int alea = random.nextInt(2);
        if (alea == 0) { 
            for (Person p : this.passengers) {
                if (p.getTargetFloor() == floor.getNumber()) {
                    this.lastUnloaded.add(p);
                    logger.info("Floor {}: {}{} leaves Elevator {}",
                            floor.getNumber(),
                            p.getNickname(),
                            p.getTargetFloor(),
                            this.id);
                } else {
                    remaining.add(p);
                }
            }
        }
        this.passengers = remaining;
        return this.lastUnloaded.size();
    }

}