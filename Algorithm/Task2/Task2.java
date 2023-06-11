public class Task2 {


    public static void main(String[] args) {
        String str1 = "god";
        String str2 = "dog";
        System.out.println(permutation(str1, str2));
    }

    boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[128]; //ASCII文字の範囲に対応する配列を作成

        //　文字列sの文字の出現回数をカウント
        for (int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);
            count[ch]++;
        }

        // 文字列のtの文字の出現回数をカウント
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            count[ch]++;
            if (count[ch] < 0) {
                return false; // 文字が不足している場合はfalseを返す
            }

        }
        return true;
    }
}
