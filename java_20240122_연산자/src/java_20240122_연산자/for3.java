package java_20240122_연산자;

import java.util.Scanner;

public class for3 {

	public static void main(String[] args) {
		
        
		
		int a = 0;   // 홀수
		int b = 0;  // 짝수

		for(int i=0; i <=100; i++){
			
			if (i % 3==0 &&  i % 5==0)
			a += i;
			if (i % 3==0 &&  i % 5==0)
			b += 1;
		}
			
			System.out.println("3또는5의배수의합은" + a + "입니다.");	
			System.out.println("3또는5의배수의갯수는" + b + "입니다.");	
	}
}
