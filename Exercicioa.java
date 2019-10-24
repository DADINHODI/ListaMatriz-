import java.util.Scanner;
public class Exercicioa {
	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int v[][] = new int [4][4];
		int i,j,n=1;
		for (i=0;i<4;i++) {
			for (j=0;j<4;j++) {
				v [i] [j] = n=n+n;
				System.out.print(" ["+v [i][j]+"] ");
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
	}

}
