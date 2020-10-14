/*17)concat two string if length of two string is equal.
    if length of one string is greater, then remove the character from 
    largest string and then add. The number of characters removed from 
    largest string is equal to smallest string's length
    for example: input 1="hello";
                 input 2="helloworld";
                 output="worldhello";                 */
public class StringCocat17 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	String input1="hello";
	String input2="hello"; 
	
	StringBuffer sb=new StringBuffer(input2);
	if(input1.length()==input2.length())
		System.out.println(input1.concat(input2));
	else if(input1.length()<=input2.length())
		System.out.println(sb.delete(0, 5).append(input1));
	else if(input1.length()>=input2.length())
		System.out.println(sb.delete(0, 5).append(input1));
		

	}

}
