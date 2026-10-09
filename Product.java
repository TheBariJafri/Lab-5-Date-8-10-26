public class Product{
	private String ID;    
	private String name;
	private double price;
	private int qty;
	private static int count=0;
	private static double maxPrice;
	private static double minPrice;
	public Date md;
	
	
	public Product(String name, double price,int qty, Date md )
	{
		this.ID=  String.format("p%03d",++count);
		this.qty=qty;
		this.name=name;
		this.md=md;
		this.price=price;
		this.qty=qty;
		if(count==1){
			maxPrice=price;
			minPrice=price;		
		}
                else 
		 {
			if(count > 1 && minPrice > price)
				{
					minPrice = price;
				}
			if(count > 1 && maxPrice < price)
				{
					maxPrice = price;
				}
		 
		 }                  

	}
	
	
	public void Display(){
	
		System.out.println("Name : "+ name);
		System.out.println("ID : "+ ID);
		System.out.println("Price : "+ price);
		System.out.println("Quantity: "+ qty);
		System.out.println("MAX : "+ maxPrice);
		System.out.println("MIN : "+ minPrice);
	System.out.printf("DOB: %02d/%02d/%04d%n", md.getDate(),md.getMonth(),md.getYear()); 	
		

		
	}
	
}