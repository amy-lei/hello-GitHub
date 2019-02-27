// Greets a person without repetition

public class Greeter {

    
    public static void main(String[] person) {                        
        greet( "Professor Kernighan");
        greet( "Admiral Hopper");
        greet( "Good-time Johnny");
        greet( "Mr.Holmes");
    }
    /*
    One cannot define greet in the function body of another method. However, it is legal to define greet both before the main method or after the main method. 
    */
    public static void greet( String person) {
            System.out.println( "hello, " + person + "! How you doon?");
        }

}