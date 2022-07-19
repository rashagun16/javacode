package Pattern;
import java.util.*;
public class Hollowrectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbber of rows");
		int r= sc.nextInt();
		System.out.println("Enter number of columns");
		int c=sc.nextInt(); 
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if((i==1)||(i==r)||(j==1)||(j==c))
					System.out.println("*");
				else
					System.out.println(" ");
			}
			System.out.println("\n");
			
		}
	}

}
