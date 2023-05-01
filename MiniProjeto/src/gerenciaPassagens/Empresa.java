package gerenciaPassagens;

import java.util.ArrayList;

public class Empresa extends Usuario{
	//ATRIBUTOS
	private ArrayList<Passagem> passagens;

	//CONSTRUTORES
	public Empresa(String n, String cnpj, String tel, String e) {
		super(n, cnpj, tel, e);
		this.passagens = new ArrayList<Passagem>();
	}
	
	//METODOS
	public void cadastraPassagem(Passagem p) {
		passagens.add(p);
	}	
	public void removePassagem(int i) {
		//outra passagem vai entrar no lugar desse i-nesima
		//isso vai se rum problema?
		passagens.remove(i);
	}
	public void atualizaPassagem(Passagem p, int i) {
		passagens.set(i, p);
	}
	public void listaPassagens() {
		for (int i = 0; i < passagens.size(); i++) {
			System.out.println("------------------------------------");
			System.out.println("Passagem " + (i + 1) + "\n");
			passagens.get(i).infoAtributos();
			System.out.println("------------------------------------");
		}
	}
	public void infoAtributos() {
		System.out.println("Nome:      " + this.getName());
		System.out.println("CNPJ:      " + this.getDocumento());
		System.out.println("Número de Passagens: " + this.passagens.size());
	}
}
