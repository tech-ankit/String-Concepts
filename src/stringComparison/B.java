package stringComparison;

public class B {
    public static void main(String[] args) {
        String x1 = "mike";
        String x2 = "sike";//it checks lexicographically.
        System.out.println(x1.compareTo(x2)); // it returns negative and positive value if content is equals then it returns 0 or if x1 is bigger than x2 then it will return positive value or if x1 is smaller than x2 then it will return negative value.
    }
}
