/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.dongiao;

import dto.dongiao.ThongSoDTO;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ThongSoService {

    List<ThongSoDTO> findAll(int position);

    List<ThongSoDTO> findAll();

    ThongSoDTO findById(String id);

    String create(ThongSoDTO dto);

    String update(ThongSoDTO dto);

    boolean delete(String id);

    long totalCount();
}
