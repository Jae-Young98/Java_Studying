package CH02;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);

        /*
         * 상수는 다른 값으로 변경이 불가능. 변수의 타입 앞에 'final' 을 붙임
         * final int MAX_SPEED = 100; // 선언과 동시에 초기화 해야함.
         * 상수의 이름은 모두 대문자로 하는 것이 암묵적인 관례
         */
    }
}
