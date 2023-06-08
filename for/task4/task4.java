public class task4 {

    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            System.out.print(i +" ");

            if (i % 3 == 0) {
                System.out.print("Oh!");
            }

            if(i % 4 == 0){
                System.out.print("Yes!!");
            }

            System.out.println();
        }
    }
}
