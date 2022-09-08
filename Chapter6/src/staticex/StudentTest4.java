package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentP = new Student2();
		studentP.setStudentName("피카츄");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentP.getStudentName()+"학번: "+studentP.studentID);
		
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.getStudentName()+"학번: " +studentSon.studentID);
		

	}

}
