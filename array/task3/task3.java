public class task3 {

    public static void main(String[] args) {
        int[] numberArray = { 10, 3, 22, 9, 2, 18 };
        int max = 0;
        int min = numberArray[0];

        for (int number : numberArray) {
            if (max < number) {
                max = number;
            }

            if (min > number) {
                min = number;
            }

        }
            System.out.println("最小値は" + min);
            System.out.println("最大値は" + max);

    }

}
