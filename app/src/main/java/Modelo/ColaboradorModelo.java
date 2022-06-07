package Modelo;
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table; 

@Table(name="colaboradores")
@Entity
public class ColaboradorModelo {
	//Colunas da tabela
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int codigo; 
	
	@Column(name="nome")
	private String nome; 
	
	@Column(name="sobrenome")
	private String sobrenome; 
	
	@Column(name="email")
	private String email; 
	
	// get e set 
	public int getCodigo() {
		return codigo; 
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo; 
	}
	public String getNome() {
		return nome; 
	}
	public void setNome(String nome) {
		this.nome = nome; 
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome; 
	}
	public String getEmail() {
		return email; 
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
