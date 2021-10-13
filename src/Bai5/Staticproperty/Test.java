package Bai5.Staticproperty;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("suki", "Gà gô engine");

        System.out.println(Car.numberOfCar);
        Car car2 = new Car("toto", "Gà tây engine");

        System.out.println(Car.numberOfCar);
    }
}
