public class task6 {
    static int age = 20;
    static String gender = "female"; // female ：女性、 male ：男性
    static String status = "";

    public static void main(String[] args) {

        if (age == 10 && gender == "male") {
            status = "A";
            System.out.println(status);
        } else if (age == 30 && gender.equals("foo")) {
            status = "B";
            System.out.println(status);
        } else if (age == 12 && gender.equals("male")) {
            status = "C";
            System.out.println(status);
        } else if (age == -1 && gender.equals("male")) {
            status = "判定対象外";
            System.out.println(status);
        }


    }
}
