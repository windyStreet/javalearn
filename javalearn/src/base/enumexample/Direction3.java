package base.enumexample;

public abstract class Direction3 {
	//��������ʵ��
	public static final Direction3 FRONT = new Direction3("ǰ"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("ǰ");
		}
	};
	public static final Direction3 BEHIND = new Direction3("��"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("��");
		}
		
	};
	public static final Direction3 LEFT = new Direction3("��"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("��");
		}};
	public static final Direction3 RIGHT = new Direction3("��"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("��");
		}};
	//���췽��˽�л�����ֹ�������
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
