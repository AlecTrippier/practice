
/**
 * 生徒クラス
 */
class Student {
    private String name;

    /**
     * 生徒の名前をセットする
     * @param String name
     */
    public void setName(String name) {
        this.name = name;
    }

    // 練習問題-1

    public void showName() {

        System.out.println(this.name);

    }
}