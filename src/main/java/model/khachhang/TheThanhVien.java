/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.khachhang;

import comon.constant.khachhang.TrangThaiTheThanhVien;
import comon.model.PrimaryModel;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author nguyenth28
 */
@Getter
@Setter
@Table(name = "TheThanhVien")
@Entity
public class TheThanhVien extends PrimaryModel implements Serializable {
    
    @Column
    private String maTTV;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "vi_diem_id", referencedColumnName = "id")
    private ViDiem viDiem;


    @ManyToOne
    @JoinColumn(name = "loai_the_id", referencedColumnName = "id")
    private LoaiThe loaiThe;

    @Column
    private Long ngayPhatHanh;

    @Column
    private Long ngayHetHan;
    
    @Column
    private TrangThaiTheThanhVien trangThaiTheThanhVien;
}
