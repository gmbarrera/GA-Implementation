package gmbarrera.ga.tsp;

import gmbarrera.ga.Gen;

public class GenPath extends Gen {
	private double distance;
	private String cityNameFrom;
	private String cityNameTo;
	
	public GenPath(double distance, String cityNameFrom, String cityNameTo) {
		this.distance = distance;
		this.cityNameFrom = cityNameFrom;
		this.cityNameTo = cityNameTo;
	}

	public double getDistance() {
		return distance;
	}

	public String getCityNameFrom() {
		return cityNameFrom;
	}

	public String getCityNameTo() {
		return cityNameTo;
	}
	
	public String toString() {
		return cityNameFrom + " -> " + cityNameTo + " [" + distance + "]";
	}
	
	
	
}
