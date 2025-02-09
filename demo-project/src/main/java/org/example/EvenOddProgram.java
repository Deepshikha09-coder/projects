package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddProgram {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(78,90,44,53,89,69,93);
        Map<Boolean, List<Integer>> oddEvenNumbersMap = integerList.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
        for (Map.Entry<Boolean, List<Integer>> booleanListEntry : oddEvenNumbersMap.entrySet()) {
            if(booleanListEntry.getKey()){
                System.out.println("Even Numbers");
            }else{
                System.out.println("Odd Numbers");
            }
            for (Integer i : booleanListEntry.getValue()) {
                System.out.println(i + " ");
            }

        }
    }
}
