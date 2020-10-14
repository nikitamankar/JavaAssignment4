/*8) input---input1=1;
            input2=4;
            input3=1;
    output1=4;
    operation--- print the element which is not repeated    
    if all the inputs r different sum all inputs
    input---input1=1;
            input2=2;
            input3=3;
    output1=6;               */
public class addition08 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=1,b=2,c=3;
		int  a=1,b=4,c=1;
		
		System.out.println(sumofnonRepeatedValues(a,b,c));
			
		}
public static int sumofnonRepeatedValues(int a,int b,int c){
	int n=0;
	if((a!=b)&&(b!=c)&&(c!=a))
	n=a+b+c;
	else
		if((a==b)&&(b==c))
			n=0;
		else if(a==b)
			n=c;
		else if(b==c)
			n=a;
		else if(a==c)
			n=b;
	return n;
	
}

	

}
