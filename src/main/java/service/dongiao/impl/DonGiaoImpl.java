/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.dongiao.impl;

import comon.utilities.Mapper;
import dto.dongiao.DonGiaoDTO;
import java.util.ArrayList;
import java.util.List;
import model.dongiao.DonGiao;
import repository.dongiao.DonGiaoRepository;
import service.dongiao.DonGiaoService;

/**
 *
 * @author ADMIN KH
 */
public class DonGiaoImpl implements DonGiaoService{
     private DonGiaoRepository repository;

    public DonGiaoImpl() {
     this.repository = new DonGiaoRepository();

    }

    @Override
    public List<DonGiaoDTO> findAll(int position) {
        List<DonGiaoDTO> listDTO = new ArrayList<>();
        List<DonGiao> listModel = repository.findAll(position);
        for (DonGiao model : listModel) {
            listDTO.add(Mapper.modelMapper().map(model, DonGiaoDTO.class));
        }
        return listDTO;
    }

    @Override
    public List<DonGiaoDTO> findAll() {
        List<DonGiaoDTO> listDTO = new ArrayList<>();
        List<DonGiao> listModel = repository.findAll();
        for (DonGiao model : listModel) {
            listDTO.add(Mapper.modelMapper().map(model, DonGiaoDTO.class));
        }
        return listDTO;
    }

    @Override
    public DonGiaoDTO findById(String id) {
        DonGiao model = repository.findById(id);
        return Mapper.modelMapper().map(model, DonGiaoDTO.class);

    }

    @Override
    public String create(DonGiaoDTO dto) {
        dto.setId(null);
        DonGiao model = Mapper.modelMapper().map(dto, DonGiao.class);
        String result;
        if (repository.save(model) != null) {
            result = "Thêm thành công";
        } else {
            result = "Thêm thất bại";
        }
        return result;
    }

    @Override
    public String update(DonGiaoDTO dto) {
       
        DonGiao model = Mapper.modelMapper().map(dto, DonGiao.class);
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
