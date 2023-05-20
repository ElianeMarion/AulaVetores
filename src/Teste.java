import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total;
		Scanner leitor = new Scanner(System.in);
		double[] alunos = new double[10];
		
		System.out.println("Por favor, digite o consumo do 1º aluno");
		alunos[0] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 2º aluno");
		alunos[1] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 3º aluno");
		alunos[2] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 4º aluno");
		alunos[3] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 5º aluno");
		alunos[4] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 6º aluno");
		alunos[5] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 7º aluno");
		alunos[6] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 8º aluno");
		alunos[7] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 9º aluno");
		alunos[8] = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 10º aluno");
		alunos[9] = leitor.nextDouble();
		
		total = alunos[0] + alunos[1] + alunos[2];
		
		System.out.println("O aluno 1 consumiu R$" + alunos[0]);
		System.out.println("O aluno 2 consumiu R$" + alunos[1]);
		System.out.println("O aluno 3 consumiu R$" + alunos[2]);
		

		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
	}

}
