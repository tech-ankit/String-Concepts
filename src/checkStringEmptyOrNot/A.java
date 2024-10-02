package checkStringEmptyOrNot;

public class A {
    public static void main(String[] args) {
        String x1 = "mike";
        System.out.println(x1.isEmpty());//false

        String x2 = "";
        System.out.println(x2.isEmpty());//it will return true because this is a empty string

        String x3 = " ";
        System.out.println(x3.isEmpty());//space is consider as value
    }
}
