package lk.ijse.gdse.spring.webmvc.service;

import lk.ijse.gdse.spring.webmvc.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    List<ItemDTO> getAllItems();
    ItemDTO getItemDetails(String id);
    void saveItem(ItemDTO itemDTO);
    void updateItem(ItemDTO itemDTO);
    void deleteItem(String id);
}
