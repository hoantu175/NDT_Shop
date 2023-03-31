/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.khachhang;

import comon.constant.khachhang.TrangThaiQuyDoi;
import comon.model.PrimaryModel;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ADMIN KH
 */
@Getter
@Setter
@Table(name = "QuyDoiDiem")
@Entity
public class QuyDoiDiem extends PrimaryModel implements Serializable {

    @Column
    private long tienTichDiem;

    @Column
    private long tienTieuDiem;

    @Column
    private TrangThaiQuyDoi trangThaiQuyDoi;

}
