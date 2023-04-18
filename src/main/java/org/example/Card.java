package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope("prototype")
public class Card {
    private BankAccount bankAccount;
    private String cardNumber;
    private String cardStatus;
    private Double balance;
}
