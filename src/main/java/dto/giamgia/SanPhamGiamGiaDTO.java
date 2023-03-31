/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.giamgia;

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
public class SanPhamGiamGiaDTO extends GiamGiaDTO {

    private SanPhamDTO sanPham;

    private GiamGiaDTO giamGia;

    @NotNull(message = "Đơn giá  - Không được để trống !")
    private float donGia;

    @NotNull(message = "Số tiền còn lại  - Không được để trống !")
    private float soTienConLai;

}
