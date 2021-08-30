package com.sms.client;

import java.util.Scanner;

import com.sms.beans.Student;
import com.sms.beans.Teacher;
import com.sms.services.SchoolServiceImpl;
import com.sms.services.SchoolServiceInt;

public class SmsClient {
	public static void main(String[] args) {
		SchoolServiceInt schoolService = new SchoolServiceImpl();

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("\n==========================");
			System.out.println("School Management System");
			System.out.println("==========================");
			System.out.println("1. Register Student ");
			System.out.println("2. Display All Student ");
			System.out.println("3. Display Student By ID ");
			System.out.println("---------------------------");
			System.out.println("4. Register Teacher ");
			System.out.println("5. Display All Teacher ");
			System.out.println("6. Display Teacher By ID ");
			System.out.println("---------------------------");
			System.out.println("7. Total Revenue ");
			System.out.println("8. Total Expences ");
			System.out.println("---------------------------");
			System.out.println("9. Exit ");
			System.out.println("---------------------------\n");

			System.out.print("Enter your Choice :: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Student student = new Student();

				System.out.print("Enter ID = ");
				student.setId(sc.nextInt());

				System.out.print("Enter Name = ");
				student.setName(sc.next());

				System.out.print("Enter Grade = ");
				student.setGrade(sc.next());

				System.out.print("Enter feesPaid = ");
				student.setFeesPaid(sc.nextDouble());

				System.out.print("Enter totalFees = ");
				student.setTotalFees(sc.nextDouble());

				schoolService.addStudent(student);
				break;

			case 2:
				schoolService.displayAllStudent();
				break;

			case 3:
				System.out.print("Enter Student ID = ");
				int id = sc.nextInt();
				schoolService.displayStudentByID(id);
				break;

			case 4:
				Teacher teacher = new Teacher();

				System.out.print("Enter ID = ");
				teacher.setId(sc.nextInt());
				;

				System.out.print("Enter Name = ");
				teacher.setName(sc.next());

				System.out.print("Enter Salary = ");
				teacher.setSalary(sc.nextDouble());

				schoolService.addTeacher(teacher);
				break;

			case 5:
				schoolService.displayAllTeacher();
				break;

			case 6:
				System.out.print("Enter Teacher ID = ");
				int tID = sc.nextInt();
				schoolService.displayTeacherByID(tID);
				break;
			case 7:
				double revenue = schoolService.calculateRevenue();
				System.out.println("School Revenue = "+revenue);
				break;
				
			case 8:
				double expenses = schoolService.calculateExpenses();
				 System.out.println("School expenses = "+expenses);
				 break;
				
			case 9:
				System.out.println("Exit");
				System.exit(0);
			default:
				System.out.println("Wrong Choice.\n Enter 1 or 2 or 3 .....");

			}

		} while (true);

		
	}

}
