package br.com.zgsolucoes

class Portao {

	private TipoMovimentoEnum tipoMovimento;
	private int posicaoEmSegundos;
	
	
	Portao() {
		this.tipoMovimento = TipoMovimentoEnum.FECHADO
		this.posicaoEmSegundos = 0
	}
	
	void abrir() {
		if(posicaoEmSegundos < 5){
			posicaoEmSegundos++
			tipoMovimento = TipoMovimentoEnum.ABRINDO
		}
		else{
			tipoMovimento = TipoMovimentoEnum.ABERTO
		}
		
	}
	
	void fechar(){
		if(posicaoEmSegundos > 0){
			posicaoEmSegundos--
			tipoMovimento = TipoMovimentoEnum.FECHANDO
		}
		else{
			tipoMovimento = TipoMovimentoEnum.FECHADO
		}
	}
}

