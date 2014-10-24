import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ce416-03 on 2014. 10. 24..
 */
public class sumTest {
    @Test
    public void testSum() throws Exception {
        assertThat(2 + 3, is(5));
    }

}
