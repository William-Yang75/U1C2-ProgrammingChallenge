public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double average = (t1 + t2 + t3 + t4) / 4;
        return average;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) Math.round(average);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        long value = Math.round(userDouble * 100);
        int a = (Math.round(value /10000));
        int b = (Math.round(value /1000 % 10));
        int c = (Math.round(value /100 % 10));
        int d = (Math.round(value /10 % 10));
        int e = (Math.round(value % 10));
        int hundred = (a+1)%10;
        int ten = (b+1)%10;
        int one = (c+1)%10;
        int tenth = (d+1)%10;
        int hundredth = (e+1)%10;
        long adjusted = hundred * 10000L + ten * 1000L + one * 100L + tenth * 10L + hundredth;
        return adjusted/100.0;

    // long value = Math.round(userDouble * 100);

    // int hundreds = (int) (value / 10000);
    // int tens = (int) (value / 1000 % 10);
    // int ones = (int) (value / 100 % 10);
    // int tenths = (int) (value / 10 % 10);
    // int hundredths = (int) (value % 10);

    // hundreds = (hundreds + 1) % 10;
    // tens = (tens + 1) % 10;
    // ones = (ones + 1) % 10;
    // tenths = (tenths + 1) % 10;
    // hundredths = (hundredths + 1) % 10;

    // long adjusted = hundreds * 10000L + tens * 1000L + ones * 100L
    //         + tenths * 10L + hundredths;
    // return adjusted / 100.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(123.90));
        //231.01
    }

}
