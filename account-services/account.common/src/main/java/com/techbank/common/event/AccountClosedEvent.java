package com.techbank.common.event;

import com.techbank.cqrs.event.BaseEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class AccountClosedEvent extends BaseEvent {

    public AccountClosedEvent(Integer id){
        super(id);
    }

}
