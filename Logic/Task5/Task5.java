
public class Task5 {

    public static void main(String[] args) {

        int n = 7;
        int sum = calculateSum(n);

        System.out.println("n = " + n);
        System.out.println("合計値：" + sum);

    public static int calculateSum(int n){
        if(n <= 0){
            return 0;
        }else{
            return n + calculateSum(n-1);
        }

    }

    }

}
