package base.enumexample;

public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d);
		System.out.println("+++++++++++++++++++++++++");
		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("+++++++++++++++++++++++++");
		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(DirectionEnum.FRONT);
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(DirectionEnum2.FRONT);
		System.out.println(DirectionEnum2.FRONT.getName());
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(DirectionEnum3.FRONT);
		System.out.println(DirectionEnum3.FRONT.getName());
		DirectionEnum3.FRONT.show();
		
		System.out.println("------------------");
		DirectionEnum3 denum3 = DirectionEnum3.FRONT;
		switch(denum3){
		case FRONT:
			System.out.println("你选的是前");
			break;
		case BEHIND:
			System.out.println("你选的是后");
			break;
		default:
			break;
		}
				
	}
}
