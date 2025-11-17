package sec02.exam09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 2. System.arraycopy() 메소드 이용
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 1, newStrArray, 0, 2);
		System.out.println(newStrArray[0]);
		
		
		// 3. Arrays.copyof() 메소드 이용
		String[] newStrArray2 = Arrays.copyOf(oldStrArray,oldStrArray.length+2);
		System.out.println(newStrArray2[3]);

	}

}
