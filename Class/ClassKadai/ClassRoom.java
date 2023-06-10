import java.util.HashMap;

class ClassRoom {
    // <出席番号 Student型>
    private HashMap<Integer, Student> students = new HashMap<Integer, Student>();

    // <(主担任 | 副担任) Teacher型>
    private HashMap<String, Teacher> teachers = new HashMap<String, Teacher>();

    /**
     * 以下のフィールド変数を書き換えてはならない
     */
    // 生徒の氏名
    private String[] studentNames = {"赤城", "加賀", "工藤", "斎藤", "島野", "高橋", "橋本", "松村", "柳沢"};

    // 学年
    private int grade = 6;

    // クラス番号
    private int classNumber = 1;

    /**
     * 練習問題-3
     */
    public void setStudents() {
        for (int i = 0; i < this.studentNames.length; i++) {
            Student student = new Student();
            student.setName(this.studentNames[i]);
            this.students.put(i + 1, student);
        }
    }

    /**
     * 主担任をセットする
     */
    public void setMainTeacher() {
        Teacher mainTeacher = new Teacher();
        mainTeacher.setName("山田太郎");
        mainTeacher.setSubject("国語");
        this.teachers.put("主担任", mainTeacher);
    }

    /**
     * 副担任をセットする
     */
    public void setSubTeacher() {
        /**
         * 練習問題-2
         */
        Teacher subTeacher = new Teacher();
        subTeacher.setName("佐々木一郎");
        subTeacher.setSubject("数学");
        this.teachers.put("副担任", subTeacher);
    }

    /**
     * クラス名簿を出力する
     */
    public void showClassRoom() {
        /**
         * 練習問題-4
         */
        System.out.println("------------------------------------");
        System.out.println(this.grade + "年" + this.classNumber + "組 クラス名簿");
        System.out.println("------------------------------------");
        this.teachers.forEach((key, teacher) -> {
            System.out.print(key + " ");
            teacher.showTeacherInformation();
        });
        System.out.println("------------------------------------");
        System.out.println("生徒一覧");
        this.students.forEach((key, student) -> {
            System.out.print(key + ". ");
            student.showName();
        });
        System.out.println("------------------------------------");
    }
}