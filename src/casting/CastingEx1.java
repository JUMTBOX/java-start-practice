package casting;

public class CastingEx1 {
    public static void main(String[] args) {
        int intValue = 10;
        double dbValue = 15.25;

        intValue = (int) dbValue;
        System.out.println(intValue);
    }
}
