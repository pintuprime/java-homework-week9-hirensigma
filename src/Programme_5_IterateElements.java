import java.util.ArrayList;
import java.util.ListIterator;
//Write a Java program to iterate through all elements in an array list using
//Iterater
public class Programme_5_IterateElements {
    //main method
    public static void main(String[] args) {
        iterateAllElements();//static method called
    }
    //static method
    public static void iterateAllElements() {
        //creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        System.out.println("Arrays List : " + numbers);
        //creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();
        System.out.println("Iterating over array list: ");
        //while loop used
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " , ");
        }
    }
}
