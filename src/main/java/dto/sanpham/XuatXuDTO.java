/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.sanpham;

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
public class XuatXuDTO extends AuditModelDTO {

    @NotBlank(message = "Mã xuất xứ - Không được để trống !")
    private String ma;

    @NotBlank(message = "Tên xuất xứ - Không được để trống !")
    private String ten;

    @NotBlank(message = "Số điện thoại xuất xứ - Không được để trống !")
    private String sdt;

    @NotBlank(message = "Email xuất xứ - Không được để trống !")
    private String email;

    @NotBlank(message = "Địa chỉ xuất xứ - Không được để trống !")
    private String diaChi;

}
