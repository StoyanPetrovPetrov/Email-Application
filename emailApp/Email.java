package emailApp;

import java.util.Scanner;

public class Email {
    private String companySuffix = "company.com";
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaltPasswordLenght = 10;
    private String alternateEmail;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department :" + this.department);
        this.password = randomPassword(defaltPasswordLenght);
        System.out.println("Your password is :" + this.password);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
        System.out.println("Your email is :" + email);
    }

    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for developmenr\n3 for Accounting\n0 for none\nEnter the department code :");
        Scanner in = new Scanner(System.in);
        int depChois = in.nextInt();
        if (depChois == 1) {
            return "sales";
        } else if (depChois == 2) {
            return "dev";
        } else if (depChois == 3) {
            return "acct";
        } else {
            return "";
        }

    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
    }
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME :" + firstName + " " + lastName +
                "\nCOMPANY EMAIL :" + email +
                "\nMAILBOX CAPACITY : " + mailBoxCapacity + "mb";
    }


}

