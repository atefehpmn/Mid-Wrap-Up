public class Lecture4Exercises {
    public long factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);
    }
    public long fibonacci(int n) {
        if (n == 1||n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public String reverse(String word) {
        String rev="";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }
    public boolean isPalindrome(String line) {
        line = line.replaceAll("\\s", "");
        line = line.toLowerCase();
        if (reverse(line).equals(line)){
            return true;
        }
        return false;
    }
    public char[][] dotPlot(String str1, String str2) {
        char[][] dotPlot = new char[str1.length()][str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dotPlot[i][j] = '*';
                }
                else {
                    dotPlot[i][j] = ' ';
                }
            }
        }
        return dotPlot;
    }
}
