package basic;
enum Directions{
	NORTH,EAST,WEST,SOUTH;
}
public class RetriveEnum {

	public static void main(String[] args) {
		Directions[]d=Directions.values();
		System.out.println("News stand for");
		for(Directions rd:d)
			System.out.println(rd);

	}

}
