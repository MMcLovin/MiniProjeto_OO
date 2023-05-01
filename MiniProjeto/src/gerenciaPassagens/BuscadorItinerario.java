package gerenciaPassagens;

import java.util.ArrayList;

public class BuscadorItinerario {
	//atributos
	private ArrayList<Passagem> passagens;
	
	//construtor
	public BuscadorItinerario(ArrayList<Passagem> p) {
		this.passagens = p;
	}
	
	//metodos
	//cada buscador varre os atributos de cada um dos elementos da
	//arraylist de passagnes, comparando a string recebida com parametro 
	//com a string do atributo para verificar se coincidem e então printar 
	//a passagem correspondente, caso n existam passagens com o paramentro passado
	//uma mensagem sera printada
	public void buscaDataEm(String dtEm) {
		
		boolean achou = false;
		
		for (int i = 0; i < passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getDataEmbarque() == dtEm) {
				achou = true;
				System.out.println("Achamos uma passagem!\n");
				this.passagens.get(i).infoAtributos();
			}
		}
		if (achou == false) {
			System.out.println("\nNão há passagens com esta data\n");
		}
	}
	
	public void buscaDataDesem(String dtDes) {
		
		boolean achou = false;
		
		for (int i = 0; i < passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getDataDesembarque() == dtDes) {
				achou = true;
				System.out.println("Achamos uma passagem!\n");
				this.passagens.get(i).infoAtributos();
			}
		}
		if (achou == false) {
			System.out.println("\nNão há passagens com esta data\n");
		}
	}
	
	public void buscaOrig(String Orig) {
		
		boolean achou = false;
		
		for (int i = 0; i < passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getOrigem() == Orig) {
				achou = true;
				System.out.println("Achamos uma passagem!\n");
				this.passagens.get(i).infoAtributos();
			}
		}
		if (achou == false) {
			System.out.println("\nNão há passagens com esta origem\n");
		}
	}
	
	public void buscaDest(String dest) {
		
		boolean achou = false;
		
		for (int i = 0; i < passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getDestino() == dest) {
				achou = true;
				System.out.println("Achamos uma passagem!\n");
				this.passagens.get(i).infoAtributos();
			}
		}
		if (achou == false) {
			System.out.println("\nNão há passagens com este destino\n");
		}
	}
	
	//getters and setters
}
