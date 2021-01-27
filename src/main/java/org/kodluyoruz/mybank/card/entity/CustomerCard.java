package org.kodluyoruz.mybank.card.entity;

import lombok.*;
import org.kodluyoruz.mybank.card.enums.CardType;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customerCard", uniqueConstraints = @UniqueConstraint(columnNames = {"card_number", "varchar"}))
@Entity
public class CustomerCard {

    @Id
    @GeneratedValue
    private Long cardId;

    private String cardOwnerName;

    private String cardOwnerLastName;

    @Column(name = "card_number")
    private String cardNumber;

    private String cardLastMonth;

    private String cardLastYear;

    private String cardCvv;

    private BigDecimal cardBalance;

    @Enumerated(EnumType.STRING)
    private CardType cardType;

    /*
        TODO :  account(one) card(many) bir hesabın hem kredi kartı hemde ön ödemeli kartı olabilir
     */
}
