public class Access_Modifiers {
    public static void main(String[] args){
    BankAccount BA = new BankAccount();
    BA.username = "JohnDoe";
//todo: BA.password = "Password123"; // Error: password has private access in BankAccount class
    BA.accountNumber = "1234567890"; // Error: accountNumber has protected access in BankAccount class


    BA.setPassword("NewPassword123"); // This will work because setPassword is public
    System.out.println("Username: " + BA.username);
//todo: System.out.println("Password: " + BA.password); // Error: password has private access in BankAccount class
//todo: System.out.println("Account Number: " + BA.accountNumber); // Error: accountNumber has protected access in BankAccount class

    }
}

class BankAccount{
    public String username ;
    private String password ;
    protected String accountNumber ;

    public void setPassword(String newPassword){
        password = newPassword;
        System.out.println("Password set to: " + password);
    }

}


// ! Access modifiers are used to restrict access to the class members.

/* 
Modifier	Same Class	Same Package	Subclass (Different Package)	Everywhere
public	    ✅	        ✅	            ✅	                            ✅
protected   ✅	        ✅	            ✅	                            ❌
default	    ✅	        ✅	            ❌	                            ❌
private	    ✅	        ❌	            ❌	                            ❌
 */