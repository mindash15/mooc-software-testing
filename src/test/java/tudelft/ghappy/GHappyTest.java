package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
@Test
    public void testHappyGG(){
    GHappy gh = new GHappy();
    Assertions.assertTrue(gh.gHappy("xxggxx"));

}

@Test
    public void testLonelyG(){
    GHappy gh = new GHappy();
    Assertions.assertFalse(gh.gHappy("xxgxx"));
}


@Test
    public void testLastGIsLonely(){
    GHappy gh = new GHappy();
    Assertions.assertFalse(gh.gHappy("xxggyygxx"));
}

@Test
    public void testEmptyString(){
    GHappy gh = new GHappy();
    Assertions.assertTrue(gh.gHappy(""));
}

@Test
    public void testNoGAtAll(){
    GHappy gh = new GHappy();
    Assertions.assertTrue(gh.gHappy("absdef"));
}

}

