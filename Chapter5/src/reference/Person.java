package reference;

public class Person {

	private int age;
	private String name;
	private boolean isMarried;
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	private int children;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	
	public void showInfo() {
		System.out.println("나이가 " +age+"살,"+ "이름이 "+name +"이라는 남자가 있습니다. 이남자는 결혼을 "+ isMarried +"고, 자식이 " +children+" 있습니다.");
	}
	
	
	
}
