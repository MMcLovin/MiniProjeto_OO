package tentativa_teste;

public class Passagem {
									//enumeracao dos atributos
	private String dataEmbarque;	// 1 duh
	private String dataDesembarque;	// 2 duh
	private String horaEmbarque;	// 3 duh
	private String horaDesembarque;	// 4 duh
	private String origem;			// 5 duh
	private String destino;			// 6 duh
	private float preco;			// 7 duh
	private String tipo_poltrona;	// 8 - leito, semi leito e tals (4 tipos)
	private String num_poltrona;	// 9 - duas fileiras (A e B) com 10 assentos cada 
	private String nome_empresa;	// 10 duh
	private Empresa empresa;		// 11

	//construtores
	public Passagem(String dtE, String dtD, String hrE, String hrD, String orig,
					String dest, String tpPol, String numPol) {
		this.dataEmbarque = dtE;
		this.dataDesembarque = dtD;
		this.horaEmbarque = hrE;
		this.horaDesembarque = hrD;
		this.origem = orig;
		this.destino = dest;
		this.tipo_poltrona = tpPol;
		this.num_poltrona = numPol;
		this.nome_empresa = this.empresa.getNome();
	}

	public Passagem(){
		//defaul constructor
	}

	//metodos
	public void achaPreco() {
		/*	Esse metodo altera o preço de acordo com o tipo de poltrona,
		 	levando em consideração o preço base já estabelecido por cada empresa
		
			Cada elemento do vetor valores tem um correspondente direto
			no vetor tipo, isto é, cada poltrona tem um valor diferente
		*/ 
		float[] valores = new float[3];//vetor q armazena 4 precos
		float v = 0, preco = 0;
		//v = valor acumulado devido a cada tipo de cadeira e que devera ser somado ao preço base da empresa
		//
		for (int i = 0; i < valores.length; i++) {
			valores[i] = preco;
			preco += 31.84;
		}
		
		String tp;
		tp = this.getTipo_poltrona();

		String[] tipo = new String[3];// vetor q armazena 4 tipos de poltronas
		tipo[0] = "leito";
		tipo[1] = "semi leito";
		tipo[2] = "cama";
		tipo[3] = "cama premium";
		
		for (int i = 0; i < tipo.length; i++) {
			//acha o preco correspondente de cada poltrona
			if (tp == tipo[i]) {
				v = valores[i];
			}
		}
		this.preco = empresa.getPrecoBase() + v;
	}

	public void infoAtributos() {
		System.out.println("data e hora de embarque:    " + this.dataEmbarque 
							+ " às " + this.horaEmbarque);							//1 e 3
		System.out.println("data e hora de desembarque: " + this.dataDesembarque
							+ " às " + this.horaDesembarque);						//2 e 4
		System.out.println("Saindo de:  " + this.origem);							//5
		System.out.println("Indo para:  " + this.destino);							//6
		System.out.println("valor: R$ " + this.preco);								//7
		System.out.println("Tipo de Poltrona    " + this.tipo_poltrona);			//8
		System.out.println("Numero da Poltrona: " + this.num_poltrona);				//9
		System.out.println("Empresa: " + this.nome_empresa);						//10
	}
	
	
	//getters and setters
	public String getDataEmbarque() {
		return dataEmbarque;
	}
	
	public void setDataEmbarque(String dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}
	
	public String getDataDesembarque() {
		return dataDesembarque;
	}
	
	public void setDataDesembarque(String dataDesembarque) {
		this.dataDesembarque = dataDesembarque;
	}
	
	public String getHoraEmbarque() {
		return horaEmbarque;
	}
	
	public void setHoraEmbarque(String horaEmbarque) {
		this.horaEmbarque = horaEmbarque;
	}
	
	public String getHoraDesembarque() {
		return horaDesembarque;
	}
	
	public void setHoraDesembarque(String horaDesembarque) {
		this.horaDesembarque = horaDesembarque;
	}

	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float v) {
		this.preco = v;
	}
	public String getTipo_poltrona() {
		return tipo_poltrona;
	}
	public void setTipo_poltrona(String tipo_poltrona) {
		this.tipo_poltrona = tipo_poltrona;
	}
	public String getNum_poltrona() {
		return num_poltrona;
	}
	public void setNum_poltrona(String num_poltrona) {
		this.num_poltrona = num_poltrona;
	}
	public String getNomeEmpresa() {
		return nome_empresa;
	}
	public void setNomeEmpresa(String empresa) {
		this.nome_empresa = empresa;
	}
}
