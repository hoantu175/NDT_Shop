/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comon.listener;

import comon.model.PrimaryModel;
import java.util.UUID;
import javax.persistence.PrePersist;

/**
 *
 * @author nguyenth28
 */
public class CreatePrimaryModelListener {

    @PrePersist
    private void onCreate(PrimaryModel entity) {
        entity.setId(UUID.randomUUID().toString());
    }

}
