package base.enumexample;
/**
 * 
 * @author Administrator jdk �ṩ��ö����
 *
 */
public enum DirectionEnum2 {
	FRONT("ǰ"), BEHIND("��"), LEFT("��"), RIGHT("��");
	private String name;
	private DirectionEnum2(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}

