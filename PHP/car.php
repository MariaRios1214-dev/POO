<?php
class Car {
  public $id;
  public $license;
  public $driver;
  protected $passengers;
  
  public function __construct($license, $driver){
    $this-> license = $license;
    $this-> driver = $driver;
  }

  public function PrintDataCar(){
    echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
  }
  public function getPassengers(){
    return $this->passengers;
  }

  public function setPassengers($passengers) {      
        
    if ($passengers == 4) {
        $this->passengers = $passengers;
    }
    else {
        echo "Necesitas asignar 4 pasajeros";
    }

  }
}
?>