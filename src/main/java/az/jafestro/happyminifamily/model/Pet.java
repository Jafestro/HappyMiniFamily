package az.jafestro.happyminifamily.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private short trickLevel;
    private String[] habits;
}
