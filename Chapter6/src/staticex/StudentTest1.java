package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		//객체의 생성과 상관없이 그전에 메모리 로드될때 시리얼넘이 잡힘.
		System.out.println(Student.serialNum);
		
		/*
		 * Student studentJ = new Student(); //시리얼넘버 증가
		 * 
		 * Student studentT = new Student(); System.out.println(studentJ.serialNum);
		 * System.out.println(studentT.serialNum);
		 * 
		 * 
		 * //클래스 변수는 클래스 이름으로 참조한다. System.out.println(Student.getSerialNum());
		 */

	}

}
