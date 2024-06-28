import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    public void getXTest_whenStart_thenReturn0() {
        //Given
        boolean start = true;

        //When
        int actual = getX(start);

        //Then
        assertEquals(actual, 0);
    }

}