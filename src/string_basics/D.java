package string_basics;
/*The intern() method moves the new
String("mike") to the string pool,
x1 and x2 refer to the same object in the pool.
This is why x1 == x2 returns true.*/
/*The .equals() method checks
if the contents of the strings are the same, which is
true in this case, as both x1 and x2 have the same value,
 "mike". So, x1.equals(x2) will also return true.*/
public class D {
    public static void main(String[] args) {
        String x1 = "mike";
        String x2 = new String("mike").intern();//explicitly moved data to string pool instead of storing in heap using new keyword
        System.out.println(x1 == x2);
        System.out.println(x1.equals(x2));
    }
}
