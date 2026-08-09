package com.dsa.app.leetcode.top150.arraystring;

public class LC0012_IntegerToRoman {
    public String intToRoman(int num) {

        Pair[] pairs = getPairs();
        String romanVal = new String();
        for(Pair pair :pairs){
            int qotient =num / pair.getValue() ;
            for(int i=0 ; i < qotient ; i++){
                romanVal = romanVal+pair.getSymbol();
            }
            num = num % pair.getValue() ;

        }

        return romanVal;
    }

    public Pair[] getPairs(){
        Pair[] pairs =  {new Pair(1000,"M"),new Pair(900,"CM"), new Pair(500,"D"), new Pair(400,"CD") , new Pair(100,"C"),new Pair(90,"XC"), new Pair(50,"L"),new Pair(40,"XL"), new Pair(10,"X"), new Pair(9,"IX"),new Pair(5,"V"), new Pair(4,"IV"),new Pair(1,"I") };
        return pairs ;
    }
}

class Pair{
    int value ;
    String symbol ;

    Pair(int value , String symbol){
        this.value = value ;
        this.symbol = symbol ;
    }

    int getValue(){
        return this.value ;
    }

    String getSymbol(){
        return this.symbol;
    }
}
