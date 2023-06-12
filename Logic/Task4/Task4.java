
public class Task4 {



            public static void main(String[] args) {
                int inputNum = 37;

                // 以下出力の処理をコーディングする

                System.out.println(isPrimeNumber(inputNum));

            }

            public static boolean isPrimeNumber(int inputNum) {
                // 以下素数の確認をする処理を追加する
                if (inputNum <= 1) {
                    return false;
                }

                // 2からnumber-1までの数で割り切れるかどうかを判定
                for (int i = 2; i <= Math.sqrt(inputNum); i++) {
                    if (inputNum % i == 0) {
                        return false;
                    }
                }
                return true;

            }



    }
