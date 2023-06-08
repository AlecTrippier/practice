
public class Task1 {
    public static void main(String[] args) {
        String[][][][] fonts = {
                {
                        {
                                { "T", "h", "e", " " },
                                { "q", "u" }
                        },
                        {
                                { "i" },
                                { "c", "k", " ", "b", "r" },
                                { "o", "w", "n" }
                        },
                        {
                                { " ", "f" }
                        }
                },
                {
                        {
                                { "o", "x", " ", "j" },
                                { "u" }
                        },
                        {
                                { "m", "p" },
                                { "s", " ", "o", "v" }
                        }
                },
                {
                        {
                                { "e", "r" },
                                { " ", "t", "h" },
                                { "e", " ", "l" }
                        },
                        {
                                { "a", "z", "y", " ", "d" },
                                { "o", "g", "." }
                        }
                }
        };

        for (int i = 0; i < fonts.length; i++) {
            for (int j = 0; j < fonts[i].length; j++) {
                for (int k = 0; k < fonts[i][j].length; k++) {
                    for (int l = 0; l < fonts[i][j][k].length; l++) {
                        System.out.print(fonts[i][j][k][l] + " ");
                    }
                }
            }
        }
    }

}



