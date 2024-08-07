import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class Level1Test {

    @Test
    public void test1() {
        String[] wres = {".+..","..+.",".+.."};
        String[] res = Level1.TreeOfLife(3,4, 12, wres);
        assertArrayEquals (wres, res);
    }

    @Test
    public void test2() {
        String[] wres = {".+..","..+.",".+.."};
        String[] res = Level1.TreeOfLife(3,4, 4, wres);
        assertArrayEquals (wres, res);
    }

    @Test
    public void test5() {
        String[] ish = {"..+..","...+.","..+..","..+.."};

        String[] wres = {"+++++","+++++","+++++","+++++"};

        String[] res = Level1.TreeOfLife(4,5, 5, wres);
        assertArrayEquals (wres, res);
    }

    @Test
    public void test6() {
        String[] ish = {"+...+","++.++","+...+","+...+"};

        String[] wres = {"..+..",".....","..+..","..+.."};

        String[] res = Level1.TreeOfLife(4,5, 6, ish);
        assertArrayEquals (wres, res);
    }


    @Test
    public void test7() {
        String[] ish = {".......","...+...","....+..",".......","++.....","++....."};

        String[] wres = {".......","...+...","....+..",".......","++.....","++....."};

        String[] res = Level1.TreeOfLife(6,7, 24, ish);
        assertArrayEquals (wres, res);
    }
    
}
