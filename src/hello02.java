/*input="hello"
    output="hlo"; Alternative positions...       */

public class hello02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hello";
		for(int i=0;i<input.length();i++)
			if(i%2==0)
				System.out.print(input.charAt(i));
				
		}

}
