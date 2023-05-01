package gerenciaPassagens;

public class Itinerario {
	//atributos
	private String dataEmbarque;	
	private String dataDesembarque;	
	private String horaEmbarque;	
	private String horaDesembarque;	
	private String origem;			
	private String destino;	

	//construtor
	public Itinerario(String dtE, String dtD, String hrE, String hrD, String orig, String dest) {
		this.dataEmbarque = dtE;
		this.dataDesembarque = dtD;
		this.horaEmbarque = hrE;
		this.horaDesembarque = hrD;
		this.origem = orig;
		this.destino = dest;
	}
	//metodos
	public void infoAtributos() {
		System.out.println("Data de embarque:    " + this.getDataEmbarque() + " às " + this.getHoraEmbarque());
		System.out.println("Data de desembarque: " + this.getDataDesembarque() + " às " + this.getHoraDesembarque());
		System.out.println("Local de origem:     " + this.getOrigem());
		System.out.println("Local de destino:    " + this.getDestino());
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
}
