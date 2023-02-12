import java.util.Scanner;
public class semma {
public static void main(String[] args) {
		
		int p,n,r;
                             char sc;
                             Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Principle amount: ");
		p = scanner.nextInt();
		
		System.out.println("Enter the number of years: ");
		n = scanner.nextInt();
		System.out.println("Is customer senior citizen? (y/n): ");
	    sc = scanner.next().charAt(0);
		
		if(sc=='Y'||sc=='y')
		{
			r=12;
		}
		else
		{
			r=10;
		}
		int si = (p*n*r)/100;
		System.out.println("Interest: "+si);

	}
}
