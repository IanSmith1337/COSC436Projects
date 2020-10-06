package PairProgramming;

/* 
----------------------------------------------------------------
Problem 1:
----------------------------------------------------------------
Given an array of integers, return indices of the two numbers such that they add up to a 
specific target. You may assume that each input would have exactly one solution, and 
you may not use the same element twice. 
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
----------------------------------------------------------------
*/
public class Problem1 {
    public static void main(String[] args) {
        Integer[] arrayIntegers = {1, 2, 3, 4, 5};
        Integer target = Integer.parseInt(args[0]);
        try {
            Integer[] indexes = findNumbers(arrayIntegers, target);
            for (Integer integer : indexes) {
                System.out.println(integer);
            }
        } catch (NullPointerException e) {
            System.out.println("No valid indexes found.");
        }
    }

    public static Integer[] findNumbers(Integer[] array, Integer number) {
        int target = number;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if((array[i] + array[j]) == target) {
                    Integer[] result = {i, j};
                    return result;
                }
            }
        }

        Integer[] result = {};
        return result;
    }
}

/* 
to compile: 

javac <folder>/<filename>
cd <folder>
java <filename>

*/