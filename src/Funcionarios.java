import java.util.Scanner;

public class Funcionarios {
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//define o tipo de funcionario a ser cadastrado
		System.out.println("1- Funcionario comum ");
		System.out.println("2- Gerente ");
		System.out.println("3- diretor");
		
		//pede ao usuario o tipo de funcionario que deseja ser cadatrado
		System.out.println("Digite o tipo de funcionario que deseja cadastrar");
		int f1 = input.nextInt();
		
		//primeira opçao "Funcionario comum"
		if(f1 == 1) {
			System.out.println("digite  o nome :");
			System.out.println("digite a data de nascimento :");
			System.out.println("data de ingresso :");
			System.out.println("seu banco :");
			System.out.println("sua agencia :");
			System.out.println("sua conta corrente :");
			System.out.println("seu salario eh de quanto :");
			int salario1 = input.nextInt();
			// calculo para o seu salario
			int sala ;
			sala = (int)(salario1 +(salario1*2.5/100));
			System.out.println(sala);
			
			//salario anual
			int anual1 = salario1*12;
			System.out.println(anual1);
			
			//Valor anual das bonificações
			int bo1 = (int) (salario1*2.5/100);
			System.out.println(bo1);
			
			
		}
		//segunda  opçao "gerente"
		if(f1 == 2) {
			System.out.println("digite  o nome :");
			System.out.println("digite a data de nascimento :");
			System.out.println("data de ingresso :");
			System.out.println("seu banco :");
			System.out.println("sua agencia :");
			System.out.println("sua conta corrente :");
			System.out.println("seu setor :");
			System.out.println("seu nivel :");
			System.out.println("seu salario eh de quanto :");
			int salario2 = input.nextInt();
			// calculo para o seu salario
			int sala2 ;
			sala2 = (int)(salario2 +(salario2*5/100));
			System.out.println(sala2);
			
			//salario anual
			int anual2 = salario2*12;
			System.out.println(anual2);
			
			//Valor anual das bonificações
			int bo2 = (int) (salario2*5/100);
			System.out.println(bo2);
			
			
		}
		//terceira opçao "diretor"
		if(f1 == 2) {
			System.out.println("digite  o nome :");
			System.out.println("digite a data de nascimento :");
			System.out.println("data de ingresso :");
			System.out.println("seu banco :");
			System.out.println("sua agencia :");
			System.out.println("sua conta corrente :");
			System.out.println("seu setor :");
			System.out.println("seu nivel :");
			System.out.println("seu  departamento :");
			System.out.println("seu sua participaçao nos lucros :");
			int lucros = input.nextInt();
			System.out.println("seu salario eh de quanto :");
			int salario3 = input.nextInt();
			// calculo para o seu salario
			int sala3 ;
			sala3 = (int)(salario3 +(salario3*8/100) + lucros);
			System.out.println(sala3);
			
			//salario anual
			int anual3 = salario3*12;
			System.out.println(anual3);
			
			//Valor anual das bonificações
			int bo3 = (int) ((salario3*8/100) + lucros);
			System.out.println(bo3);
		}
	
		if(f1 < 0 && f1 > 3) {
			System.out.println("este funcionario nao existe ");
		}
		
	}

}
