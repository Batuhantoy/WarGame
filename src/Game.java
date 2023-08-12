import java.util.Scanner;

public class Game {

	private Player player;
	private Location location;
	
	Scanner sc = new Scanner(System.in);
	
	public Game() {
		
	}
	
	public void start() {
		System.out.println("Exploit Game'e Hoşgeldiniz!!!");
		System.out.print("Karakterinizin İsmini Giriniz : ");
		String playerName = sc.nextLine();
		
		//Player newPlayer = new Player(playerName);
		player = new Player(playerName);
		System.out.println(player.getUserName()+" oyuna Hoşgeldiniz!!");
		System.out.println();
		player.selectChar();
		setLocation(new SafeHouse(player));
		while(true)
		{
			System.out.println("-----------------------------");
			player.printInfo();
			selectLocation();
			if(!location.onLocation()) {
				System.out.println("Öldün çık!!!");
				break;
			}
		
		
		}
	}

	public void selectLocation() {		
		System.out.println("GÜNCEL KONUM : "+location.getLocationName());
		//System.out.println("----------------");
		System.out.println("Hangi bölgeye gitmek istersiniz ?");
		for(Location l : location.getLocationNames()) {
			System.out.println("("+l.getLocationId()+")"+" "+l.getLocationName());
		}
		
		
		
		int selected=sc.nextInt();	
		setLocation(location.getLocationNames().get(selected-1));
		System.out.println("-----------------------------");
		System.out.println("GÜNCEL KONUM : "+location.getLocationName());
		//location.onLocation();
		System.out.println();
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;		
	}
	
	
}
