package string_basics;
/*String pool concept: In Java, when you create a
string using quotes ("mike"), it goes into a special memory are called the string pool.
Both x1 and x2 point to the same object in the pool since the content is same.*/

/*== compares the memory addresses: In this case, x1 == x2 returns true
because both variables refer to the same object in the string pool*/

public class A {
    public static void main(String[] args) {
        String x1 = "mike";
        String x2 = "mike";
        System.out.println(x1==x2);
        //it will definetely returns true because this ==
        // comparing the object address of string because
        // string has string pool concept both variable are refers same
        // object present in string pool
    }
}
