package condition;

public class ConditionEx5 {
    public static void main(String[] args) {
        String[] grades = {"A","B","C","D","F","E"};
        String comment;
        for(int i = 0; i < grades.length; i++){
            switch (grades[i]){
                case "A":
                    comment = "탁월한 성과입니다.";
                    break;
                case "B":
                    comment = "좋은 성과입니다.";
                    break;
                case "C":
                    comment = "준수한 성과입니다.";
                    break;
                case "D":
                    comment = "향상이 필요합니다";
                    break;
                case "F":
                    comment = "불합격입니다.";
                    break;
                default:
                    comment = "잘못된 학점입니다.";
            }
            System.out.println(comment);
        }
    }
}
