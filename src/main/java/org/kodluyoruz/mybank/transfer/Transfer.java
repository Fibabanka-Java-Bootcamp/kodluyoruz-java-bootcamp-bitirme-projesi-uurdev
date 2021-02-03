package org.kodluyoruz.mybank.transfer;

import lombok.*;
import org.kodluyoruz.mybank.account.enums.BankAccountMoneyType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "transfer")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long receipt;

    private String sentUserName;

    private String sentUserLastName;

    private Long sentUserAccountId;

    @Enumerated(value = EnumType.STRING)
    private BankAccountMoneyType bankAccountMoneyType;

    private Date transferTime;

    private String sentIban;

    private BigDecimal sentAmount;

    private String recipientName;

    private String recipientLastName;

    private Long recipientId;

    private String recipientIban;

    private BigDecimal amountReceived;


}
