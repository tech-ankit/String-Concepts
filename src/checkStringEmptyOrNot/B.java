package checkStringEmptyOrNot;

public class B {
    public static void main(String[] args) {
        String x1 = "mike";
        System.out.println(x1.isBlank());//false

        String x2 = "";
        System.out.println(x2.isBlank());//is string is empty then return true

        String x3 = " ";//if method is empty and  have whitespaces then it returns true
        System.out.println(x3.isBlank());
    }
}
