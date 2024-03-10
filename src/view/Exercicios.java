package view;

import controller.ExerciciosController;
import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		ExerciciosController ex = new ExerciciosController();
		int opc = 0;
		int tamanho, num;
		int[] array;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe qual exercicio gostaria de ver\n"
					+ "1 - SomatoriaNumerosNaturais\n2 - MenorValorVetor\n3 - Fatorial\n4 - ExibirTotalElementosNegativos\n"
					+ "5 - Somatoria de = 1 + 1/2 + 1/3 + 1/4 + ... 1/N\n9 - Sair"));
			switch (opc) {
			case 1:
				num = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe a quantidade de numeros naturais"));
				System.out.println(ex.Ex1(num, 0));
				break;
			case 2:
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor que deseja"));
				array = new int[tamanho];

				for (int i = 0; i < tamanho; i++) {
					array[i] = (int) (Math.random() * 99) + 1;
				}

				int menorVal = array[array.length - 1];
				System.out.println(ex.Ex2(array, tamanho, menorVal));
				break;
			case 3:
				int fatorial = Integer
						.parseInt(JOptionPane.showInputDialog("Informe o número que será feito o fatorial"));
				System.out.println(ex.Ex3(fatorial));
				break;
			case 4:
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor que deseja"));
				array = new int[tamanho];
				
				for(int i = 0; i < tamanho; i++) {
					array[i] = (int) (Math.random() * 50) + (-10);
				}
				
				System.out.println(ex.Ex4(array, tamanho));
				break;
			case 5:
				num = Integer.parseInt(
						JOptionPane.showInputDialog("Informe o limite do denominador da divisão que sera somada"));
				System.out.println(ex.Ex5(num));
				break;
			case 9:
				System.out.println("Saindo ...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente!");
				break;

			}
		}

	}

}
