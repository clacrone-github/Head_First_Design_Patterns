
public class Knight extends Character {

	public Knight() {
		this.movement = new WalkBehavior();
		this.weapon = new SwordBehavior();
	}
	
	@Override
	void fight() {
		// TODO Auto-generated method stub
		System.out.println("The Knight is fighting!");
		weapon.useWeapon();
	}

}
