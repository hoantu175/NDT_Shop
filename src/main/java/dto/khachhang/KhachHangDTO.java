/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.khachhang;

import comon.constant.ModelProperties;
import comon.constant.khachhang.TrangThaiKhachHang;
import comon.model.AuditModelDTO;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ADMIN KH
 */
@Getter
@Setter
public class KhachHangDTO extends AuditModelDTO {

    private TheThanhVienDTO theThanhVien;

    @NotBlank(message = "Mã khách hàng - Không được để trống !")
    private String maKH;

    @NotBlank(message = "Tên - Không được để trống !")
    private String ten;

    @NotNull(message = "Ngày sinh - Không được để trống !")
    private long ngaySinh;

    @NotEmpty(message = "Gioi tính - Không được để trống !")
    private String gioiTinh;

    @NotBlank(message = "SĐT - Không được để trống !")
    private String sdt;

    @NotBlank(message = "Địa chỉ - Không được để trống !")
    private String diaChi;

    @NotBlank(message = "Email - Không được để trống !")
    @Pattern(regexp = ModelProperties.REGEX_EMAIL)
    private String email;

    @NotNull(message = "Số lần mua - Không được để trống !")
    private int soLanMua;

    private TrangThaiKhachHang trangThaiKhachHang;

    private String ghiChu;

    public Object[] toDataRow() {
        return new Object[]{maKH, this.getTheThanhVien().getMaTTV(), ten, sdt, new Date(ngaySinh), email, diaChi, gioiTinh, ghiChu, soLanMua, trangThaiKhachHang};
    }
}
