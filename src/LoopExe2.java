public class LoopExe2 {

    public static void main(String[] args) {

        formatTrinangle(6);
    }

    static void formatTrinangle(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (j < n - (i + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
}


