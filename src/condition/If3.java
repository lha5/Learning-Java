package condition;

public class If3 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            // ~7: 미취학
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {
            // 8~13: 초등학생
            System.out.println("초등학생");
        }
    }
}