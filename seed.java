
import java.util.Scanner;

public class seed {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
    	System.out.println("enter x");
    	int x=scan.nextInt();
    	System.out.println("enter y");
    	int y=scan.nextInt();
    	int mul=x,data=0;
    	while(x!=0)
    	{
    		data=x%10;
    		x=x/10;
    		mul*=data;
    	}
    	if(mul==y)
    		System.out.println("yes");
    	else
    		System.out.println("no");
     
	}

}
