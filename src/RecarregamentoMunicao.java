import java.util.Scanner;

/*Crie um sistema de recarregamento de balas igual existe nos jogos de tiros normais igual Counter Strike

O programa vai come�ar com uma arma de 30 balas no pente e 90 para recarregar (30/90).


1. Pe�a para o usuario digitar a quantidade de balas que v�o ser atiradas, exemplo: 5
2. Depois que digitar, mostre para ele quantas balas ainda tem no pente e quantas tem para recarregar, ficando por exemplo: 25/90
3. Depois pergunte para ele se quer recarregar ou continuar atirando.
3.1 Se quiser recarregar, recarregue a arma e mostre para ele as balas que ainda tem no pente e quantas tem para recarregar, exemplo: 30/85
3.2 Se quiser continuar atirando, volte para a etapa 1

Obs:
Se o jogador atirar 5 balas a arma vai ficar com 25 balas no pente e 90 para recarregar (25/90)
Se o jogador recarregar a arma, a arma vai ficar com 30 balas no pente e 85 para recarregar (30/85)

No primeiro momento fa�a sem pensar em por exemplo: O usuario digitar 561516156156 balas e ficar -561516156126/90, depois voc� pode ajustar isso.

Fa�a pensando que o usuario vai digitar n�meros pequenos como: 5 ou 2


------

Coisas a mais:

1. Fa�a uma valida��o para verificar se o usuario n�o digitou uma quantidade que extrapola a quantidade de balas que tem no pente, exemplo: 10000000 */


public class RecarregamentoMunicao {

	public static void main(String[] args) {
		
		int pente = 30, recarregador = 90, balasUtilizadas = 0, somaBalasUtilizadas = 0;
		String perguntaRecarregar = "", perguntaContinuar = "";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sua arma come�a com 30 balas no pente e 90 no carregador, ficando 30/90");
		
		do {
			System.out.print("Digite a quantidade de balas que v�o ser atiradas: ");
			balasUtilizadas = teclado.nextInt();
			
			if(balasUtilizadas >0 && balasUtilizadas <=pente) {
				somaBalasUtilizadas += balasUtilizadas;
				pente -= balasUtilizadas;
			}else { 
				System.out.println("Voc� digitou um n�mero maior que o permito de balas no pente!!");
				break;
			}
			
			System.out.println("Voc� ainda possui " + pente + "/" + recarregador);
			
			System.out.print("Voc� quer recarregar? ");
			
			perguntaRecarregar = teclado.next();
			
			if(perguntaRecarregar.equals("Sim")) {
				recarregador -= somaBalasUtilizadas;
				
				pente += somaBalasUtilizadas;
				
				somaBalasUtilizadas = 0;
				
				System.out.println("Voc� ainda possui " + pente + "/" + recarregador);
			}
			
			System.out.print("Voc� quer continuar? ");
			perguntaContinuar = teclado.next();
			
			
		}while (perguntaContinuar.equals("Sim"));
		
			System.out.println("O resultado final � " + pente + "/" + recarregador);
			teclado.close();
	}
	
}
