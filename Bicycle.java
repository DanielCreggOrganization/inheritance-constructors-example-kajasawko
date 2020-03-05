public class Bicycle {

	// the Bicycle class has three fields
	private int cadence;
	private int gear;
	private int speed;

//     //Default constructor
public Bicycle(){

    System.out.println("I just created a bicycle");

}



	// Parameterised constructor
	public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        System.out.println("I just created a bike");
        
	}


	
    // Getters and Setters here
        public void setCadence(int cadence ) {
            this.cadence = cadence;
        }

        public int getCadence(){
            return cadence;
        }




        public void setGear(int gear ) {
            this.gear = gear;
        }

        public int getGear(){
            return gear;
        }




        public void setSpeed(int speed ) {
            this.speed = speed;
        }

        public int getSpeed(){
            return speed;
        }

    


	// Extra methods here
	public void applyBrake(int speedDecrement) {
		speed -= speedDecrement;
	}

	public void speedUp(int speedIncrement) {
		speed += speedIncrement;
	}

}
