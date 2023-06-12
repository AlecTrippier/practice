public class Task3 {
    public static void main(String[] args) {
        // 数値リテラルはアンダースコアを入れて桁の可読性をよくすることが出来る
        int deposit = 10_000; // 10000 と同等
        int amount = 3_214; // 合計金額
        int Change = deposit - amount; //おつり

        // 以下に処理を追加する
        System.out.print("合計金額:" + String.format("%,d",amount) + "円 ");
        System.out.print("預り金" + String.format("%,d", deposit) + "円 ");
        System.out.println("おつり" + String.format("%,d", Change) + "円");

        int[] bills = { 5000, 1000 };
        int[] coins = { 500, 100, 50, 10 };

        // 紙幣の枚数を計算して出力する
        for (int bill : bills) {
            int count = Change / bill;
            System.out.println(String.format("%,d", bill) + "円札:" + count + "枚");
            Change %= bill;
        }

        for (int coin : coins) {
            int count = Change / coin;
            System.out.println(String.format("%,d", coin) + "円玉:" + count + "枚");
            Change %= coin;
        }
    }
}
