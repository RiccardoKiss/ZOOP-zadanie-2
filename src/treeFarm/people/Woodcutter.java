package treeFarm.people;

public class Woodcutter extends Worker{			// DREVORUBAC
	private boolean hasAxe = false, hasBucket = false;
	private Paycheck paycheck;
	public Woodcutter(String firstName, String lastName, boolean sex, int age) {
		super(firstName, lastName, sex, age);
		this.paycheck = new Paycheck(0);

	}
	
	public Paycheck getMoney() {
		return this.paycheck;
	}

	
	public void setAxe(boolean axe) {
		this.hasAxe = axe;
	}

	public void getAxe() {
		if (hasAxe) {
			System.out.printf("Woodcutter %s %s owns an axe.\n", this.firstName, this.lastName);
		} else {
			System.out.printf("Woodcutter %s %s doesn't own an axe.\n", this.firstName, this.lastName);
		}
	}

	public void cutTree() {		// TBD
		
		
		paycheck.addMoney(50);
	}

	public void setBucket(boolean bucket) {
		this.hasBucket = bucket;
	}

	public void getBucket() {
		if (hasBucket) {
			System.out.printf("Woodcutter %s %s owns a bucket.", this.firstName, this.lastName);
		} else {
			System.out.printf("Woodcutter %s %s doesn't own a bucket.", this.firstName, this.lastName);
		}
	}

}
