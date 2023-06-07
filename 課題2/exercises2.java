
public class exercises2 {

    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 13;

        if ((num1 + num2) % 7 == 0) {
            if (num1 > 10 || num1 % 2 == 0) {
                if (num2 < 100 && num2 % 6 != 0) {
                    System.out.println("すべての条件を満たしました");
                }
            }
        }
    }
}
