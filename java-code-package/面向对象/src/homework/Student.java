package homework;

public class Student {
	public String name;
	public String email;
	private int age;
	public long phone;
	public Student()
	{
		name = "Ñ§Éú";
		email = "xxx@xx.com";
		age = 15;
		phone = 123456789;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	public void getName()
	{
		System.out.println(this.name);
	}
	public void getEmail()
	{
		System.out.println(this.email);
	}
	public void getAge()
	{
		System.out.println(this.age);
	}
	public void getPhone()
	{
		System.out.println(this.phone);
	}
	public static void eat()
	{
		System.out.println("³Ô¶«Î÷");
	}
	public static void drink()
	{
		System.out.println("ºÈ");
	}
	public static void play()
	{
		System.out.println("Íæ");	
	}
	public static void sleep()
	{
		System.out.println("Ë¯¾õ");
	}
	public static void main(String[] args)
	{
		Student s = new Student();
		s.setName("´ÞÇØ");
		s.getName();
		s.getEmail();
		s.play();
		
	}
}
