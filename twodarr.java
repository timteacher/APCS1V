package lab3;
import java.util.*;

public class twodarr {
	public static void main(String[] args) {
		// declare an arr x that stores integers
		int[] x;
		x = new int[10];
		// array list declaration
		ArrayList<Integer> xl;
		
		// instantiation/assignment - setting x to be an array of int 10 long
		
		
		
		
		
		int [][] y = new int [8][8];

		for (int i=0; i<8;i++) {
			//
			if (i%2==0) {
				for (int j=0; j<8; j++) {
					if (j%2==0) {
						y[i][j]=1;
					}
				}
			}
			else {
				for (int j=0; j<8; j++) {
					if (j%2!=0) {
						y[i][j]=1;
					}
				}
			}
			
				
		}
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
