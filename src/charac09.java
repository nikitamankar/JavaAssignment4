import java.util.StringTokenizer;

/*9)input1-- Hello*world
    output-- boolean(true or false)
    operation-- if the character before and after * are same return true else false
                if there in no star in the string return false(Ignore case)  Add equal ignore case             */
public class charac09 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="HellO*oorld";
		boolean b=charcStar(input1);
		if(b==true){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
}
public static boolean charcStar(String input1){
			boolean b1=false;
		char c='*';
		int n=0;
		for(int i=0;i<input1.length();i++){
		 if(c==input1.charAt(i)){
			 n++;
			 if(n==1)	{ 
					StringTokenizer st=new StringTokenizer(input1,"*");
					String s1=st.nextToken();
					System.out.println(s1);
					String s2=st.nextToken();
					System.out.println(s2);
					
					               if(s1.charAt(s1.length()-1)==s2.charAt(0)){
						                   b1=true;
					                   }else{
						                 b1=false;
					                    }
			            }
			 
		                    }
}
		return b1 ;
		
	}
	

}
