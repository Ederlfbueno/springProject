package exemplo.app2.modelo;

public class RespostaModelo {

	// Atributo 
	private String mensagem; 
	
	public RespostaModelo() {}
	
	public RespostaModelo(String mensagem) {
		this.mensagem = mensagem; 
	}
	
	public String getMensagem() { 
		return mensagem; 
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem; 
	}
}
