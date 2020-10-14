import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
/*11) String i/p1=2012;
    sTRING i/p2=5
    IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;    */
public class Stringlength11 {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		String ip1="2023";
		String ip2="5";
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
			Date d1=sdf.parse(ip1);
			System.out.println(d1);
			Date d2=new Date();
			System.out.println(d2);
			int n1=d1.getYear();
		    int n2=d2.getYear();
			int n3=Integer.parseInt(ip2);
			if((n2-n1)>n3)
				System.out.println("True");
			else
				System.out.println("False");
		
		
		
		/*String s="15-08-2020";
		StringTokenizer st=new StringTokenizer(s,"-");
		st.nextToken();
		st.nextToken();
		String s1=st.nextToken();
		System.out.println(s1);
		int n=Integer.parseInt(ip1);
		int m=Integer.parseInt(s1);
		int n3=Integer.parseInt(ip2);
		
		if((m-n)>n3)
			System.out.println("True");
		else
			System.out.println("False");*/
	}
}
