package go.livespring.livespring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    private TransactionService transactionService;

    @GetMapping(path = "/transactions/{accountNumber}")
    public List<Transaction> getTransactions(@PathVariable("accountNumber") String accountNumber) {
        return new TransactionService().findAllByAccountNumber(accountNumber);
    }


}
