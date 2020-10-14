/* 10)input --String input1 ="xaXafxsd"
    output--String output1="aXafsdxx"
    operation-- remove the character "x"(only lower case) from string and place at the end    */
public class characXX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="xaXafxsd";
		StringBuffer sb=new StringBuffer(s);
		char c='x';
	
		for(int i=0;i<sb.length();i++)
			if(c==sb.charAt(i)){
				char c1=sb.charAt(i);
			      sb.deleteCharAt(i);
		         String s2=String.valueOf(c1);
		          sb.append(s2);
	}	
		System.out.println(sb);	

	}

}
