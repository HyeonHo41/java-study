package sec03.exam04.quiz;

public class Animal {
	String kind;
	int age;
	
	
	
	
	public Animal(String kind,int age) {
		this.kind = kind;
		this.age = age;		
	}
	public Animal(String kind) {
		this(kind,1);
	}
	public Animal(int age) {
		this("사람",age);
	}
	
	public void info() {
	  System.out.println(kind + ": " + age + "살");
	}
}



