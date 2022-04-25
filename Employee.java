import java.util.Arrays;
import java.util.Scanner;
class Employee
{
int eNo,eSalary;
String eName;
public Employee(int no,int sal,String name)
{
eNo=no;
eSalary=sal;
eNmae=nmae;
}
public void showData()
{
System.out.print("Emp_id="+eNo+" "+"Name="+eName+" "+"Salary="+eSalary);
System.out.println();
}
}
public class EmpArrObjects
{
public static void main(String[] args){
System.out.println("Enter the number of employees:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter the number of Employee details one by one:_");
//create array of Employee objects to hold n objects.
Employee employees[]=new employee[n];

Scanner sc_emp=new Scanner(System.in);
int eid,esal;
Stringe enam;

for(int i=0;i<n;i++){
System.out.println("enter"+i+" employee details:");
System.out.println("enter employee id(integer):"); 
eid=sc_emp.nextInt();
System.out.print("enter employee name(String):");
String nam=sc_emp.next();
enam=new String(nam);
System.out.println("enter employee salary(integer):");
esal=sc_emp.nextInt();
Employee emp=new Employee(eid,esal,enam);
employees[i]=emp;
}
System.out.println("Employees are:\n");
for(Employee y:employees)
y.showData();
System.out.println("enter employee number to search:");
int semp=sc.nextInt();
boolean found=false;
for(Employee e:employee)
{
if(semp=e.eNo)
{
found=true;
System.out.println("Employee found");
e.showData();
break;
}
}
if(!found)
{
System.out.println("Employee not found");
}
}
}
