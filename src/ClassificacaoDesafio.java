/* 2. 
Alice e Bob criaram, cada um, um problema para o HackerRank. Um revisor avalia os dois desafios, 
atribuindo pontos em uma escala de 1 a 100 para tr�s categorias:
clareza do problema, originalidade e dificuldade.

A classifica��o do desafio de Alice � a triplet a = (a[0], a[1], a[2]),
e a classifica��o do desafio de Bob � a triplet b = (b[0], b[1], b[2]).

A tarefa � encontrar seus pontos de compara��o comparando a[0] com b[0], a[1] com b[1] e a[2] com b[2].

Se a[i] > b[i], ent�o Alice recebe 1 ponto.
Se a[i] < b[i], ent�o Bob recebe 1 ponto.
Se a[i] = b[i], ent�o nenhuma pessoa recebe um ponto.
Os pontos de compara��o s�o o total de pontos que uma pessoa ganhou.

Dados a e b, determine seus respectivos pontos de compara��o.

Exemplo

a = [1, 2, 3]
b = [3, 2, 1]
Para os elementos * 0 *, Bob recebe um ponto porque a[0].
Para os elementos iguais a[1] e b[1], nenhum ponto � ganho.
Finalmente, para os elementos 2, a[2] > b[2] ent�o Alice recebe um ponto.
A matriz de retorno � [1, 1] com a pontua��o de Alice primeiro e a de Bob em segundo. */

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
		
		System.out.println("A matriz de retorno �: [" + resultado[0] + "," + resultado[1] + "]");
		
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
