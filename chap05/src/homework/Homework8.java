package homework;

public class Homework8 {

	public static void main(String[] args) {
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] newMenu= new String[5];
		String[] add = {"Salad","Soup"};
		String result="";
		String result2="";
		
		System.arraycopy(menu, 0, newMenu, 0, 3);
		System.arraycopy(add, 0, newMenu, 3, 2);
		
		for (int i = 0; i < menu.length; i++) {
			result+=menu[i]+" ";
		}
		for (int i = 0; i < newMenu.length; i++) {
			result2+=newMenu[i]+" ";
		}
		System.out.println(result);
		System.out.println(result2);
	
		
		

	}

}
