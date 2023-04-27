package com.orcrist.account.dto.converter;

import com.orcrist.account.dto.TransactionDto;
import com.orcrist.account.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {

    public TransactionDto convert(Transaction from){
        return new TransactionDto(from.getId(),
                from.getTransactionType(),
                from.getAmount(),
                from.getTransactionDate());
    }
}
