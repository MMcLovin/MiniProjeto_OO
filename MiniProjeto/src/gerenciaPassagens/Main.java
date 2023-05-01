package gerenciaPassagens;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		String[] i = new String[18];
		//itinerario 1
		i[0] = "29/04/23";
		i[1] = "30/04/23";
		i[2] = "10h00";
		i[3] = "11h00";
		i[4] = "Braília - DF";
		i[5] = "São Paulo - SP";
		//Itinerario 2
		i[6] = "01/05/23";
		i[7] = "01/05/23";
		i[8] = "8h00";
		i[9] = "19h00";
		i[10] = "Brasília - DF";
		i[11] = "São Luís - GO";
		
		Itinerario i1 = new Itinerario(i[0],i[1],i[2],i[3],i[4],i[5]);
		Itinerario i2 = new Itinerario(i[6],i[7],i[8],i[9],i[10],i[11]);
		
		//criando intancias de Cliente 
		Cliente c1 = new Cliente("João", "123.456.789-00", "(61) 98521 - 3169",
				"", "Rua do nunca casa 999");
		Cliente c2 = new Cliente("Maria", "159.456.753-26", "(61) 98524 - 7319",
				"", "Rua do faz de conta casa 0");
		
		//Criando instancia de Passagem
		Passagem p1 = new Passagem("Leito", "A1", c1, i1);
		Passagem p2 = new Passagem("Semi-Leito", "B1", c2, i2);
		
		Empresa emp1 = new Empresa("Melhor Empresa do Mundo"," 12.345.6348/0002-00","(61) 3321 - 3031",
				"", "Avenida boa");
		Empresa emp2 = new Empresa("Melhor Melhor Empresa do Mundo"," 34.985.318/0002-01","(61) 3321 - 3030",
				"", "Avenida ruim");
		
		emp1.cadastraPassagem(p1);
		//emp2.cadastraPassagem(p2);
		
		emp1.listaPassagens();
		
		

	}

}
