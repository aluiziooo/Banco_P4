package br.unipe.cc.banco;

public class Conta extends ContaAbstrata {		
	
	public Boolean debitar(float valor){
		if(valor > this.saldo){
			return false;
		}
		this.setSaldo(saldo - this.getSaldo());
		return true;
	}		
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
