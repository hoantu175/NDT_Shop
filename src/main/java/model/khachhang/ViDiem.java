/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.khachhang;

import comon.constant.khachhang.TrangThaiViDiem;
import comon.model.PrimaryModel;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author nguyenth28
 */
@Getter
@Setter
@Table(name = "ViDiem")
@Entity
public class ViDiem extends PrimaryModel implements Serializable {

    @Column
    private int diemDaCong;

    @Column
    private int diemDaDung;

    @Column
    private int tongDiem;
    
    @Column
    private TrangThaiViDiem trangThaiViDiem;

}
