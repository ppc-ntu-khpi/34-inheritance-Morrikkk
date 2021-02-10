package domain;

public class Dog extends Predator
{
    private String kind;

    public Dog(String name, int weight, String kind)
    {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Dog()
    {
        this("Large", 15, "husky");
    }

    public Dog(String name)
    {
        this(name, 15, "husky");
    }

    public void play()
    {
        System.out.println("Dog is playing;");
    }

    public void hunt()
    {
        super.hunt();
        System.out.println("Dog hunting for the bone:");
    }

    public String toString()
    {
        return super.toString()+"\nkind:\t"+this.kind+"\n\nThis is Dog!";
    }

    public void speak()
    {
        super.speak();
        System.out.println("Woof! Woof!");
    }

    public void eat()
    {
        System.out.println("Dog eats bone and meal;");
    }
}
