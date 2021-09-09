import java.util.*;

abstract class DessertItem{
	String itemName;
	double cost;
	public abstract double getCost();
	public DessertItem(String itemName, double cost) {
		this.itemName=itemName;
		this.cost=cost;
	}
	public void display() {
		System.out.println(this.itemName+" : "+this.cost);
	}
	
}
class Candy extends DessertItem{
	public Candy(String itemName, double cost) {
		super(itemName,cost);
		}
	public double getCost() {
		return this.cost*60;
	}
}
class Cookie extends DessertItem{
	public Cookie(String itemName, double cost) {
		super(itemName,cost);
		}
	public double getCost() {
		return this.cost*70;
	}
}
class IceCream extends DessertItem{
	public IceCream(String itemName, double cost) {
		super(itemName,cost);
		}
	public double getCost() {
		return this.cost;
	}
}

public class Assignment2_7_DessertItem {
	public static void main(String[] args) {
		DessertItem[] Candy = new Candy[40];
		DessertItem[] Cookie = new Cookie[50];
		DessertItem[] IceCream = new IceCream[60];
		int userchoice;
		int cookieCount=0, candyCount=0, icecreamCount=0;
		Scanner sc = new Scanner(System.in);
		char flag = 'N';
		while( flag == 'N') {
			System.out.println("Chhose an user");
			System.out.println("1.Customer");
			System.out.println("2.owner");
			System.out.println("Enter your choice: ");
			userchoice = sc.nextInt();
			switch(userchoice) {
			case 1:
				int custch;
				displayitems();
				System.out.println("Enter your choice");
				custch= sc.nextInt();
				switch(custch) {
				case 1:
					makeOrder(Cookie,cookieCount);
					break;
				case 2:
					makeOrder(Candy,candyCount);
					break;
				case 3:
					makeOrder(IceCream,icecreamCount);
					
				}
				break;
				
			case 2:
				int ownch;
				displayitems();
				System.out.println("Enter your choice:");
				ownch=sc.nextInt();
				String name;
				switch(ownch) {
				case 1:
					addItem(Cookie,cookieCount);
					cookieCount++;
					break;
					
				case 2:
					addItem(Candy,candyCount);
					candyCount++;
					break;
				case 3:
					addItem(IceCream,icecreamCount);
					icecreamCount++;
					break;
				default:
					System.out.println("Invalid choice");
					
				}
				break;
				
				default:
					System.out.println("Invalid choice");
					
				
			}
			
		}
	}
	private static void displayitems() {
		System.out.println("1.Cookie");
		System.out.println("2.Candy");
		System.out.println("3.IceCream");
	
	}
	private static void addItem(DessertItem[] item,int cookieCount) {
		Scanner sc=new Scanner(System.in);
		String name;
		int cookiecost;
		name=sc.nextLine();
		cookiecost=sc.nextInt();
		item[cookieCount]= new Cookie(name,cookiecost);
		
	}
	private static void makeOrder(DessertItem[] item,int count) {
		if(count<=0) {
			System.out.println("Stock is over");
		}else {
			Scanner sc= new Scanner(System.in);
			for(int i=0;i<count;i++) {
				item[i].display();
				String choice;
				choice=sc.nextLine();
				
			}
		}
	}

}
