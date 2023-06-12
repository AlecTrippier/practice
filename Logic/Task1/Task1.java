public class Task1 {


        public static void main(String[] args) {
            int[] nums = {40, 84, 10, 37, 24, 3, 58, 29, 76, 55};

            // バブルソートでソートする

            // forで要素の数分繰り返し
            for (int i = 0; i < nums.length; i++) {
                // 比較のため要素の数分繰り返し
                // 比較範囲を徐々に狭めていくため nums.length -i　が必要
                // 内側の処理で要素数 +1 が実行されるため、配列の範囲外にアクセスしないように -1 が必要
                for (int j = 0; j < nums.length - i - 1; j++) {
                    // 元の要素と次の要素と比較
                    if (nums[j] > nums[j + 1]) {
                        // 元の要素より次の要素が小さい場合は一時変数に元の要素の値を代入
                        int temp = nums[j];
                        // 元の要素を次の要素で上書き
                        nums[j] = nums[j + 1];
                        // 一時変数に代入していた元の要素で次の要素を上書き
                        nums[j + 1] = temp;
                        // 繰り返し
                    }

                }

            }
                // ソート結果の表示
            System.out.println("ソート結果:");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

}
