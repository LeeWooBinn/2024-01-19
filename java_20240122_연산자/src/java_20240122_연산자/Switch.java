package java_20240122_연산자;

public class Switch {

	public static void main(String[] args) {
		
		char grabe = 'B';
		
	    switch (grabe) {
	    case 'A':
	    	System.out.println("매우우수");
	    	break;
	    case 'B':
	    	System.out.println("우수");
	    	break;
	    case 'C':
	    	System.out.println("좋음");
	    	break;
	    case 'D':
	    	System.out.println("좀 더 열심히");
	    	break;
	    case 'f':
	    	System.out.println("미흡");
	    	break;
	    default:
	    	System.out.println("잘못된 등급");
	    }
	 
	}

}
