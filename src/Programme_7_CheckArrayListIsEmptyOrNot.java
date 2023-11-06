import java.util.ArrayList;

//Write a Java program to test if an array list is empty or not
public class Programme_7_CheckArrayListIsEmptyOrNot {
    //main method
    public static void main(String[] args) {
        listEmptyOrNot();//static to static directly method called
    }
     //static method
    public static void listEmptyOrNot() {
        ArrayList<String> c = new ArrayList<String>();
        c.add("Red");
        c.add("Green");
        c.add("Black");
        c.add("White");
        c.add("Pink");
        System.out.println("Original array list: " + c);
        System.out.println("Checking above array list is empty or not! " + c.isEmpty());
        c.removeAll(c);
        System.out.println("Array list after removing all elements " + c);
        System.out.println("Checking the above array list is empty or not! " + c.isEmpty());
    }
}
