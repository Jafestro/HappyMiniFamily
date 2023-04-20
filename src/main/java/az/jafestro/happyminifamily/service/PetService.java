package az.jafestro.happyminifamily.service;

import org.springframework.stereotype.Service;

@Service
public class PetService {
    public String eat(){
        return "I am eating";
    }
    public String respond(String petName){
        return "Hello, owner. I am - " + petName + ". I miss you!";
    }
    public String foul(){
        return "I need to cover it up";
    }
}
