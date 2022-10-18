package heranca;

import java.util.ArrayList;

public class TestaVeiculo {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(new Onibus("AAA-1111", 2000, 41));
		veiculos.add(new Onibus("ABC-1234", 2005, 45));
		veiculos.add(new Onibus("BBB-2222", 2010, 42));
		veiculos.add(new Onibus("CCC-3333", 2015, 43));
		veiculos.add(new Onibus("DDD-4444", 2020, 44));
		
		veiculos.add(new Caminhao("EFG-5678", 2022, 9));
		veiculos.add(new Caminhao("EEE-5555", 1982, 2));
		veiculos.add(new Caminhao("FFF-6666", 1992, 3));
		veiculos.add(new Caminhao("GGG-7777", 2002, 4));
		veiculos.add(new Caminhao("HHH-8888", 2012, 7));
		
		

	
	for (Veiculo veiculo : veiculos) {
		veiculo.exibirDados();
		}
	}

}
