package carneleopardosistema;

import java.util.Objects;

public class Cliente {
	private String nome;
	private String cpf;
	private String cell;
	
	private Tributo[] tributos;
	
	public Cliente(String nome, String cpf, String cell) {
		this.nome = nome;
		this.cpf = cpf;
		this.cell = cell;
		this.tributos = new Tributo[60];
	}
	
	
	
	@Override
	public String toString() {
		return "Contribuinte: " + nome + " - CPF: " + cpf + " - Contato: " + cell;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(!(o instanceof Cliente)) {
			return false;
		}
		
		Cliente oCliente = (Cliente) o;
		
		if(this.cpf.equals(oCliente.cpf)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
}
