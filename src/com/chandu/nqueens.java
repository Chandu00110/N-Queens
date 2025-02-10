package com.chandu;

import java.util.Scanner;

class Test{
	Scanner s = new Scanner(System.in);
	int n;
	int a[][];
	void get(int x) {
		n=x;
		a=new int[n][n];
	}
	int c=0;
	int d=0;
	void read() {					//reading the matrix values
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("enter the "+i+","+j+"element: ");
				a[i][j]=s.nextInt();
				if(a[i][j]==0 || a[i][j]==1) {
					continue;
				}
				else {
					System.out.println("please enter in the format of 0's and 1's");
					j=j-1;
				}				
			}
		}
		System.out.println();
	}
	
	
	void display() {				//display matrix values
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	int check() {
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(j==i) {
						sum=sum+a[j][k];
					}
				}
			}
			if(sum!=1) {
				System.out.println("please enter atleast 1 in "+i+"row");
				d++;
			}
		}
		return d;
	}
}

class Test2 extends Test{
	

	int col() {						//checking column duplicates
	
		if(d==0) {
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(k==i) {
						sum=sum+a[j][k];
					}
				}
			}
			if(sum==2) {
				c++;
				break;
			}
		}
		}
		
		return c;

	}
	
	
	
	int row() {					//checking row duplicates
		
		if(d==0) {
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(j==i) {
						sum=sum+a[j][k];
						//System.out.println(sum);
						//System.out.print(a[j][k]);
					}
				}
				System.out.println();
			}
			if(sum==2) {
				c++;
				break;
			}
		}
		}
		return c;
	}
	
	
	int diagonal1() {
		if(d==0) {
		int ssum = 0;
		for(int i=0;i<((2*n)-1);i++) {
			ssum=0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(j+k==i) {
						ssum=ssum+a[j][k];
					}
				  }
				}	
			if(ssum==2) {
				c++;
				break;
			}
			System.out.println();
		}
		}
		return c;
	}
	
	int diagonal2() {
		if(d==0) {
		int ssum = 0;
		for(int i=0;i<((2*n)-1);i++) {
			ssum=0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(((j-k)+(n-1))==i) {
						ssum=ssum+a[j][k];
					}
				  }
				}	
			if(ssum==2) {
				c++;
				break;
			}
			System.out.println();
		}
		}
		return c;
	}
	
	
	void count() {					// count based verification
		if(d==0) {
		if(c==0) {
			System.out.println("success");
		}
		else {
			System.out.println("try again");
		}
	}
	}
	
}

public class nqueens{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int x=sc.nextInt();
		if(x<4) {
			System.out.println("matrix size must be minimum 4");
		}
		else {
		Test2 t= new Test2();
		t.get(x);
		t.read();
		t.display();
		t.check();
		t.col();
		t.row();
		t.diagonal1();
		t.diagonal2();
		t.count();
		}
	}
}
