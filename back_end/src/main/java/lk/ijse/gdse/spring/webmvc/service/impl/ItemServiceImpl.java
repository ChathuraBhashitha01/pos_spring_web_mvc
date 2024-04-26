package lk.ijse.gdse.spring.webmvc.service.impl;

import lk.ijse.gdse.spring.webmvc.dto.ItemDTO;
import lk.ijse.gdse.spring.webmvc.entity.Item;
import lk.ijse.gdse.spring.webmvc.repository.ItemRepo;
import lk.ijse.gdse.spring.webmvc.service.ItemService;
import lk.ijse.gdse.spring.webmvc.service.exception.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private ModelMapper modelMapper;
    private ItemRepo itemRepo;

    public ItemServiceImpl(ModelMapper modelMapper, ItemRepo itemRepo) {
        this.modelMapper = modelMapper;
        this.itemRepo = itemRepo;
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return itemRepo.findAll().stream().map(item -> modelMapper.map(item, ItemDTO.class)).toList();
    }

    @Override
    public ItemDTO getItemDetails(String id) {
        if(!itemRepo.existsById(id)){
            throw new NotFoundException("Item Code : "+id+" does not exists");
        }
        return modelMapper.map(itemRepo.findById(id).get(),ItemDTO.class);
    }

    @Override
    public void saveItem(ItemDTO itemDTO) {
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        if(!itemRepo.existsById(itemDTO.getCode())){
            throw new NotFoundException("Item Code : "+itemDTO.getCode()+" does not exists");
        }
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
    }

    @Override
    public void deleteItem(String id) {
        if(!itemRepo.existsById(id)){
            throw new NotFoundException("Item Code : "+id+" does not exists");
        }
        itemRepo.deleteById(id);
    }
}
