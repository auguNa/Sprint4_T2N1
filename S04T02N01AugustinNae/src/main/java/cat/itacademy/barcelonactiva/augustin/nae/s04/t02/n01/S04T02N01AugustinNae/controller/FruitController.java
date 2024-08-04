package cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.controller;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.model.domain.Fruit;
import cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.services.FruitServImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fruits")
public class FruitController {
	
	@Autowired
    private FruitServImpl fruitService;

    @PostMapping("/add")
    public ResponseEntity<?> addFruit(@Valid @RequestBody Fruit fruit, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(fruitService.createFruit(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(fruitService.updateFruit(fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFruit(@PathVariable("id") Long fruitId){
        fruitService.deleteFruit(fruitId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<?> getOneFruit(@PathVariable("id") Long fruitId){
        return ResponseEntity.ok().body(fruitService.getOneFruit(fruitId));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        return ResponseEntity.ok().body(fruitService.getAllFruits());
    }

}

