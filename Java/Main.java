package Java;

class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    Car car = new Car("AMQ123", new Account("Andres Herrera", "Asf2122"));
    car.passengers = 4;
    car.printDataCard();

    Car car2 = new Car("JKL345", new Account("Dana", "sadasd353"));
    car2.passengers = 2;
    car2.printDataCard();;
  }
}