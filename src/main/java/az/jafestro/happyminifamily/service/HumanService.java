package az.jafestro.happyminifamily.service;

import az.jafestro.happyminifamily.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class HumanService {

    public String greetPet(String petName) {
        return "Hello, " + petName + "";
    }

    public String describePet(Pet pet) {
        if (pet.getTrickLevel() > 50)
            return "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is very sly";

        return "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is almost not sly";
    }
}
