/*19) In a string check whether all the vowels are present
    if yes return 1 else 2.
    ex: String 1="education"
        output=1.              */
public class vowels19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="edcation";
		String s2="aeiou";
		System.out.println("Length of s2:    "+s2.length());
		int n=0;
		for(int i=0;i<s2.length();i++)
			for(int j=0;j<s1.length();j++)
				if(s1.charAt(j)==s2.charAt(i)){
				n++;	
				}
				System.out.println("Length of n:    "+n);
			
			
		if(n==s2.length())
			System.out.println("All vowels are present:    1");
	    else
			System.out.println("Some vowels are missing:    2");
				

	}

}
