/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.dongiao;

import dto.dongiao.DonGiaoDTO;
import java.util.List;

/**
 *
 * @author ADMIN KH
 */
public interface DonGiaoService {
     List<DonGiaoDTO> findAll(int position);

    List<DonGiaoDTO> findAll();

DonGiaoDTO findById(String id);

    String create(DonGiaoDTO dto);

    String update(DonGiaoDTO dto);

    boolean delete(String id);

    long totalCount();
}
