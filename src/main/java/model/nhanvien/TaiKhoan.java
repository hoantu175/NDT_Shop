/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.nhanvien;

import comon.constant.ModelProperties;
import comon.constant.Role;
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

/**
 *
 * @author nguyenth28
 */

@Getter
@Setter
@Table(name = "TaiKhoan")
@Entity

public class TaiKhoan extends PrimaryModel implements Serializable {
    @Column(length = ModelProperties.LENGTH_ACCOUNT, unique = true)
    private String tenTaiKhoan;
    
    @Column(length = ModelProperties.LENGTH_PASSWORD)
    private String matKhau;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "nhan_vien_id", referencedColumnName = "id")
    private NhanVien nhanVien;
    
    @Column
    private Role role;
}
