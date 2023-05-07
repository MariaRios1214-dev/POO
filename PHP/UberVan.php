<?php
class UberVan extends Car {
  public $typeCarAccepted;
  public $seatsMaterial;

  // public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
  //   parent:: __construct($license,$driver);
  //   $this -> typeCarAccepted = $typeCarAccepted;
  //   $this -> seatsMaterial = $seatsMaterial;
  // }
  public function __construct($license, $driver){
    parent:: __construct($license,$driver);
    
  }

  public function setPassengers($passengers) {
    
    if ($passengers == 6) {
        $this->passengers = $passengers;
    }
    else {
        echo "Necesitas asignar 6 pasajeros ";
    }

}
}
?>