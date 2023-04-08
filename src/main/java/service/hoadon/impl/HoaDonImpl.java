/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.hoadon.impl;

import comon.utilities.Mapper;
import dto.hoadon.HoaDonDTO;
import java.util.ArrayList;
import java.util.List;
import model.hoadon.HoaDon;
import repository.hoadon.HoaDonRepository;
import service.hoadon.HoaDonService;

/**
 *
 * @author ADMIN KH
 */
public class HoaDonImpl implements HoaDonService {

    private HoaDonRepository repository;

    public HoaDonImpl() {
        repository = new HoaDonRepository();
    }
        @Override
    public List<HoaDonDTO> findAll(int position) {
        List<HoaDonDTO> listDTO = new ArrayList<>();
        List<HoaDon> listModel = repository.findAll(position);
        for (HoaDon model : listModel) {
            listDTO.add(Mapper.modelMapper().map(model, HoaDonDTO.class));
        }
        return listDTO;
    }

    @Override
    public List<HoaDonDTO> findAll() {
        List<HoaDonDTO> listDTO = new ArrayList<>();
        List<HoaDon> listModel = repository.findAll();
        for (HoaDon model : listModel) {
            listDTO.add(Mapper.modelMapper().map(model, HoaDonDTO.class));
        }
        return listDTO;
    }

    @Override
    public HoaDonDTO findById(String id) {
        HoaDon model = repository.findById(id);
        return Mapper.modelMapper().map(model, HoaDonDTO.class);

    }

    @Override
    public String create(HoaDonDTO dto) {
        dto.setId(null);
        HoaDon model = Mapper.modelMapper().map(dto, HoaDon.class);
        String result;
        if (repository.save(model) != null) {
            result = "Thêm thành công";
        } else {
            result = "Thêm thất bại";
        }
        return result;
    }

    @Override
    public String update(HoaDonDTO dto) {
       
        HoaDon model = Mapper.modelMapper().map(dto, HoaDon.class);
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
