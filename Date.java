public class Date{
	private int date;
	private int month;
	private int year;
	
	public Date(int date,int month,int year)
	{
		setDate(date);
		setMonth(month);
		setYear(year);	
			
	}
	Date(int month,int year)
	{
		this(1,month,year);
	}
	Date(int year)
	{
		this(1,1,year);
	}
	
	public void setDate(int date)
		{
			if(date>30)
				System.out.println("Date is invalid(1-30), entered date : "+ date);
			else
			this.date=date;
		}
		public void setMonth(int month)
		{
			if(month>12)
				System.out.println("Month is invalid(1-12), entered month : "+ month);
			else
			this.month=month;
		}
		public void setYear(int year)
		{
			if(year<=0)
				System.out.println("Year is invalid(below 0), entered year : "+ year);
			else
			this.year=year;
		}
			
		public int getDate(){return date;}
		public int getMonth(){return month;}
		public int getYear(){return year;}	
	
		public void Display(){
					System.out.printf("The date is: %02d/%02d/%04d%n", date, month, year); 
				}
}