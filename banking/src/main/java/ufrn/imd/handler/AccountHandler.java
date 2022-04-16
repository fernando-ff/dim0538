package ufrn.imd.handler;

import reactor.core.publisher.Mono;
import ufrn.imd.domain.Account;

public class AccountHandler {

    public void transfer(Double value, Mono<Account> inputAccount, Mono<Account> outputAccount) {
        outputAccount.subscribe(c -> {
           if(c.getBalance() < value)
               throw new RuntimeException("Insuficient balance!");
           c.setBalance(c.getBalance() - value);
        });
        inputAccount.subscribe(ac -> {
            Double actual = ac.getBalance();
            ac.setBalance(actual + value);
        });
    }
    public void withdraw(Double value, Mono<Account> account) {
        account.subscribe(c -> {
            if(c.getBalance() < value) {
                throw new RuntimeException("There isn't sufficient money!");
            }
            c.setBalance(c.getBalance() - value);
        });
    }

    public void deposit(Double value, Mono<Account> inputAccount){
        inputAccount.subscribe(c -> {
            c.setBalance(c.getBalance() + value);
        });
    }

}
