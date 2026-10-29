package patos;

import quacks.Quack;
import voar.VoarComAsas;

public class PatoReal extends Pato{
	
	public PatoReal() {
		
		quackBehavior = new Quack();
		flyBehavior = new VoarComAsas();
		
	}
	
	public void display() {
		System.out.println("Eu sou um real pato real");
	}
	
}
