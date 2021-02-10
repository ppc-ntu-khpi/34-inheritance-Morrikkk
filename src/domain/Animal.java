package domain;


 /**
 * The class Animal
 */ 
public class Animal
{
    protected String name;

    protected int weight;



/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() 
    {

        name="generic animal";
        weight=15;
    }



/** 
 *
 * Eat
 *
 */
    public void eat() 
    {

        System.out.println("Animal eating;");
    }



/** 
 *
 * Speak
 *
 */
    public void speak() 
    {

        System.out.println("Animal speaking;");
    }



/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() 
    {

        return "  MY ANIMAL:"+"\nname:\t"+name+"\nweight:\t"+weight+" kg";
    }
}
