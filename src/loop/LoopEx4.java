package loop;

public class LoopEx4 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i+=1){
            for(int j = 1; j < 10; j+=1){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
