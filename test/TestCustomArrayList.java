import com.coderscampus.arraylist.CustomArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestCustomArrayList {

    @Test
    public void shouldAddItemToArrayList() {

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        // populate the test arrayList
        for (int i = 0; i < 21; i++) {
            customArrayList.add(i);
        }

        Assert.assertEquals(21,customArrayList.getSize());
    }



    @Test
    public void shouldAddItemToArrayListAtSpecifiedIndexOrThrowException(){

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        int testIndex = 5;
        int testItem = 12;
        int nonExistentTestIndex = 8;

        // populate the test arrayList
        for (int i = 0; i <= 4; i++) {
            customArrayList.add(i);
        }

        // add item at test index
        customArrayList.add(testIndex,testItem);

        // get item from a pre populated index
        Assert.assertEquals(2,(Object)customArrayList.get(2));

        // test newly added item
        Assert.assertEquals(testItem,(Object)customArrayList.get(testIndex));

        //test addition at non existing index
        IndexOutOfBoundsException thrown = assertThrows(
                IndexOutOfBoundsException.class,
                ()->customArrayList.get(nonExistentTestIndex)
        );

        Assert.assertTrue(thrown.getMessage().contains("Index out of bound!"));
    }


    @Test
    public void shouldGetArrayListSize(){
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        int testSize = 25;
        int expectedSize = 25;

        // populate the test arrayList
        for (int i = 0; i <= testSize; i++) {
            customArrayList.add(i);
        }

        // add item at test index
        int actualSize = customArrayList.getSize();

        // get size of the  from a pre populated index
        Assert.assertEquals(expectedSize,(Object)customArrayList.getSize());

    }

    @Test
    public void shouldGetItemFromSpecifiedIndexOrThrowException(){ //

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        int indexThrowsException = 15;
        int testIndex = 5;
        int testItem = 12;
        int arraySize = 5;
        int existingIndex = 2;

        // populate the test arrayList
        for (int i = 0; i <= arraySize; i++) {
            customArrayList.add(i);
        }

        // add item at test index
        customArrayList.add(testIndex,testItem);

        // get item from the pre populated index
        Assert.assertEquals(2,(Object)customArrayList.get(existingIndex));

        // test added item
        Assert.assertEquals(testItem,(Object)customArrayList.get(testIndex));

        //test addition at non existing index
        IndexOutOfBoundsException thrown = assertThrows(
                IndexOutOfBoundsException.class,
                ()->customArrayList.get(indexThrowsException)
        );

        Assert.assertTrue(thrown.getMessage().contains("Index out of bound!"));
    }

    @Test
    public void shouldRemoveItemFromSpecifiedIndexOrThrowException(){

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        int indexAtRemove = 5;


        // populate the test arrayList
        for (int i = 0; i <= 10; i++) {
            customArrayList.add(i);
        }

        int lengthBeforeRemove = customArrayList.getSize();

        Integer removedItem = customArrayList.remove(indexAtRemove);

        // get item from pre populated index
        Assert.assertEquals(6,(Object)customArrayList.get(5));


        // get item from pre populated index
        Assert.assertEquals(lengthBeforeRemove - 1,(Object)customArrayList.getSize());

        //test exception
        IndexOutOfBoundsException thrown = assertThrows(
                IndexOutOfBoundsException.class,
                ()->customArrayList.remove(15)
        );

        Assert.assertTrue(thrown.getMessage().contains("Index out of bound!"));
    }
}
