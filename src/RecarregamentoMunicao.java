import java.util.Scanner;

/*Crie um sistema de recarregamento de balas igual existe nos jogos de tiros normais igual Counter Strike

O programa vai começar com uma arma de 30 balas no pente e 90 para recarregar (30/90).


1. Peça para o usuario digitar a quantidade de balas que vão ser atiradas, exemplo: 5
2. Depois que digitar, mostre para ele quantas balas ainda tem no pente e quantas tem para recarregar, ficando por exemplo: 25/90
3. Depois pergunte para ele se quer recarregar ou continuar atirando.
3.1 Se quiser recarregar, recarregue a arma e mostre para ele as balas que ainda tem no pente e quantas tem para recarregar, exemplo: 30/85
3.2 Se quiser continuar atirando, volte para a etapa 1

Obs:
Se o jogador atirar 5 balas a arma vai ficar com 25 balas no pente e 90 para recarregar (25/90)
Se o jogador recarregar a arma, a arma vai ficar com 30 balas no pente e 85 para recarregar (30/85)

No primeiro momento faça sem pensar em por exemplo: O usuario digitar 561516156156 balas e ficar -561516156126/90, depois você pode ajustar isso.

Faça pensando que o usuario vai digitar números pequenos como: 5 ou 2


------

Coisas a mais:

1. Faça uma validação para verificar se o usuario não digitou uma quantidade que extrapola a quantidade de balas que tem no pente, exemplo: 10000000 */


public class RecarregamentoMunicao {

	public static void main(String[] args) {
		
		int pente = 30, recarregador = 90, balasUtilizadas = 0, somaBalasUtilizadas = 0;
		String perguntaRecarregar = "", perguntaContinuar = "";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sua arma começa com 30 balas no pente e 90 no carregador, ficando 30/90");
		
		do {
			System.out.print("Digite a quantidade de balas que vão ser atiradas: ");
			balasUtilizadas = teclado.nextInt();
			
			if(balasUtilizadas >0 && balasUtilizadas <=pente) {
				somaBalasUtilizadas += balasUtilizadas;
				pente -= balasUtilizadas;
			}else { 
				System.out.println("Você digitou um número maior que o permito de balas no pente!!");
				break;
			}
			
			System.out.println("Você ainda possui " + pente + "/" + recarregador);
			
			System.out.print("Você quer recarregar? ");
			
			perguntaRecarregar = teclado.next();
			
			if(perguntaRecarregar.equals("Sim")) {
				recarregador -= somaBalasUtilizadas;
				
				pente += somaBalasUtilizadas;
				
				somaBalasUtilizadas = 0;
				
				System.out.println("Você ainda possui " + pente + "/" + recarregador);
			}
			
			System.out.print("Você quer continuar? ");
			perguntaContinuar = teclado.next();
			
			
		}while (perguntaContinuar.equals("Sim"));
		
			System.out.println("O resultado final é " + pente + "/" + recarregador);
			teclado.close();
	}
	
}
