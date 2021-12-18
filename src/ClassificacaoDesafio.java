/* 2. 
Alice e Bob criaram, cada um, um problema para o HackerRank. Um revisor avalia os dois desafios, 
atribuindo pontos em uma escala de 1 a 100 para três categorias:
clareza do problema, originalidade e dificuldade.

A classificação do desafio de Alice é a triplet a = (a[0], a[1], a[2]),
e a classificação do desafio de Bob é a triplet b = (b[0], b[1], b[2]).

A tarefa é encontrar seus pontos de comparação comparando a[0] com b[0], a[1] com b[1] e a[2] com b[2].

Se a[i] > b[i], então Alice recebe 1 ponto.
Se a[i] < b[i], então Bob recebe 1 ponto.
Se a[i] = b[i], então nenhuma pessoa recebe um ponto.
Os pontos de comparação são o total de pontos que uma pessoa ganhou.

Dados a e b, determine seus respectivos pontos de comparação.

Exemplo

a = [1, 2, 3]
b = [3, 2, 1]
Para os elementos * 0 *, Bob recebe um ponto porque a[0].
Para os elementos iguais a[1] e b[1], nenhum ponto é ganho.
Finalmente, para os elementos 2, a[2] > b[2] então Alice recebe um ponto.
A matriz de retorno é [1, 1] com a pontuação de Alice primeiro e a de Bob em segundo. */

//criar um metodo que retorne um array e receba dois arrays(alice e bob) e dentro dele fazer o for

public class ClassificacaoDesafio {

	public static void main(String[] args) {
		
		int[] alice = new int[3];
		
		alice[0] = 1;
		alice[1] = 2;
		alice[2] = 3;
		
		int[] bob = new int[3];
		
		bob[0] = 3;
		bob[1] = 2;
		bob[2] = 1;
		
		int resultado[] = calcularPontuacaoFinal(alice, bob);
		
		System.out.println("A matriz de retorno é: [" + resultado[0] + "," + resultado[1] + "]");
		
	}
	
	public static int[] calcularPontuacaoFinal(int[] alice , int[] bob) {
		
		int pontoAlice = 0;
		int pontoBob = 0;
		
		for(int i = 0; i < alice.length; i++) {
			
			if (alice[i] > bob[i]) {
				pontoAlice += 1;
			}else if (alice[i] < bob[i]) {
				pontoBob +=1;
			}
		}
		
		int[] resultado = {pontoAlice, pontoBob};
		
		return resultado;
		
	}

}
