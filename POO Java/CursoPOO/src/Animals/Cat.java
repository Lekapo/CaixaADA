package Animals;

public class Cat extends Animal {
    static int catsCount;

    public Cat(String name, String color, double weight) {
        super(name, color, weight);
        catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", mood='" + mood + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Meow!!!");
    }

    public String fetch() {
        return "a insect";
    }
}
