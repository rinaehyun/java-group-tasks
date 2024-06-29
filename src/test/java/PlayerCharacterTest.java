import org.junit.jupiter.api.Test;

import static java.nio.file.Files.move;
import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    public void getXTest_whenStart_thenReturn0() {
        //Given
        int x = 0;

        //When
        int actual = PlayerCharacter.getX();

        //Then
        assertEquals(0, actual);
    }

    @Test
    public void getYTest_whenStart_thenReturn0() {
        //Given
        int y = 0;

        //When
        int actual = PlayerCharacter.getY();

        //Then
        assertEquals(0, actual);
    }

    @Test
    public void moveTest_whenW_thenReturn1() {
        //Given
        String key = "W";
        //When
        boolean actual = PlayerCharacter.move(key);
        //Then
        assertTrue( actual);
    }
    @Test
    public void moveTest_whenD_thenReturn1() {
        //Given
        String key = "d";
        //When
        boolean actual = PlayerCharacter.move(key);
        //Then
        assertTrue( actual);
    }

}