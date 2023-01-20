package Adi2561;

public class SimpleHello {


			double BOA;
			double basic;
			double bonus;
			double add;
			double month;
			double year;
			double tax;
			double month_t;
			double salary;
			double p1;
			
			public SimpleHello(int a ,int b,int c)
			{
				basic=a;
				BOA=b;
				bonus=c;
			}
			
			
			public double monthly_sal()
			{
				add=(bonus+BOA+basic);
				System.out.println();
				System.out.println("Monthly salary is :"+add);
				return add;
				
				
			}
			
			public double pf()
			{
			   p1=basic*0.12;
			   System.out.println("PF is "+p1);
			   return p1;
			}
			 public double monthly_taxable() {
				 month=add-p1;
				 System.out.println("Monthly taxable amount :"+month);
				 return month;
				 
				 
			 }
		       public double yearly_taxable()
		       {
		    	   year=month*12;
		    	   System.out.println("Yearly taxable amount :"+year);
		    	   return year;
		       }
		       
		       public double tax_year() {
		    	   if (year<=250000) {
		    		   
		    		   System.out.println("No tax required");
		    		   
					
				} else if (year>250000 && year<=500000)
				{
					 tax=year * 0.05;
					System.out.println("Tax appliable is :"+tax);
				
				}else if (year>500000 && year <=750000)
				{
					 tax=year * 0.10;
					System.out.println("Tax applicable is :"+tax);
					
				}else if (year>750000 && year <=1000000)
				{
					 tax=year * 0.15;
					System.out.println("Tax applicable is :"+tax);
				}else if (year>100000 && year <=1250000)
				{
					 tax=year * 0.20;
					System.out.println("Tax applicable is :"+tax);
				}else if (year>1250000 && year <=1500000)
				{
					tax=year * 0.25;
					System.out.println("Tax applicable is :"+tax);
				}else 
				{
					tax=year * 0.30;
					System.out.println("Tax applicable is :"+tax);
				}	
				return tax;
		       }
		       public double monthly_tax()
		       {
		    	  month_t=tax/12;
		    	  System.out.println("Monthly tax is :"+month_t);
		    	  return month_t;
		       }
		       public double salary_month() {
		    	    salary=month-month_t;
		    	   System.out.println("Monthly Hands in Salary:"+salary);
		    	   return salary;
		       }
		       
					
					public static void main(String[] args) {
					System.out.println("****************First Employee Salary details*************");
					SimpleHello emp1=new SimpleHello(7000,5000,2000);
					emp1.monthly_sal();
					emp1.pf();
					emp1.monthly_taxable();
					emp1.yearly_taxable();
					emp1.tax_year();
					emp1.monthly_tax();
					emp1.salary_month();
					System.out.println();
					System.out.println("****************Second Employee Salary details*************");
					SimpleHello emp2=new SimpleHello(10000,7000,2500);
					emp2.monthly_sal();
					emp2.pf();
					emp2.monthly_taxable();
					emp2.yearly_taxable();
					emp2.tax_year();
					emp2.monthly_tax();
					emp2.salary_month();
					
					System.out.println();
					System.out.println("****************Third Employee Salary details*************");
					SimpleHello emp3 = new SimpleHello(12000,9000,3000);
					emp3.monthly_sal();
					emp3.pf();
					emp3.monthly_taxable();
					emp3.yearly_taxable();
					emp3.tax_year();
					emp3.monthly_tax();
					emp3.salary_month();
					
					System.out.println();
					System.out.println("****************Forth Employee Salary details*************");
					SimpleHello emp4 = new SimpleHello(15000,10000,3500);
					
					emp4.monthly_sal();
					emp4.pf();
					emp4.monthly_taxable();
					emp4.yearly_taxable();
					emp4.tax_year();
					emp4.monthly_tax();
					emp4.salary_month();
					
					
					
					
				
		       }
		}





