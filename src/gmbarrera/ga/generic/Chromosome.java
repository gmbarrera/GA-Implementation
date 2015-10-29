package gmbarrera.ga.generic;

import java.util.ArrayList;

public abstract class Chromosome {
	private ArrayList<Gen> genes;
	
	public Chromosome() {
		genes = new ArrayList<Gen>();
	}

	public ArrayList<Gen> getGenes() {
		return genes;
	}
	
	public void add(Gen gen) {
		this.genes.add(gen);
	}
}
