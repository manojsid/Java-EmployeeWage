class emp{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage caluclation using Java");
		int is_Present=1;
		int salary;
		int wagePerHr=20;
		int hrs=0;
		//double parttime=1;         
		//double fulltime=2;
		//double absent=0;
		//double random_Check=Math.floor(Math.random() * 10) % 2;
		int total_working_days=20;
		int salary_per_month=0;
		double random_Check_2=Math.floor(Math.random() * 10) % 3;
		int random=(int)random_Check_2;
			switch(random){
				case 1:
				System.out.println("Yes...!, Employee is present and he is parttime");
				//salary=wagePerHr*parttime_hrs;
				hrs=4;
				//System.out.println("And he owned salary of Rs"+salary);
				//salary_per_month=total_working_days*salary;


				break;
				case 2:
				System.out.println("Yes...!, Employee is present and he is FULLTIME");
				hrs=8;
				//System.out.println("And owned salary of Rs"+salary);
				break;
				default:
				System.out.println("Employee is absent");


			}

			salary=wagePerHr*hrs;
			System.out.println("And he owned salary of Rs"+salary);
			salary_per_month=total_working_days*salary;
			System.out.println("Employee wage for month is: "+salary_per_month);




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
