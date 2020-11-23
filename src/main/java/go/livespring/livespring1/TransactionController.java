package go.livespring.livespring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    private TransactionService transactionService;

    @GetMapping(path = "/transactions")
    public List<Transaction> getTransactions(@RequestParam(value = "accountNumber")
                                                     int accountNumber) {

        return new TransactionService().findAllByAccountNumber();
    }


}
