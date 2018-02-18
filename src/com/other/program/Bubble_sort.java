package com.other.program;

public class Bubble_sort {
 
   
	/**
	 *  // logic to sort the elements
	 * @param bubbleArray
	 */
    public static void bubble_srt(int bubbleArray[]) {
        int n = bubbleArray.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (bubbleArray[i] > bubbleArray[k]) {
                    swapValues(i, k, bubbleArray);
                }
            }
            printNumbers(bubbleArray);
        }
    }
 
    /**
     * 
     * @param i
     * @param j
     * @param array
     */
    private static void swapValues(int i, int j, int[] array) {
 
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    /**
     * 
     * @param input
     */
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
 
    }
}