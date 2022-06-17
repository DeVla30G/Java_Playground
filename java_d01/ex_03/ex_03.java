package ex_03;
import java.util.ArrayList;
/**
 * ex_03
 */
public class ex_03 {

    public static void printArray ( ArrayList < String > myArray ) {
        
         for(int i = 0 ; i < myArray.size(); i++ ){
            System.out.println(myArray.get(i));
        }

    }

    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();
        
        ex_03.printArray(myArray);
    }
         

}