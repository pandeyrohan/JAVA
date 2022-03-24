/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int m,n;
	   System.out.println("Enter the rows adn the columns: ");
	   m = sc.nextInt();
	   n = sc.nextInt();
	   int a[][] = new int[m][n];
	   for(int i=0;i<m;i++){
	       for(int j=0;j<n;j++){
	           a[i][j] = sc.nextInt();
	       }
	   }
	   System.out.println("Original Matrix: ");
	   for(int i=0;i<m;i++){
	       for(int j=0;j<n;j++){
	           System.out.print(a[i][j] + " ");
	       }
	       System.out.println("\n");
	   }
	   System.out.println("Rotated matrix: ");
	   for(int i=0;i<m;i++){
	       for(int j=i;j<n;j++){
	           int t = a[i][j];
	           a[i][j] = a[j][i];
	           a[j][i]= t;
	       }
	   }
	   for(int i=0;i<n;i++){
	       int l=0;
	       int r = a[i].length-1;
	       while(l<r){
	           int t=a[i][l];
	           a[i][l] = a[i][r];
	           a[i][r]=t;
	           l++;
	           r--;
	       }
	   }
	   for(int i=0;i<m;i++){
	       for(int j=0;j<n;j++){
	           System.out.print(a[i][j] + " ");
	       }
	       System.out.println("\n");
	   }
	   
	}
}

