<?php

require_once('Car.php');
require_once('Account.php');
require_once('UberVan.php');
require_once('UberX.php');

$car = new Car("AsW56", new Account("AndresHerrera", "ASD123"));

$uberX = new UberX("OJL395", new Account("Marco rios", "AND456"),"mazda", "2");
$uberX->setPassengers(6);
$uberX->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"));
$uberVan->setPassengers(6);
$uberVan->printDataCar();
?>