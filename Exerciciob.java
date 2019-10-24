import java.lang.*;
import java.util.*;
public class Exerciciob {
	public static void main(String[] args) {
		int matriz [][] = new int [3][3];
		int i,j,maior=0,menor=11,r=0,c=0,l=0,l1=0,c1=0;
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				matriz [i][j] = (int) (Math.random()*10);
				if(matriz [i][j] >maior) {
					maior=matriz [i] [j];
					l=i;
					c=j;
				}else if(matriz [i][j]<menor) {
					menor=matriz [i] [j];
					l1=i;
					c1=j;
				}
			}
		}
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(" ["+matriz [i][j]+"] ");
				if(j==2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("linha: "+l+" Coluna: "+c+" numero maior: " +maior);
		System.out.println("linha: "+l1+" Coluna: "+c1+" numero maior: " +menor);
	}

}
