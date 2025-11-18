package sec03.exam03.quiz;

public class Animal {
	String kind;
	int age;
	
	
	
	
	public Animal(String kind,int age) {
		this.kind = kind;
		this.age = age;		
	}
	public Animal(String kind) {
		this.kind = kind;		
		this.age=1;
	}
	public Animal(int age) {
		this.age = age;
		this.kind="사람";
	}
	
	public void info() {
	  System.out.println(kind + ": " + age + "살");
	}
}



