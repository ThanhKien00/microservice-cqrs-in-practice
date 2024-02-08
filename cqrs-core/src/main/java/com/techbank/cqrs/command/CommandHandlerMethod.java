package com.techbank.cqrs.command;


@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {

    void handle(BaseCommand command);


}
