
public class Overloading {

	
	static int sum(int x,int y) {
		return x+y;
	}
	static int sum(int x,int y, int z) {
		return x+y+z;
	}
	static double sum(int x, double y) {
		return x+y;
	}
	static double sum(double x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10,20));
		System.out.println(sum(23.9,45));
		System.out.println(sum(34,56.7));
		System.out.println(sum(10,20,30));
		

	}

}
