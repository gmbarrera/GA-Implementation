package gmbarrera.ga.tsp;

import gmbarrera.ga.generic.Chromosome;
import gmbarrera.ga.generic.Gen;

public class ChromosomeRoute extends Chromosome {
	
	public double getTotalDistance() {
		double distance = 0;
		
		for(Gen gen : this.getGenes()) {
			distance += ((GenPath)gen).getDistance();
		}
		
		return distance;
	}
	
	public String toString() {
		String aux = "";
		
		for(Gen gen : this.getGenes()) {
			aux += gen.toString() + "\t";
		}
		aux += "\t" + this.getTotalDistance();
		
		return aux;
	}
}
