public class MountainBike extends Bicycle {
    
    // the MountainBike subclass adds one field
    public int seatHeight;

    // Default Constructor
    public MountainBike(int cadence, int gear, int speed, int seatHeight) {
        super (cadence, gear, speed);
        this.seatHeight = 0;

    	
    }
    // Paramiterised constructor
   public MountainBike(int startHeight) {
           this.seatHeight = startHeight;
        System.out.println("I just created a mountain bike!");
   }  
    
    // Paramiterised constructor using super keyword 
        
    // Getters and Setters
}
