package condition;

public class ConditionEx4 {
    public static void main(String[] args) {
        String[] movies = {"어바웃타임", "토이 스토리", "고질라"};
        int[] ratings = {9,8,7};
        double minimumRate = Math.floor(Math.random()*10);
        for(int i =0; i < movies.length; i++){
            String movie = movies[i];
            int rating = ratings[i];
            if(rating >= minimumRate) {
                System.out.println(movie +"을(를) 추천합니다.");
            } else {
                System.out.println(movie +"을(를) 추천하지 않습니다.");
            }
        }
        System.out.println("평점 기준: " + minimumRate);
    }
}
