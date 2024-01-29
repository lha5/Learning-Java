package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // boolean(불리언) true 또는 false 값만 입력 가능
        char d = 'A'; // 문자 하나를 다룰 때 사용. 작은따옴표(')를 사용해서 감싸야 한다. e.g. 'A', '가'
        String e = "Hello Java"; // 문자열. 문자열을 다루기 위한 특별한 타입

        // 리터럴(Literal)
        // 코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java"와 같은 고정된 값
        // 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
