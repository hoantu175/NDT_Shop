/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.hoadon;

import dto.hoadon.HoaDonDTO;
import java.util.List;

/**
 *
 * @author ADMIN KH
 */
public interface HoaDonService {

    List<HoaDonDTO> findAll(int position);

    List<HoaDonDTO> findAll();

    HoaDonDTO findById(String id);

    String create(HoaDonDTO dto);

    String update(HoaDonDTO dto);

    boolean delete(String id);

    long totalCount();
}
