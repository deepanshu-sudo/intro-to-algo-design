import java.util.Arrays;

/**
 * Write Algorithm, Pseudocode, Flowchart to reverse the order of the elements of an array
 */

public class ArrayOrderReversal {

    public static <T> void reverseArray(T[] array) {
        for(int i = 0, j = array.length-1; i < j; i++, j--) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void main(String[] args) {
        String[] strArray = {"Hi", "This", "Is", "Deepanshu"};
        reverseArray(strArray);
        System.out.println(Arrays.toString(strArray));

        Integer[] intArray = {1,2,3,4,5};
        reverseArray(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
