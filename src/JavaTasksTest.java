import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaTasksTest {

    JavaTasks javaTasks = new JavaTasks();
    @Test
    public void arraySizeIsOne(){
        int[] arr = {1};
        assertEquals(1 ,javaTasks.singleNumber(arr));
        assertEquals(1 ,javaTasks.singleNumber2(arr));
    }
    @Test
    public void singleNumberIsZero(){
        int[] arr = {-1 , 3 , 0 ,3 ,-1};
        assertEquals(0 ,javaTasks.singleNumber(arr));
        assertEquals(0 ,javaTasks.singleNumber2(arr));
    }
    @Test
    public void singleNumberIsPositive(){
        int[] arr = {-13 , 8 , -6 , 9 , -6 , -13 , 8};
        assertEquals(9 ,javaTasks.singleNumber(arr));
        assertEquals(9 ,javaTasks.singleNumber2(arr));
    }
    @Test
    public void singleNumberIsNegative(){
        int[] arr = {-13 , 8 , -6 , 9 , -6 , 9 , 8};
        assertEquals(-13 ,javaTasks.singleNumber(arr));
        assertEquals(-13 ,javaTasks.singleNumber2(arr));
    }

}