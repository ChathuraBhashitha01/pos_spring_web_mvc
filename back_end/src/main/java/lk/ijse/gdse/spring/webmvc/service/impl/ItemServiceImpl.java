package lk.ijse.gdse.spring.webmvc.service.impl;

import lk.ijse.gdse.spring.webmvc.dto.ItemDTO;
import lk.ijse.gdse.spring.webmvc.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public List<ItemDTO> getAllItems() {
        return null;
    }

    @Override
    public ItemDTO getItemDetails(String id) {
        return null;
    }

    @Override
    public void saveItem(ItemDTO itemDTO) {

    }

    @Override
    public void updateItem(ItemDTO itemDTO) {

    }

    @Override
    public void deleteItem(String id) {

    }
}
