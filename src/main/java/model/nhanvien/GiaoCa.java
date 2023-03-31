/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.nhanvien;

import comon.constant.ModelProperties;
import comon.constant.nhanvien.TrangThaiGiaoCa;
import comon.model.PrimaryModel;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "GiaoCa")
@Entity
public class GiaoCa extends PrimaryModel implements Serializable {

    @Column
    private String maGC;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "nhan_vien_id", referencedColumnName = "id")
    private NhanVien nhanVien;

    @Column
    private String idNhanVienTrongCa;

    @Column
    private String idNhanVienCaTiepTheo;

    @Column
    private Long thoiGianNhanCa;

    @Column
    private Long thoiGianGiaoCa;

    @Column
    private float tienBanDau;

    @Column
    private float tongTienTrongCa;

    @Column
    private float tongTienMat;

    @Column
    private float tongTienKhac;

    @Column
    private float tienPhatSinh;

    @Column(length = ModelProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String ghiChuPhatSinh;

    @Column
    private float tongTienMatCaTruoc;

    @Column
    private float tongTienMatRut;

    @Column
    @Nationalized
    private TrangThaiGiaoCa trangThaiGiaoCa;

    @Column(length = ModelProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String chuThich;
}
