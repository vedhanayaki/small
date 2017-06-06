package larger;
import java.util.Scanner;
public class larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the values");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("the larger number is a");
		}
		if(b>c&&b>a){
			System.out.println("the larger number is b");
		}
		if(c>a&&c>b)
		{
			System.out.println("the larger number is c");
		}
	}

}
