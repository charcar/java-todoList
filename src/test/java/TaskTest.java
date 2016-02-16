import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void getDescription_getsDescription() {
    Task myTask = new Task("Feed cat");
    assertEquals("Feed cat", myTask.getDescription());
  }
}
