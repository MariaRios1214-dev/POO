from account import Account
from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AMS123", Account("Andres Galvis", "sdf5454"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("MKL452", Account("Dulce Antonia", "ASE45"))
    print(vars(car2))
    print(vars(car2.driver))
