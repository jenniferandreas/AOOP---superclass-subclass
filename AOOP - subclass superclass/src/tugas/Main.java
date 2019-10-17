package tugas;

import java.util.Scanner;

public class Main {
	public Main()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Id: ");
		String id = scan.nextLine();
		System.out.println("Input Name: ");
		String name = scan.nextLine();
		System.out.println("Input Address: ");
		String address = scan.nextLine();
		System.out.println("Input ClassCode: ");
		String classCode = scan.nextLine();
		System.out.println("Input Faculty: ");
		String faculty = scan.nextLine();
		
		Mahasiswa mahasiswa = new Mahasiswa(id,name,address,classCode,faculty);
		System.out.println(mahasiswa.getId());
		System.out.println(mahasiswa.getName());
		System.out.println(mahasiswa.getAddress());
		System.out.println(mahasiswa.getClassCode());
		System.out.println(mahasiswa.getFaculty());
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
