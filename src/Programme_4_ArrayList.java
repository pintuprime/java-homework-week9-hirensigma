import java.util.ArrayList;
//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class Programme_4_ArrayList {
    //main method
    public static void main(String[] args) {
        arrayListColours();//static method called
    }
    //static method
    public static void arrayListColours(){
    //creating a array list
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");
        colours.add("Orange");
        colours.add("White");
        System.out.println("ArrayList: " + colours);

        //for loop
        for(int i = 0; i < colours.size(); i++){
            System.out.print(colours.get(i));
            System.out.print(" , ");
        }
    }
}
