package Algorithm.Task5;

public class Task5 {
    public static void main(String[] args) {
        String answer = "ACBD";
        String guess = "DDBB";
        calculateHitAndBlow(answer, guess);
    }

    public static void calculateHitAndBlow(String answer, String guess) {
        int hit = 0;
        int blow = 0;

        for (int i = 0; i < answer.length(); i++) {
            char answerChar = answer.charAt(i);
            char guessChar = guess.charAt(i);

            if (answerChar == guessChar) {
                hit++;
            } else if (answer.contains(String.valueOf(guessChar))) {
                blow++;
            }
        }

        System.out.println("ヒット: " + hit);
        System.out.println("ブロー: " + blow);
    }
}
