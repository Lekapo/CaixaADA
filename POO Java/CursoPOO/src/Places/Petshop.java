package Places;

import Animals.Animal;
import Animals.Dog;

public class Petshop {

    public void bathe(Animal animal) {
        animal.setMood("Clean");
    }

    public void groom(Dog dog) {
        dog.setMood("Groomed");
    }

    public void hotel(Animal animal) {
        animal.setMood("Missing his owner");
    }
}
