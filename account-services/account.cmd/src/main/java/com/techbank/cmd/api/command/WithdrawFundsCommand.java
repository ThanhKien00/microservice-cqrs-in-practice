package com.techbank.cmd.api.command;

import com.techbank.cqrs.command.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class WithdrawFundsCommand extends BaseCommand {

    private double amount;

}
