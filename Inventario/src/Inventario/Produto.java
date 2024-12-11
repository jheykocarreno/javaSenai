package Inventario;

public class Produto {

	//Declaramos variaveis
	private String codProd;
	private String nomProd;
	private int qtdProd;
	private double valProd;

	//Criamos os construtores
	public Produto() {
		
	}
	
	public Produto(String codProd, String nomProd, int qtdProd, double valProd) {
		this.codProd = codProd;
		this.nomProd = nomProd;
		this.qtdProd = qtdProd;
		this.valProd = valProd;
	}
	
	//Criamos os setters para cada variavel
	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}
	
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	
	public void setUniProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}
	
	public void setValProd(double valProd) {
		this.valProd = valProd;
	}
	
	//Criamos os getters para cada variavel
	public String getCodProd() {
		return codProd;
	}
	
	public String getNomProd(){
		return nomProd;
	}
	
	public int getQtdProd() {
		return qtdProd;
	}
	
	public double getValProf() {
		return valProd;
	}

	//Criacao de metodos
	//-Metodo toString
	public String toString() {
		return "\n\nCodigo de Produto : " + this.codProd + "\nNome do produto : " + this.nomProd + "\nQuantidade no estoque : " + this.qtdProd + "\nValor do produto : " + this.valProd;
		
		
	}
}
