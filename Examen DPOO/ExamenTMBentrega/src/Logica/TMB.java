package Logica;

public abstract class TMB {
	protected float peso;
	protected int altura;
	protected int anios;
	
	//Mi teclado no tiene ñ 
	
	public TMB (float peso, int altura, int anios ) {
		this.altura = altura;
		this.peso = peso;
		this.anios = anios;
	}
	 public abstract float calculartmb();

}
