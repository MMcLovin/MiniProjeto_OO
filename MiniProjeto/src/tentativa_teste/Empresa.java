package tentativa_teste;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String cnpj;//exemplo 18.236.120/0001-58
	private ArrayList<Passagem> passagens;
	private float precoBase;

	//construtores
	public Empresa(String n, String cnpj, ArrayList<Passagem> p, int pb) {
		//quero atribuir o nome da empresa a todos os elementos do arralist p
		//tmb quero atribuir o preço base a todos os elementos do arraylist p
		this.nome = n;
		this.cnpj = cnpj;
		this.passagens = p;
		this.precoBase = atribuir_PrecoBase(pb);
		
	}
	public Empresa() {
		//default constructor
	}
	
	//metodos
	public void adicionaPassagem(Passagem p) {
		passagens.add(p);
	}	
	public void removePassagem(int i) {
		passagens.remove(i);
	}
	public void listaPassagens() {
		for (int i = 0; i < passagens.size(); i++) {
			System.out.println("**********************************");
			System.out.println(passagens.get(i).toString());
			System.out.println("**********************************");
		}
	}
	
	public int numPassagens() {
		int i = 0;
		for (; i < passagens.size(); i++);
		return i;
	}
	
	public void infoAtributos() {
		System.out.println("Nome:      " + this.nome);
		System.out.println("CNPJ:      " + this.cnpj);
		System.out.println("Passagens: " + this.passagens);
	}

	public float atribuir_PrecoBase(int pb) {
		//cada empresa tem um preço base de passagem
		//
		float[] valores = new float[4];
		for (int i = 0, j = 20; i < valores.length; i++,  j+=10) {
			valores[i] = j;
		} 
		return valores[pb];
	}
	
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
	public float getPrecoBase() {
		return precoBase;
	}
	public void setPrecoBase(int precoBase) {
		this.precoBase = precoBase;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}
