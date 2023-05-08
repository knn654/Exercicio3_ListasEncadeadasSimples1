package view;

import javax.swing.JOptionPane;

import model.*;

public class Principal {
	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		lista.addFirst(3);
		lista.addLast(5);
		lista.addLast(18);
		lista.addLast(12);
		lista.addLast(9);
		lista.addLast(7);
		lista.addLast(6);
		lista.addLast(2);
		lista.addLast(13);
		lista.addLast(4);
		lista.addLast(16);

		int opc = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a opção desejada: \n 1- Mostrar a lista normal \n 2- Mostrar a lista invertida \n Outro número - Finalizar programa"));
		if (opc == 1) {
			for (int i = 0; i < lista.size(); i++) {
				System.out.print(lista.get(i) + " - ");
			}
			System.out.println();
		} else if (opc == 2) {
			for (int i = lista.size() - 1; i != -1; i--) {
				System.out.print(lista.get(i) + " - ");
			}
		} else {
			System.out.println("Fim.");
		}
	}
}
