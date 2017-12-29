import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,count = 0,i = 0,j = 0;
		List<Integer> Olist = new ArrayList<>();
		List<Integer> EList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		x = sc.nextInt();
		System.out.println("Enter the second number:");
		y=sc.nextInt();
		
		for(int num=x;num<y;num++) {
			
			if(num%2==0) {
				EList.add(num);
	
			}
			else {
				Olist.add(num);
			
			}
			
		}
		//or(int count1=0;count1<10;count1++) {
System.out.println("Even numbers: " +EList);
System.out.println("Odd numbers: " +Olist);
	//	}
	}

}
