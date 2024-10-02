package string_basics;
/*Different memory locations: x1 = "mike" is stored in the
  string pool, while x2 = new String("mike")
 creates a new object in the heap memory, even though both have the same content*/
/*== compares references, not content: Since x1 and x2 refer to different memory
locations (string pool vs heap), x1 == x2 returns false.*/
public class C {
    public static void main(String[] args) {
        String x1 = "mike";
        String x2 = new String("mike");
        System.out.println(x1 == x2);//x1 and x2 holds different object addresses. == compare references not the values.
    }
}
