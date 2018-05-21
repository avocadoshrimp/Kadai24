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
    	
    	if(n>0&&n<20){
    		return "";
    	}else{
    		
    		return "";
    	

    }
    }
}
