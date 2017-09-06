package br.com.zgsolucoes

class Controller {
	
	private Portao portao;
	
	Controller(Portao portao) {
		this.portao = portao;
	}

	String execute(String sequencia) {
		
		StringBuilder stringBuilder = new StringBuilder()
		
		for (char acao in sequencia) {
			switch (acao) {
				case 'P':
					moverPortao();
					break;
				case 'O':
					reverterMovimentoPortao();
					break;
				case '.':
					manterMovimentoPortao();
					break;
				default:
					break;
			}
			stringBuilder.append(portao.posicaoEmSegundos)
		}
		return stringBuilder
	}
	
	void moverPortao() {
		
		switch (portao.tipoMovimento) {
			case TipoMovimentoEnum.ABRINDO:
				portao.tipoMovimento = TipoMovimentoEnum.ABRINDO_PARADO
				break;
			case TipoMovimentoEnum.FECHANDO:
				portao.tipoMovimento = TipoMovimentoEnum.FECHANDO_PARADO
				break;
			case TipoMovimentoEnum.ABRINDO_PARADO:
				portao.abrir();
				break;
			case TipoMovimentoEnum.FECHANDO_PARADO:
				portao.fechar();
				break;
			case TipoMovimentoEnum.FECHADO:
				portao.abrir();
				break;
			case TipoMovimentoEnum.ABERTO:
				portao.fechar();
				break;
			default:
				break;
		}
	}
	
	void reverterMovimentoPortao() {
		switch (portao.tipoMovimento) {
			case TipoMovimentoEnum.ABRINDO:
				portao.fechar()
				break;
			case TipoMovimentoEnum.FECHANDO:
				portao.abrir()
				break;
			default:
				break;
		}
	}
	
	void manterMovimentoPortao() {
		switch (portao.tipoMovimento) {
			case TipoMovimentoEnum.ABRINDO:
				portao.abrir()
				break;
			case TipoMovimentoEnum.FECHANDO:
				portao.fechar()
				break;
			default:
				break;
		}
	}
}
