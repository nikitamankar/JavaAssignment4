/*3)Input1=”Hello World”;  output-------  “dello WorlH”.     */
public class HelloWorld03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="Hello World";
       StringBuffer sb=new StringBuffer();
	      sb.append(s.substring(s.length()-1)); //d
	      sb.append(s.substring(1, s.length()-1));//ello Worl
	      sb.append(s.substring(0, 1));//H
	     
	      System.out.println(sb);
	}

}
