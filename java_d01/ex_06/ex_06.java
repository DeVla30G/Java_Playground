package ex_06;

/**
 * ex_06
 */
public class ex_06 {

    public static void sequence(int nbr) {
		String ref, res = "1";
		int count, i = 0;
		char c;
		for (int n = 0; n <= nbr; n++) {
			ref = res;
			res = "";
			c = ref.charAt(i);
			System.out.println(ref);
			while (i < ref.length()) {
				count = 0;
				while (i < ref.length() && c == ref.charAt(i)) {
					count++;
					i++;
				}
				res += Integer.toString(count) + c;
				if (i < ref.length())
					c = ref.charAt(i);
				else
					i++;
			}
			i = 0;
		}
	}
    public static void main(String[] args){
        sequence(0);
        sequence(1);
        sequence(2);
        sequence(3);
        sequence(4);
        sequence(5);
        sequence(6);
    }
}