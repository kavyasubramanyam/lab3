import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
  @Test 
  public void testMerge() {
    List<String> inputList1 = new ArrayList<>(Arrays.asList( "a", "b", "c" ));
    List<String> inputList2 = new ArrayList<>(Arrays.asList( "a", "b", "c" ));
    System.out.println(inputList1);
   var myArray = ListExamples.merge(inputList1, inputList2);
   List<String> checkList = new ArrayList<>(Arrays.asList( "a","a","b","b","c","c"));
    System.out.println(myArray);
    assertEquals(checkList, myArray);
	}



}
