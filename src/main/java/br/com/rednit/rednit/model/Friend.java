package br.com.rednit.rednit.model;

public class Friend<TAccount extends Account<? super TAccount>> {
	
	private TAccount friend1;
	
	private TAccount friend2;

	public TAccount getFriend1() {
		return friend1;
	}

	public TAccount getFriend2() {
		return friend2;
	}
	
}