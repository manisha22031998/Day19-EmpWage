public class EmpWage
{
	public static final int WAGE_PER_HR=20,HALF_DAY=1,FULL_DAY=2,MONTH=20,MAXHRS=100;
	public static void main(String[] args)
	{
		int salary=0,workingHr=0,day=0;
		int totalWorkingHrs=0,totalSalary=0;

//		for(int day=1;day<=MONTH;day++)
		while(day<=MONTH && totalWorkingHrs<MAXHRS)
		{
			int random=(int)Math.floor(Math.random()*10)%3;
			switch (random)
			{
				case FULL_DAY:
//						System.out.println("Employee is PRESENT for Full Day");
						workingHr=8;
						break;
				case HALF_DAY:
//						System.out.println("Employee Present for Half Day");
						workingHr=4;
						break;
				default:
//						System.out.println("employee is absent");
						break;
			}
			if(totalWorkingHrs==96 || totalWorkingHrs==94)
			{
				if (workingHr==8)
				break;
			}
			else if(totalWorkingHrs==98)
			{
				break;
			}
			salary=WAGE_PER_HR*workingHr;
			totalWorkingHrs+=workingHr;
			totalSalary+=salary;
			day++;
		}
		System.out.println("Emlpoyee Earns this month : "+totalSalary);
		System.out.println("Days "+day+" Hours "+totalWorkingHrs);


	}

}
