package lk.ijse.gdse.spring.webmvc.api;

import lk.ijse.gdse.spring.webmvc.dto.ItemDTO;
import lk.ijse.gdse.spring.webmvc.service.ItemService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ItemDTO> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ItemDTO getItemDetails(@PathVariable("id") String id){
        return itemService.getItemDetails(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveItem(@RequestBody ItemDTO itemDTO){
        itemService.saveItem(itemDTO);
    }

    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateItem(@RequestBody ItemDTO itemDTO){
        itemService.updateItem(itemDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteItem(@PathVariable("id") String id){
        itemService.deleteItem(id);
    }
}
