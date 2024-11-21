import fr.diginamic.utils.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void testDist0(){
        int resultat= StringUtils.levenshteinDistance("ab", "ab");
        assertEquals(0, resultat);
    }
}
