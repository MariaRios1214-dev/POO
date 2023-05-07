package Java;

class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    Car car = new Car("AMQ123", new Driver(545454, "Andres Herrera", "Asf2122", "m@mso.co", "6565656", "125S"));
    car.setPassengers(3);
    car.printDataCard();

    UberX uberX = new UberX("JKL345", new Driver(546565, "Dana", "sadasd353", "ll@mso.co", "6565656","478SE"), "mazda", "3");
    uberX.setPassengers(4);
    uberX.printDataCard();


    UberPool uberPool = new UberPool("JKL345", new Driver(546565, "Polimorfirmo", "sadasd353", "ll@mso.co", "6565656","478SE"), "chevrolet", "pikanto");
    uberPool.setPassengers(3);
    uberPool.printDataCard();

    UberVan uberVan = new UberVan("SRER546", new Driver(545454, "Polimorfirmo Herrera", "Asf2122", "m@mso.co", "6565656", "125S"));
    uberVan.setPassengers(6);
    uberVan.printDataCard();

    Card card = new Card(2356, 452, "7/8/23", 545454);
    card.printDataPayment();

    User user = new User(63265650, "Antontia", "WDE234", "anto@antc.om", "n5s3sd");
    user.printDataUser();
    
    Driver driver = new Driver(44450, "Emilio", "AWS452", "em@antc.om", "n5s3sd", "656");
    driver.printDataDriver();



  }
}