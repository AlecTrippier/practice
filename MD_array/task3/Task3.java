// 準備
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MultidimensionalArrayAnswer {
    public static void main(String[] args) {
        // 準備
        List<String> wagashi = new ArrayList<String>();
        wagashi.add("みたらし団子");
        wagashi.add("ういろう");
        wagashi.add("せんべい");
        wagashi.add("羊羹");

        List<String> yogashi = new ArrayList<String>();
        yogashi.add("ショートケーキ");
        yogashi.add("プリン");
        yogashi.add("シュークリーム");
        yogashi.add("クッキー");
        yogashi.add("マシュマロ");
        yogashi.add("チョコレート");

        Map<String, List<String>> sweets = new HashMap<String, List<String>>();
        sweets.put("和菓子", wagashi);
        sweets.put("洋菓子", yogashi);

        // 練習問題-3
        /** 拡張for文を使った例 */
        for (String key : sweets.keySet()) {
            System.out.println(key + ": " + sweets.get(key).size() + "個");
        }
        System.out.println();

        /** forEachメソッドを使った例 */
        sweets.forEach((key, value) -> {
            System.out.println(key + ": " + value.size() + "個");
        });
        System.out.println();
    }
}