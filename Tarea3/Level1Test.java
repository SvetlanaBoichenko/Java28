import org.junit.jupiter.api.Test;
//import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

class Level1Test {


 @Test
 public void testembarco() {
  int n = 3;
  int m = 4;
  int [] batcoord = {1,2, 1,2, 1,1, 2,1};

  int[][] resocup = {{2,2,0,0}, {2,0,0,0}, {0,0,0,0} };

  int [][] resfunc2 = Level1.desembarco (n,m,batcoord);

  assertArrayEquals (resocup, resfunc2);
 }

 @Test
 public void testset1() {
  int [][] bat =  {{0,2}, {2,0}} ;
  int [][] resbat =  {{1,1}, {1,1}} ;
  int [][] resbat2 = Level1.set1(2,2,bat);
  assertArrayEquals(resbat2, resbat);
 }

  @Test
  public void testConq1() {
  int [] bat =  {};
   assertTrue(Level1.ConquestCampaign(3,4, 0, bat) == 0);
  }


 @Test
 public void testConq2() {
  int [] bat =  {1,1, 6,6};
  assertTrue(Level1.ConquestCampaign(6, 6, 2, bat) == 6);
 }

 @Test
 public void testConq3() {
  int [] bat =  {5,5, 6,6};
  assertTrue(Level1.ConquestCampaign(6, 6, 2, bat) == 9);
 }

 @Test
 public void testConq4() {
  int [] bat =  {1,1, 1,1};
  assertTrue(Level1.ConquestCampaign(6, 6, 1, bat) == 11);
 }

 @Test
 public void testConq5() {
  int [] bat =  {1,1, 1,1};
  assertTrue(Level1.ConquestCampaign(3, 4, 1, bat) == 6);
 }

 @Test
 public void testConq6() {
  int [] bat =  {1,1, 1,2, 2,1, 2,2};
  assertTrue(Level1.ConquestCampaign(2, 2, 4, bat) == 1);
 }

}
