package domain;


 /**
 * The class Dog extends predator
 */ 
public class Dog extends Predator
{
    private String kind;



/** 
 *
 * Dog
 *
 * @param name  the name
 * @param weight  the weight
 * @param kind  the kind
 * @return public
 */
    public Dog(String name, int weight, String kind) 
    {

        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }



/** 
 *
 * Dog
 *
 * @return public
 */
    public Dog() 
    {

        this("Large", 15, "husky");
    }



/** 
 *
 * Dog
 *
 * @param name  the name
 * @return public
 */
    public Dog(String name) 
    {

        this(name, 15, "husky");
    }



/** 
 *
 * Play
 *
 */
    public void play() 
    {

        System.out.println("Dog is playing;");
    }



/** 
 *
 * Hunt
 *
 */
    public void hunt() 
    {

        super.hunt();
        System.out.println("Dog hunting for the bone:");
    }



/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() 
    {

        return super.toString()+"\nkind:\t"+this.kind+"\n\nThis is Dog!";
    }



/** 
 *
 * Speak
 *
 */
    public void speak() 
    {

        super.speak();
        System.out.println("Woof! Woof!");
    }



/** 
 *
 * Eat
 *
 */
    public void eat() 
    {

        System.out.println("Dog eats bone and meal;");
    }
}
