package javaPOO;

class Films {
	public String nome;
	public String diretor;
	public String descricao;
	public String genero;
	public String duracao; 

	public Films(String nome, String diretor, String descricao, String genero, String duracao){
		this.nome = nome;
		this.diretor = diretor;
		this.descricao = descricao;
		this.genero = genero;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
}

