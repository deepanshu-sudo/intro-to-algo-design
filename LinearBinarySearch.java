public class LinearBinarySearch {
    public static int linearSearch(int[] array,int element) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array,int element) {
        int start = 0;
        int end = array.length-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(array[mid] == element) {
                return mid;
            } else if(array[mid] < element) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] randomArray = {4, 6, 13, 17, 19, 20, 22, 24, 25, 26, 29, 35, 39, 40, 41, 43, 47, 49, 50, 54, 56, 60, 63, 66, 67, 72, 75, 77, 81, 85, 86, 88, 90, 91, 94, 95, 97, 101, 103, 108, 111, 114, 116, 120, 123, 125, 128, 132, 136, 139, 140, 141, 144, 147, 150, 152, 155, 157, 160, 164, 167, 171, 173, 174, 176, 178, 181, 182, 184, 186, 187, 188, 189, 190, 192, 195, 199, 202, 205, 207, 209, 213, 215, 218, 221, 225, 228, 229, 231, 233, 235, 239, 241, 243, 246, 248, 250, 253, 255, 259, 262, 265, 267, 269, 273, 276, 279, 281, 285, 287};

        System.out.println(linearSearch(randomArray,0));
        System.out.println(binarySearch(randomArray,0));
    }
}
