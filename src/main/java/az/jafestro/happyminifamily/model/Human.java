package az.jafestro.happyminifamily.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Human {
    private String name;
    private String surname;
    private int year;
    private short iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
}
