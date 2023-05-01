 package gerenciaPassagens;

public class Passagem {
	//atributos
	private float preco;			
	private String tipo_poltrona;	
	private String num_poltrona;		
	public Itinerario itinerario;
	private Cliente cliente;

	//construtores
	public Passagem(String tpPol, String numPol, Cliente c, Itinerario i) {
		this.tipo_poltrona = tpPol;
		this.num_poltrona = numPol;
		this.cliente = c;
		this.itinerario = i;
	}
	public Passagem(){
		//defaul constructor
	}

	//metodos
	
	public void infoAtributos() {
		System.out.println("valor: 		     R$ " + this.preco);								
		System.out.println("Tipo de Poltrona:    " + this.tipo_poltrona);			
		System.out.println("Numero da Poltrona:  " + this.num_poltrona);										
	}
	
	//getters and setters
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
	public Itinerario getItinerario() {
		return itinerario;
	}
	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}