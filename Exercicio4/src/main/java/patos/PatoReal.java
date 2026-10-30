package patos;

import quack.Quack;
import voar.VoarComAsas;

public class PatoReal extends Pato{
	
	public PatoReal() {
		quackBehavior = new Quack();
		flyBehavior = new VoarComAsas();
	}
	
	public void display() {
		System.out.println("Eu sou o real pato real!");
	}
	
	
}
