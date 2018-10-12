package assignments.recursion.arrays;

import globalmethods.GlobalMethods;

/**
 * ComputerScience40S.java - This project will create an array and you can 
 * get the sum of the elements, the average, the max value and the min value.
 * 
 * @author Ethan Pottinger
 * @since 24-Sep-2018
 */
public class Arrays {
    
    public static void main(String[] args) {
        int[] array = createArray();
        displayArray(array);
        boolean stillUsing = true;
        final String[] options = {"Generate new array", "Display array", "Get maximum", "Get minimum", "Get sum", "Get average", "Quit"};
        while(stillUsing) {
            String option = GlobalMethods.choose("What would you like to do?", "Arrays", options);
            if(option.equals(options[0])) {
                array = createArray();
            }
            else if(option.equals(options[1])) {
                displayArray(array);
            }
            else if(option.equals(options[2])) {
                GlobalMethods.output("The maximum of the array is: " + maximum(array));
            }
            else if(option.equals(options[3])) {
                GlobalMethods.output("The minimum of the array is: " + minimum(array));
            }
            else if(option.equals(options[4])) {
                GlobalMethods.output("The sum of the array is: " + sum(array));
            }
            else if(option.equals(options[5])) {
                GlobalMethods.output("The average is: " + average(array));
            }
            else if(option.equals(options[6])) {
                stillUsing = false;
            }
        }
    }
    
    /**
     * Creates an array of random integers
     * 
     * @return the array generated
     */
    public static int[] createArray() {
        int size = GlobalMethods.inputInt("How big is the array?");
        int lo = GlobalMethods.inputInt("Whats the lowest value of the array?");
        int hi = GlobalMethods.inputInt("Whats the highest value of the array?");
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = GlobalMethods.randInt(lo, hi);
        }
        return array;
    }
    
    /**
     * This will output the array recursively
     * 
     * @param array The array to be outputted
     */
    public static void displayArray(int[] array) {
        GlobalMethods.output(displayArray(array, array.length - 1));
    }
    
    /**
     * This is the recursive element to the displayArray function
     * 
     * @param array The array to be outputted
     * @param current the spot of the array to display
     * @return the array as a list
     */
    private static String displayArray(int[] array, int current) {
        
        if (current == 0)  return Integer.toString(array[current]);
        
        else return array[current] + ", " + displayArray(array, current - 1);
    }
    
    /**
     * This will calculate the average of the elements in the array recursively
     * 
     * @param array the array
     * @return the average
     */
    public static double average(int[] array) {
        return (double) average(array, array.length - 1);
    }
    private static double average(int[] array, int current) {
        
        if(current == 0) return (double)((double)(array[current]) / (double)(array.length));
            
        else return (double)(((double)(array[current]) / (double)(array.length)) + (average(array, current - 1)));
    }
    
    /**
     * This adds up all the elements of the array recursively
     * 
     * @param array the array
     * @return the sum of the elements of the array
     */
    public static int sum(int[] array) {
        return sum(array, array.length - 1);
    }
    private static int sum(int[] array, int current) {
        
        if(current == 0) return array[current];
        
        else return array[current] + sum(array, current - 1);
    
    }
    
    /**
     * This will find the smallest value in the array recursively
     * 
     * @param array the array
     * @return the smallest value in the array
     */
    public static int minimum(int[] array) {
        return minimum(array, array.length - 1, array[0]);
    }
    private static int minimum(int[] array, int i, int min) {

        if(array[i] < min) min = array[i];

        if(i == 0) return min;
        
        else return minimum(array, i - 1, min);
    }
    
    /**
     * This will find the largest value in the array
     * 
     * @param array the array
     * @return the largest value in the array
     */
    public static int maximum(int[] array) {
        return maximum(array, array.length - 1, 0);
    }
    private static int maximum(int[] array, int i, int max) {

        if(array[i] > max) max = array[i];

        if(i == 0) return max;
        
        else return maximum(array, i - 1, max);
    }
    
} 
