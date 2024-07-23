import java.lang.*;
import java.util.*;
class square
{
	public static void main(String args[])
{
	int a;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter a no ");
	a = s1.nextInt();
	double Root = Math.sqrt(a);

	System.out.println("square root is : "+Root);
	s1.close();
	}
}

