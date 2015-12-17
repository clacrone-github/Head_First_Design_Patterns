
public class King extends Character {

	public King() {
		this.movement = new RunBehavior();
		this.weapon = new SwordBehavior();
	}
	
	@Override
	void fight() {
		// TODO Auto-generated method stub
		System.out.println("The King is fighting!");
		weapon.useWeapon();
	}

}
