package sec04.exam02;

import java.io.IOException;

public class KeycodeExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		// 키보드로부터 키코드를 읽어올 때 예외가 발생할 수 있음 => 예외처리(추후 학습)
		keyCode = System.in.read();  //콘솔에서 키보드로부터 입력을 받을 때까지 기다림//없으면 멈춤
		System.out.println("keyCode:"+keyCode);
		
	
	}

}
