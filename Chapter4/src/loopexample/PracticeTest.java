package loopexample;

public class PracticeTest {

	public static void main(String[] args) {
			
//		for(int i= 2; i < 10; i++) {
//			for(int j =1; j < 10; j++) {
//				if(j ==i || j <i) {
//					System.out.println(i + "x" + j +"=" +i*j);
//				}
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		/*
		 * for(int i =0; i < 4; i++) { for(int j = 1; j <= i ; j++) {
		 * System.out.print("*"); } System.out.println(" "); }
		 */
		
		
		for(int i = 6; i > 0; i--) {
			for(int j =0; j <7; j++) {
				if(j % 2 == 3) {
					System.out.print("*");
				}else {
					System.out.println(" ");
					
				}
			}
		}
		
		
		
		
		
	} 
	


}
