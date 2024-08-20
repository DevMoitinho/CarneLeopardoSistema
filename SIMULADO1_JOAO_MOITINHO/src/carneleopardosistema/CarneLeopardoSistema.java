package carneleopardosistema;

public class CarneLeopardoSistema {
	private Cliente[] contribuintes;
	private int iContribuinte;
	private Tributo[] tributos;
	private int iTributo;
	

	
	public CarneLeopardoSistema(){
		this.contribuintes = new Cliente[100];
		this.tributos = new Tributo[60];
		this.iContribuinte = 0;
	}
	
	public String CadastrarContribuinte(String nome, String cpf, String cell) {
		Cliente auxCliente = new Cliente(nome,cpf,cell);
		for(int i=0;i<iContribuinte;i++) {
			if(auxCliente.equals(contribuintes[iContribuinte])) {
				return "Cliente ja Cadastrado.";
			}
		}
		contribuintes[iContribuinte++] = auxCliente;
		return cpf;
	}
	
	public String[] ListarContribuintes() {
		String[] out = new String[iContribuinte];
		for(int i=0;i<iContribuinte;i++) {
			out[i]= contribuintes[i].toString();
		}
		return out;
	}
	
	public int CadastrarTributo(int codigo, String descricao, double valor, int ano) {
		if(1>codigo || codigo>60) {
			throw new IndexOutOfBoundsException("A faixa disponível para códigos tributários é de 1 a 60!");
		}
		Tributo auxTributo = new Tributo(codigo,descricao,valor,ano);
		for(int i=0;i<iTributo;i++) {
		if(auxTributo.equals(tributos[iTributo])) {
				return 0;
			}
		}
		tributos[iTributo++] = auxTributo;
		return codigo;
	}
	
	public String[] ListarTributos() {
		String[] out = new String[iTributo];
		for(int i=0;i<iTributo;i++) {
			out[i]= tributos[i].toString();
		}
		return out;
	}
	
	public double ReajustarTributo(int c, int a, double perc) {
		if(haTributo(c-1)) {
			if(tributos[c-1].getAno() > a) {
				tributos[c-1].reajustaValor(perc, a);
				return tributos[c-1].getValor();
			}
		}
		return 0;
	}
	
	private boolean haTributo(int c) {
		for(int i=0;i<iTributo;i++) {
			if(tributos[i].getCodigo() == c) {
				return true;
			}
		}
		return false;
	}

	
}
