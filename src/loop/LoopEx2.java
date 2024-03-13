package loop;

public class LoopEx2 {
//    public static void main(String[] args) {
//        int num = 0;
//
//        while (num <= 10) {
//            num += 2;
//            count++;
//            System.out.println(num);
//        }
//    }
    public static void main(String[] args) {
       for(int num = 2, count=1; count < 10; num +=2, count+=1){
           System.out.println(num);
       }
    }
}
