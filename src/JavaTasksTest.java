import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaTasksTest {

    JavaTasks javaTasks = new JavaTasks();

    /*
        ამოცანა 1.
     */

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

    /*
        ამოცანა 2.
     */

    @Test
    public void minSplitAmount_0(){
        assertEquals(0, javaTasks.minSplit(0));
    }
    @Test
    public void minSplitAmount_1(){
        assertEquals(1, javaTasks.minSplit(1));
    }
    @Test
    public void minSplitAmount_22(){
        assertEquals(3, javaTasks.minSplit(22));
    }
    @Test
    public void minSplitAmount_1243(){
        assertEquals(29, javaTasks.minSplit(1243));
    }

    /*
        ამოცანა 3.
     */

    @Test
    public void notContains_1(){
        int[] arr = {-1, 2, 3, -15, -254, 111};
        assertEquals(   1, javaTasks.notContains(arr));
    }
    @Test
    public void notContains_2(){
        int[] arr = {181, 28, -17, 3, 178, 1};
        assertEquals(   2, javaTasks.notContains(arr));
    }
    @Test
    public void notContains_3(){
        int[] arr = {-12, -14, 1, 2, 5, 13};
        assertEquals(   3, javaTasks.notContains(arr));
    }
    @Test
    public void notContains_4(){
        int[] arr = {-123, 1, -15, 2, 13, 3, 124};
        assertEquals(   4, javaTasks.notContains(arr));
    }
    @Test
    public void notContains_5(){
        int[] arr = {1, 2, 2, 4, 5};
        assertEquals(   3, javaTasks.notContains(arr));
    }

    /*
        ამოცანა 4.
     */

    @Test
    public void addBinary_LeadingZeros(){
        assertEquals(   "1110", javaTasks.addBinary("0000000011" ,"0000000001011"));
    }
    @Test
    public void addBinary_0_1(){
        assertEquals(   "1", javaTasks.addBinary("0" ,"1"));
    }
    @Test
    public void addBinary_1_1(){
        assertEquals(   "10", javaTasks.addBinary("1" ,"1"));
    }
    @Test
    public void addBinary_1010_1011(){
        assertEquals(   "10101", javaTasks.addBinary("1010" ,"1011"));
    }

    /*
        ამოცანა 5.
     */

    @Test
    public void countVariants_0(){
        assertEquals(   0, javaTasks.countVariants(0));
        assertEquals(0,javaTasks.countVariants2(0));
        assertEquals(0,javaTasks.countVariants3(0));
    }
    @Test
    public void countVariants_1(){
        assertEquals(   1, javaTasks.countVariants(1));
        assertEquals(1,javaTasks.countVariants2(1));
        assertEquals(1,javaTasks.countVariants3(1));
    }
    @Test
    public void countVariants_2(){
        assertEquals(  2, javaTasks.countVariants(2));
        assertEquals(2,javaTasks.countVariants2(2));
        assertEquals(2,javaTasks.countVariants3(2));
    }
    @Test
    public void countVariants_3(){
        assertEquals(   3, javaTasks.countVariants(3));
        assertEquals(3,javaTasks.countVariants2(3));
        assertEquals(3,javaTasks.countVariants3(3));
    }
    @Test
    public void countVariants_4(){
        assertEquals(   5, javaTasks.countVariants(4));
        assertEquals(5,javaTasks.countVariants2(4));
        assertEquals(5,javaTasks.countVariants3(4));
    }
    @Test
    public void countVariants_5(){
        assertEquals(   8, javaTasks.countVariants(5));
        assertEquals(8,javaTasks.countVariants2(5));
        assertEquals(8,javaTasks.countVariants3(5));
    }
    @Test
    public void countVariants_6(){
        assertEquals(   13, javaTasks.countVariants(6));
        assertEquals(13,javaTasks.countVariants2(6));
        assertEquals(13,javaTasks.countVariants3(6));
    }
    @Test
    public void countVariants_7(){
        assertEquals(   21, javaTasks.countVariants(7));
        assertEquals(21,javaTasks.countVariants2(7));
        assertEquals(21,javaTasks.countVariants3(7));
    }
    @Test
    public void countVariants_8(){
        assertEquals(   34, javaTasks.countVariants(8));
        assertEquals(34,javaTasks.countVariants2(8));
        assertEquals(34,javaTasks.countVariants3(8));
    }
    @Test
    public void countVariants_9(){
        assertEquals(   55, javaTasks.countVariants(9));
        assertEquals(55,javaTasks.countVariants2(9));
        assertEquals(55,javaTasks.countVariants3(9));
    }
    @Test
    public void countVariants_10(){
        assertEquals(   89, javaTasks.countVariants(10));
        assertEquals(89,javaTasks.countVariants2(10));
        assertEquals(89,javaTasks.countVariants3(10));
    }

}