package gmbarrera.ga;

import java.util.ArrayList;

public class Population {
	private ArrayList<Chromosome> population;
	
	public Population() {
		population = new ArrayList<Chromosome>();
	}

	/**
	 * Add a Chromosome to the population
	 * @param cr
	 */
	public void add(Chromosome cr) {
		this.population.add(cr);
	}
	
	public String toString() {
		String aux = "";
		
		for(Chromosome c : population)
			aux += c.toString() + "\n";
		
		return aux;
	}
	
}
