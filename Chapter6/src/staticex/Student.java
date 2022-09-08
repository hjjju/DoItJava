package staticex;

public class Student {
	static int serialNum = 10000; //static변수
	
	int studentId;	//인스턴스변수, 멤버변수
	String studentName;
	
	public Student() {	//생성자호출
		serialNum++;
		studentId = serialNum;
	}

	public static int getSerialNum() {
		int i = 10;	//지역변수 stack
		i++;
		System.out.println(i);
		
		//static메서드에서는 멤버변수,인스턴스변수 사용X
//		studentName = "홍길동"; //멤버변수, 인스턴스변수 new 될때 생성됨.-> 생성되지도 않아서 사용할수x
		
		return serialNum;	//static변수(클래스변수)
	}
	
	
	
	
}
