/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.khachhang;

import comon.constant.ModelProperties;
import comon.model.PrimaryModel;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author nguyenth28
 */

@Getter
@Setter
@Table(name = "LoaiThe")
@Entity
public class LoaiThe extends PrimaryModel implements Serializable {
    
    
    @Column(length = ModelProperties.LENGTH_NAME)
    @Nationalized
    private String ten;
    
    
    @Column(length = ModelProperties.LENGTH_NAME_SHORT)
    @Nationalized
    private int giaTri;
    
    @Column
    private int soLuong;
}
