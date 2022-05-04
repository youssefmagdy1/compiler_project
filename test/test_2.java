package test;

public class test_2 {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};
        //Initialize max with first element of array.
        int max = arr[0];
        //Loop through the array
        for (int k : arr) {
            //Compare elements of array with max
            if (k > max)
                max = k;
        }

        for (int j : arr) max = j;

        System.out.println("Largest element present in given array: " + max);
    }
}