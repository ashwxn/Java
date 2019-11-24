import java.util.ArrayList;


public class Contacts {
    private ArrayList<String> contacts  = new ArrayList<String>();
    private ArrayList<String> contactPhnNo = new ArrayList<String>();

    public void storeContact(String name, String phnNo){
        contacts.add(name);
        contactPhnNo.add(phnNo);
    }
    public void printContact(){
        System.out.println("You have "+contacts.size()+" contacts in your Mobile phone : ");
        for(int i=0;i<contacts.size();i++){
            System.out.println((i+1)+"  "+contacts.get(i)+ "  -  "+contactPhnNo.get(i));
        }
    }
    public void modifyContact(int position,String name){
        contacts.set(position,name);
        System.out.println("ArrayList at "+(position+1)+" has been modified as "+name);
    }
    public String findContact(String searchContact){
        int position = contacts.indexOf(searchContact);
        if(position >= 0){
            return contacts.get(position);
        }
        return null;
    }
    public void removeContact(int position){
        String theContact  = contacts.get(position);
        String theNumber = contactPhnNo.get(position);
        contacts.remove(position);
        contactPhnNo.remove(position);
    }
}



//MAIN PROGRAM

import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice :  ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContact();
                    break;
                case 2:
                    storeContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    findContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contacts in the Mobile");
        System.out.println("\t 2 - To add a contact to the Mobile");
        System.out.println("\t 3 - To modify a contact in the Mobile");
        System.out.println("\t 4 - To search for a contact from the Mobile");
        System.out.println("\t 5 - To remove a contact in the Mobile");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void storeContact(){
        System.out.print("Please Enter the Contact Name and Phone Number : ");
        contacts.storeContact(scanner.nextLine(),scanner.nextLine());
    }

    public static void modifyContact(){
        System.out.println("Enter item number : ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Contact Name to be replaced : ");
        String newName = scanner.nextLine();
        contacts.modifyContact(itemNo,newName);
    }

    public static void removeContact(){
        System.out.println("Enter the item number to be deleted from the Contact List : ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        contacts.removeContact(itemNo);
        System.out.println("Contact successfully removed !! ");
    }

    public static void findContact(){
        System.out.println("Contact to search for : ");
        String searchContact = scanner.nextLine();
        if(contacts.findContact(searchContact)!= null ){
            System.out.println("Found  "+searchContact+" in the Contact List");
        }else{
            System.out.println(searchContact+" not found in the Contact List");
        }
    }
}
