package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String carDealership;
    private int priceLimit;
    private List<Car> carsForSell = new ArrayList<>();

    private boolean addCar(Car car) {
        boolean withinLimit=false;
        if (car.getPrice() <= getPriceLimit()) {
            carsForSell.add(car);
            withinLimit = true;
        }
        return withinLimit;
    }

    public double sumCarPrice() {
        double sum = 0;
        for (Car c : carsForSell) {
            sum += c.getPrice();
        }
        return sum;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsOneBrand = new ArrayList<>();
        for (Car c : carsForSell) {
            if (c.getBrand().equalsIgnoreCase(brand)) {
                carsOneBrand.add(c);
            }
        }
        return carsOneBrand;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCars = 0;
        for (Car c : carsForSell) {
            if (c.getPrice() <= price) {
                numberOfCars++;
            }
        }
        return numberOfCars;

    }

    public CarShop(String carDealership, int priceLimit) {
        this.carDealership = carDealership;
        this.priceLimit = priceLimit;
    }

    public String getCarDealership() {
        return carDealership;
    }

    public int getPriceLimit() {
        return priceLimit;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public static void main(String[] args) {
        ///1. rész
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);

        CarShop carShop = new CarShop("Best Car", 10_000_000);

        System.out.println(carShop.addCar(car1));  //true
        System.out.println(carShop.getCarsForSell().size()); //1

        System.out.println(carShop.addCar(car2));  //false
        System.out.println(carShop.getCarsForSell().size()); //1

        car1.decreasePrice(10);

        System.out.println(carShop.getCarsForSell().get(0).getPrice()); //2070000

        //2. rész
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);

        carShop.addCar(car3);
        carShop.addCar(car4);

        System.out.println(carShop.sumCarPrice()); //6270000

        System.out.println(carShop.numberOfCarsCheaperThan(2_000_000)); //1

        System.out.println(carShop.numberOfCarsCheaperThan(1_000_000)); //0

        System.out.println(carShop.carsWithBrand("Toyota").size()); //2

        System.out.println(carShop.carsWithBrand("BMW").size()); //0
    }
}
