package singleton;

public class Company {

	//외부에서 이 생성자를 호출 할수 없음.
	
	//단 한개의 인스턴스
	private static Company instance = new Company();
	
	private  Company() {
		
	}
	
	//외부에서 가져다 쓰기위한 메소드
	//객체를 생성하지 않고 사용하기 위해 static메소드로생성.
	public static Company getInstance() {
		if(instance == null)
			instance = new  Company();
		return instance;
	}
}
