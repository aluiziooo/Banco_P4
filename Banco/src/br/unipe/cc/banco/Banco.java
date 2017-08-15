package br.unipe.cc.banco;

import java.util.List;

public class Banco {
	private List<Conta> contas;
		
	
	public Boolean debitar(String numeroConta, float valor){
		for (Conta conta : contas) {
			if(conta.getNumConta().equals(numeroConta))
				return conta.debitar(valor);
		}
		return false;
	}
	public Boolean creditar(String numeroConta, float valor){
		for (Conta conta : contas) {
			if(conta.getNumConta().equals(numeroConta))
				return conta.creditar(valor);
		}
		return false;
	}
		
	
}

