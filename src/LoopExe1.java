public class LoopExe1 {

    public static void main(String[] args) {

        formatTriangle(6);
    }

    static void formatTriangle(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
