/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.khachhang;

import comon.constant.ModelProperties;
import comon.constant.khachhang.TrangThaiKhachHang;
import comon.model.PrimaryModel;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author nguyenth28
 */
@Getter
@Setter
@Table(name = "KhachHang")
@Entity
public class KhachHang extends PrimaryModel implements Serializable {

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "the_thanh_vien_id", referencedColumnName = "id")
    private TheThanhVien theThanhVien;

    @Column
    private String maKH;

    @Column(length = ModelProperties.LENGTH_NAME)
    @Nationalized
    private String ten;

    @Column
    private long ngaySinh;

    @Column
    @Nationalized
    private String gioiTinh;

    @Column(length = ModelProperties.LENGTH_PHONE)
    private String sdt;

    @Column(length = ModelProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String diaChi;

    @Column(length = ModelProperties.LENGTH_EMAIL)
    private String email;
    
    @Column
    private int soLanMua;

    @Column
    private TrangThaiKhachHang trangThaiKhachHang;

    @Column(length = ModelProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String ghiChu;
}
