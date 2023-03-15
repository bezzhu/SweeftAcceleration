import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStructureTest {

    /*
        ამოცანა 6.
     */

    @Test
    public void myStructure_Integer(){
        MyStructure<Integer> myStructure = new MyStructure<>();
        myStructure.add(4);
        myStructure.add(2);
        assertTrue(myStructure.remove(2));
        assertEquals(1, myStructure.size());
    }
    @Test
    public void myStructure_String(){
        MyStructure<String> myStructure = new MyStructure<>();
        myStructure.add("GEO");
        myStructure.add("USA");
        assertTrue(myStructure.remove("GEO"));
        assertEquals(1, myStructure.size());
    }
    @Test
    public void myStructure_Character(){
        MyStructure<Character> myStructure = new MyStructure<>();
        myStructure.add('G');
        myStructure.add('B');
        assertEquals('G', myStructure.get(0));
        assertTrue(myStructure.remove('B'));
        assertEquals(1, myStructure.size());
    }

}