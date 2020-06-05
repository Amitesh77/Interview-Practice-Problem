
public class Immutable {
	
	public final String name;
	public final int id;
	
	private Immutable(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	

	public String getName() {
		return name;
	}




	public int getId() {
		return id;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Immutable a=new Immutable("Amitesh",101);
		
		//a.id=102;
		System.out.println(a.id);

	}

}
