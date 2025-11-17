package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2행 3열의 2차원 배열
		int[][]	mathScores = new int[2][3];
		
		// 2차원 배열의 모든 요소에 접근하려면 중첩 for문이 필요
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println(i+""+j+""+mathScores[i][j]);
			}
		}
		
		int[][] englishScores = new int [2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println(i+""+j+"="+englishScores[i][j]);
			}
		}
		
		int[][] javaScores = {
				{95,80},
				{92,96,80}
		};
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println(i+""+j+"="+javaScores[i][j]);
			}
		}

	}

}
