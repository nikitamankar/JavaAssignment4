/*15) pan card number validation:
    all letters shud be in caps,shud be of 8 chars.
    first three letters must be alphabets.
    next 4 letters shud be digits and last letter shud be an alphabet   */
public class panCardValidation15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABc1234C";
		
		boolean b=false;
		int n=0;
		if(s.length()==8){
			for(int i=0;i<=2;i++){
				char c=s.charAt(i);
				if(Character.isUpperCase(c))//||Character.isUpperCase(s.charAt(s.length()-1)))
			      n++;
				else
					n=0;;
		       }
			if(n==3){
			for(int j=3;j<=6;j++){
				char cc=s.charAt(j);
				if(Character.isDigit(cc))
					 b=true;
				else
					b=false;
			  }
			
			if(Character.isUpperCase(s.charAt(s.length()-1))){
				b=true;
			}else{
					b=false;
			}
		}
		}
		
	if(b==true)
			System.out.println("PanCard Number Is Correct");
		else
			System.out.println("PanCard Number Is************* InCorrect");
			

	}

}
