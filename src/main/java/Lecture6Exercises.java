import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {
    public long calculateEvenSum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
    public int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        if (m1[0].length != m2.length) {
            throw new RuntimeException("Dimensions don't match");
        }
        double[][] prod = new double[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++)
                    prod[i][j] += m1[i][k] * m2[k][j];
            }
        }
        return prod;
    }
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> array = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            array.add(Arrays.asList(names[i]));
        }
        return array;
    }
    public List<Integer> primeFactors(int n) {
        List<Integer> prime = new ArrayList<>();
        if (n % 2 == 0){
            prime.add(2);
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0){
                prime.add(i);
            }
            while (n % i == 0) {
                n /= i;
            }
        }
        if (n > 2)
            prime.add(n);
        return prime;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        return Arrays.asList(line.split("[^a-zA-Z]+"));
    }
}
