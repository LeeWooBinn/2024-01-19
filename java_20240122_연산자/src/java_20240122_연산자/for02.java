package java_20240122_연산자;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		
        
		

		int odd = 0;   // 홀수
		int even = 0;  // 짝수

		for(int i=1; i <=100; i++){
		   if(i % 2 == 0){
		      even += i;   // 짝수 합
		   }else if(i % 2 == 1){
		      odd += i;      // 홀수 합
		   }
		}
		System.out.println("짝수 합 : "+ even + "홀수 합: " + odd);
	}
}
