/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.khachhang;

import comon.constant.khachhang.TrangThaiTheThanhVien;
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
public class TheThanhVienDTO extends AuditModelDTO {

    @NotBlank(message = "Mã thẻ thành viên - Không được để trống !")
    private String maTTV;

    private ViDiemDTO viDiem;

    private LoaiTheDTO loaiThe;

    @NotNull(message = "Ngày phát hành - Không được để trống !")
    private Long ngayPhatHanh;

    @NotNull(message = "Ngày hêt hạn - Không được để trống !")
    private Long ngayHetHan;

    @NotNull(message = "Trạng thái thẻ  - Không được để trống !")
    private TrangThaiTheThanhVien trangThaiTheThanhVien;
}
