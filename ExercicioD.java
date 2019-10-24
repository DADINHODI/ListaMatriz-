import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class ExercicioD {
	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int v[][] = new int [4][4];
		List<Integer> Canto = new ArrayList<>();
		List<Integer> sorteados= new ArrayList<>();
		int i,j,k,rd=0,ns=0,c = 0, d=0, qtdAcertos=0, cont=0;
		int cs; 
		for (i=1;i<76;i++) {
			Canto.add(i);
			sorteados.add(i);
		}
		Collections.shuffle(sorteados);
		Collections.shuffle(Canto);
		for (i=0;i<4;i++) {
			for (j=0;j<4;j++) {
				v[i][j]=sorteados.get(d);
				d++;
			}
		}
		System.out.println("Sua cartela é essa:");
		for (i=0;i<4;i++) {
			for (j=0;j<4;j++) {
				System.out.print("|"+v [i][j]+"|");
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("Hora de sortear as bolinhas");
		while (qtdAcertos<16) {
			System.out.println("Número Sorteado: "+Canto.get(cont));
			for (i=0;i<4;i++) {
				for (j=0;j<4;j++) {
					if (Canto.get(cont)==v[i][j]) {
						 
						System.out.println("Número Acertado posição na sua cartela :"+j+", "+i);
						qtdAcertos++;
					}
				}
			}
			cont++;
			rd++;
		}
		if (qtdAcertos >= 16) {
			System.out.println("BINGO");
			System.out.println("Você jogou só "+rd+" partidas para ganhar");
		}
		
		
		
		
	}
}
