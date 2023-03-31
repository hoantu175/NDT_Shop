/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dongiao;

import model.khachhang.KhachHang;
import comon.constant.ModelProperties;
import comon.constant.TrangThaiThanhToan;
import comon.constant.dongiao.TrangThaiDonGiao;
import comon.constant.dongiao.YeuCauDonHang;
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
import model.hoadon.HoaDon;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author nguyenth28
 */
@Getter
@Setter
@Table(name = "DonGiao")
@Entity
public class DonGiao extends PrimaryModel implements Serializable {

    @Column(length = ModelProperties.LENGTH_CODE)
    private String maDG;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "hoa_don_id", referencedColumnName = "id")
    private HoaDon hoaDon;

    @Column
    @Nationalized
    private String diaChi;

    @Column
    private float tienThuHo;

    @Column
    private Long ngayGiao;

    @Column
    private TrangThaiDonGiao trangThaiDonGiao;

    @Column
    private YeuCauDonHang yeuCauDonHang;

    @Column(length = ModelProperties.LENGTH_PHONE)
    private String sdtNguoiNhan;

    @Column
    @Nationalized
    private String ghiChu;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "thong_so_id", referencedColumnName = "id")
    private ThongSo thongSo;
}
