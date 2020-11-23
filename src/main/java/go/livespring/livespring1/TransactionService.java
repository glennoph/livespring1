package go.livespring.livespring1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber() {
        List<Transaction> transactionList = new ArrayList<Transaction>();
        transactionList.add(new Transaction(1001, 5, 2,
                "merch-a", 9991));
        transactionList.add(new Transaction(1002, 10, 3,
                "merch-b", 9992));
        return transactionList;
    }

}
