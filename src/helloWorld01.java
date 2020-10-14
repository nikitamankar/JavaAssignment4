/*1)INPUT1= helloworld
   INPUT2= 2. delete the char,if rpted twice.
   if occurs more than twice,leave the first occurence and delete the duplicate
   O/P= helwrd;            */
public class helloWorld01 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="helloworld";
		int input2=2;
		
		StringBuffer sb=new StringBuffer(input1);
		for(int i=0;i<sb.length();i++){
			int n=0;
			for(int j=i+1;j<sb.length();j++){
				
				if(sb.charAt(i)==sb.charAt(j)){
					sb.deleteCharAt(j);
					n++;
				}
			}
	if((n==(input2-1))){
		sb.deleteCharAt(i);
		System.out.println(sb);
	      }
		}
	}
}
