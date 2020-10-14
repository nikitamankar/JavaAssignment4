import java.util.Arrays;
import java.util.StringTokenizer;

/*18) i/p: Honesty is my best policy
    o/p: Honesty
    Return the maximum word length from the given string.
    If there are two words of same length then,
    return the word which comes first based on alphabetical order.   */
public class Honesty18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="Honesty is my best policy";
		String s="Honesty is my best Hanesty";
	
		String s1=null;
		int max=0;
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()){
		 s=st.nextToken();
		int n=s.length();
		if(n>max){
			max=n;
			s1=s;
		}else{
		if(n==max)
			for(int i=0;i<s.length();i++)
			{
				char c1=s1.charAt(i);
		        char c2=s.charAt(i);
		        if(c1!=c2){
		        	if(c1>c2)
		        		s1=s;
		        }
			}
			}
		}
		System.out.println(s1);
		

	}

}
