/*6)int[] input={2,1,4,1,2,3,6};
    check whether the input has the sequence of "1,2,3". if so-
    output=true;
    int[] input={1,2,1,3,4,5,8};
    output=false                           */
public class matchsequence06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {2,1,4,1,2,3,6};
       // int[] a = {1,2,1,3,4,5,8};
         int n = 0;
        for(int i = 0;i < a.length-1;i++)
              if((a[i+1]-a[i]) == 1)
                    n++;
        if(n == 2){
          System.out.println("True");
         }else{
            	  System.out.println("False");
              }
                    
     
  }
}
	
		
	


