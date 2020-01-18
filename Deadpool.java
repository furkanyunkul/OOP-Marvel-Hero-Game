
public class Deadpool extends Information{
	private int spesificPower;
	
	public Deadpool(String player,int power,int attack,int defance,int spesificPower) {
		super(player,power,attack,defance);
		this.setSpesificPower(spesificPower);
	}

	public int getSpesificPower() {
		return spesificPower;
	}

	public void setSpesificPower(int spesificPower) {
		this.spesificPower = spesificPower;
	}
	
	@Override
	public void printInf() {
		
		super.printInf();
	}
	
	public void printAttackEnemy(String enemy) {
		System.out.println(this.GetPlayer()+" attacked to "+enemy);
		this.power=this.power-20;
		printInf();
	}

}
