package condition;

public class ConditionEx1 {
    public static void main(String[] args) {
        int[] data = {90,65,55,85,75};
        for(int i = 0; i < data.length; i++){
            int score = data[i];
            String grade;
            if(score >= 90){
                grade = "A";
            } else if (80 <= score) {
                grade = "B";
            } else if (70 <= score) {
                grade = "C";
            } else if (60 <= score) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("학점은 " + grade + "입니다.");
        }
    }
}
