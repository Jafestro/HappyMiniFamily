package az.jafestro.happyminifamily.controller;

import az.jafestro.happyminifamily.model.Pet;
import az.jafestro.happyminifamily.service.HumanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")
public class HumanController {
    private final HumanService service;

    public HumanController(HumanService service) {
        this.service = service;
    }

    @GetMapping("/greetPet")
    public String greetPet(@RequestBody String petName){
        return service.greetPet(petName);
    }

    @GetMapping("/describePet")
    public String describePet(@RequestBody Pet pet){
        return service.describePet(pet);
    }
}
