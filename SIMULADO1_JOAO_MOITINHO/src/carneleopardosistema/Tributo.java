package carneleopardosistema;

import java.util.Objects;

public class Tributo {
	private int codigo;
	private String descricao;
	private double valor;
	private int ano;
	
	public Tributo(int codigo, String descricao, double valor, int ano) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.ano = ano;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public int getAno() {
		return this.ano;
	}

	public double getValor() {
		return this.valor;
	}
	
	public void reajustaValor(double p,int a) {
		this.valor += this.valor*p;
		this.ano = a;
	}

	@Override
	public String toString() {
		return "| Tributo: " + codigo + "-" + descricao + " - Valor: R$" + String.format("%.2f", valor) + " - Ano Base: " + ano + " |";
	}

	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(!(o instanceof Tributo)) {
			return false;
		}
		
		Tributo oTributo = (Tributo) o;
		
		if(this.codigo == oTributo.codigo) {
			return true;
		}
		return false;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
}
