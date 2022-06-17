package ex_05;
import java.util.ArrayList;
/**
 * ex_05
 */
public class ex_05 {

    public static void main(String[] args) {
  
       System.out.print(myGetArgs("a", "b", "c"));
     }

    public static ArrayList<String> myGetArgs(String ... var) {
        ArrayList<String> arr = new ArrayList<String>(var.length);
        for(int i=0; i < var.length; i++){
            arr.add(var[i]);
        } 
        return arr;
    }
   
}