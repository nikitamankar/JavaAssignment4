/*4)String array will be given.if a string is Prefix of an any other string in that array means count. */
public class Prefix04 {
	public static void main(String[] args) {
	String[] a={"Nikita","Nidhi","Priyanka","Kavita","Zarna"};
    String b="Ni";
    int n=0;
    for(int i=0;i<a.length;i++){
         
          String s1=a[i];
          if(s1.startsWith(b))
        
                n++; 
          }
    System.out.println(n);
}

	

}
