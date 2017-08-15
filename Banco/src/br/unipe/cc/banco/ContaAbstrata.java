package br.unipe.cc.banco;

public abstract class ContaAbstrata {
	protected float saldo;
	protected String numConta;		
	
	abstract Boolean debitar(float valor);		
	public Boolean creditar(float valor){
		if(valor < 0)
			return false;
		this.setSaldo(valor + this.getSaldo());
		return true;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
}
