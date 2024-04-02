package basic;

import java.util.Scanner;

enum IceCrream{
	Vanilla(20.00),Chocolate(22.50),Strawberry(23.00);
	private double price;
	IceCrream(double price) {
		this.price=price;
		
	}
	static void getPrice(int i) {
		IceCrream[]creams=IceCrream.values();
		System.out.println("pay Rs."+creams[i].price);
	}
}
public class IceCreamEnum {

	public static void main(String[] args) {
		System.out.println("Available Ice Creams");
		for(IceCrream cream:IceCrream.values()) {
			int no=cream.ordinal();
			System.out.println(no+" "+cream);
			
		}
		System.out.println("Select The IceCream By using Its Numbers ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		IceCrream.getPrice(choice);

	}

}
