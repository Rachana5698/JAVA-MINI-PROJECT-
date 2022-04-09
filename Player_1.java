package MINI_GAME;

public class Player_1 {

	private String name ;
	private String weapon;
	private int health;
	
	public Player_1(String name, String weapon, int health)
	{
		this.name = name;
		this.weapon = weapon;
		if(health >0 && health<=100)
		this.health = health;
		else 
		{
			System.out.println("Please Enter the health between 0 to 100");
			System.exit(getHealth());
		}
	}
	
	public void damage_by_gun1()
	{
		this.health -= 30 ;
		if(this.health < 0)
		{
			this.health = 0;
		}
		System.out.println("Got hit by Gun 1 , Health is reduce by 30"+ " new health is "+this.health);
		if(health == 0)
			System.out.println("Player is Dead");
	}
	
	public void damage_by_gun2()
	{
		this.health -= 50 ;
		if(this.health < 0)
		{
			this.health = 0;
		}
		System.out.println("Got hit by Gun 2 , Health is reduce by 50"+ " new health is "+this.health);
		if(health == 0)
			System.out.println(getName()+ " is Dead");		
	}
	
	public void getNewHealth()
	{
		if(this.health == 0)
			System.out.println("Payer is dead you can't extend the health");
		else 
		{
			this.health = 100;
			System.out.println("Your new health is "+getHealth());
		}
	}
	public String getName()
	{
		return name ;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getWeapon()
	{
		return weapon;
	}
	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}
	public int getHealth()
	{
		return health;
	}
	public void getHealth(int health)
	{
		this.health = health;
	}
}
