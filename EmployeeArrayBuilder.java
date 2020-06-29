import java.util.*;
public class EmployeeArrayBuilder implements ComputingWage{
	public static final int Is_Parttime=1;
	public static final int Is_Fulltime=2;

	private int numberOfCompany=0;
	private LinkedList<CompanyEmpSalary> companyEmpWageList;
	private Map<String,CompanyEmpSalary> companyToEmpWageMap;
	
	public EmployeeArrayBuilder(){
		companyEmpWageList=new LinkedList<>();
		companyToEmpWageMap=new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int wagePerHr, int number_of_working_days, int max_hrs_in_month){
		CompanyEmpSalary companyEmpSalary=new CompanyEmpSalary(company, wagePerHr, number_of_working_days, max_hrs_in_month);
		companyEmpWageList.add(companyEmpSalary);
		companyToEmpWageMap.put(company, companyEmpSalary);

	}
	public void computeWage(){
		for (int i=0;i< companyEmpWageList.size() ; i++) {
			CompanyEmpSalary companyEmpSalary=companyEmpWageList.get(i);
			companyEmpSalary.setTotalempwage(this.computeWage(companyEmpSalary));
			System.out.println(companyEmpSalary);
		}
	}

	public int getTotalWage(String company){
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public int computeWage(CompanyEmpSalary companyEmpSalary){
	int hrs=0, total_hrs=0, totalWorkingDays=0;
	while (total_hrs <= companyEmpSalary.max_hrs_in_month && totalWorkingDays < companyEmpSalary.number_of_working_days){
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
		return total_hrs * companyEmpSalary.wagePerHr;
		}
		public static void main(String[] args) {
			ComputingWage arrbuilder=new EmployeeArrayBuilder();
			//EmployeeArrayBuilder arrbuilder = new EmployeeArrayBuilder();
			arrbuilder.addCompanyEmpWage("google", 20, 2, 10 );
			//arrbuilder.addCompanyEmpWage( company: "Wallmart", wagePerHr: 10, number_of_working_days: 4, max_hrs_in_month: 20 );
			arrbuilder.addCompanyEmpWage( "Wallmart", 10, 4, 20 );
			arrbuilder.computeWage();
			System.out.println("Total wage for Google company: " + arrbuilder.getTotalWage("Google"));
		}


}
