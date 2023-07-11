
import java.util.Scanner;
class day1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sub marks");
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		float sum=0;
		sum=a+b+c+d+e;
		
		float p=(sum/(5*100))*100;
		System.out.println(p);
		boolean ab=sc.hasNextInt();
		System.out.println(ab);
		
		
	}
}