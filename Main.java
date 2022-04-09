package MINI_GAME;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player_1 player1 = new Player_1("Rachana","sword",100);
		Player_2 player2 = new Player_2("Ritesh","Machine Gun",80,true);
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println(
					 "1. Shoot by Gun 1 to Player 1\n"
					+"2. Shoot by Gun 2 to Player 2\n"
					+"3. Shoot By Gun 1 to Player 1\n"
					+"4. Shoot By Gun 2 to Player 2\n"
					+"5. Want heal for Player 1\n"
					+"6. Want heal for Player 2\n"
					+ "7. EXIT");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			if(ch == 7)
			{
				System.out.println("You are exiting from this game");
				break;
			}
			else
			{
				switch(ch)
				{
					case 1:
						player1.damage_by_gun1();
						break;
					case 2:
						player1.damage_by_gun2();
						break;
					case 3:
						player2.damage_by_gun1();
						break;
					case 4:
						player2.damage_by_gun2();
						break;
					case 5:
						player1.getNewHealth();
						break;
					case 6: 
						player2.getNewHealth();
						break;
					
				}
			}
			
			
		}

	}
}