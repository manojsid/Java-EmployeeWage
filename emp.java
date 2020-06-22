class emp{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage caluclation using Java");
		int is_Present=1;
		int salaryp=0;
		int salaryf=0;
		int wagePerHr=20;
		int hrs=0;
		int total_working_days=20;
		int salary_per_month=0;
		int max_working_days=20;
		
		for ( int i=0;i<=max_working_days;i++) {
		double random_Check_2=Math.floor(Math.random() * 10) % 3;
		int random=(int)random_Check_2;	
		
		
			switch(random){
				case 1:
				System.out.println("Yes...!, Employee is present and he is parttime");
				hrs=4;
				int pp=wagePerHr*hrs;
				salaryp=pp+salaryp;

				break;
				case 2:
				System.out.println("Yes...!, Employee is present and he is fulltime");
				hrs=8;
				int ff=wagePerHr*hrs;
				salaryf=salaryf+ff;
				break;
				default:
				System.out.println("Employee is absent");


			}

			
			

}
			System.out.println("Monthly salary of parttime employee is "+salaryp);
			System.out.println("Montly salary of fulltime employee is"+salaryf);
			//salary_per_month=total_working_days*salary;
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
