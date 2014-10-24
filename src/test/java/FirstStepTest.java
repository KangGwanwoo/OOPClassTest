    import junit.framework.TestCase;
    import org.junit.Test;
    import static org.junit.Assert.*;

    public class FirstStepTest extends TestCase {
        @Test


        public void testWhoDo() throws Exception {
           FirstStep fs = new FirstStep();
           int result = fs.howLongDistance("강관우","100뛰기");


           assertEquals(100,result,0);

        }
    }



