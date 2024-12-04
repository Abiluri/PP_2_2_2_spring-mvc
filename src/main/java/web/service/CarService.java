package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Toyota Camry", 2020, "Silver"));
        cars.add(new Car("Honda Accord", 2019, "Black"));
        cars.add(new Car("Ford Mustang", 2021, "Red"));
        cars.add(new Car("Tesla Model 3", 2022, "White"));
        cars.add(new Car("Volkswagen Golf", 2018, "Blue"));
    }

    public List<Car> getCars(int count) {
        return count < 5 ? cars.subList(0, count) : cars;
    }

    public List<Car> getAllCars() {
        return cars;
    }
}