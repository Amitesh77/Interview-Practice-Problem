
public class Singleton {
	
	private static Singleton singleinstance=null;
	
	public String s;
	
	private Singleton()
	{
		s="Amitesh";
	}
	
	public static Singleton getInstance()
	{
		if(singleinstance==null)
		{
			singleinstance=new Singleton();
		}
		
		return singleinstance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		x.s=x.s.toUpperCase();
		y.s=y.s.toLowerCase();
		
		System.out.println(x.s);
		System.out.println(y.s);

	}

}
