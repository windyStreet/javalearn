package base.enumexample;
/**
 * 
 * @author Administrator jdk �ṩ��ö����
 *
 */
public enum DirectionEnum3 {
	FRONT("ǰ"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("ǰ");
			
		}
		
	}, BEHIND("��"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("��");
		}}, LEFT("��"){

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("��");
				
			}}, RIGHT("��"){

				@Override
				public void show() {
					// TODO Auto-generated method stub
					System.out.println("��");
					
				}};
	private String name;
	private DirectionEnum3(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public abstract void show();
}
