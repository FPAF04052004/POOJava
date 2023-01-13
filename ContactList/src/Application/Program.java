package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contact;
import Entities.EmployeeContact;
import Entities.OutsourcedEmployeeContact;
import Entities.PersonalContact;
import Entities.Relationship;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ArrayList<Contact> list = new ArrayList<Contact>();
		
		System.out.println("Deseja adicionar uma nova pessoa?");
		char novo = sc.next().charAt(0);
		
		while(novo == 'y') {
			
			System.out.println("Qual tipo de contato desejar adicionar?");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Qual o nome do contato?");
			String name = sc.nextLine();
			System.out.println("Qual o numero do contato?");
			String number = sc.nextLine();
			System.out.println("Qual a informação complementar?");
			String information = sc.nextLine();
			
			if(type == 'P' || type == 'p') {
				
				System.out.println("Deseja informar sua relação?");
				char relation = sc.next().charAt(0);
				
				if(relation == 'y') {
					System.out.println("Qual a sua relação com o contato?");
					Relationship relationship = Relationship.valueOf(sc.next());
					
					list.add(new PersonalContact(name, number, information, relationship));
				}else {
					list.add(new PersonalContact(name, number, information));
				}
				
			}else {
				
				System.out.println("Qual o valor que ele ganha por hora?");
				Double valuePerHour = sc.nextDouble();
				System.out.println("Quantas horas ele trabalhou?");
				Double hours = sc.nextDouble();
				
				System.out.println("É terceirizado?");
				char terceirizado = sc.next().charAt(0);
				
				if(terceirizado == 'y') {
					Double comission = sc.nextDouble();
					list.add(new OutsourcedEmployeeContact(name, number, information, valuePerHour, hours, comission));
				}else {
					list.add(new EmployeeContact(name, number, information, valuePerHour, hours));
				}
			
			}
			
			System.out.println("Deseja adicionar outro contato?");
			novo = sc.next().charAt(0);
		}
		
		System.out.println("Lista de contatos");
		for(Contact contact: list) {
			System.out.println(contact.Description());
		}
		
		System.out.println("Deseja buscar um contato?");
		novo = sc.next().charAt(0);
		
		while(novo == 'y') {
			sc.nextLine();
			String busca = sc.nextLine();
			for(Contact contact: list) {
				if(String.join(busca, contact.getName()) != null) {
					System.out.println(contact.Description());
				}
			}
			
			System.out.println("Deseja buscar outro contato?");
			novo = sc.next().charAt(0);
		}
		
		System.out.println("Deseja excluir alguem contato?");
		novo = sc.next().charAt(0);
		
		sc.close();
	}
}

