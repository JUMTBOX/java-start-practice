package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        double score = Math.floor(Math.random()*100);
        boolean result = score >= 80 && score <= 100;
        System.out.println("점수는 "+score+" 입니다.");
        System.out.println(result);
    }
}
