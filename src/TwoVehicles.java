// A program that uses the Vehicle Class

class TwoVehicles{
  public static void main(String[] args) {
    Vehicle coupe = new Vehicle(); // create a Vehicle object named coupe
    Vehicle minivan = new Vehicle(); //create a Vehicle object named minivan
    int range1, range2;


    //assign values to fields in coupe
    coupe.passengers = 2;
    coupe.fuelcap = 14;
    coupe.mpg = 35;
    range1 = coupe.fuelcap * coupe.mpg;

    //assign values to fields in minivan
    minivan.passengers = 7;
    minivan.fuelcap = 18;
    minivan.mpg = 21;
    range2 = minivan.fuelcap * minivan.mpg;

    // state the passenger amount and compute the range of a minivan assuming a full tank of gas
    System.out.println("A coupe carries " + coupe.passengers + " passengers and can travel "
        + range1 + " miles on a full tank of gas.");

    // state the passenger amount and compute the range of a minivan assuming a full tank of gas
    System.out.println("A minivan carries " + minivan.passengers + " passengers and can travel "
        + range2 + " miles on a full tank of gas.");
  }
}