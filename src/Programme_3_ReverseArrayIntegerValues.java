
//Write a Java program to reverse an array of integer values.

public class Programme_3_ReverseArrayIntegerValues {
    //main method
    public static void main(String[] args) {
        //object created
        Programme_3_ReverseArrayIntegerValues obj = new Programme_3_ReverseArrayIntegerValues();
        //instance methodcalled through object
        obj.reverseArrayValue();
    }
    //instance method
     public void reverseArrayValue(){
        //initialize array
        int[] a = new int[]{1,2,3,4,5,6,7,};
        System.out.println("Original array : ");

        for (int i = 0; i < a.length; i++){//for loop
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //loop through the array in reverse order
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
