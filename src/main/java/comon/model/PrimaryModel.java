/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comon.model;

import comon.constant.ModelProperties;
import comon.listener.CreatePrimaryModelListener;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
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
@EntityListeners(CreatePrimaryModelListener.class)
public abstract class PrimaryModel extends AuditModel implements IsIdentified{

    @Id
    @Column(length = ModelProperties.LENGTH_ID)
    private String id;

}
