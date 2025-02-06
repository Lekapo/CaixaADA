package Animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int height;
    protected double weight;
    protected String mood;

    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
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

    public void eat() {
        System.out.println("Chomp, chomp chomp!!");
    };
    public void sleep(){
        System.out.println("Zzzzz...");};

    public abstract void speak();
}
