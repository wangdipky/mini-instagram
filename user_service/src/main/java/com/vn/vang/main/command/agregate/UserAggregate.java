package com.vn.vang.main.command.agregate;

import com.vn.vang.main.command.command.CreateUserCommand;
import com.vn.vang.main.command.command.DeleteUserCommand;
import com.vn.vang.main.command.command.UpdateUserCommand;
import com.vn.vang.main.command.event.UserCreatedEvent;
import com.vn.vang.main.command.event.UserDeletedEvent;
import com.vn.vang.main.command.event.UserUpdatedEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserAggregate
 */
@Aggregate
@Getter
@Setter
public class UserAggregate {

    @AggregateIdentifier
    private String aggId;

    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private Integer isActive;

    private String roles;

    private Integer isVerify;

    private Date createdDate;

    private Date updatedDate;

    private Date deletedDate;

    public UserAggregate() {}

    @CommandHandler
    public UserAggregate(CreateUserCommand command) {
        UserCreatedEvent event = new UserCreatedEvent();
        BeanUtils.copyProperties(command, event);
        AggregateLifecycle.apply(event);
    }

    @CommandHandler
    public UserAggregate(UpdateUserCommand command) {
        UserCreatedEvent event = new UserCreatedEvent();
        BeanUtils.copyProperties(command, event);
        AggregateLifecycle.apply(event);
    }

    @CommandHandler
    public UserAggregate(DeleteUserCommand command) {
        UserDeletedEvent event = new UserDeletedEvent();
        BeanUtils.copyProperties(command, event);
        AggregateLifecycle.apply(event);
    }

    @EventSourcingHandler
    public void handle(UserCreatedEvent event) {

        this.aggId = event.getAggId();
        this.userId = event.getUserId();
        this.firstName = event.getFirstName();
        this.lastName = event.getLastName();
        this.email = event.getEmail();
        this.phone = event.getPhone();
        this.isActive = event.getIsActive();
        this.roles = event.getRoles();
        this.isVerify = event.getIsVerify();
        this.createdDate = event.getCreatedDate();
        this.updatedDate = event.getUpdatedDate();
        this.deletedDate = event.getDeletedDate();
    }

    @EventSourcingHandler
    public void handle(UserUpdatedEvent event) {

        this.aggId = event.getAggId();
        this.userId = event.getUserId();
        this.firstName = event.getFirstName();
        this.lastName = event.getLastName();
        this.email = event.getEmail();
        this.phone = event.getPhone();
        this.isActive = event.getIsActive();
        this.roles = event.getRoles();
        this.isVerify = event.getIsVerify();
        this.createdDate = event.getCreatedDate();
        this.updatedDate = event.getUpdatedDate();
        this.deletedDate = event.getDeletedDate();
    }

    @EventSourcingHandler
    public void handle(UserDeletedEvent event) {

        this.aggId = event.getAggId();
        this.userId = event.getUserId();
    }

}