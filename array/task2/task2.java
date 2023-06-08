public class task2 {
    String[] teamList = {
        "A",
        "B",
        "C",
        "D",
        "E"
    };

    public void printMatchupTable() {
        int numTeams = teamList.length;

        // 表のヘッダ行を出力
        System.out.print("| NoBattle ");
        for (int i = 0; i < numTeams; i++) {
            System.out.print("| A vs " + teamList[i] + " ");
        }
        System.out.println("|");

        // 表の各行を出力
        for (int i = 0; i < numTeams; i++) {
            System.out.print("| " + teamList[i] + " vs A ");
            for (int j = 0; j < numTeams; j++) {
                if (i == j) {
                    System.out.print("| NoBattle ");
                } else {
                    System.out.print("| " + teamList[i] + " vs " + teamList[j] + " ");
                }
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        task2 task = new task2();
        task.printMatchupTable();
    }
}
