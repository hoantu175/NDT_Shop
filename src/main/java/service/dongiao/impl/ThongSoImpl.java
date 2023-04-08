/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.dongiao.impl;

import comon.utilities.Mapper;
import dto.dongiao.ThongSoDTO;
import java.util.ArrayList;
import java.util.List;
import model.dongiao.ThongSo;
import repository.dongiao.ThongSoRepository;
import service.dongiao.ThongSoService;

/**
 *
 * @author Admin
 */
public class ThongSoImpl implements ThongSoService{
    private ThongSoRepository repository;

    public ThongSoImpl() {
    repository = new ThongSoRepository();
    }
     @Override
    public List<ThongSoDTO> findAll(int position) {
        List<ThongSoDTO> listDTO = new ArrayList<>();
        List<ThongSo> listModel = repository.findAll(position);
        for (ThongSo model : listModel) {

//            KhachHangDTO khachHangDTO = Mapper.modelMapper().map(model.getHoaDon().getKhachHang(), KhachHangDTO.class);
//            HoaDonDTO hoaDonDTO = Mapper.modelMapper().map(model.getHoaDon(), HoaDonDTO.class);
//            hoaDonDTO.setKhachHang(khachHangDTO);
            ThongSoDTO thongSoDTO = Mapper.modelMapper().map(model, ThongSoDTO.class);
//            donGiaoDTO.setHoaDon(hoaDonDTO);
            listDTO.add(thongSoDTO);
        }
        return listDTO;
    }

    @Override
    public List<ThongSoDTO> findAll() {
        List<ThongSoDTO> listDTO = new ArrayList<>();
        List<ThongSo> listModel = repository.findAll();
        for (ThongSo model : listModel) {
            listDTO.add(Mapper.modelMapper().map(model, ThongSoDTO.class));
        }
        return listDTO;
    }

    @Override
    public ThongSoDTO findById(String id) {
       ThongSo model = repository.findById(id);
        return Mapper.modelMapper().map(model, ThongSoDTO.class);

    }

    @Override
    public String create(ThongSoDTO dto) {
        dto.setId(null);
        ThongSo model = Mapper.modelMapper().map(dto, ThongSo.class);
        String result;
        if (repository.save(model) != null) {
            result = "Thêm thành công";
        } else {
            result = "Thêm thất bại";
        }
        return result;
    }

    @Override
    public String update(ThongSoDTO dto) {
       
        ThongSo model = Mapper.modelMapper().map(dto, ThongSo.class);
        String result;
        if (repository.save(model) != null) {
            result = "Sua thanh cong";
        } else {
            result = "Sua that bai";
        }
        return result;

    }

    @Override
    public boolean delete(String id) {

        return repository.delete(id);
    }

    @Override
    public long totalCount() {
        return repository.totalCount();
    }
}
