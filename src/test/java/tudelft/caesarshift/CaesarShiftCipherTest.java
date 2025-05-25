package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.crypto.Cipher;

public class CaesarShiftCipherTest {
@ParameterizedTest
@CsvSource({
        "abc, 1, bcd",
        "xyz, 3, abc",
        "abc, -1, zab",
        "abc, 0, abc",
        "abc, 27, bcd"
})
    public void testSimpleShift(String input, int shift, String expected)
{
    CaesarShiftCipher cipher = new CaesarShiftCipher();
    String result = cipher.encode(input,shift);
    Assertions.assertEquals(result,expected);
}

@Test
    public void testEmptyString()
{
    CaesarShiftCipher cipher = new CaesarShiftCipher();
    String result = cipher.encode("",5);
    Assertions.assertEquals("",result);
}

@Test
    public void testInvalidCharacter(){
    CaesarShiftCipher cipher = new CaesarShiftCipher();
    String result = cipher.encode("abc!",1);
    Assertions.assertEquals("abc!",result);
}

@Test
    public void testShiftZero(){
    CaesarShiftCipher cipher = new CaesarShiftCipher();
    String result = cipher.encode("abc",0);
    Assertions.assertEquals("abc",result);
}
}
