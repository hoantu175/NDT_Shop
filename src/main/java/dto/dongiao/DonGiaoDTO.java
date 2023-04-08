/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.dongiao;

import comon.constant.ModelProperties;
import comon.constant.dongiao.TrangThaiDonGiao;
import comon.constant.dongiao.YeuCauDonHang;
import comon.model.AuditModelDTO;
import dto.hoadon.HoaDonDTO;
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
public class DonGiaoDTO extends AuditModelDTO {

//    @NotBlank(message = "Mã Đơn Giao - Không được để trống !")
    private String maDG;

    private HoaDonDTO hoaDon;

    @NotBlank(message = "Địa chỉ - Không được để trống !")
    private String diaChi;

//    @NotNull(message = "Tiền thu hộ - Không được để trống")
    private float tienThuHo;

    private Long ngayGiao;

//    @NotNull(message = "Trạng thái  - Không được để trống")
    private TrangThaiDonGiao trangThaiDonGiao;

    private YeuCauDonHang yeuCauDonHang;

//    @NotBlank(message = "Số điện thoại - Không được để trống !")
//    @Pattern(regexp = ModelProperties.REGEX_PHONE_NUMBER, message = "Số điện thoại - Không đúng định dạng !")
    private String sdtNguoiNhan;

    private String ghiChu;

    private ThongSoDTO thongSo;

}
