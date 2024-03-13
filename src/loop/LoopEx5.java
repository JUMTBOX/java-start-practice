package loop;

public class LoopEx5 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i+=1){
            for(int j = 1; j <= i; j+=1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
