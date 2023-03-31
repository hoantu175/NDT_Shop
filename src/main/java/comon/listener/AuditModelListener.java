/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comon.listener;

import comon.model.AuditModel;
import java.util.Calendar;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 *
 * @author nguyenth28
 */
public class AuditModelListener {


    @PrePersist
    private void onCreate(AuditModel entity) {
        entity.setCreatedAt(getCurrentTime());
        entity.setUpdatedAt(getCurrentTime());
    }

    @PreUpdate
    private void onUpdate(AuditModel entity) {
        entity.setUpdatedAt(getCurrentTime());
    }

    private long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }
}
