public class Demo{
	public static void main(String args[])
	{
		Product p1=new Product("Bat",900,300, new Date(10,8,2011));
		Product p2=new Product("Gloves ",1834,200,new Date(12,12,2001));
		Product p3=new Product("Helmet",1300,400,new Date(11,12,1981));

		p1.Display();
		p2.Display();
		p3.Display();
	}

}