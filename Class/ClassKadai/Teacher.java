
/**
 * 先生クラス
 */
class Teacher {
    // 先生の名前
    private String name;
    // 担当教科
    private String subject;

    /**
     * 先生の名前をセットする
     * @param String name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 担当教科をセットする
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 先生の名前・担当教科を出力する
     */
    public void showTeacherInformation() {
        System.out.println("氏名: " + this.name + " 教科: " + this.subject);
    }
}