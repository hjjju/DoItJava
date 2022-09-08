package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName +"," + address);
		
	}
	
//	public Student() {} //자바컴파일러가 추가해줌, 매개변수x 생성자가 하나도 없을때만 만들어줌
	
//	public Student(int id, String name) {
//		studentID = id;
//		studentName = name;
//	}
//	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) { //메인함수
		
		int i = 10; //기본자료형
		
		
		Student studentLee = new Student(); //객체
		studentLee.studentName = "이순신";
		studentLee.studentID=100;
		studentLee.address ="서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID=101;
		studentKim.address ="미국 산호세";
				
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
	
	
}
