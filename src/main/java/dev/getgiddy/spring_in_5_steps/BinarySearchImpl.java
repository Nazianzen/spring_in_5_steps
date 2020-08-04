package dev.getgiddy.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired // Tell spring that this is a dependency for BinarySearchImpl
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        // Sorting an array
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        // Search the sorted array

        // Return the result
        System.out.println(sortAlgorithm);
        return numberToSearchFor;
    }
}