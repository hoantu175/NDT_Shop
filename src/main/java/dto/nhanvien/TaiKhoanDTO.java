/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.nhanvien;

import comon.constant.Role;
import comon.model.AuditModelDTO;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author ADMIN KH
 */
@Getter
@Setter
public class TaiKhoanDTO extends AuditModelDTO {

    @NotBlank(message = "Tên tài khoản - Không được để trống !")
    private String tenTaiKhoan;

    @NotBlank(message = "Mật khẩu - Không được để trống !")
    private String matKhau;

    private NhanVienDTO nhanVien;

    private Role role;
}
