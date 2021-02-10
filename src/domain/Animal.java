package domain;

public class Animal
{
    protected String name;

    protected int weight;

    public Animal()
    {
        name="generic animal";
        weight=15;
    }

    public void eat()
    {
        System.out.println("Animal eating;");
    }

    public void speak()
    {
        System.out.println("Animal speaking;");
    }

    public String toString()
    {
        return "  MY ANIMAL:"+"\nname:\t"+name+"\nweight:\t"+weight+" kg";
    }
}
