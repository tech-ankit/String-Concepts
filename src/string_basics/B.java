package string_basics;
//new String("mike") makes two different objects, even though both have the same value.
//== checks references, not value the == checks if the two objects are in the same place in
// memory, not if they hold the same text. Since they are different objects, x1 == x2 is
// false.
public class B {
    public static void main(String[] args) {
        String x1 = new String("mike");
        String x2 = new String("mike");
        System.out.println(x1 == x2);
    }
}
