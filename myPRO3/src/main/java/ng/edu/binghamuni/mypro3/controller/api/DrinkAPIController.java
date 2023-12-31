package ng.edu.binghamuni.mypro3.controller.api;

import ng.edu.binghamuni.mypro3.Repository.DrinkRepository;
import ng.edu.binghamuni.mypro3.domain.Drink;
import ng.edu.binghamuni.mypro3.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DrinkAPIController {
@Autowired
    DrinkRepository drinkRepository;
@Autowired
    DrinkService drinkService;
@RequestMapping("/drink")
@GetMapping("/drink")
public ResponseEntity<List<Drink>>getAllDrink(){
    return ResponseEntity.ok().body(drinkService.getAllDrinks());
}


}
