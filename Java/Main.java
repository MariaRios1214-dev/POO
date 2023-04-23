package Java;

class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    Car car = new Car();
    car.license = "AMQ123";
    car.driver = "Andres Herrera";
    car.passengers = 4;
    car.printDataCard();
    Car car2 = new Car();
    car2.driver = "Dana";
    car2.license = "JKL345";
    car2.passengers = 2;
    car2.printDataCard();;
  }
}