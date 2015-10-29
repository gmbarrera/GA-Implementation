package gmbarrera.ga;

public abstract class GeneticAlgorithm {
	
	public abstract Population createInitialPopulation();
	
	
	
	
	public Population start() {
		Population theBest = null;
		Population initialPopulation = createInitialPopulation();
		
		
		System.out.println("Initial Population:");
		System.out.println(initialPopulation);
		
		
		
		
		return theBest;
	}
	
}
