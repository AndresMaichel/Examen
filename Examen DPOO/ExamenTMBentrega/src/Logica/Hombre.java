package Logica;

public class Hombre extends TMB{
	
	public Hombre(float peso, int altura, int anios) {
		super(peso, altura, anios);
	}
	public float calculartmb() {
		return (float) (88.362 + (13.397*peso)+(4.799*altura)-(5.677*anios));
	}
}
