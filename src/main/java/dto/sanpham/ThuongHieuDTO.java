/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.sanpham;

import comon.constant.sanpham.TrangThaiThuongHieu;
import comon.model.AuditModelDTO;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author ADMIN KH
 */
@Getter
@Setter
public class ThuongHieuDTO extends AuditModelDTO {

    @NotBlank(message = "Mã thương hiệu - Không được để trống !")
    private String ma;

    @NotBlank(message = "Tên thương hiệu - Không được để trống !")
    private String ten;

    private TrangThaiThuongHieu trangThaiThuongHieu;

}
