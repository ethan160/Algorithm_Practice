
/*
Implement function atoi to convert a string to an integer.

If no valid conversion could be performed, a zero value is returned.

If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.

Example
"10" => 10
"-1" => -1
"123123123123123" => 2147483647
"1.0" => 1
*/


public class Solution {
    /*
     * @param str: A string
     * @return: An integer
     */
    public int atoi(String str) {
        // write your code here
        if (str == null || str.length() < 1)
        return 0;
        
        // trim white spaces
        str = str.trim();
 
        char flag = '+';
 
        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        // use double to store result
        double result = 0;
    
        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
 
        if (flag == '-') {
            result = -result;
        }
 
        // handle max and min
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
 
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
 
        return (int) result;
    }
}