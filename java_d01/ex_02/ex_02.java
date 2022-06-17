package ex_02;

public class ex_02 {
    public static String getAngryDog (int nbr) {
        String result = " ";
        for (int i = 0; i < nbr; i ++){
            result = result + " woof";
    }
    return result;
}
    public static void main(String[] args) {
        
        System.out.println(getAngryDog(3));
    }
}
