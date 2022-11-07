package javaPOO;

public class MenuController {
	public int meia;
	public int inteira;
	public int opcao;
	public int sessao;
	
	public MenuController(int sessao){
		this.meia = 12;
		this.inteira = 24;
		this.opcao = 0;
		
	}

	public int getSessao() {
		return this.sessao;
	}
	
	public int getMeia() {
		return this.meia;
	}

	public int getInteira() {
		return this.inteira;
	}
}
