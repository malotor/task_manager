package com.malotor.taskmanager.Domain;

import javax.persistence.Embeddable;

@Embeddable
public class UserId extends Identity {

    public UserId(String value) {
        super(value);
    }

}
