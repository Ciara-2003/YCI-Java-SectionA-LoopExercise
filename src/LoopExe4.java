public class LoopExe4 {
    public static void main(String args[]) {
        butterflywithline(4);
    }
    public static void butterflywithline(int x){
        showline(x);
        showbutterfly(x);
        showline(x);
    }
    public static void showline(int x){
        for (int i = 1; i <= (x*2)+1; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void showbutterfly(int x){
        for (int i = 1; i <= x-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= ((x-i)*2)+1; k++) {
                System.out.print("  ");
            }
            for (int h = i; h >= 1; h--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= ((x-i)*2)+1; k++) {
                System.out.print("  ");
            }
            for (int h = i; h >= 1; h--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}