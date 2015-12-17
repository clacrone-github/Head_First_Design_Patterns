
public class AdventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character king = new King();
		king.setWeapon(new SwordBehavior());
		king.fight();
		king.setWeapon(new AxeBehavior());
		
		king = new Queen();
		king.fight();
		king.setWeapon(new KnifeBehavior());
		
		king.performMovement();
		king.setMovement(new StrutBehavior());
		king.performMovement();
		
		king = new Queen();
		king.fight();
		king.performMovement();
		
		king = new Troll();
		king.fight();
		king.performMovement();
		
		king = new Knight();
		king.fight();
		king.performMovement();
	}

}
