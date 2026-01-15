package animals;

import common.Animal;

public class Rabbit extends Animal{
	
	public Rabbit(String name) {
		super(name);
	}
	@Override
	public void sound() {
		System.out.println(" 꿍꿍 ");
	}

}
