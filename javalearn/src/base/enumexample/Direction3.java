package base.enumexample;

public abstract class Direction3 {
	//创建几个实例
	public static final Direction3 FRONT = new Direction3("前"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("前");
		}
	};
	public static final Direction3 BEHIND = new Direction3("后"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("后");
		}
		
	};
	public static final Direction3 LEFT = new Direction3("左"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("左");
		}};
	public static final Direction3 RIGHT = new Direction3("右"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("右");
		}};
	//构造方法私有化，防止创建多个
	private Direction3(){
		
	}
	private String name;
	private Direction3(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void show();
}
