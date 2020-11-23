package go.livespring.livespring1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    TransactionService transactionService;

    @BeforeEach
    void setUp() {
        System.out.println("TransactionServiceTest");
        transactionService = new TransactionService();
    }

    @Test
    void findAllByAccountNumber() {
        List<Transaction> transactionList = transactionService.findAllByAccountNumber();
        assertNotNull(transactionList);
        assertEquals(2,transactionList.size());
    }
}