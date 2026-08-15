package com.dsa.app.leetcode.top150.arraystring;

import java.util.ArrayList;
import java.util.List;

public class LC0068_TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        for(int i=0; i<words.length; ){
            int spaceCount = 0;
            int charInTheLine = words[i].length();
            int j=i;
            while(j+1<words.length && (charInTheLine+1+words[j+1].length()) <= maxWidth){
                j++;
                spaceCount++;
                charInTheLine= charInTheLine +1 + words[j].length();
            }
            int spacesToFill = maxWidth - charInTheLine ;
            int spacesToFillInEach = spaceCount==0? 0 : spacesToFill/spaceCount +1 ;
            int spacesToFillExtra = spaceCount==0?0:spacesToFill % spaceCount ;

            StringBuilder sb = new StringBuilder(words[i]);
            if(j==words.length-1){
                i++;
                while(i<=j){
                    sb.append(" " +words[i]);
                    i++;
                }
                while(spacesToFill>0){
                    sb.append(" ");
                    spacesToFill--;
                }
            }else{
                while(spaceCount>0 && i< words.length-1 && i<j){
                    int k = spacesToFillInEach ;
                    while(k>0){
                        sb.append(" ");
                        k--;
                    }
                    if(spacesToFillExtra>0){
                        sb.append(" ");
                        spacesToFillExtra-- ;
                    }
                    i++;
                    sb.append(words[i]);
                }
                while(spacesToFillInEach==0 && spacesToFill >0){
                    sb.append(" ");
                    spacesToFill--;
                }
            }

            i++;
            // System.out.println(sb.toString());
            result.add(sb.toString());
        }

        return result;

    }

    // clean version

        public List<String> fullJustify1(String[] words, int maxWidth) {
            List<String> result = new ArrayList<>();
            int i = 0;

            while (i < words.length) {
                int j = i;
                int lineLen = words[i].length();

                // Pack words into the current line
                while (j + 1 < words.length && lineLen + 1 + words[j + 1].length() <= maxWidth) {
                    j++;
                    lineLen += 1 + words[j].length();
                }

                int gaps = j - i;
                StringBuilder sb = new StringBuilder();

                // Case 1: Last line OR single word → left align
                if (j == words.length - 1 || gaps == 0) {
                    sb.append(words[i]);
                    for (int k = i + 1; k <= j; k++) {
                        sb.append(" ").append(words[k]);
                    }
                    while (sb.length() < maxWidth) {
                        sb.append(" ");
                    }
                } else {
                    // Case 2: Normal justification
                    int totalSpaces = maxWidth - (lineLen - gaps); // spaces to distribute
                    int spaceEach = totalSpaces / gaps;
                    int extraSpaces = totalSpaces % gaps;

                    sb.append(words[i]);
                    for (int k = i + 1; k <= j; k++) {
                        for (int s = 0; s < spaceEach; s++) sb.append(" ");
                        if (extraSpaces-- > 0) sb.append(" ");
                        sb.append(words[k]);
                    }
                }

                result.add(sb.toString());
                i = j + 1;
            }

            return result;
        }



    // Write a main method to test the above function
    public static void main(String[] args) {
        LC0068_TextJustification obj = new LC0068_TextJustification();
        String[] words = {"What","must","be","acknowledgment","shall","be"};//{"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = obj.fullJustify(words, maxWidth);
        for (String line : result) {
            System.out.println("\"" + line + "\"");
        }
    }
}
