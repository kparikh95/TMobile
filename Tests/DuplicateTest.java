import com.company.Duplicate;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateTest {
    private Duplicate d1;

    @BeforeEach
    void setUp() {
        d1 = new Duplicate(2, "karan");
    }


    @Test
    void getId() {

        assertEquals(1, d1.getId());
    }


    @Test
    void getCenter() {

        assertEquals("karan", d1.getCenter());
    }
}