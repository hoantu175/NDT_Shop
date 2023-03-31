/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.sanpham;

import comon.constant.ModelProperties;
import comon.constant.sanpham.LoaiSanPham;
import comon.constant.sanpham.TrangThaiSanPham;
import comon.model.PrimaryModel;
import java.io.Serializable;
import java.util.Set;
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
@Entity
@Table(name = "SanPham")
public class SanPham extends PrimaryModel implements Serializable {

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "xuat_xu_id")
    private XuatXu xuatXu;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "chat_lieu_id")
    private ChatLieu chatLieu;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "mau_sac_id")
    private MauSac mauSac;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "thuong_hieu_id")
    private ThuongHieu thuongHieu;

    @Column(length = ModelProperties.LENGTH_CODE)
    private String maSP;

    @Column(length = ModelProperties.LENGTH_NAME)
    @Nationalized
    private String tenSP;

    @Column
    private float giaNhap;

    @Column
    private float giaBan;

    @Column
    private int soLuongTon;

    @Column(length = ModelProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String moTa;

    @Column
    @Nationalized
    private LoaiSanPham loaiSp;

    @Column
    @Nationalized
    private TrangThaiSanPham trangThaiSanPham;

}
