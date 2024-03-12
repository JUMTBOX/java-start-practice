package condition;

public class ConditionEx3 {
    public static void main(String[] args) {
        int[] data = {-5,0,10};
        for(int i =0; i<data.length; i++){
            int usd = data[i];
            int rate = 1300;
            String comment;
            if(usd < 0){
                comment = "잘못된 금액입니다.";
            } else if (usd==0) {
                comment = "환전할 금액이 없습니다.";
            } else {
                comment = "환전 금액은 " + rate * usd + "원입니다.";
            }
            System.out.println("dollor: " + usd);
            System.out.println(comment);
        }
    }
}
