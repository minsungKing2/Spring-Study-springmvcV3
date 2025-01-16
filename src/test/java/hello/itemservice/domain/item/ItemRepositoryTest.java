package hello.itemservice.domain.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ItemRepositoryTest {

    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach() {
        itemRepository.clearStore();
    }

    @Test
    void save() {
        //given

        //when

        //then
    }

    @Test
    void findAll() {
        //given

        //when

        //then
    }

    @Test
    void updateItem() {
        //given

        //when

        //then
    }

}
