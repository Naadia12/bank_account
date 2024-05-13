public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

//      Constructor
    public BankAccount(String firstNameData, String lastNameData, String dateOfBirthData, int accountNumberData)

    {
        this.firstName = firstNameData;
        this.lastName = lastNameData;
        this.dateOfBirth = dateOfBirthData;
        this.accountNumber = accountNumberData;
        this.balance = 0;

    }
//      Getters and Setters

    public String getFirstName() {
        return this.firstName;
    }

        public void setFirstName (String firstName){
            this.firstName = firstName;

        }
        public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
}
