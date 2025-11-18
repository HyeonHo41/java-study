package sec04.exam02;

public class Computer {

    // 1. 매개 변수를 배열 타입으로 선언
    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    // 2. 가변인자 ... 사용
    int sum2(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}