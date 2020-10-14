import java.util.StringTokenizer;
/*16)Return 1 if the last & first characters of a string are equal else 
    return -1. Consider case.
    Eg: Input = "this was great"
        Output= 1                            */

public class StringCharc16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String Input= "This was great";
        boolean b=firstlastCharc(Input);
        if(b==true)
        	System.out.println("1");
        else
        	System.out.println("-1");
	}
public static boolean firstlastCharc(String Input){
		boolean b1=false;
      StringTokenizer st=new StringTokenizer(Input," ");
        String s1=st.nextToken();
        System.out.println(s1);
        st.nextToken();
        String s2=st.nextToken();
        System.out.println(s2);
       
        if(s1.charAt(0)==s2.charAt(s2.length()-1)){
        	b1=true;
        }else{	if((Character.isUpperCase(s1.charAt(0))==Character.isLowerCase(s2.charAt(s2.length()-1)))||
        			(Character.isLowerCase(s1.charAt(0))==Character.isUpperCase(s2.charAt(s2.length()-1)))){
        		
        	b1=true;
        }
        }
		return b1;
        	
		/*
			char s=Input.charAt(0);
		    char c=Input.charAt(Input.length()-1);
			if(s==c)
				b1=true;
		return b1;    */
			
	}

}
