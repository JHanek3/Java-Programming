
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void withdraw_returnsTrue_ifEnoughFunds() {
        BankAccount account = new BankAccount(500);
        assertTrue(account.withdraw(400));
    }
    @Test
    public void withdraw_returnsFalse_ifNotEnoughFunds() {
        BankAccount account = new BankAccount(500);
        assertFalse(account.withdraw(600));
    }
}
