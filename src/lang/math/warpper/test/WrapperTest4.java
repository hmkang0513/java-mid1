package lang.math.warpper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        int integer1 = Integer.valueOf(str);
        Integer intValue = integer1;
        int integer2 = intValue;

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
