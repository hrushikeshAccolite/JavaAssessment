// Given an array, sort the array such that the sum of the
// numbers of the first half is closer to the sum of the numbers in
// the 2nd half of the array. The input array is not sorted
// Example: {1,2,3,4} -> {1,4,3,2}
// Example: {2,7,3,8,11,12} -> {11,8,3,2,7,12}

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Integer [] input = new Integer[] {2,7,3,8,11,12};
        sortMyArray(input);
    }

    public static void sortMyArray(Integer [] input){
        Arrays.sort(input);
        ArrayList <Integer> firstHalf = new ArrayList<Integer>();
        ArrayList <Integer> secondHalf = new ArrayList<Integer>();
        AbstractList <Integer> sortedArray = new ArrayList<Integer>();

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        firstHalf.add(input[input.length -1]);
        secondHalf.add(input[input.length -2]);

        firstHalfSum += input[input.length -1];
        secondHalfSum += input[input.length -2];
        
        for(int i = input.length - 3; i >= 0; i--){

            if(firstHalfSum  <= secondHalfSum){
                firstHalf.add(input[i]);
                firstHalfSum += input[i];
            } else {
                secondHalf.add(input[i]);
                secondHalfSum += input[i];
            }
        }
        if(firstHalf.size() < secondHalf.size()){
            sortedArray.addAll(secondHalf);
            sortedArray.addAll(firstHalf);
        } else {
            sortedArray.addAll(firstHalf);
            sortedArray.addAll(secondHalf);
        }
        
        System.out.println(sortedArray);
        return;
    } 
}
