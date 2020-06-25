class emp{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage caluclation using Java");
		int wagePerHr=20;
		int hrs=0;
		int total_working_days=20;
		int salary=0;
		int max_working_days=20;
		int max_working_hrs=0;
		int total_salary=0;
		
		for ( int i=0;i<=max_working_days;i++) {
		if (max_working_hrs<100) {
			
		
		double random_Check_2=Math.floor(Math.random() * 10) % 3;
		int random=(int)random_Check_2;	
		
		
			switch(random){
				case 1:
				System.out.println("Yes...!, Employee is present and he is parttime");
				hrs=4;
				salary=wagePerHr*hrs;
				System.out.println("parttime salary of employee is: "+salary);
				break;
				case 2:
				System.out.println("Yes...!, Employee is present and he is fulltime");
				hrs=8;
				salary=wagePerHr*hrs;
				System.out.println("fulltime salary of employee is: "+salary);
				break;
				default:
				hrs=0;
				salary=0;
				System.out.println("Employee is absent");


			}
			total_salary=total_salary+salary;
			System.out.println("Total salary till now: " +total_salary);
			max_working_hrs=max_working_hrs+hrs;
			System.out.println("Total working hours till now: "+max_working_hrs);
		}
		

}
System.out.println("Total Wage For Employee in a month: "+ total_salary);
			//System.out.println("Employee wage for month is: "+salary_per_month);



				/*if (random_Check==is_Present) {
				//System.out.println("Employee is present");
				if (random_Check_2==parttime) {
					System.out.println("Yes...!, Employee is present and he is parttime");
					salary=wagePerHr*parttime_hrs;
					System.out.println("And he owned salary of Rs"+salary);
				}
				else if (random_Check_2==fulltime) {
				System.out.println("Yes...!, Employee is present and he is FULLTIME");
				salary=wagePerHr*fulltime_hrs;
				System.out.println("And owned salary of Rs"+salary);
				}	

			else{
				System.out.println("absent");
				} 

				}
				
	else {
		System.out.println("Employee is absent");
	}*/


	}

}
