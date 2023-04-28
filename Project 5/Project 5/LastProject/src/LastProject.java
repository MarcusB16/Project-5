/*
 * Programmer Name: Marcus Brown
 * CLass Name: LastProject
 * Date: 4/27/2023
 * Course CIS1500 A1513
 * Purpose Statement: Produce an application that test and utilizes arrays in a variety of ways
 */

import java.util.Random;

public class LastProject {
    public static void main(String[] args) {
        int[] nums1 = new int[15];
        int[] nums2 = new int[15];
        int[] nums3 = { 15, 19, 5, 3 ,6, 20, 30, 18, 8, 11, 16, 13, 22, 29, 1};
        int randomSum;
        int sumUnderForty;
        int smallestNumber;
        int largestIndex;
        int elementFound;
        int[] overThirty;

        initArray(nums1);
        System.out.println("The nums1 array after initializing: ");
        displayArray(nums1);
        System.out.println("\n\nThe nums3 array after initializing: ");
        displayArray(nums3);
        genRandom(nums2);
        System.out.println("\n\nThe nums2 array after initializing: ");
        displayArray(nums2);

        randomSum = sumRandom(nums2);
        System.out.print("\n\nThe sum of  ");
        displayArray(nums2);
        System.out.print(" is: " + randomSum);

        sumUnderForty = underForty(nums2);
        System.out.println("\nThe sum of the values in num2 that are under 40 is " + sumUnderForty);

        System.out.println("\nThe nums3 array after initializing: ");
        displayArray(nums3);
        smallestNumber = smallest(nums3);
        System.out.println("\nThe smallest number in this array is " + smallestNumber);
        largestIndex = largest(nums3);
        System.out.println("The largest number's index in the array is " + largestIndex);

        elementFound = search(nums3, 6);
        if(elementFound != -1){
            System.out.println(" The number 6 was found at this index: " + elementFound);
        }
        else{
            System.out.println(" The number 6 was not found.");
        }
        overThirty = addToOverThirty(nums3);
        System.out.println("The nums3 array after adding 1 to all numbers greater than 30 is ");
        displayArray(overThirty);



    }

    //Initializes an array that is passed through the method.
    public static void initArray(int[]nums){
        for(int index = 0; index < nums.length; index++){
            nums[index] = index;
        }
    }

    // Displays an array to the screen that is passed through it
    public static void displayArray(int[]numsD){
        for(int displays : numsD){
            System.out.print(displays + " ");
        }
    }

    // Generates a random set of numbers to the array that is passed through it
    public static void genRandom(int[] randNum){
        Random rand = new Random();
        for(int numRand = 0; numRand < randNum.length;numRand++ ){
            randNum[numRand] = rand.nextInt(101);
        }

    }

    // Calculates the sum of all numbers in an array that is passed through the method. Returns the sum.
    public static int sumRandom(int[] sum){
        int newSum = 0;
        for (int index : sum) {
            newSum += index;
        }
        return newSum;

    }

    // Adds all numbers that are under 40 in an array that is passed through it; Returns the sum.
    public static int underForty(int[] under) {
        int sumNumbers = 0;
        for (int i : under) {
            if (i < 40) {
                sumNumbers += i;
            }
        }
        return sumNumbers;
    }

    // Finds the smallest number within the array that is passed through. Returns that number.
    public static int smallest(int[] small){
        int smallestNum = small[0];
        for(int index = 1; index<small.length; index++){
            if( small[index]< small[index-1]){
                smallestNum = small[index];
            }
        }

        return smallestNum;
    }

    // Finds the largest number within an array that is passed through and returns that number's index within the given array.
    public static int largest(int[] doubleXL) {
        int largestIndex = 0;
        for (int index = 1; index < doubleXL.length; index++) {
            if (doubleXL[index] > doubleXL[largestIndex]) {
                largestIndex = index;
            }
        }
        return largestIndex;
    }

    // Searches for a specific number within the array that is passed through, returns the index of that number.
    public static int search(int[] numSearch, int numLook){
        int index = 0;
        int element = -1;
        boolean foundIndex = false;

        while(!foundIndex && index < numSearch.length){
            if(numSearch[index] == numLook){
                foundIndex = true;
                element = index;
            }
            index++;
        }
        return element;
    }

    // Adds 1 to all numbers over thirty within an array that is passed through the method.
    public static int[] addToOverThirty(int[] arrays){
        for(int index = 0; index < arrays.length; index++){
            if ( arrays[index] > 30){
                arrays[index] += 1;
            }
        }
        return arrays;
    }

}
