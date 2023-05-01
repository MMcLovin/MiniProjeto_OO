package gerenciaPassagens;

public class Usuario {
	//atributos
	private String nome;
	private String Documento;
	private String telefone;
	private String Endereço;
	
	//construtores
	public Usuario(String n, String c, String tel, String e) {
		this.nome = n;
		this.Documento = c;
		this.telefone = tel;
		this.Endereço = e;
	}
	public Usuario() {
		
	}
	//metodos
	
	//getters and setters
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public String getDocumento() {
		return this.Documento;
	}
	public void setDocumento(String c) {
		this.Documento = c;
	}
	public String getContato() {
		return telefone;
	}
	public void setContato(String contato) {
		this.telefone = contato;
	}
}
