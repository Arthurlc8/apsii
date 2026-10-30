package patos;

import quack.QuackBehavior;
import voar.FlyBehavior;

public abstract class Pato {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Pato() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	
	public void swim() {
		System.out.println("Todos os patos boiam, inclusive as iscas!");
	}
	
	
}
