

public class Task2 {

    public static void main(String[] args) {

        int number = 12304;
        int tenpNumber = number;
        int sum = 0;

        while (tenpNumber != 0) {
            int digit = tenpNumber % 10; //最下位桁を取得する
            sum += digit; //　最下位桁を合計値に加算
            tenpNumber /= 10;

        }

        System.out.println("整数値: " + number);
        System.out.println("各桁の合計値: " + sum);
    }

}
