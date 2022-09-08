package cooperation;

public class Tax {

	int passangerNumber;
	int money;
	
	
	public void takeTax(int money) {
		this.money += money;
		this.passangerNumber++;
		
	}
	
	public void showInfo() {
		System.out.println("택시 요금은 "+money+"원 지불하였습니다.");
	}
}
