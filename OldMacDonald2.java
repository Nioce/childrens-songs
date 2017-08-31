/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    /**
     * Sings the first line
     */
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }

    
    /**
     * Sings the second line + the animal @parm
     */
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }

    /**
     * Sings the sounds of the animal, note the +sound per each line
     * Sings two lines of sounds @parm
     */
    public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    /**
     * Sings the following verse in order with ordered @parm 
     */
    public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    /**
     * List the animals with noises that it will display @parm
     */
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
