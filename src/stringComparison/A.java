package stringComparison;

public class A {
    public static void main(String[] args) {
        String x1 = "mike";
        String x2 = "mike";
        String x3 = "MIKE";
        String x4 = new String("mike");
        String x5 = new String("mike").intern();

        System.out.println(x1.equals(x2));//.equals is very case sensitive.

        System.out.println(x1.equals(x3));//.equals is very case sensitive it gives us false

        System.out.println(x1.equalsIgnoreCase(x3));//that ignore cases during comparison and give us boolean value

        System.out.println(x1.equals(x4));

        System.out.println(x1.equals(x5));
    }
}
