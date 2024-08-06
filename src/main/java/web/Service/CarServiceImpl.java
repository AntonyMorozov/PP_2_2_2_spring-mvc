package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 190));
        cars.add(new Car("BMW", "5", 210));
        cars.add(new Car("BMW", "7", 270));
        cars.add(new Car("Volvo", "xc70", 230));
        cars.add(new Car("Lada", "Kalina", 102));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count > 0 ? count : cars.size())
                .collect(Collectors.toList());
    }
}
