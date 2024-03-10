package controller;

public class ExerciciosController {
	
	public ExerciciosController(){
		super();
	}
	
	
	//Ex1 - somatoria da sequencia dos numeros naturais
	public int Ex1(int num, int i) {
		// num vai ser a quantidade de numeros da sequência
		//Já i vai ser zero
		// PARADA => num menor igual a 0 
		if(num <= 0) {
			return 0;
		}
		//A recursividade vai ser o i, que começara como 0
		// mais a chamada do método(cada chamada diminui a quantidade de numeros da sequencia,
		//o i vai representar os numeros da sequencia, sempre incrementando)
		return i + Ex1(--num, ++i);
	}
	
	//Ex2 - menor valor do vetor
	public int Ex2(int[] array,int tamanho, int menorVal) {
		// PARADA => quando tamanho for igual a 0, já se percorreu todo o vetor
		if(tamanho == 0) {
			return menorVal;
		}
		//Já que tamanho vai ser decrementado, pode se verificar do ultimo até o primeiro registro
		//Até que se ache um valor menor que o ultimo
		else if (array[tamanho-1] < menorVal) {
			menorVal = array[tamanho-1];
		}
		//Retorno vai ser o mesmo, unica diferença é diminuir o valor de tamanho
		//já que vai ser o indice dos If's
		return Ex2(array, --tamanho, menorVal);
	}
	
	//Ex3 - Fatorial
	public int Ex3(int num) {
		//Garante que não vai dar um erro de StackOverFlow, dado os limites da recursividade
		if (num > 12) {
			System.out.println("Limite de entrada é 12");
			return 0;			
		}
		//PARADA => Enquanto num não for igual ou menor que 0, se continua a recursividade
		else if(num <= 0) {
			return 1;			
		}
		//Recursividade vai ser dada pela multiplicação do num atual e a chamada do metodo com o num decresivo
		return num * Ex3(num - 1);
	}
	
	// Ex4 - exibir total de elementos negativos de um vetor inteiro
	public int Ex4(int array[], int nPosicao) {
		// PARADA => Quando nPosicao chegar a 0 ou menor, já se percorreu todo o vetor
		if(nPosicao <= 0) {
			return 0;
		}
		else if (array[nPosicao-1] < 0) {
			//Caso encontre numero negativo vai somar 1 
			// e decrementar o nPosicao para seguir a iteração do vetor
			return 1 + Ex4(array,--nPosicao);
		} else {
			//caso não encontrar numero negativo vai seguir para o proximo indice
			return Ex4(array,--nPosicao);
		}
	}
	
	//Ex5 - Somatoria de = 1 + 1/2 + 1/3 + 1/4 + ... 1/N
	public double Ex5(int n) {
		// PARADA => quando N for igual a 1 se acrescenta o ultimo numero da somatoria 1
		if(n == 1) {
			return 1;
		}
		//Recursividade se da pela divisão entre 1 e n somado a chamada do método com n sendo decrementado
		return (double) 1 /n + Ex5(--n);
	}
}
