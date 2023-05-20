import java.util.Scanner;

public class JuncaoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int[] vetA = new int[6];
		int[] vetB = new int[6];
		int i;
		for(i=0; i<6;i++) {
			System.out.println("Digite o " + (i+1) +" valor para o vetorA: ");
			vetA[i] = leitor.nextInt();
		}
	}

}
