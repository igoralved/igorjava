import java.util.Scanner;
import java.util.Random;
public class Main {
	
	//Exercício 1
	
	
	public static  boolean eMaiorDeIdade(int idade) {
		if(idade >= 18) {
			return true;
		}return false;
	}
	
	
	//Exercício 2
	
	public static double compraComDesconto(String nome, double preco, int quantidade) {
		if(quantidade > 0 && quantidade <= 10) {
			return preco * quantidade;
		}else if(quantidade > 10 && quantidade <= 20) {
			return preco * quantidade - ((preco * quantidade * 10) / 100);
		}else if(quantidade > 20 && quantidade <= 50) {
			return preco * quantidade - ((preco * quantidade * 20) / 100);
		}else if(quantidade > 50) {
			return preco * quantidade - ((preco * quantidade * 25) / 100);
		}return 0.0;
	}
	
	
	
	//Exercício 3
	
	
	
	
	
	//Exercício 4
	
	
	
	
	

	public static void main(String[] args) {
		System.out.print("\f");
		Scanner in = new Scanner(System.in);
		
		System.out.println("Exercicio 1:");
		System.out.println("Insira a idade da pessoa:\n");
		int idade = in.nextInt();
		System.out.println("Idade digitada: " + idade);
		if(eMaiorDeIdade(idade)) {
			System.out.println("Ela e maior de idade, pois tem pelo menos 18 anos!");
		}
		else {
			System.out.println("Ela nao e maior de idade, pois tem menos de 18 anos!");
		}
		
		System.out.println("Exercicio 2:");
		System.out.println("Qual é o nome do produto que voce quer comprar?");
		String nomeproduto = in.next();
		double preco = -1;
		do {
			System.out.println("E o preco (valor positivo, pode ser decimal)?");
			preco = in.nextDouble();
		}while(preco <= 0);
		int quantidade = -1;
		do {
			System.out.println("E a quantidade (valor positivo maior que zero)?");
			quantidade = in.nextInt();
		}while(quantidade <= 0);
		System.out.println("Produto: " + nomeproduto);
		System.out.println("Custo: " + preco);
		System.out.println("Quantidade: " + quantidade);
		if(quantidade <= 10) {
			System.out.println("Desconto: Nenhum");
		}else if(quantidade > 10 && quantidade <= 20) {
			System.out.println("Desconto: 10%");
		}else if(quantidade > 20 && quantidade <= 50) {
			System.out.println("Desconto: 20%");
		}else {
			System.out.println("Desconto: 25%");
		}
		System.out.println("Valor pago: " + compraComDesconto(nomeproduto, preco, quantidade));
		
		System.out.println("Exercicio 3:");
		Random r = new Random();
		
		int opcaojogador = -1;
		do {
			System.out.println("Escolha pedra (digite 1), papel (2) ou tesoura (3):");
			opcaojogador = in.nextInt();
		}while(opcaojogador < 1 || opcaojogador > 3);
		int opcaopc = r.nextInt() % 3 + 1;
		System.out.println("Opcao sua:");
		switch(opcaojogador) {
		case 1:
			System.out.println("Pedra");
			break;
		case 2:
			System.out.println("Papel");
			break;
		default:
			System.out.println("Tesoura");
			break;
		}
		
		System.out.println("Opcao do computador:");
		
		switch(opcaopc) {
		case 1:
			System.out.println("Pedra");
			if(opcaojogador == 2) {
				System.out.println("Voce venceu!");
			}else if(opcaojogador == 1) {
				System.out.println("Empate!");
			}else {
				System.out.println("Computador venceu!");
			}
			break;
		case 2:
			System.out.println("Papel");
			if(opcaojogador == 3) {
				System.out.println("Voce venceu!");
			}else if(opcaojogador == 2) {
				System.out.println("Empate!");
			}else {
				System.out.println("Computador venceu!");
			}
			break;
		default:
			System.out.println("Tesoura");
			if(opcaojogador == 1) {
				System.out.println("Voce venceu!");
			}else if(opcaojogador == 3) {
				System.out.println("Empate!");
			}else {
				System.out.println("Computador venceu!");
			}
			break;
		}
		System.out.println("Exercício 4:");
		int opcao = 0;
		while(opcao != 5) {
			System.out.println("Escolha:");
			System.out.println("1=soma");
			System.out.println("2=subtracao");
			System.out.println("3=multiplicacao");
			System.out.println("4=divisao");
			System.out.println("5=desligar calculadora");
			opcao = in.nextInt();
			while(opcao < 1 || opcao > 5) {
				System.out.println("Escolha:");
				System.out.println("1=soma");
				System.out.println("2=subtracao");
				System.out.println("3=multiplicacao");
				System.out.println("4=divisao");
				System.out.println("5=desligar calculadora");
				opcao = in.nextInt();
			}
			switch(opcao) {
			case 1:
				System.out.println("Insira o valor a:");
				float a = in.nextFloat();
				System.out.println("Insira o valor b:");
				float b = in.nextFloat();
				float result = a + b;
				System.out.println("a + b = " + result);
				break;
			case 2:
				System.out.println("Insira o valor a:");
				float a1 = in.nextFloat();
				System.out.println("Insira o valor b:");
				float b1 = in.nextFloat();
				float result1 = a1 - b1;
				System.out.println("a - b = " + result1);
				break;
			case 3:
				System.out.println("Insira o valor a:");
				float a2 = in.nextFloat();
				System.out.println("Insira o valor b:");
				float b2 = in.nextFloat();
				float result2 = a2 * b2;
				System.out.println("a * b = " + result2);
				break;
			case 4:
				System.out.println("Insira o valor a:");
				float a3 = in.nextFloat();
				System.out.println("Insira o valor b:");
				float b3 = in.nextFloat();
				if(b3 == 0) {
					if(a3 == 0) {
						System.out.println("a / b = " + 0);
					}else {
						System.out.println("Erro");
					}
				}else {
					float result3 = a3 / b3;
					System.out.println("a / b = " + result3);
				}
				break;
			case 5:
				System.out.println("Desligando a calculadora...");
				break;
			}
		}
	}	
	
}
