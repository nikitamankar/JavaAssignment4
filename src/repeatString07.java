/*7)Input1=”cowboy”; Output1=”cowcow”;
    Input1=”so”;output1=”sososo”; 
    HINT: if they give 3 letter word u have to display 2 time;            */
public class repeatString07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="cowboy";
		String input2="co";
		StringBuffer sb=new StringBuffer();
		int n1=input2.length();
		System.out.println(n1);
		if(n1==3){
			sb.append(input2).append(input2);
		System.out.println(sb);
		}else if(n1==2){
			sb.append(input2).append(input2).append(input2);
			System.out.println(sb);
		}
			
		

	}

}
