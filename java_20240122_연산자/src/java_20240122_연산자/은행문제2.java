package java_20240122_연산자;

import java.util.Scanner;

public class 은행문제2 {

	public static void main(String[] args) {
		
        int bank = 0;
        int tmp;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        
           for(; flag == true; ) {
        	
        	System.out.println("------------------------------");
        	System.out.println("1.예금\t| 2.출금\t| 3.잔고\t| 4.종료");
        	System.out.println("------------------------------");
        	
        			int num = Integer.parseInt(sc.nextLine());
        			switch(num){
        			case 1:
        				System.out.println("예금액 : ");
        				tmp = Integer.parseInt(sc.nextLine());
        				bank += tmp;
        				break;
        			case 2:
        				System.out.println("출금액 : ");
        				tmp = Integer.parseInt(sc.nextLine());
        				bank -= tmp;
        				break;
        			case 3:
        				System.out.println("잔고 :"+ bank +"\n");
        				break;
        			default :
        				flag = false;
        				break;
        	
        	
        	
        	}
        	
        System.out.println("프로그램 종료");
        
	  
        		  
        	
        		
        }
       
        
       
        		
        		
        
        
        
        
		
		

		
	}
}
