package com.dsa.app.leetcode.top150.arraystring;

public class LC0006_ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1 ) return s ;
        StringBuilder sb = new StringBuilder();

        int increment = (numRows*2) -2;
        for(int i=0; i< numRows ; i++){
            for(int j=i ; j < s.length() ; j=j+increment){
                sb.append(s.charAt(j));
                if(i>0 && (i <numRows-1) &&
                        ( (j+increment - (2 * i)) < s.length())){
                    sb.append(s.charAt(j+increment - ( 2 * i)));
                }
            }
        }

        return sb.toString();
    }

    // main method to test the convert function
    public static void main(String[] args) {
        LC0006_ZigZagConversion obj = new LC0006_ZigZagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String result = obj.convert(s, numRows);
        System.out.println(result); // Output: "PAHNAPLSIIGYIR"
    }
}
