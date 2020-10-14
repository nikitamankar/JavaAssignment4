/*12)input string="hello", n=2
    output: lolo                     */
public class stringHello12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		int n1=2;
		
		String s2=s1.substring(s1.length()-n1, s1.length());
		System.out.println(s2);
		StringBuffer sb=new StringBuffer();
		   for(int i=0;i<n1;i++)
			sb.append(s2);
		System.out.println(sb);
    }
}
