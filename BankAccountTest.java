import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount batmansAccount;

    @BeforeEach
    public void setup (){
        batmansAccount = new BankAccount("James","Smith", "1.12.1999", 1233 );
    }
//   Getters and setters
    @Test
    public void canGetFirstName(){
      assertThat(batmansAccount.getFirstName()).isEqualTo("James");

        }

    @Test
    public void hasLastName() {
        assertThat(batmansAccount.getLastName()).isEqualTo("James");

    }
        @Test
        public void hasDateOfBirth(){
            assertThat(batmansAccount.getDateOfBirth()).isEqualTo("1922-11-08");
        }
    @Test
    public void hasAccountNumber(){
        assertThat(batmansAccount.getAccountNumber()).isEqualTo(1234);
    }