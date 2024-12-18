import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai ","I20N ",300.000 , 1);
        Car car2 = new Car("Honda ","Civic ",150.000 , 2);
        Car car3 = new Car("Toyota ","Corolla ",200.000 , 3);
        ElectricCar car4 = new ElectricCar("Tesla ","Model S ",300.000,4,100,260);

        List<Car> CarList = new ArrayList<>();
        CarList.add(car1);
        CarList.add(car2);
        CarList.add(car3);
        CarList.add(car4);
        System.out.println("--------------------CARS--------------------");
        CarList.forEach(Car::display);
        System.out.println(car1.getBrand() + car1.getModel() + car1.getPrice());
        System.out.println("--------------------------------------------");


        System.out.println("Car names starts with H");
        CarList.stream()
                .filter((p) -> p.Brand.startsWith("H"))
                .map((p) -> p.Brand.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
        System.out.println("--------------------------------------------");


        System.out.println("Car Price under 200.000: ");
        CarList.stream()
                .filter(car -> car.Price < 200.000)
                .forEach(Car::display);
        System.out.println("--------------------------------------------");


        double totalPrice = PriceTransactions.sumPrices(car1, car2);
        System.out.println("Total Price of car1 and car2: " + totalPrice);
    }
}