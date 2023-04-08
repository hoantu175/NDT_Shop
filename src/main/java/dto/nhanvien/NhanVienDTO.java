/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.nhanvien;

import comon.constant.ModelProperties;
import comon.model.AuditModelDTO;
import dto.hoadon.HoaDonDTO;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author ADMIN KH
 */
@Getter
@Setter
public class NhanVienDTO extends AuditModelDTO {

    @NotBlank(message = "Mã nhân viên - Không được để trống !")
    private String maNV;

    @NotBlank(message = "Tên nhân viên - Không được để trống !")
    private String ten;

    @NotNull(message = "Ngày sinh - Không được để trống !")
    private Long ngaySinh;

    @NotNull(message = "Gioi tính - Không được để trống !")
    private String gioiTinh;

    @NotBlank(message = "Số điện thoại - Không được để trống !")
    private String sdt;

    @NotBlank(message = "Địa chỉ - Không được để trống !")
    private String diaChi;

    @NotBlank(message = "Email - Không được để trống !")
    @Pattern(regexp = ModelProperties.REGEX_EMAIL)
    private String email;
}
