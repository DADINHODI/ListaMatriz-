import java.lang.*;
import java.util.Scanner;
public class Exercicioc {
	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int v[][] = new int [3][4];
		int i,j,n,n1,n2,n3,n4;
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				v [i][j] = (int) (Math.random()*10);
				if (i==j) {
					n= v [i][3];
					}
				}
			}
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				v [i][3] += v [i][j];
			}
		}
		for (i=0;i<3;i++) {
			for (j=0;j<4;j++) {
				System.out.print(" ["+v [i][j]+"] ");
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
		
	}
}
