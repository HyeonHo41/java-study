package sec04.exam03;

public class Car {
	// 필드
	int gas;
	
	// 생성자
	
	// 메소드
	// 연료 주입 메소드(Setter)
	void setGas(int gas) {
		this.gas = gas;
	}
	// 연료를 확인하는 메소드
	boolean isLeftGas() {
		if (gas==0) {
			System.out.println("가스가 없습니다."+gas);
			return false;
		}
		System.out.println("가스가 있습니다."+gas);
		return true;
	}
	// 달리는 메소드
	void run() {
		while (true) {
			if (gas>0) {
				System.out.println("달립니다"+gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다"+gas);
				return;
			}
		}
	}
}
