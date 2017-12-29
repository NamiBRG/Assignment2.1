import java.util.*;

public class acad {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("First number: ");
		x=sc.nextInt();
		System.out.println("Second number: ");
		y=sc.nextInt();
		z = sum(x,y);
		System.out.println("The sum is: "+z);	
	}

	static int sum(int a,int b)
	{
	return a+b;	
	}
}

