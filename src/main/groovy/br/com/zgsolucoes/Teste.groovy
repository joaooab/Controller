package br.com.zgsolucoes

class Teste {
	public static void main(String[] args) {
		Portao portao = new Portao();
		portao.tipoMovimento = TipoMovimentoEnum.FECHADO
		switch (portao.tipoMovimento){
			case TipoMovimentoEnum.ABERTO:
				println("Aberto")
				break
			case TipoMovimentoEnum.FECHADO:
				println("Fechado")
				break
			default:
				println("default")
				break;
		}
	}
}
