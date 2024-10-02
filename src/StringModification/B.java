package StringModification;
//The trim() method deletes extra spaces from the beginning and end of the string.
//here we apply replaceAll() method to remove extra spaces between two words here
// we replace space and tab space with single white sapce.
public class B {
    public static void main(String[] args) {
        String x1 = "  mike    stallin fernandize     ";
        System.out.println(x1.trim().replaceAll("\\s+"," "));
    }
}
