package br.com.zgsolucoes

import org.junit.Assert

class ControleRemoto {
	
	static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		println("Insira a sequência");
		String sequencia = sc.nextLine();
		
		Portao portao = new Portao();
		Controller controller = new Controller(portao);
		String saida = controller.execute(sequencia);
		println(saida);
	}
}
