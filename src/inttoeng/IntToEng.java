package inttoeng;

import java.util.Scanner;
public class IntToEng {
	   // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	//数字を読み取る
    	String number = String.valueOf(n);
    	int oneplace = n%10; //いちのくらい
    	int tenplace = n/10; //じゅうのくらい
    	
    	//1~19
    	String[] NumPart1 = {"zero", "one", "two", "three", "four","five", "six", 
    			"seven", "eight", "nine","ten", "eleven", "twelve", "thirteen",
    			"fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	
    	//20,30,40,50,60,70,80,90
    	String[] NumPart2 = {"","","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    	
    	if(n>0&&n<20){
    		number =NumPart1[n];
    		return number;
    	}else{
    		number = NumPart2[tenplace]+" "+NumPart1[oneplace];
    		return number;
    	

    }
   }
}
