package Java;

class Car {
  private Integer id;
  private String license;
  private Driver driver;
  protected Integer passengers;

  public Car(String license, Driver driver){
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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }
}
