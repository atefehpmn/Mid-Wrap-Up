import java.util.*;

public class Lecture5Exercises {
    public String weakPassword(int length) {
        Random rand = new Random();
        String pass = "";
        for (int i = 0; i < length; i++) {
            pass += (char)(rand.nextInt(26) + 97);
        }
        return pass;
    }
    public String strongPassword(int length) throws Exception {
        if (length <= 2) {
            throw new Exception("Length can't be less than 3");
        }
        Random rand = new Random();
        String pass = "";
        int digitN = rand.nextInt(length - 2);
        int specialN = rand.nextInt(length - digitN - 2) + 1;
        digitN++;
        for (int i = 0; i < digitN; i++){                   //add random number of digits to password
            pass += (char)(rand.nextInt(9)+49);
        }
        for (int i = 0; i < specialN; i++){                 //add random number of special characters to password
            pass += (char)(rand.nextInt(15)+33);
        }
        pass += weakPassword(length - digitN - specialN); //fill the rest of the string with weak password generator
        char[] array = pass.toCharArray();
        for (int i = 0; i < length; i++) {    //shuffle the string
            int randomIndexToSwap = rand.nextInt(length);
            char temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return new String(array);
    }
    public boolean isFibBin(int n) {
        for (int i = 1; i < n; i++) {
            long fib = fibonacci(i);
            if (fib + Long.bitCount(fib) == n) {
                return true;
            }
        }
        return false;
    }
    public long fibonacci(int n) {  //added the fibonacci method to use in isFibBin
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
