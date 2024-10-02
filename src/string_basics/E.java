package string_basics;
//check is string is empty or not
public class E {
    public static void main(String[] args) {
        String x1 = "mike";//object is created and value is also present in this
        System.out.println(x1.length());

        String x2 = "";//object is created but value is empty //space is also consider as length
        System.out.println(x2.length());//if it is empty it will return zero, but it works on only empty even single space is also consider as length of one

        String x3 = null;// no object is created
        System.out.println(x3);//if we check here length of null string it throws and null pointer exception
    }
}
