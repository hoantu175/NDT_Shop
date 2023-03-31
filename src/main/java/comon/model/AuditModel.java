/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comon.model;

import comon.listener.AuditModelListener;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author nguyenth28
 */

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditModelListener.class)
public abstract class AuditModel {

    @Column(updatable = false)
    private Long createdAt;

    @Column
    private Long updatedAt;

}
