import java.lang.Math;

public class kraw {

	public static void main(String[] args) {
		kraw k = new kraw();
		k.Run();
	}
	
	public void Run(){
		
		// Create dummy values for analysis
		int a = 5;
		String s1 ="val";
		double d1 =5.0;
		
		
		// Run dummy functions. These are not clones.
		foo1(a);
		System.out.println(foo2(a,a));
		System.out.println(foo3(a));
		System.out.println(foo4(a));
		
		// Run the Roy clones		
		sumProdO(a);
		sumProd1A(a);
		sumProd1B(a);
		sumProd1C(a);
		sumProd2A(a);
		sumProd2B(a);
		sumProd2C(a);
		sumProd2D(a);
		sumProd3A(a);
		sumProd3B(a);
		sumProd3C(a);
		sumProd3D(a);
		sumProd3E(a);
		sumProd4A(a);
		sumProd4B(a);
		sumProd4C(a);
		sumProd4D(a);

	}
	

		// Example of a dummy, non-clone function
		public void foo1(int a){
			if(a <3){
				while(a <3){
					a = a+1;
					System.out.println("foo");
				}
			}
		}
		
		
		// Example of a dummy, non-clone function
		public int foo2(int a, int b)
		{
			if(a>b){
				b = a;
			}
			return a;
		}
		
		// Example of a dummy, non-clone function
		public int foo3(int a)
		{
			for (int i=0; i<a;i++){
				a = a+1;
			}
			return a;
		}
		
		// Example of a dummy, non-clone function
		public boolean foo4(int a){
			if (a>3){
				return true;
			}else{
				return false;
			}
		}
		
		
		// ****************************************************************
		// ************************ Type 1 Clones   ***********************
		// ****************************************************************
		
		
		// Note: The following clones were taken from work by Krawitz
		
		
		
		
		// ****************************************************************
		// ************************ Type 1 Clones   ***********************
		// ****************************************************************
		
		// Note, these clones were taken from the work by Cordy
		
		// Original Code - Cordy
		void sumProdO(int n) {
			double sum=0.0; //C1
			double prod =1.0;
			for (int i=1; i<=n; i++)
			{
				sum=sum + i;
				prod = prod * i;
				foo(sum, prod); 
			}
		}
		
		
		// Example 1A - Type 1 Clone - Cordy
			void sumProd1A(int n) {
				double sum=0.0; //C1
				double prod =1.0;
					for (int i=1; i<=n; i++)
					{
						sum=sum + i;
						prod = prod * i;
						foo(sum, prod); 
					}
			}
		
		
			// Example 1B - Type 1 Clone - Cordy
			void sumProd1B(int n) {
				double sum=0.0; //C1
				double prod =1.0; //C
				for (int i=1; i<=n; i++)
				{
					sum=sum + i; 
					prod = prod * i;
					foo(sum, prod); 
				}
			}
			
		
			// Example 2D - Type 2 Clone - Cordy
			void sumProd2D(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				for (int i=1; i<=n; i++)
				{
					sum=sum + (i*i);
					prod = prod*(i*i);
					foo(sum, prod); 
					}
				}
			
			
			// Example 3A - Type 3 Clone - Cordy
			void sumProd3A(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				for (int i=1; i<=n; i++)
				{
					sum=sum + i;
					prod = prod * i;
					foo(sum, prod, n); 
				}
			}
			
			
			
			// Example 3B - Type 3 Clone - Cordy
			void sumProd3B(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				for (int i=1; i<=n; i++)
				{
					sum=sum + i;
					prod = prod * i;
					foo(prod); 
					}
				}
		
			
			// Example 3C - Type 3 Clone - Cordy
			void sumProd3C(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				for (int i=1; i<=n; i++)
				{
					sum=sum + i;
					prod = prod * i;
					if ((n % 2) == 0) { // extra brackets added for syntatic purposes
						foo(sum, prod);
					} 
				}
			}
			
			
			// Example 3D - Type 3 Clone - Cordy
			void sumProd3D(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				for (int i=1; i<=n; i++)
				{
					sum=sum + i;
					//line deleted
					foo(sum, prod); 
					}
				}
			
			// Example 3E - Type 3 Clone - Cordy
			// For syntax purposes, the precise functionality was altered.
			public void sumProd3E(int n) {
			double sum=0.0; //C1
			double prod =1.0;
			for (int i=1; i<=n; i++)
			{ 
				if (i %2 == 0){ 
					sum+= i;
				}
				prod = prod * i;
				foo(sum, prod); 
				}
			}
			
			// Example 4a - Type 4 Clone - Cordy
			void sumProd4A(int n) {
				double prod =1.0;
				double sum=0.0; //C1
				for (int i=1; i<=n; i++)
				{
					sum=sum + i;
					prod = prod * i;
					foo(sum, prod); 
				}
			}
			
			
			// Example 4B - Type 4 Clone - Cordy
			void sumProd4B(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				for (int i=1; i<=n; i++)
				{
					prod = prod * i;
					sum=sum + i;
					foo(sum, prod); 
				}
			}
			
			
			// Example 4C - Type 4 Clone - Cordy
			void sumProd4C(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				for (int i=1; i<=n; i++)
				{
					sum=sum + i;
					foo(sum, prod);
					prod=prod * i; 
				}
			}
			
			// Example 4D - Type 4 Clone - Cordy
			void sumProd4D(int n) {
				double sum=0.0; //C1
				double prod =1.0;
				int i=0;
				while (i<=n)
				{ 
					sum=sum + i;
					prod = prod * i;
					foo(sum, prod);
					i++ ; 
				}
			}
			
			
			
		
		// dummy methods to simply handle the test sum prod functions
		private double foo(double sum, double prod){return sum + prod +1;}
		private double foo(double sum){return sum +1.0;}
		
		private double foo(double sum, double prod, double temp){
			return sum + prod + temp;
		}
	
	
}
