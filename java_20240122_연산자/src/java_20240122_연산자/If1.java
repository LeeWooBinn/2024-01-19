package java_20240122_연산자;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);
		
		int won;
		
		System.out.println("나이를 입력하시오");
		won = sc.nextInt();
		
	
		if(won >=65) {
			won = 0;
		}
		
		else if (won >=20) {
			won = 1500;
		}
		else if (won>=14) {
			won = 1500/4*3;
		}
		else if (won>=4)  {
			won = 1500/2;
		}
		else {
			won = 0;
		}
		
		
		System.out.println("요금은" + won +"원 입니다.");
	}

}
