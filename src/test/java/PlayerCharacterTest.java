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
        int actual = PlayerCharacter.move(key);
        //Then
        assertEquals(1, actual);
    }


    // Test when the input is right
    @Test
    public void moveLeftTest_whenA_thenReturnMinus1() {
        //Given
        String key = "A";
        //When
        int actual = PlayerCharacter.moveLeft(key);
        //Then
        assertEquals(-1, actual);
    }

    // Test when the input is wrong
    @Test
    public void moveLeftTest_whenB_thenReturn0() {
        //Given
        String key = "b";
        //When
        int actual = PlayerCharacter.moveLeft(key);
        //Then
        assertEquals(0, actual);
    }

}