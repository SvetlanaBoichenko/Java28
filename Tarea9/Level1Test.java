import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class Level1Test {

    @Test
    public void testCod1() {
        String waitstr = "омоюу толл дюиа акчп йрьк";
        String str = Level1.Codirovka  ("отдай мою кроличью лапку");

        assertTrue (str.equals(waitstr));
    }
    @Test
    public void testCod2() {
        String waitstr = "Оалхт ссалы етви нуыц ьпсв ниое";
        String str = Level1.Codirovka("Осень наступила высохли цветы");

        assertTrue(str.equals(waitstr));
    }
    @Test
    public void testCod8() {
        String waitstr = "Осеньнаступилавысохлицветы";
        String str = Level1.Codirovka("Осень наступила высохли цветы");
        String str2 = Level1.DeCodirovka(str);

        assertTrue(str2.equals(waitstr));
    }
    @Test
    public void testCod3() {
        String waitstr = "Варг сгид еова гвс дое";
        String str = Level1.Codirovka("Всегда говори всегда");

        assertTrue(str.equals(waitstr));
    }
    @Test
    public void testCod13() {
        String waitstr = "Всегдаговоривсегда";
        String str = Level1.DeCodirovka("Варг сгид еова гвс дое");

        assertTrue(str.equals(waitstr));
    }

    @Test
    public void testCod4() {
        String waitstr = "Стн вла еа";
        String str = Level1.Codirovka("Светлана");

        assertTrue(str.equals(waitstr));
    }


    @Test
    public void testCod6() {
        String waitstr = "отдаймоюкроличьюлапку";
        String str = Level1.DeCodirovka("омоюу толл дюиа акчп йрьк");

        assertTrue(str.equals(waitstr));
    }

    @Test
    public void testCod7() {
        String waitstr = "КакупоительнывРоссиивечера!!";
        String str = Level1.Codirovka("Как упоительны в России вечера!!");
        String str2 = Level1.DeCodirovka(str);

        assertTrue(str2.equals(waitstr));
    }
}