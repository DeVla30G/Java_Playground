package ex_01;
public class ex_01{

    public static void myConcat(String str1, String str2){
        System.out.println(str1.concat(str2));
    }

    public static void main(String[] args){
        myConcat("Hello ", "world");
    }
}