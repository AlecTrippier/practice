public class Task3 {
    public static void main(String[] args) {
        // 数値リテラルはアンダースコアを入れて桁の可読性をよくすることが出来る
        int deposit = 10_000; // 10000 と同等
        int amount = 3_214; // 合計金額
        int Change = deposit - amount; //おつり

        // 以下に処理を追加する
        System.out.print("合計金額:" + String.format("%,d",amount) + "円 ");
        System.out.print("預り金:" + String.format("%,d", deposit) + "円 ");
        System.out.println("おつり:" + String.format("%,d", Change) + "円");

        int[] bills = { 5000, 1000 }; // 確認したいお札の種類を配列に組み込む
        int[] coins = { 500, 100, 50, 10 , 1 }; // 確認したい硬貨の種類を配列に組み込む

        // 紙幣の枚数を計算して出力する
        // 金額が高い順から割り切れた額があれば合計金額から減算処理を行う
        for (int bill : bills) {
            int count = Change / bill; // データ形式がintなので整数の値のみ代入される
            System.out.println(String.format("%,d", bill) + "円札:" + count + "枚");
            Change %= bill; // 金額を割り算して余った金額が次の計算に使用される
        }

        for (int coin : coins) {
            int count = Change / coin;
            System.out.println(String.format("%,d", coin) + "円玉:" + count + "枚");
            Change %= coin; // 最終的に1円で全て割り切れる計算なのでChangeが0になったら終了となる
        }
    }
}
