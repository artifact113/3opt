package br.uece.threeopt.heuristica.sequenciamento;

import java.io.File;
import java.net.URL;

import br.uece.threeopt.heuristica.opt.ThreeOptSequencial;

public class Fabrica {
	
	public static void main(String[] args) {
		
		Matriz jobs = new Matriz() {
			public File getArquivo() {
				return new File(getRelativePath().getFile()+"Car5.txt");
			}
		};
		
		ThreeOptSequencial tps = new ThreeOptSequencial();
		Integer retorno = tps.calculaTempoDaSequencia(Matriz.getJobs()[0]);
		
		
		System.out.println(retorno);
		
		
		
	}

	public static URL getRelativePath(){
		return Fabrica.class.getResource("../../../../../arquivos/instanciasSequenciamento/");
	}
}
