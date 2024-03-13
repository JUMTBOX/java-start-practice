package loop;

public class LoopEx3 {
    public static void main(String[] args) {
        //1,2,3,100;
        int max = 100;
        int sum = 0;
//        int i = 1;
//        while (i <= max){
//            sum += i;
//            i+=1;
//        }
        for(int i=1; i<=max; i+=1){
            sum += i;
        }
        System.out.println(sum);
    }
}
