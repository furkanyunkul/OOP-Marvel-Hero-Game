
public class Information extends Game{
	private String player;
	public int power;
	public int attack;
	public int defance;
	
	
	public Information(String player,int power,int attack,int defance) {
		this.player=player;
		this.power=power;
		this.attack=attack;
		this.defance=defance;	
	}
	
	//Getter Setter
	public void SetPlayer(String player) {
		this.player=player;
	}
	public String GetPlayer() {
		return this.player;
	}
	public void SetPower(int power) {
		this.power=power;
	}
	public int GetPower(){
		return this.power;
	}
	public void SetAttack(int attack) {
		this.attack=attack;
	}
	public int GetAttack() {
		return this.attack;
	}
	public void SetDefance(int defance) {
		this.defance=defance;
	}
	public int GetDefance() {
		return this.defance;
	}
	//Extra
	public void printInf() {
		System.out.println("Player name:"+player);
		System.out.println("Player power:"+power);
		System.out.println("Player attack:"+attack);
		System.out.println("Player defance:"+defance);
	}
	
	public void printAttackEnemy(Object enemy) {
		System.out.println(player+" attacked to "+enemy);
		printInf();
	}
	public void printDefanceEnemy(String enemy) {
		System.out.println(player+" defanced to "+enemy);
		printInf();
	}

	public int aaa() {
		// TODO Auto-generated method stub
		return 0;
	}


}
