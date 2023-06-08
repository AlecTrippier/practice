// 準備
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class  Task2 {
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

        // 練習問題-2
        System.out.println(sweets.get("洋菓子").get(3));
        System.out.println();
    }
}