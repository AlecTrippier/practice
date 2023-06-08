
public class task4 {
    public static void main(String[] args){
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayB = {11, 21, 31, 41, 51, 61, 71};

        System.out.println("入れ替え前");
        System.out.print("配列Aの要素は ");
        for (int element : arrayA) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
        System.out.print("配列Bの要素は ");
        for (int element : arrayB) {
            System.out.print(element + " ");
        }

        for (int i = 0; i < arrayA.length; i++) {
            /** ここから追記可 */
        }
        System.out.println("");
        System.out.println("");
        System.out.println("入れ替え後");
        System.out.print("配列Aの要素は ");
        for (int element : arrayB) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
        System.out.print("配列Bの要素は ");
        for (int element : arrayA) {
            System.out.print(element + " ");
        }
    }
}
