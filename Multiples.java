import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,z=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			z=x*i;
			System.out.printf("%d x %d = %d\n",x,i,z);
		}
	}

}
