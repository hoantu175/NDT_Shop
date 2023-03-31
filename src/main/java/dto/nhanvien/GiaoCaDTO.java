/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.nhanvien;

import comon.constant.nhanvien.TrangThaiGiaoCa;
import comon.model.AuditModelDTO;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author ADMIN KH
 */
@Getter
@Setter
public class GiaoCaDTO extends AuditModelDTO {

    @NotBlank(message = "Mã Giao ca - Không được để trống !")
    private String maGC;

    private NhanVienDTO nhanVien;

    @NotBlank(message = "Id nhân viên trong ca - Không được để trống !")
    private String idNhanVienTrongCa;

    @NotBlank(message = "Id nhân viên ca tiếp theo - Không được để trống !")
    private String idNhanVienCaTiepTheo;

    @NotNull(message = "Thời gian nhận ca - Không được để trống !")
    private Long thoiGianNhanCa;

    @NotNull(message = "Thời gian giao ca - Không được để trống !")
    private Long thoiGianGiaoCa;

    @NotNull(message = "Tiền bắt đầu ca - Không được để trống !")
    private float tienBanDau;

    @NotNull(message = "Tiền trong ca - Không được để trống !")
    private float tongTienTrongCa;

    @NotNull(message = "Tổng tiền mặt - Không được để trống !")
    private float tongTienMat;

    @NotNull(message = "Tổng tiền khác - Không được để trống !")
    private float tongTienKhac;

    @NotNull(message = "Tiền phát sinh - Không được để trống !")
    private float tienPhatSinh;

    @NotBlank(message = "Ghi chú phát sinh - Không được để trống !")
    private String ghiChuPhatSinh;

    @NotNull(message = "Tổng tiền mặt ca trước - Không được để trống !")
    private float tongTienMatCaTruoc;

    @NotNull(message = "Tổng tiền mặt rút - Không được để trống !")
    private float tongTienMatRut;

    private TrangThaiGiaoCa trangThaiGiaoCa;

    private String chuThich;
}
