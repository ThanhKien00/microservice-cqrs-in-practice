package com.techbank.common.event;

import com.techbank.common.dto.AccountType;
import com.techbank.cqrs.event.BaseEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class AccountOpenedEvent extends BaseEvent {

    private String accountHolder;

    private AccountType type;

    private Date createdDate;

    private double openingBalance;

}
