package Java;

class Car {
  Integer id;
  String license;
  Account driver;
  Integer passengers;

  public Car(String license, Account driver){
    this.license = license;
    this.driver= driver;
  }

  void printDataCard(){
    System.out.println("License: " + license + " --- Name driver: " + driver.name);
  }
}
