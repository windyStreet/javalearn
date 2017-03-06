package base.enumexample;

public class Direction {
	//创建几个实例
	public static final Direction FRONT = new Direction();
	public static final Direction BEHIND = new Direction();
	public static final Direction LEFT = new Direction();
	public static final Direction RIGHT = new Direction();
	//构造方法私有化，防止创建多个
	private Direction(){
		
	}
}
