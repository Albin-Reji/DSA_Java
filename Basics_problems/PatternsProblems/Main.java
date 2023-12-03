package PatternsProblems;

public class Main {

	public static void main(String[] args) {
//		pattern1(5);
//		pattern2(5);
//		pattern3(5);
//		pattern4(5);
//		pattern5b(6);
//		pattern6(5);
//		pattern7(5);
//		pattern8(5);
		pattern9(4);


	}
//	pattern 1:
	
//	*****
//	*****
//	*****
//	*****
//	*****
	
	static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
//  pattern 2:
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *
	static void pattern2(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	pattern 4:
	
//	*****
//	****
//	***
//	**
//	*
	
	static void pattern3(int n) {
		for (int i=0; i<n;i++) {
			for (int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
//  pattern 4:
	
//	1
//	12
//	123
//	1234
//	12345
	static void pattern4(int n) {
		for (int i=1; i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
//	pattern 5:
	
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*
	
	static void pattern5(int n) {
		for(int i=1;i<2*n;i++) {
			if(i<=n)
				{
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.print("\n");	
			}
			else {
				for( int j=1;j<=n+(n-i);j++) {
					System.out.print("*");
				}
				System.out.print("\n");	
			}
		}
	}
	static void pattern5b(int n) {
		for(int i=1;i<2*n;i++) {
			for(int j=1;j<=n-Math.abs(n-i);j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
//	pattern 6:
	
//    *
//   **
//  ***
// ****
//*****
	
	static void pattern6(int n) {
		for( int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}
//	pattern 7:
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
	static void pattern7(int n) {
		for(int i=1;i<2*n;i++) {
			for(int j=1;j<=Math.abs(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n-Math.abs(n-i);k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
//	 pattern 8:
	
//    1
//   212
//  32123
// 4321234
//543212345
	
	static void pattern8(int n) {
		for (int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {	
				System.out.print(col);

			}
			for(int col=2;col<=row;col++) {	
				System.out.print(col);

			}
			System.out.print("\n");
		}
	}
//	pattern 9:
	
//	   1
//	  212
//	 32123
//	4321234
//	 32123
//	  212
//	   1
	static void pattern9(int n) {
		for(int i=1;i<2*n;i++) {
			for(int space=1;space<=Math.abs(n-i);space++) {
				System.out.print(" ");
			}
			int c=i>n?2*n-i:i;
			for(int j=c;j>=1;j--) {
				
				System.out.print(j);
			}
			for(int col=2;col<=n-Math.abs(n-i);col++) {	
				System.out.print(col);

			}
			
			System.out.print("\n");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
