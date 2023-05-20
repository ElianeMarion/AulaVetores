import java.util.Scanner;

public class TesteVetores {

	//Constantes
	public static final int qtdAluno = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		Scanner leitor = new Scanner(System.in);
		
		double[] alunos = new double[qtdAluno];
		String[] nomesAlunos = {"Ana", "Beatriz", "Joao", "Ana", "Andre", "Guilherme"};
		
		int i;
		
		for(i = 0; i < alunos.length; i++) {
			System.out.println("Por favor, digite o consumo do " + (i+1) + " .aluno");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];	
		}
		
		for(i=0; i < alunos.length; i++)
			System.out.println("O aluno "+(i+1)+ " consumiu R$" + alunos[i]);
		

		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();

	}

}
