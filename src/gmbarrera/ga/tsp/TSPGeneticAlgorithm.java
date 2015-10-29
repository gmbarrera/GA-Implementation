package gmbarrera.ga.tsp;

import java.util.ArrayList;
import java.util.Collections;

import gmbarrera.ga.generic.GeneticAlgorithm;
import gmbarrera.ga.generic.Population;

public class TSPGeneticAlgorithm extends GeneticAlgorithm {

	private String[] cities = { "A", "B", "C", "D", "E" };
	private double[][] distances = { { 0, 5, 8, 4, 6 }, 
									 { 5, 0, 2, 9, 4 }, 
									 { 8, 2, 0, 3, 1 }, 
									 { 4, 9, 3, 0, 5 }, 
									 { 6, 4, 1, 5, 0 } };

	@SuppressWarnings("unchecked")
	@Override
	public Population createInitialPopulation() {
		Population pop = new Population();
		
		for(int i = 0; i < 10; i++) {
			
			ArrayList<Integer> citiesAvailables = new ArrayList<Integer>();
			for(int j = 0; j < cities.length; j++) 
				citiesAvailables.add(j);
			
			Collections.shuffle(citiesAvailables);
			
			ChromosomeRoute cr = new ChromosomeRoute();
			
			int from = citiesAvailables.remove(0);
			
			while (citiesAvailables.size() > 0){
				
				int to = citiesAvailables.remove(0);
				double distance = distances[from][to];
				
				cr.add(new GenPath(distance, cities[from], cities[to]));
				
				from = to;
			}
			
			pop.add(cr);
		}
		
		return pop;
	}

}
