package badkeyboard;

import org.junit.Assert;
import org.junit.Test;

public class BadKeyBoardTest {

    @Test
    public void testKeyBoard() {
        BadKeyBoard keyBoard = new BadKeyBoard();

        String receivedText = keyBoard.receivedText("HE*<LL>O");

        Assert.assertEquals("LLHO", receivedText);
    }

    @Test
    public void testKeyBoardWithNumbers() {
        BadKeyBoard keyBoard = new BadKeyBoard();

        String receivedText = keyBoard.receivedText("HE*<LL>O<123#456>#*123");

        Assert.assertEquals("123LLH123", receivedText);
    }

    @Test
    public void testKeyBoardWithRandomTestInput() {
        BadKeyBoard keyBoard = new BadKeyBoard();

        String receivedText = keyBoard.receivedText("*1******1");

        System.out.println(receivedText);
    }
}