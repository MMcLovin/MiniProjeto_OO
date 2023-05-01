package tentativa_teste;

import java.lang.reflect.Array;

import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		ArrayList<Passagem> passagensEmpresa1 = new ArrayList<Passagem>();
		ArrayList<Passagem> passagensEmpresa2 = new ArrayList<Passagem>();
		//crio um vetor que recebe uma passagem como elemento

		Passagem p1 = new Passagem(
								  	"15/05/2023","16/05/2023",
								  	"10h00","15h00",
								  	"Brasília - DF","Belo Horizonte - MG",
								  	"leito","A1"
								  );
		Passagem p2 = new Passagem(
									"16/05/2023","17/05/2023",
									"10h00","15h00",
									"Brasília - DF","Rio de Janeiro - RJ",
									"semi leito","B1"
								  );
		Passagem p3 = new Passagem(
									"17/05/2023","18/05/2023",
									"10h00","15h00",
									"Brasília - DF","Rio Branco - AC",
									"cama","A2"
								  );
		Passagem p4 = new Passagem(
									"18/05/2023","19/05/2023",
									"10h00","15h00",
									"Brasília - DF","São Paulo - SP",
									"cama premium","B2"
								  );
		//p1.estadoAtual();
		passagensEmpresa1.add(p1);
		passagensEmpresa2.add(p2);
		
		System.out.println(p1.toString());
	}

}
