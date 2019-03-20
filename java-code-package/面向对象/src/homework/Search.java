package homework;

public class Search {
	{
		
	}
	public void searchName(String name)
	{
		Object[] S = new Object[3];
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		a.setName("小明");
		a.setName("小王");
		a.setName("小红");
		S[0] = a.name;
		S[1] = b.name;
		S[2] = c.name;
		for(int i = 0;i<S.length;i++)
		{
			
		}
	}
	public void searchEmail(String email)
	{
		Object[] S = new Object[3];
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		a.setEmail("123@xx.com");
		a.setEmail("132@xx.com");
		a.setEmail("213@xx.com");
		S[0] = a;
		S[1] = b;
		S[2] = c;
	}
	public void searchPhone(long phone)
	{
		Object[] S = new Object[3];
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		a.setPhone(12345678);
		a.setPhone(12345687);
		a.setPhone(12345678);
		S[0] = a;
		S[1] = b;
		S[2] = c;
	}
	public static void main(String[] args)
	{	
		
	}
}
