class Vehicle {
  int passengers; // number of passengers
  int fuelcap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  void range() {
    System.out.println("The range is " + fuelcap * mpg +".");
  }

}