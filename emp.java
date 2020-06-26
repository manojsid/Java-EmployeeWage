class emp{
	public static final int Is_Parttime=1;
	public static final int Is_Fulltime=2;
	//public static final int wagePerHr=20;
	//public static final int number_of_working_days=20;
	//public static final int max_hrs_in_month=100;

		public static int employee_comp(String company, int wagePerHr, int number_of_working_days, int max_hrs_in_month){
		int hrs=0, total_hrs=0, totalWorkingDays=0;
		while (total_hrs <= max_hrs_in_month && totalWorkingDays < number_of_working_days){
		totalWorkingDays++;
		double random_Check_2=Math.floor(Math.random() * 10) % 3;
		int random=(int)random_Check_2;	
		switch(random){
				case Is_Parttime:
				hrs=4;
				break;
				case Is_Fulltime:
				hrs=8;
				break;
				default:
				hrs=0;
			}
			total_hrs+=hrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +hrs);
		}
		int totalEmpWage=total_hrs*wagePerHr;
		System.out.println("Total Emp wage for Company: " +company+" is: "+totalEmpWage);
		return totalEmpWage;
		}

public static void main(String[] args) {
	System.out.println("Welcome to Employee wage caluclation using Java");
	employee_comp("Dmart", 20, 2, 10);
	employee_comp("Reliance", 10, 4, 20);

}
}

