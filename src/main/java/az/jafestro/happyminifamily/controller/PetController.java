package az.jafestro.happyminifamily.controller;

import az.jafestro.happyminifamily.service.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetController {
    private final PetService service;

    public PetController(PetService service) {
        this.service = service;
    }

    @GetMapping("/eat")
    public String eat(){
        return service.eat();
    }

    @GetMapping("/respond")
    public String respond(@RequestBody String petName){
        return service.respond(petName);
    }

    @GetMapping("/foul")
    public String foul(){
        return service.foul();
    }
}
