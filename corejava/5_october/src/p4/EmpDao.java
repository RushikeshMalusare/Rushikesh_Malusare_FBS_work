package p4;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import p1.Emp;
import p2.HR;
import p2.Admin;
import p2.SaleManager;
public class EmpDao {
	static ArrayList <Emp> employees = new ArrayList<Emp>();
	
	
	static {
		readEmpFormFile();
		if(employees.isEmpty()) {
		employees.add(new HR(101,"sanjeev",50000,3200));
	    employees.add(new HR(102, "raju", 48000, 4500));
	    employees.add(new HR(103, "priyanka", 47000, 4000));
	   employees.add( new SaleManager(201, "Karan", 60000, 12, 8000));
	    employees.add( new SaleManager(202, "Meena", 58000, 15, 7500));
	    employees.add( new SaleManager(203, "Rohit", 62000, 10, 9000));
	   employees.add(new Admin( 301, "Pragati", 70000, 10000));
	   employees.add( new Admin(302, "Isha", 68000, 9500));
	   employees.add( new Admin(303, "Pooja", 72000, 11000)); 
	    employees.add( new Admin(304, "Shubham", 75000, 12000));
		}
	}
	public static void writeEmpFile() {
		try {
			FileOutputStream fos=new FileOutputStream("C://Users//Global//Downloads//demo1//de.txt");
			try {
				ObjectOutputStream oos= new ObjectOutputStream(fos);
				oos.writeObject(employees);
				oos.close();
				fos.close();
				System.out.println("Emp Save Successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private static void readEmpFormFile() {
		
		try {
			FileInputStream fis=new FileInputStream("C://Users//Global//Downloads//demo1//de.txt");
			try {
				ObjectInputStream ois =new ObjectInputStream(fis);
				try {
					employees=(ArrayList<Emp>)ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("class Not Found ");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File Not Found ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class Not Found ");
		}
		
	}

	public void addEmployee(Emp e) {
       employees.add(e);
       writeEmpFile();    
           
        } 
	
    public Emp searchEmployeeById(int id) {
        for (int i = 0; i <employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }
        return null;
    }

  
    public boolean updateEmployee(int id, double newSalary) {
        Emp emp = searchEmployeeById(id);
        if (emp != null) {
            emp.setSal(newSalary);
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
    	Emp emp = searchEmployeeById(id);
            if (emp != null) {
               employees.remove(emp);
               
                employees = null;
                return true;
            
        }
        return false;
    }
 
    public void displayAll() {
        for(int i=0;i<employees.size();i++) {
        	employees.get(i).displayAll();
        }
   }

   public ArrayList<Emp>getAllEmp(){
	   return employees;
   }
   public void displayType(int type) {
	   
	   boolean found=false;
	   for(Emp e:employees) {
		   switch(type) {
		   case 1://admin
			   if(e instanceof Admin)
			   {
				   e.displayAll();
				   found=true;
			   }
			   break;
		   case 2://HR
			   if(e instanceof HR)
			   {
				   e.displayAll();
				   found=true;
			   }
			   break;
		   case 3://salemanager
			   if(e instanceof SaleManager)
			   {
				   e.displayAll();
				   found=true;
			   }
			   break;
			   default:
			   	System.out.println("Invalid Type");
			   return;
		   }
	   }
	   if(!found) 
		   System.out.println("Emp Not Found");
   } 
	   public void sortSal(boolean  ascending)
	   {
		   ArrayList<Emp>sortedList=new ArrayList<Emp>(employees);
		   for(int i=0;i<sortedList.size()-1;i++)
		   {
			   for(int j=0;j<sortedList.size()-1;i++)
			   {
				   double s1=sortedList.get(j).Calsal();
				   double s2=sortedList.get(j+1).Calsal();
				   if(( ascending && s1>s2)||(! ascending && s1<s2))
				   {
					   Emp temp=sortedList.get(j);
					   sortedList.set(j+1,temp);
				   }
			   }
		   }
		   System.out.println("\n Employee Sorted by Salary("+( ascending?"Asending":"Descending")+")");
		   for(Emp e:sortedList)
		   {
			   e.displayAll();
		   }
		   
	   }
	   
	   public void displaytopSal(int topCount)
	   {
		   ArrayList<Emp>sortedList=new ArrayList<>(employees);
		   for(int i=0;i<sortedList.size()-1;i++)
		   {
			   for(int j=0;i<sortedList.size()-1;i++)
			   {
				   if(sortedList.get(j).Calsal()<sortedList.get(j+1).Calsal())
					{
					   	Emp temp=sortedList.get(j);
					   	sortedList.set(j,sortedList.get(j+1));
					   	sortedList.set(j+1, temp);
					}
			   }
		   }
		   System.out.println("\n Top Salary"+topCount+"high paid Employees");
		   for(int i=0;i<topCount && i<sortedList.size();i++)
		   {
			   sortedList.get(i).displayAll();
		   }
	   }
	   
   }
   

	