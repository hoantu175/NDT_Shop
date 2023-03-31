/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.khachhang;

import comon.model.AuditModelDTO;
import java.util.Set;
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
public class LoaiTheDTO extends AuditModelDTO {

    private String ten;
    @NotBlank(message = "Giá trị - Không được để trống !")
    private int giaTri;

    @NotNull(message = "Số lượng - Không được để trống !")
    private int soLuong;
}
