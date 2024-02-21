package Presentación;

import Logica.TMB;
import Logica.Hombre;
import Logica.Mujer;

public class Main{
	public static void main(String[] args) {
		
		TMB persona;
		persona = new Hombre (65, 186, 19);
			System.out.println(persona.calculartmb());
		
		persona = new Mujer (50, 165, 19);
			System.out.println(persona.calculartmb());
		
	}

}
