import java.util.*;
public class FirstCode {
	static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	static int lcm(int a,int b,int g) {
		int l;
		l = (a*b)/g;
		return l;
	}

	public static void main(String[] args) {
		System.out.println("LCM And HCF ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = gcd(a,b);
		System.out.printf("The GCD of %d and %d = %d\n",a,b,g);
		int l = lcm(a,b,g);
		System.out.printf("The LCM of %d and %d = %d",a,b,l);
		
		

	}

}
