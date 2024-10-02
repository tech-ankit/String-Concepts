package StringModification;

public class C {
    public static void main(String[] args) {
        String x1 = "a a aaa b a ba";
        int count = 0;
        for(int i = 0;i < x1.length(); i++){
            if(x1.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
