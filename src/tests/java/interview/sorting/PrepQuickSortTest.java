package interview.sorting;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by scootdog on 8/23/14.
 */
@Test
public class PrepQuickSortTest {

    public void testQuickSortAccuracy() throws Exception {
        int[] testArray1 = {1,55,4,44,2,22,0,33,3,1,3,22};

        Assert.assertFalse(testOrder(testArray1));

        PrepQuickSort.quicksort(testArray1);

        Assert.assertTrue(testOrder(testArray1));

        int[] testArray2 = {122,55,4,44,2,22,40,33,35,101,23,22};

        Assert.assertFalse(testOrder(testArray2));

        PrepQuickSort.quicksort(testArray2);

        Assert.assertTrue(testOrder(testArray2));
    }

    private boolean testOrder(int[] testArray) {

        int last = testArray[0];
        for(int arrayValue:testArray) {
            if (arrayValue < last) {
                return false;
            }
            last = arrayValue;
        }

        return true;
    }

}
