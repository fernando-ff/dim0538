package ufrn.imd.domain;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Integer id;
    private String number;
    private Double balance;


}
