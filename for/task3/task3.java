
public class task3 {
    public static void main(String[] args){
        for(int i = 1; i <=10; i++){
            if (i % 2 == 0) {
                System.out.println("処理をスキップします。");
                continue;
            }
            System.out.println(i + "回目の出力です。");

            if (i == 7) {
                System.out.println("処理を終了します");
                break;
            }

        }
    }
}
