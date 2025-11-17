package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		
		Student s2 = s1;
		System.out.println(s2);

		
		if (s1==s2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
