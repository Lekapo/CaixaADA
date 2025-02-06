import Animals.Bird;
import Animals.Cat;
import Animals.Dog;
import Places.Petshop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int number = 287346298;
        System.out.println(number);
        System.out.println("==============================================");
        System.out.println();


        Dog dog1 = new Dog(

        "Kika",
        "Caramel",
        10.2
        );

        Dog dog2 = new Dog(
                "Lili",
                "white",
                4.8
                );



        System.out.println(dog1);
        dog1.eat();
        dog1.speak();

        String fetchedObjected = dog1.fetch();
        System.out.println(dog1.getName() + " brought a: " + fetchedObjected);

        System.out.println(dog1.interact("pet"));
        System.out.println(dog1.interact("nothing"));
        System.out.println(dog1.interact("ring a bell"));



        System.out.println();
        System.out.println(dog2.getName());
        System.out.println(dog2.interact("ring a bell"));

        System.out.println(dog1.toString());
        System.out.println(dog2 .toString());

        System.out.println("All dogs: " + dog1.getDogsCount());

        Cat cat1 = new Cat("Gatinha", "white", 3.2);
        System.out.println(cat1.toString());

        Bird bird1 = new Bird("Crowei", "black", 1.1);
        System.out.println(bird1.toString());

        dog1.speak();
        cat1.speak();
        bird1.speak();
        bird1.sleep();
        cat1.eat();




        System.out.println("===============================================================");
        System.out.println();

        Petshop petshop = new Petshop();

        petshop.bathe(dog1);
        petshop.bathe(cat1);
        petshop.groom(dog1);
        System.out.println(dog1.getName() + " is feeling " + dog1.getMood());
        System.out.println(cat1.getName() + " is feeling " + cat1.getMood());






    }
}