
public class Weapon {

	private int id;
	private String name;	
	private int damage;
	private int price;
	
	public Weapon(int id, String name, int damage, int price) {
		super();
		this.id = id;
		this.name = name;
		this.damage = damage;
		this.price = price;
	}
	
	public static Weapon[] getWeaponList() {
		Weapon[] weapons = new Weapon[3];
		weapons[0] = new Weapon(1,"Tabanca",2,15);
		weapons[1] = new Weapon(2,"Kılıç",3,35);
		weapons[2] = new Weapon(3,"TÜfek",7,45);
		return weapons;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
}
