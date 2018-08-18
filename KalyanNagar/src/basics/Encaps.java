package basics;

public class Encaps {

	public static void main(String[] args) {
		A a=new A();
		a.setName("Peter");
		a.setAge(25);
		a.setRoll(10);
		System.out.println("Name="+a.getName());
		System.out.println("Age="+a.getAge());
		System.out.println("Roll="+a.getRoll());
	}
}
class A{
	private String name;
	private int age;
	private int roll;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
	public void setAge(int newAge) {
		this.age=newAge;
	}
	public void setRoll(int newRoll) {
		this.roll=newRoll;
	}
}
