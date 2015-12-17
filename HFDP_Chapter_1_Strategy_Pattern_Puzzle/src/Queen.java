
public class Queen extends Character {
	
	public Queen() {
		this.movement = new WalkBehavior();
		this.weapon = new BowAndArrowBehavior();
	}
	
	@Override
	void fight() {
		// TODO Auto-generated method stub
		System.out.println("The Queen is fighting!");
		weapon.useWeapon();
	}

}
