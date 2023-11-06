import java.util.HashSet;
/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else
 */
public class Programme_8_hashsetStoreIntegerObject {
    // main method
    public static void main(String[] args) {
        //create a hashset object called number
        HashSet<Integer> numbers = new HashSet<Integer>();
        //add the value to set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        System.out.println("Numbers are set");
        //static method called directly
        checkTheNumberInSet(numbers);
    }
    //static method
    public static void checkTheNumberInSet(HashSet<Integer> set) {
        //used for loop and if else
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " found in set. ");
            } else {
                System.out.println(i + " not found in set");
            }
        }
    }
}
