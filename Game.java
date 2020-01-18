
public class Game {
	public static void main(String[] args) throws InterruptedException {
		int hPower = 0;
		int hAttack=0;
		int hDefance=0;
		int ePower=0;
		int eAttack=0;
		int eDefance=0;
		Information hulk=new Hulk("Hulk",300,50,20,50);
		Information deadpool=new Deadpool("Deadpool",150,30,10,20);
		Information ironman=new Ironman("Ironman",200,25,50,5);
		Object[] myList= {hulk,deadpool,ironman};
		
		int orderHero=(int)(Math.random()*myList.length);
	
		Object hero=myList[orderHero];
		int orderEnemy=(int)(Math.random()*myList.length);
		Object enemy=myList[orderEnemy];
		//Hero
		if(hero.equals(hulk)) {
			
			hulk.printInf();
			hPower=hulk.GetPower();
			hAttack=hulk.GetAttack();
			hDefance=hulk.GetDefance();
		}
		else if(hero.equals(deadpool)) {
			
			deadpool.printInf();
			hPower=deadpool.GetPower();
			hAttack=deadpool.GetAttack();
			hDefance=deadpool.GetDefance();
		}
		else if(hero.equals(ironman)) {
			ironman.printInf();
			hPower=ironman.GetPower();
			hAttack=ironman.GetAttack();
			hDefance=ironman.GetDefance();
		}
		else {
			System.out.println("nothing");
		}
		System.out.println("********************************************************");
		//Enemy
		if(enemy.equals(hulk)) {
			hulk.printInf();
			ePower=hulk.GetPower();
			eAttack=hulk.GetAttack();
			eDefance=hulk.GetDefance();
		}
		else if(enemy.equals(deadpool)) {
			deadpool.printInf();
			ePower=hulk.GetPower();
			eAttack=hulk.GetAttack();
			eDefance=hulk.GetDefance();
		}
		else if(enemy.equals(ironman)) {
			ironman.printInf();
			ePower=hulk.GetPower();
			eAttack=hulk.GetAttack();
			eDefance=hulk.GetDefance();
		}
		else {
			System.out.println("nothing");
		}
		
		int round=0;
		
		while(true) {
			int orderMatch=(int) (Math.random()*2);
			round=round+1;
			System.out.println("Round:"+round);
			System.out.println("********************************************************");
			
			Thread.sleep(3000);
			
			if(orderMatch==0) {
				if(hero.equals(hulk) && enemy.equals(hulk)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(hulk,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(hulk,ePower,eAttack,eDefance);
				}
				else if(hero.equals(hulk) && enemy.equals(deadpool)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(hulk,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(deadpool,ePower,eAttack,eDefance);
				}
				else if(hero.equals(hulk) && enemy.equals(ironman)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(hulk,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(ironman,ePower,eAttack,eDefance);
				}
				else if(hero.equals(deadpool) && enemy.equals(hulk)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(deadpool,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(hulk,ePower,eAttack,eDefance);
				}
				else if(hero.equals(deadpool) && enemy.equals(ironman)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(deadpool,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(ironman,ePower,eAttack,eDefance);
				}
				else if(hero.equals(deadpool) && enemy.equals(deadpool)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(deadpool,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(deadpool,ePower,eAttack,eDefance);
				}
				else if(hero.equals(ironman) && enemy.equals(deadpool)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(ironman,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(deadpool,ePower,eAttack,eDefance);
				}
				else if(hero.equals(ironman) && enemy.equals(ironman)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(ironman,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(ironman,ePower,eAttack,eDefance);
				}
				else if(hero.equals(ironman) && enemy.equals(hulk)) {
					hPower=hPower-eAttack+hDefance;
					printInfHero(ironman,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(hulk,ePower,eAttack,eDefance);
				}
				else {
					System.out.println("nothing");
				}	
			}
			if(orderMatch==1) {
				if(hero.equals(hulk) && enemy.equals(hulk)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(hulk,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(hulk,ePower,eAttack,eDefance);
				}
				else if(hero.equals(hulk) && enemy.equals(deadpool)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(hulk,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(deadpool,ePower,eAttack,eDefance);
				}
				else if(hero.equals(hulk) && enemy.equals(ironman)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(hulk,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(ironman,ePower,eAttack,eDefance);
				}
				else if(hero.equals(deadpool) && enemy.equals(hulk)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(deadpool,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(hulk,ePower,eAttack,eDefance);
				}
				else if(hero.equals(deadpool) && enemy.equals(ironman)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(deadpool,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(ironman,ePower,eAttack,eDefance);
				}
				else if(hero.equals(deadpool) && enemy.equals(deadpool)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(deadpool,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(deadpool,ePower,eAttack,eDefance);
				}
				else if(hero.equals(ironman) && enemy.equals(deadpool)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(ironman,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(deadpool,ePower,eAttack,eDefance);
				}
				else if(hero.equals(ironman) && enemy.equals(ironman)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(ironman,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(ironman,ePower,eAttack,eDefance);
				}
				else if(hero.equals(ironman) && enemy.equals(hulk)) {
					ePower=ePower-hAttack+eDefance;
					printInfHero(ironman,hPower,hAttack,hDefance);
					System.out.println("********************************************************");
					printInfEnemy(hulk,ePower,eAttack,eDefance);
				}
				else {
					System.out.println("nothing");
				}	
			}
			if(ePower<=0  || hPower<=0) {
				System.out.println("********************************************************");
				System.out.println("Game Over");
				if(ePower>hPower) {
					System.out.println("********************************************************");
					System.out.println("Enemy wins");
					break;
				}
				else {
					System.out.println("********************************************************");
					System.out.println("Hero wins");
					break;
				}
			}
		}
		//
	}
	public static void printInfHero(Object hero,int hPower,int hAttack,int hDefance ) {
		System.out.println("Hero");
		System.out.println(hero);
		System.out.println("Power:"+hPower);
		System.out.println("Attack:"+hAttack);
		System.out.println("Defance:"+hDefance);
	}
	public static void printInfEnemy(Object enemy,int ePower,int eAttack,int eDefance ) {	
		System.out.println("Enemy");
		System.out.println(enemy);
		System.out.println("Power:"+ePower);
		System.out.println("Attack:"+eAttack);
		System.out.println("Defance:"+eDefance);
	}
	
	 
	




	
}
