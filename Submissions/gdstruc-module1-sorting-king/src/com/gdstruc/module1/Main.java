package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {
	int[] numbers = new int [10];
    int[] numbersSelection = new int [10];
    int[] numbersLargest = new int [10];
    //initializing array values for numbers
    numbers[0] = 66;
    numbers[1] = 23;
    numbers[2] = 107;
    numbers[3] = -36;
    numbers[4] = 98;
    numbers[5] = 75;
    numbers[6] = 337;
    numbers[7] = 413;
    numbers[8] = -18;
    numbers[9] = 3;
    //initializing array values for numbersSelection
    numbersSelection[0] = 314;
    numbersSelection[1] = 58;
    numbersSelection[2] = 99;
    numbersSelection[3] = 156;
    numbersSelection[4] = -71;
    numbersSelection[5] = -3;
    numbersSelection[6] = 10;
    numbersSelection[7] = 47;
    numbersSelection[8] = 21;
    numbersSelection[9] = 15;
    //initializing array values for numbersSelection
    numbersLargest[0] = 25;
    numbersLargest[1] = 67;
    numbersLargest[2] = 33;
    numbersLargest[3] = -26;
    numbersLargest[4] = 316;
    numbersLargest[5] = 450;
    numbersLargest[6] = -401;
    numbersLargest[7] = 212;
    numbersLargest[8] = 96;
    numbersLargest[9] = 7;

    //printing array before bubble sort
    System.out.println("Before descending bubble sorting:");
    printArrayElements(numbers);

    //bubble sort function and printing
    bubbleSort((numbers));

    System.out.println("\n\nAfter bubble sort:");
    printArrayElements(numbers);

    System.out.println("\n\nBefore descending selection sorting:");
    printArrayElements(numbersSelection);

    //selection sort function and printing
    selectionSort((numbersSelection));

    System.out.println("\n\nAfter selection sort:");
    printArrayElements(numbersSelection);

    System.out.println("\n\nBefore selection sort:");
    printArrayElements(numbersLargest);

    //selection sort function and printing, smallest value at the end
    smallestSelectionSort((numbersLargest));

    System.out.println("\n\nAfter selection sort with the smallest value first:");
    printArrayElements(numbersLargest);
    }

     private static void bubbleSort(int[] arr)
     {
         for(int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--)
         {
             for (int i = 0; i < lastSortedIndex; ++i)
             {
                 if (arr[i] < arr[i+1])
                 {
                     int temp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = temp;
;                 }
             }
         }
     }

     private static void selectionSort(int[] arr)
     {
         for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
         {
             int largestIndex = 0;
             for (int i = 1; i <= lastSortedIndex; ++i)
             {
                 if (arr[i] < arr[largestIndex])
                 {
                     largestIndex = i;
                 }
             }

             int temp = arr[lastSortedIndex];
             arr[lastSortedIndex] = arr[largestIndex];
             arr[largestIndex] = temp;
         }
     }

    private static void smallestSelectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; ++i)
            {
                if (arr[i] > arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

     private static void printArrayElements(int[] arr)
     {
         for (int j : arr) {
             System.out.print(j + " ");
         }
     }
}
