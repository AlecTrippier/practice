public class exercises1 {

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 13;

        boolean isMultiple;

        if (13 % 8 == 0) {

            isMultiple = true;
        } else {
            isMultiple = false;
        }

        if (isMultiple) {
            System.out.println(num2 + "は"+ num1 +"の倍数です");
        } else {
            System.out.println(num2 + "は"+ num1 + "の倍数ではありません");
        }
    }

}