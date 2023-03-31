/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.khachhang;

import comon.constant.khachhang.TrangThaiQuyDoi;
import comon.model.AuditModelDTO;
import dto.sanpham.SanPhamDTO;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ADMIN KH
 */
@Getter
@Setter
public class QuyDoiDiemDTO extends AuditModelDTO {

    @NotNull(message = "Tiền tích điểm - Không được để trống !")
    private long tienTichDiem;

    @NotNull(message = "Tiền tiêu điểm - Không được để trống !")
    private long tienTieuDiem;

    @NotNull(message = "Trạng thái quy đổi - Không được để trống !")
    private TrangThaiQuyDoi trangThaiQuyDoi;

}
