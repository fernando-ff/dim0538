package ufrn.imd;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ufrn.imd.domain.Account;
import ufrn.imd.handler.AccountHandler;

public class Main {
    public static void main(String[] args) {
        AccountHandler ah = new AccountHandler();

        Mono<Account> ac =
                Mono.just(new Account(1, "200", 100.000));
        Mono<Account> ac1 =
                Mono.just(new Account(2, "200", 100.000));

        ah.transfer(80.00, ac, ac1);
    }
}
