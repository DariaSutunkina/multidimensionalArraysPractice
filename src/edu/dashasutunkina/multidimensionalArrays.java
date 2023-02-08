package edu.dashasutunkina;

public class multidimensionalArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        showArray(numbers);
        inverseArray(numbers);
    }
    public static void showArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void inverseArray (int [] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

