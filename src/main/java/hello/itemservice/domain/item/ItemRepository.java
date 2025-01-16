package hello.itemservice.domain.item;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); //실제로는 HashMap 사용하면 안됨. static 사용
    private static long sequence = 0L;

    //아이템 저장
    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    //아이템 조회
    public Item findById(Long id) {
        return store.get(id);
    }

    //아이템 전체 조회
    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    //아이템 업데이트
    public void update(Long itemId, Item updateParam) {
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    //저장소 초기화 -> store 데이터 초기화
    public void clearStore() {
        store.clear();
    }
 }
