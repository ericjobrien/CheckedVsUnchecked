import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        readFile("myFile.txt");
        String name = null;
        printLength(name);

    }

    private static void readFile (String fileName){ //checked, meaning it happens at compile time
        // one way of handling this issue, if you don't use a try/catch statement, you'll have to deal with this exception in some other way, because
        // the program won't compile if a checked exception exists
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe + "That file doesn't exist");
        }
    }

    private static void printLength(String myString) { //unchecked, meaning it happens at runtime
        //Can just throw this exception and the code will still compile and then start running.
        //However, without dealing with exception, meaning catching it and telling the program to do something once caught,
        //the program will stop running and throw a runtime exception at runtime.
        //If this were a program where someone was entering a string in a form, the catch could be designed to reply back to
        //the user to enter only a string, for instance.
        try {
            System.out.println(myString.length());
        } catch (NullPointerException npe) {
            System.out.println("String cannot be null");
        }

    }

}
