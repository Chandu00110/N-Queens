package com.chandu;

import java.util.Scanner;

class Board {
	Scanner s = new Scanner(System.in);
	int n;
	int a[][];

	void get(int x) {
		n = x;
		a = new int[n][n];
		read();
		display();
	}

	void read() { // Reading the matrix values
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the element at (" + i + "," + j + "): ");
                a[i][j] = s.nextInt();

                if (a[i][j] != 0 && a[i][j] != 1) {
                    System.out.println("Please enter only 0 or 1.");
                    j--; // Allow user to re-enter valid input
                } else {
                    sum += a[i][j];
                }
            }

            // Ensure exactly one queen per row
            if (sum > 1) {
                System.out.println("More than one queen in row " + i + ". Please re-enter the row.");
                i--; // Re-enter the entire row
            } else if (sum < 1) {
                System.out.println("At least one queen must be in row " + i + ". Please re-enter the row.");
                i--; // Re-enter the entire row
            }
        }
        System.out.println();
    }
	
	void display() { // display matrix values
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}

class NQueensValidator extends Board {
	
	void cal() {

		if (col() && d1() && d2()) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}

	}

	boolean col() { // checking column duplicates
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int k = 0; k < n; k++) {
				sum += a[k][i];
			}
			if (sum > 1) {
			    System.out.println("More than one queen in column " + i);
			    return false;
			} else if (sum < 1) {
			    System.out.println("No queen in column " + i);
			    return false;
			}
		}
		return true;
	}

	boolean d1() {  // checking d1 duplicates left to right
		for (int i = 0; i < ((2 * n) - 1); i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (j + k == i) {
						sum += a[j][k];
					}
				}
			}
			if (sum > 1) {
                System.out.println("More than one queen in left to right  diagonal");
				return false;
			}
		}
		return true;
	}
		
	boolean d2() {  // checking d2 duplicates right to left
		for (int i = 0; i < ((2 * n) - 1); i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (((j - k) + (n - 1)) == i) {
						sum = sum + a[j][k];
					}
				}
			}
			if (sum > 1) {
				return false;
			}
		}
		return true;
	}

}

public class nqueens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("Enter the size of matrix");
			x = sc.nextInt();
			if(x<4) {
				System.out.println("matrix size must be minimum 4");
			}
		}while(x<4);

		NQueensValidator q = new NQueensValidator();
		q.get(x);
		q.cal();
	}
}
