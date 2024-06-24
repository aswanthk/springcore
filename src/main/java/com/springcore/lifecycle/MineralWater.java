package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MineralWater {
	private double prize;

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public MineralWater() {
		super();
	}

	@Override
	public String toString() {
		return "MineralWater [prize=" + prize + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting: init (MineralWater)");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending: destroy (MineralWater)");
	}
	
}
