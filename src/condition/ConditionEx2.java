package condition;

public class ConditionEx2 {
    public static void main(String[] args) {
        int [] data = {1,25,5,150};
        for(int i = 0; i < data.length; i++){
            int distance = data[i];
            String ride = "도보";
            if (5 >= distance && 1 < distance) {
                ride = "자전거";
            } else if (25 >= distance && 5 < distance) {
                ride = "자동차";
            } else if (100 < distance) {
                ride = "비행기";
            }
            System.out.println("distance: " + distance);
            System.out.println( ride + "를 이용하세요.");
        }
    }
}
