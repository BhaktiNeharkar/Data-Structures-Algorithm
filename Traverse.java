
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        //create 2 array, create an arraylist, now add those 2 arrays into the array list
        int[] arr1 = {1, 2, 3};

        int[] arr2 = {4, 5, 6};

        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            marks.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            marks.add(arr2[i]);
        }

        for (int i : marks) {
            System.out.print(i);
        }
    }
}
