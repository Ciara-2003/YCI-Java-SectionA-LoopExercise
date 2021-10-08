public class LoopExe3 {
    public static void main(String[] args) {
        formattwoTriangle(7);
    }
    public static void formattwoTriangle(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




