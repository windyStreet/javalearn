package base.enumexample;
/**
 * 
 * @author Administrator jdk 提供的枚举类
 *
 */
public enum DirectionEnum2 {
	FRONT("前"), BEHIND("后"), LEFT("左"), RIGHT("右");
	private String name;
	private DirectionEnum2(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}

