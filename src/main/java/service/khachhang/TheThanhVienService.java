/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.khachhang;

import dto.khachhang.TheThanhVienDTO;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TheThanhVienService {

    List<TheThanhVienDTO> findAll(int position, int pageSize);

    TheThanhVienDTO findById(String id);
    
    TheThanhVienDTO findByNgayHetHan(Long ngayHetHan);

    String create(TheThanhVienDTO dTO);

    String update(TheThanhVienDTO dTO);

    boolean delete(String id);

    long totalCount();
}
