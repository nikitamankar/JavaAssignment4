/*13)prove whether a number is ISBN number or not
input="0201103311"
ISBN number:  sum=0*10 +2*9+ 0*8 +1*7+ 1*6 +0*5+ 3*4 +3*3+ 1*2 +1*1
sum%11==0 then it is ISBN number    */
public class IsbnNumber13 {
	public static void main(String[] args) {
	      String input="0201103312";
		  int sum = 0;
		  int n = 10;
		  boolean b = false;

		  for (int i = 0; i < input.length(); i++) {
		   int c = Integer.valueOf(input.substring(i, i + 1));
		   sum = sum + (c * n);
		   n--;
		  }
		  System.out.println(sum);
		  if (sum % 11 == 0) {
		   b = true;
		  }

		  System.out.println("The ISBN Number Validation is " + b);
		  }
}
