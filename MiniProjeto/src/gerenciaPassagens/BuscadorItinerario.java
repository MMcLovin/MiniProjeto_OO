package gerenciaPassagens;

import java.util.ArrayList;

public class BuscadorItinerario {
	//atributos
	protected ArrayList<Passagem> passagens;
	
	//construtor
	public BuscadorItinerario(ArrayList<Passagem> p) {
		this.passagens = p;
	}
	
	//metodos
	public Passagem buscaDataEm(String dtEm) {
		int j = 0, i = 0;
		for (; i <= passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getDataEmbarque() == dtEm) {
				return passagens.get(i);
			}
		}
		return null;
	}
	
	public Passagem buscaDataDes(String dtDes) {
		int j = 0, i = 0;
		for (; i <= passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getDataDesembarque() == dtDes) {
				return passagens.get(i);
			}
		}
		return null;
	}
	
	public Passagem buscaHrEmb(String hrEm) {
		int j = 0, i = 0;
		for (; i <= passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getHoraEmbarque() == hrEm) {
				return passagens.get(i);
			}
		}
		return null;
	}
	public Passagem buscaHrDes(String hrDes) {
		int i = 0;
		for (; i <= passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getHoraDesembarque() == hrDes) {
				return passagens.get(i);
			}
		}
		return null;
	}
	
	public Passagem buscaOrig(String Orig) {
		int i = 0;
		for (; i <= passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getOrigem() == Orig) {
				return passagens.get(i);
			}
		}
		return null;
	}
	
	public Passagem buscaDest(String dest) {
		int i = 0;
		for (; i <= passagens.size(); i++) {
			if (passagens.get(i).getItinerario().getDestino() == dest) {
				return passagens.get(i);
			}
		}
		return null;
	}
	
	//getters and setters
}
