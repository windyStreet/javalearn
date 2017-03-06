package base.enumexample;
/**
 * 
 * @author Administrator jdk 提供的枚举类
 *
 */
public enum DirectionEnum3 {
	FRONT("前"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("前");
			
		}
		
	}, BEHIND("后"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("后");
		}}, LEFT("左"){

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("左");
				
			}}, RIGHT("右"){

				@Override
				public void show() {
					// TODO Auto-generated method stub
					System.out.println("右");
					
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
