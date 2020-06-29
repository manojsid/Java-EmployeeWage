public class EmployeeArrayBuilder{
	public static final int Is_Parttime=1;
	public static final int Is_Fulltime=2;

	private int numberOfCompany=0;
	private CompanyEmpSalary[] companyEmpWageArray;

	public EmployeeArrayBuilder(){
		companyEmpWageArray=new CompanyEmpSalary[5];
	}
	private void addCompanyEmpWage(String company, int wagePerHr, int number_of_working_days, int max_hrs_in_month){
		companyEmpWageArray[numberOfCompany]=new CompanyEmpSalary(company, wagePerHr, number_of_working_days, max_hrs_in_month);
		numberOfCompany++;
	}
	private void computeWage(){
		for (int i=0;i< numberOfCompany ; i++) {
			companyEmpWageArray[i].setTotalempwage(this.computeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeWage(CompanyEmpSalary Emmp){
	int hrs=0, total_hrs=0, totalWorkingDays=0;
	while (total_hrs <= Emmp.max_hrs_in_month && totalWorkingDays < Emmp.number_of_working_days){
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
			System.out.println("***Day->: ***" + totalWorkingDays + " Emp Hr: " + hrs);
		}
		return total_hrs * Emmp.wagePerHr;
		}
		public static void main(String[] args) {
			EmployeeArrayBuilder arrbuilder = new EmployeeArrayBuilder();
			arrbuilder.addCompanyEmpWage("google", 20, 2, 10);
			arrbuilder.addCompanyEmpWage("Wallmart", 10, 4, 20);
			arrbuilder.computeWage();
		}

}
