package Logica;

public class Mujer extends TMB{
	
	public Mujer(float peso, int altura, int anios) {
		super(peso, altura, anios);
	}
	public float calculartmb() {
		return (float) (447.593 + (9.247*peso)+(3.098*altura)-(4.33*anios));
	}
}

