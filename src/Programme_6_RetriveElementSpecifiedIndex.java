import java.util.ArrayList;
import java.util.List;
//Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class Programme_6_RetriveElementSpecifiedIndex {
    public static void main(String[] args) {// main method
        //object created
        Programme_6_RetriveElementSpecifiedIndex obj = new Programme_6_RetriveElementSpecifiedIndex();
        obj.retriveElement();//instance method called by object
    }
    //instance method
    public void retriveElement() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Car");
        list_Strings.add("Truck");
        list_Strings.add("Bike");
        list_Strings.add("Airplane");
        list_Strings.add("Motorbike");
        //print the list
        System.out.println(list_Strings);
        //retrive the first and fourth element
        String element = list_Strings.get(0);
        System.out.println("First Element: " + element);
        element = list_Strings.get(3);
        System.out.println("Fourth Element: " + element);
    }
}
