package base.enumexample;

public class Direction2 {
	//创建几个实例
	public static final Direction2 FRONT = new Direction2("前");
	public static final Direction2 BEHIND = new Direction2("后");
	public static final Direction2 LEFT = new Direction2("左");
	public static final Direction2 RIGHT = new Direction2("右");
	//构造方法私有化，防止创建多个
	private Direction2(){
		
	}
	private String name;
	private Direction2(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
