package homework;

public class Homework1 {

	public static void main(String[] args) {
		int[] key = {152, 180, 165, 158, 171};
		int[] newKey = new int[5];
		
		
		for (int i = 0; i < key.length-1; i++) {
				if (key[i]>key[i+1]) {
					newKey[i]=key[i+1];
					newKey[i+1]=key[i];
				} else {
					newKey[i]=key[i];
					newKey[i+1]=key[i+1];
				}
				
			
		}

		for (int i = 0; i < newKey.length; i++) {
			System.out.print(newKey[i]+" ");
		}
	}

}
