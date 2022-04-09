package MINI_GAME;

public class Player_2 extends Player_1{

	private int health;
	private boolean armour;
	


	public Player_2(String name, String weapon, int health, boolean armour)
	{
		super(name,weapon,health);
		this.health = health;
		this.armour = armour;
	}

	@Override  //ALT+SHIFT+S+V
	public void damage_by_gun1() {
		if(armour)
		{
			this.health -= 20;
			if(this.health <= 0) 
				this.health = 0;
			System.out.println("Armour is on .Got hit by Gun 1, Health is reduced by 20."+ 
				"New health is "+this.health);
		}
		if(!armour)
		{
			this.health -= 30;
			if(this.health <= 0) 
				this.health = 0;
			System.out.println("Armour is not on .Got hit by Gun 1, Health is reduced by 20."+ 
				"New health is "+this.health);

		}
	}

	@Override
	public void damage_by_gun2() {
		if(armour)
		{
			this.health -= 40;
			if(this.health <= 0) 
				this.health = 0;
			System.out.println("Armour is off .Got hit by Gun 2, Health is reduced by 20."+ 
				"New health is "+this.health);
		}
		if(!armour)
		{
			this.health -= 50;
			if(this.health <= 0) 
				this.health = 0;
			System.out.println("Armour is not off .Got hit by Gun 2, Health is reduced by 20."+ 
				"New health is "+this.health);

		}
	}

	@Override
	public void getNewHealth() {
		if(this.health == 0)
			System.out.println("Payer is dead you can't extend the health");
		else 
		{
			this.health = 100;
			System.out.println("Your new health is "+this.health);
		}
	}
	
	
	
	
	
	
}
