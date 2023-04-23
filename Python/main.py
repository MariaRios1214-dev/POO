from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "AMS123"  # type: ignore
    car.driver = "Andres Galvis"  # type: ignore
    print(vars(car))

    car2 = Car()
    car2.driver = "Lorena lopez"  # type: ignore
    car2.license = "LOP212"  # type: ignore
    print(vars(car2))
