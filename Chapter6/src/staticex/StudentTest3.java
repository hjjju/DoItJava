package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student1 studentP = new Student1();
		studentP.setStudentName("피카츄");
		System.out.println(Student1.serialNum); //serialNum 변수를 클래스 이름으로 참조.
		System.out.println(studentP.studentName +"학번: "+studentP.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName +"학번: "+ studentSon.studentID);
		

	}

}
