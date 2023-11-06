import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_hashMapObject {
    //main method
    public static void main(String[] args) {
        hashObject();//static method called
    }
        //static method
        public static void hashObject() {
            //Hashmap object
            HashMap<String, Integer> map = new HashMap();
            map.put("Sachin", 10);
            map.put("Dhoni", 7);
            map.put("Rohit", 5);
            //for and while loop
            for (Map.Entry<String, Integer> m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
            Iterator<HashMap.Entry<String, Integer>> nameList = map.entrySet().iterator();
            while (nameList.hasNext()) {
                System.out.print(nameList.next() + " ");
            }
        }
    }
