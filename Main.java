public class Main{
    public static void main(String[] args){
       // Bicycle bicycleObject1 = new Bicycle();

        MountainBike mountainBikeObject1 = new MountainBike(1,2,3,4);

        //System.out.println(mountainBikeObject1.seatHeight);
        System.out.println(mountainBikeObject1.seatHeight);

        mountainBikeObject1.applyBrake(12);
        System.out.println(mountainBikeObject1.getSpeed()); 
        
    }
}