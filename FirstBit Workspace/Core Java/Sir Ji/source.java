class Date
{
	int day,month,year;
	String dow;

}//class date ends here
class Test
{
	public static void main(String[] args)
	{
		int a;
		Date d1;//reference
		d1 = new Date();
		System.out.println(d1);

		Date d2= new Date();
		System.out.println(d2);

	}
	public static void main1(String[] args)
	{
		Date d1;//reference
		d1 = new Date();
		System.out.println(d1);
		System.out.println("The date is : "+d1.day+"/"+d1.month+"/"+d1.year);
		System.out.println("Day of week is  "+d1.dow);
		d1.day=6;
		d1.month=2;
		d1.year=2026;
		d1.dow="Friday";
		System.out.println("The date is :  " +d1.day+"/"+d1.month+"/"+d1.year);
		System.out.println("Day of week is  "+d1.dow);
		
	}
}