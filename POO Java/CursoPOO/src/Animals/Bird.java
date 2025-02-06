package Animals;

public class Bird extends Animal {
    static int birdsCount;

    public Bird(String name, String color, double weight) {
        super(name, color, weight);
        birdsCount++;
    }


    public static int getBirdsCount() {
        return birdsCount;
    }

    public static void setBirdsCount(int birdsCount) {
        Bird.birdsCount = birdsCount;
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
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", mood='" + mood + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Caw!!!");
    }

    public String fetch() {
        return "a berry";
    }
}


