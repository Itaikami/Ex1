package assignments.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }
        @Test
        void int2NumberTest() {
           // implement this test

               assertEquals("1b2",Ex1.int2Number(1,2));
               assertEquals("10b2",Ex1.int2Number(2,2));
               assertEquals("A1bG",Ex1.int2Number(161,16));
               assertEquals("FbG",Ex1.int2Number(15,16));
               assertEquals("95",Ex1.int2Number(95,10));
                }



        @Test
        void maxIndexTest() {
            // implement this test
            String[] max={"12b3","10","10bG","FFbG","1101b2","gba"};
            assertEquals(Ex1.maxIndex(max),3);
        }

    @Test
    void char2Int() {
            char[] let={'A','B','C','D','E','F','G'};
        for (int i = 0; i < let.length; i++) {
            assertEquals(Ex1.char2Int(let[i]),10+i);
        }
    }

    @Test
    void number2Int() {
            String[] nums={"11b2","BbA","AbB","AFbG","b3","15b7"};
            assertEquals(Ex1.number2Int(nums[0]),3);
            assertEquals(Ex1.number2Int(nums[1]),-1);
            assertNotEquals(Ex1.number2Int(nums[2]),Ex1.number2Int(nums[1]));
            assertEquals(Ex1.number2Int(nums[3]),175);
            assertNotEquals(Ex1.number2Int(nums[4]),3);
            assertEquals(Ex1.number2Int(nums[5]),12);

    }

    @Test
    void testEquals() {
            assertTrue(Ex1.equals("1b2","1bG"));
            assertTrue(Ex1.equals("10b2","2"));
            assertFalse(Ex1.equals("101b3","11b4"));
            assertTrue(Ex1.equals("12b4","6"));
            assertFalse(Ex1.equals("0b2","b2"));
            assertTrue(Ex1.equals("AbG","AbD"));
            assertFalse(Ex1.equals("1010b2","101b4"));
    }

    // Add additional test functions - test as much as you can.
    }
