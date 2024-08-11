import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Level1Test {
    @Test
    public void test1() {

    char [][] cha = {{'1','2','3','4','5','6','7','8'},{'2','3','4','5','6','7','8','9'},{'3','4','5','6','7','8','9','1'},{'1','2','3','4','5','6','7','8'} };
    char [][] waitcha = { {'2','1','2','3','4','5','6','7'}, {'3','4','3','4','5','6','7','8'}, {'1','5','6','7','8','9','8','9'}, {'2','3','4','5','6','7','8','1'} };

    Level1.Turn1 (cha, 2);
    assertArrayEquals (cha, waitcha);
    }


    @Test
    public void test2() {
        char [][] cha = {{'1','2','3','4','5','6','7','8'}, {'2','3','4','5','6','7','8','9'} };
        char [][] waitcha = { {'2','1','2','3','4','5','6','7'}, {'3','4','5','6','7','8','9', '8'}};

        Level1.Turn1 (cha, 1);
        assertArrayEquals (cha, waitcha);
    }

    @Test
    public void test3() {
        char [][] cha = {{'1','2','3','4'},{'4','5','6','7'},{'7','8','9','1'},{'1','2','3', '4'},{'4','5','6','7'}, {'5','6','7','8'} };
        char [][] waitcha = { {'4','1','2','3'}, {'7','8','5','4'}, {'1','2','6','7'}, {'4','5','9','1'}, {'5','6','3',4}, {'6','7','8','7'}};

    }


    @Test
    public void test7() {
        String[] S = {"123456","234567","345678", "456789"} ;
        String[] wS = {"321234","454345", "567656", "678987"};

        Level1.MatrixTurn(S, 4, 6, 2);

        assertArrayEquals (S, wS);
    }

    @Test
    public void test9() {
        String[] S = {"123456","234567","345678", "456789"} ;
        String[] wS = {"123456","234567","345678", "456789"};

        Level1.MatrixTurn(S, 4, 6, 16);

        assertArrayEquals (S, wS);
    }


}