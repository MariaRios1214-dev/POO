package Java;

class Car {
  Integer id;
  String license;
  Account driver;
  private Integer passengers;

  public Car(String license, Account driver){
    this.license = license;
    this.driver= driver;
  }

  void printDataCard(){
    if(passengers != null)
    System.out.println("License: " + license + " --- Name driver: " + driver.name + " Passengers: " + passengers);
  }


  public Integer getPassengers(){
    return passengers;
  }

  public void setPassengers(Integer passengers){
    if(passengers == 4){
      this.passengers= passengers;
    } else {
      System.out.println("Necesitas asignar 4 pasajeros");
    }
}
}
