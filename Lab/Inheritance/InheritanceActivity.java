class Employee{
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance = 250.80;
	public double hra = 1000.50;

	Employee(long id, String name, String address, long phone){
		this.employeeId =id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}

	public void calculateTransportAllowance(){
		double transportAllowance = 10*basicSalary/100;
		System.out.println("TransportAllowance: " + transportAllowance);
	}

	public void calculateSalary()
	{
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println("Salary: " + salary);
		
	}
	}
class Manager extends Employee{
	Manager(long id, String name, String address,  long phone, double salary)
		{
			super(id, name, address, phone);
			this.employeeId =id;
			this.employeeName = name;
			this.employeeAddress = address;
			this.employeePhone = phone;
			this.basicSalary = salary;
		}
		public  void calculateTransportAllowance(){
		double transportAllowance = 15*basicSalary/100;
		System.out.println("TransportAllowance: " + transportAllowance);
		}
	}

	class Trainee extends Employee{
		Trainee(long id, String name, String address,  long phone, double salary)
		{
			super(id, name, address, phone);
			this.employeeId =id;
			this.employeeName = name;
			this.employeeAddress = address;
			this.employeePhone = phone;
			this.basicSalary = salary;
		}
	}

public class InheritanceActivity{
    public static void main(String[] args)
    {
	Manager m = new Manager(126534,"Peter","Chennai India",237844, 65000);
	m.calculateSalary();
	m.calculateTransportAllowance();
	Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);
	t.calculateSalary();
	t.calculateTransportAllowance();
	
        }
}