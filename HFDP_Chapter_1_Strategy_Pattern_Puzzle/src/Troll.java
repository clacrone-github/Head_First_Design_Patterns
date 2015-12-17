
public class Troll extends Character {
	
	public Troll() {
		this.movement = new StrutBehavior();
		this.weapon = new AxeBehavior();
	}
	
	@Override
	void fight() {
		// TODO Auto-generated method stub
		System.out.println("The Troll is fighting!");
		weapon.useWeapon();
	}

}
