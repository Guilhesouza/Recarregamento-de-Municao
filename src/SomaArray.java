
/* 1. Dado um array de inteiros, encontre a soma de seus elementos.

Por exemplo, se o array ar = [1, 2, 3], 1 + 2 + 3 = 6, então retorne 6.

 */


public class SomaArray {

	public static void main(String[] args) {
		
		int[] valores = new int[3];
		   
	    valores[0] = 1;
	    valores[1] = 2;
	    valores[2] = 3;
	      
	    int soma = soma(valores);
	      
	    System.out.println("A soma dos valores é: " + soma);

	}

	public static int soma(int[] a){
	    int total = 0;
	    for(int i = 0; i < a.length; i++){
	      total += a[i];  
	    }
	      
	    return total;
	  }
	}
