/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hoadon;

import comon.constant.TinhTrangHoaDon;
import model.sanpham.SanPham;
import comon.model.PrimaryModel;
import java.io.Serializable;
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
@Table(name = "HoaDonChiTiet")
@Entity
public class HoaDonChiTiet extends PrimaryModel implements Serializable{
    @ManyToOne
    @JoinColumn(name="hoa_don_id")
    private HoaDon hoaDon;
    
    @OneToOne
    @JoinColumn(name = "san_pham_id")
    private SanPham sanPham;
    
    @Column
    private int soLuong;
    
    @Column
    private float donGia;
    
    @Column
    private TinhTrangHoaDon tinhTrangHoaDon;
}
