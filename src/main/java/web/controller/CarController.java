package web.controller;

import Models.COLOR;
import Models.Car;
import Models.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
@GetMapping("/cars")
    public String printWelcome(@RequestParam("count") int counter, Model model) {
    List<Car> list = new ArrayList<>();
    list.add(new Car("Lada", COLOR.RED, 2015));
    list.add(new Car("Ford", COLOR.BLACK, 2018));
    list.add(new Car("Opel", COLOR.WHITE, 2018));
    list.add(new Car("Lada", COLOR.WHITE, 2020));
    list.add(new Car("Ford", COLOR.BLACK, 2019));
    list = CarService.carsCount(list, counter);
    model.addAttribute("list", list);
    return "car";

    }

}
