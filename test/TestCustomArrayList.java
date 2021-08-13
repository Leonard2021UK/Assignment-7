import com.coderscampus.arraylist.CustomArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestCustomArrayList {

    @Test
    public void addItemToArrayList() {

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        for (int i = 0; i < 21; i++) {
            customArrayList.add(i);
        }

        Assert.assertEquals(21,customArrayList.getSize());
    }

    @Test
    public void shouldThrowIndexOutOfBoundException(){
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        IndexOutOfBoundsException thrown = assertThrows(
                IndexOutOfBoundsException.class,
                ()->customArrayList.get(5)
        );

        Assert.assertTrue(thrown.getMessage().contains("Index out of bound!"));
//        assertThrows(IndexOutOfBoundsException.class, CustomArrayList::get, "custom message if assertion fails...");


    }

    @Test
    public void addItemToArrayListAtSpecifiedIndex(){

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        Integr index = 5;
        Integer itemToAdd =

        for (int i = 0; i < 4; i++) {
            customArrayList.add(i);
        }




        Assert.assertEquals(12,(Object)customArrayList.get(5));
    }
}
