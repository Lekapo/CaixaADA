package Animals;

public class Dog extends Animal {
    static int dogsCount;

    public Dog(String name, String color, double weight) {
        super(name, color, weight);
        dogsCount++;
    }


    public int getDogsCount() {
        return dogsCount;
    }

    public void setDogsCount(int dogsCount) {
        Dog.dogsCount = dogsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", mood='" + mood + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Woof!!!");
    }

    public String fetch() {
        return "red ball";
    }

    public String interact(String action) {
        switch (action) {
            case "pet" -> this.mood = "happy";
            case "ring a bell" -> this.mood = "salivating";
            default -> this.mood = "neutral";
        }

        return this.name + " is " + this.mood + ".";
    }
}
