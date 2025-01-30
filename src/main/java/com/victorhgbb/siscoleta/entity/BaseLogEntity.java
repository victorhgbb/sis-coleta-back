package com.victorhgbb.siscoleta.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Calendar;

@Getter
@Setter
@MappedSuperclass
public class BaseLogEntity {

    @Column(insertable = true, updatable = false, unique = false, name = "DATE_CREATE", nullable = false, columnDefinition = "timestamp")
    private Timestamp dateCreate;

    @Column(insertable = true, updatable = false, unique = false, name = "CREATE_USER", length = 20, nullable = false)
    private String createUser;

    @Version
    @Column(insertable = true, updatable = true, unique = false, name = "DATE_UPDATE", columnDefinition = "timestamp")
    private Timestamp dateUpdate;

    @Column(insertable = true, updatable = true, unique = false, name = "UPDATE_USER", length = 20)
    private String updateUser;

    @PrePersist
    protected void prePersist() {
//        this.setDateCreate(new Timestamp(new Date().getTime()));
//        this.setCreateUser(this.getCreateUser());
    }

    @PreUpdate
    protected void preUpdate() {
        Timestamp ts = new Timestamp(Calendar.getInstance().getTime().getTime());
//        this.setDateUpdate(ts);
//        this.setUpdateUser(getUpdateUser());
    }
}
