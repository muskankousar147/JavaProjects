package com.google.vooteridapplication.things;
import java.util.ArrayList;
import java.util.List;
public class SubarraySum {

	public static void main(String[] args) {
		
		   
		        int[] array = {5, 2, 3, 1, 7, 8, 2, 3, 4};
		        int target = 7;
		        List<List<Integer>> result = findSubarrayPairsWithSum(array, target);
		        
		        // Print the results
		        for (List<Integer> subarray : result) {
		            System.out.println(subarray);
		        }
		    }

		    public static List<List<Integer>> findSubarrayPairsWithSum(int[] array, int target) {
		        List<List<Integer>> subarrayPairs = new ArrayList<>();

		        // Iterating over all possible starting points of subarrays
		        for (int i = 0; i < array.length; i++) {
		            // Generating all subarrays starting at index i
		            for (int j = i; j < array.length; j++) {
		                int sum = 0;
		                // Calculating the sum of the subarray array[i...j]
		                for (int k = i; k <= j; k++) {
		                    sum += array[k];
		                }
		                // If the sum matches the target, add this subarray to the result
		                if (sum == target) {
		                    List<Integer> subarray = new ArrayList<>();
		                    for (int k = i; k <= j; k++) {
		                        subarray.add(array[k]);
		                    }
		                    subarrayPairs.add(subarray);
		                }
		            }
		        }

		        return subarrayPairs;
		    }
		


	}


