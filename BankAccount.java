public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

//      Constructor
    public BankAccount(String firstNameData, String lastNameData, String dateOfBirthData, int accountNumberData){
        this.firstName = firstNameData;
        this.lastName = lastNameData;
        this.dateOfBirth = dateOfBirthData;
        this.accountNumber = accountNumberData;
        this.balance = 0;
    }

    public String getFirstName(){
        return this.firstName;
    }
}
