/*20)swap the every 2 chrecters in the given string 
    If size is odd number then keep the last letter as it is.
    Ex:- input: forget
	 output: ofgrte
    Ex:- input  : NewYork
         output : eNYwrok         */
public class swap20 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="forgett";
		
		StringBuffer sb=new StringBuffer();
		int j=0;
		if(s1.length()%2==0)
			j=s1.length();
		else
			j=s1.length()-1;
		
		for(int i=0;i<j;i=i+2){
			String s2=(s1.substring(i, i+2));
			System.out.println(s2);
			StringBuffer sb1=new StringBuffer(s2);
			sb.append(sb1.reverse());
			}
		String s3=new String();
		
		if(s1.length()%2==0)
			s3=sb.toString();
		else
			s3=sb.append(s1.charAt(s1.length()-1)).toString();

        System.out.println(s3);
	}

}
