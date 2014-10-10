import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by ce416-03 on 2014. 10. 10..
 */
public class addTest {
    @Test
    public void testAdd() throws Exception {
        assertThat(1 + 1, is(2));
    }

}
