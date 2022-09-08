package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("손흥민");
		System.out.println(studentSon.getStudentName()+"카드번호: "+ studentSon.studentCard);
		
		Student3 studentP = new Student3();
		studentP.setStudentName("박지성");
		System.out.println(studentP.getStudentName()+"카드번호: "+ studentP.studentCard);

	}

}
