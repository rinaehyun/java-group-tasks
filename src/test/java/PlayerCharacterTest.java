import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    public void getXTest_whenStart_thenReturn0() {
        //Given
        int x = 0;

        //When
        int actual = PlayerCharacter.getX();

        //Then
        assertEquals( 0,actual);
    }

}