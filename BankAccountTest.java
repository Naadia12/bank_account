import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount batmansAccount;


    @BeforeEach
    public void setup (){
        batmansAccount = new BankAccount("James","Smith", "1.12.1999", 1233 );
    }

    @Test
    public void canGetFirstName(){
      assertThat(batmansAccount.getFirstName()).isEqualTo("James");

    }

}
