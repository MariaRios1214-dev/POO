package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
  Map<String, Map<String,Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;

  // public UberVan(String license, Driver driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
  //   super(license, driver);
  //   this.typeCarAccepted = typeCarAccepted;
  //   this.seatsMaterial = seatsMaterial;
  // }

  public UberVan(String license, Driver driver){
    super(license, driver);
  }

  @Override
  public Integer getPassengers() {
    return super.getPassengers();
  }

  public void setPassengers(Integer passengers) {
    if(passengers == 6){
      this.passengers = passengers;
    } else {
      System.out.println("Necesitas 6 pasajeros");
    }
  }

}