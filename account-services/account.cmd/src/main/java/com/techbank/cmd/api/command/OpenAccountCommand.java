package com.techbank.cmd.api.command;


import com.techbank.common.dto.AccountType;
import com.techbank.cqrs.command.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OpenAccountCommand extends BaseCommand {

    private String accountHolder;

    private AccountType type;

    private double openingBalance;

}
