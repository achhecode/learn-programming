class Car:
    def __init__(self, name, color, model, year):
        self.name = name
        self.color = color
        self.model = model
        self.year = year
        self.is_suv = False

    def drive(self):
        print(self.name+" is driving")

    def speed(self):
        print("Speeding the car")

    def beep(self):
        print("Beep")

    def check_suv(self):
        if self.is_suv:
            print("Yes, "+self.name + " is a SUV car")
        else:
            print("No, "+self.name + " is not a SUV car")



class Humans:
    def __init__(self, name, age, address, nationality, height):
        self.name = name
        self.age = age
        self.address = address
        self.nationality = nationality
        self.height = height
        self.only_veg = True

    def run(self):
        print(self.name+ " can run at 20km/h")

    def speak(self):
        print(self.name+ " can speak Hindi & English")

    def eat(self):
        if self.only_veg:
            print(self.name+ " eat veg only")
        else:
            print(self.name+ " eat non veg and veg both")


class House:
    def __init__(self, name, length, breadth, no_of_rooms):
        self.name = name
        self.length = length
        self.breadth = breadth
        self.no_of_rooms = no_of_rooms





if __name__ == "__main__":
    # print("Running...")

    car1 = Car("Hyundai Eon", "Blue", "V2", 2013)
    print(car1.name)
    car1.drive()
    car1.is_suv = True
    car1.check_suv()

    car2 = Car("Wagnor", "Blue", "V5", 2017)
    car2.check_suv()
    car2.speed()

    human1 = Humans("Ramesh", 45, "Cannught Place, Delhi", "Indian", "5'11")
    human1.run()
    human1.only_veg = False
    human1.eat()

