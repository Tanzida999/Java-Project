import java.util.Scanner;

/**
 * Created by User on 1/18/2023.
 */
public class Email {
    public String email;
    public String firstname;
    public  String lastname;
    public String password;
    public String department;
    public String companysuffix = "aeycompany.com";
    public int defaultPasswordlength = 10;
    public int mailboxCapacity;
    public  String alternateEmail;

    //Constructor to recieve the first name and last name
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
       // System.out.println("Email Created: " + this.firstname + " " + this.lastname);
        // Call a depatment asking for thr department -  return the department
        this.department = setDepartment();
        //System.out.println("Department:" +this.department);
        // A method that returns a random password
        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your password is: " +this.password);
        //Combine elements to generate email
         email = firstname.toLowerCase() + "." +lastname.toLowerCase() + "@"+department+"."+companysuffix;
        //System.out.println("Your email is:" +email);

    }
    // Ask for department
    private String setDepartment(){
        System.out.println("New Worker: " + firstname + " .Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department");
        Scanner in = new Scanner(System.in);
        int deptchoice = in.nextInt();
        if (deptchoice == 1){return "sales";}
        else if (deptchoice ==2){return "dev";}
        else if(deptchoice == 3){return "Acct";}
        else { return "Others";}
    }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*";
        char[] password = new char[length];
        for (int i=0;i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return  new String(password);

    }
    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the altername mail
    public void setAlternateEmail(String altemail){
        this.alternateEmail = altemail;
    }
    //Change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity(){ return mailboxCapacity;}

    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: "  + firstname  +  " "+ lastname +
                " \nCOMPANY NAME: " + department +
                " \nCOMAPNY EMAIL: " + email +
                " \nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

     }
}