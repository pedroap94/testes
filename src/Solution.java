import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void closestNumbers(List<Integer> numbers) {

        Map<Integer, Integer> result = new HashMap<>();

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < numbers.size(); i++){
            int minimum = Math.abs(numbers.get(0))-Math.abs(numbers.get(1));
            for (int j = 1; j < numbers.size(); j++) {
                int abs = Math.abs(numbers.get(i)) - Math.abs(numbers.get(j));
                if (abs < minimum) {
                    minimum = abs;
                    sb.append(numbers.get(i) + " " + numbers.get(j) + "\n");
                }
            }
        }

        System.out.println(sb);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());

//        Result.closestNumbers(numbers);
        List<Integer> list = Arrays.asList(6,2,4,10);
        Result.closestNumbers(list);

//        bufferedReader.close();
    }
}