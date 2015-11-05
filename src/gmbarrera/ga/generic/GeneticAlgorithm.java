/*
 * Copyright (c) 2015, Gabriel Barrera (gmbarrera@gmail.com)
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

 package gmbarrera.ga.generic;

import java.util.LinkedList;
import java.util.List;
 

public abstract class GeneticAlgorithm {
	
	private long maxGenerations = 1000;
	private long sizePreviousPopulations = 1;
	
	
	public abstract Population createInitialPopulation();
	
	public abstract boolean convergedPopulation(Population newPopulation,  List<Population> previousPopulation);
		
	
	
	
	public final long getMaxGenerations() {
		return maxGenerations;
	}

	public final void setMaxGenerations(long maxGenerations) {
		this.maxGenerations = maxGenerations;
	}

	public final long getSizePreviousPopulations() {
		return sizePreviousPopulations;
	}

	public final void setSizePreviousPopulations(long sizePreviousPopulations) {
		this.sizePreviousPopulations = sizePreviousPopulations;
	}

	
	
	
	public Population start() {
		Population newPopulation = null;
		LinkedList<Population> previousPopulations = new LinkedList<Population>();		
		Population initialPopulation = createInitialPopulation();
		
		long generationNumber = 0;
		
		System.out.println("Initial Population:");
		System.out.println(initialPopulation);
		
		previousPopulations.push(initialPopulation);
		
		do {
			
			
			
			
			
			
			
			
			
			previousPopulations.push(newPopulation);
			if (previousPopulations.size() > sizePreviousPopulations)
				previousPopulations.pop();
			
		} while (generationNumber++ < maxGenerations && !convergedPopulation(newPopulation, previousPopulations));
		
		
		
		return newPopulation;
	}
}
