class emp{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage caluclation using Java");
		int is_Present=1;
		int salary;
		int wagePerHr=20;
		int fulltime=8;
		double random_Check=Math.floor(Math.random() * 10) % 2;
			if (random_Check==is_Present) {
				System.out.println("Employee is present");
				salary=wagePerHr*fulltime;
				System.out.println(salary);
			}
	else {
		System.out.println("Employee is absent");
	}


	}

}
