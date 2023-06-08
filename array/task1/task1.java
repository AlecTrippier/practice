public class task1 {
    public static void main(String[] args) {
        // 練習問題-1
        String[] products = {
            "水",
            "コーラ",
            "オレンジジュース",
            "カフェオレ"
        };
        String productsStr = "";

        /** for文を使った例 */
        for (int i = 0; i < products.length; i++) {
            productsStr += (i + 1) + ":" + products[i] + " ";
        }
        System.out.println(productsStr);
        System.out.println();

        /** 拡張for文を使った例 */
        int num = 1;
        for (String productName : products) {
            productsStr += num + ":" + productName + " ";
            num++;
        }
        System.out.println(productsStr);
        System.out.println();
    }
}

