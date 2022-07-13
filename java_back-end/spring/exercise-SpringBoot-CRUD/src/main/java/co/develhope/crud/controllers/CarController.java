package co.develhope.crud.controllers;

import co.develhope.crud.entities.Car;
import co.develhope.crud.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("/")
    public void addCar(@RequestBody Car car) {carRepository.save(car);}

    @GetMapping("")
    public List<Car> listCars() { return carRepository.findAll(); }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        if (carRepository.existsById(id)){
            return carRepository.getById(id);
        }else {
            return new Car();
        }
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable long id, @RequestParam String type){
        Car car;
        if (carRepository.existsById(id)){
            car = carRepository.getById(id);
            car.setType(type);
            car = carRepository.save(car);
            return car;
        }else{
            return new Car();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteSingle(@PathVariable long id, HttpServletResponse response){
        if (carRepository.existsById(id))
            carRepository.deleteById(id);
        else
            response.setStatus(409);
    }

    @DeleteMapping("")
    public void deleteAll(){
        carRepository.deleteAll();
    }
}