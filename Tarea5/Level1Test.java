import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

class Level1Test {
 @Test
 public void tessort() {

  int[] arr1 = new int[]{99, 1, 0, 2, 3, 2, 4, 5, 6, 44, 7, 0, 55, 66};

  int[] resarr = Level1.funcsort(arr1, 14);
  int[] waitarr = {0, 0, 1, 2, 2, 3, 4, 5, 6, 7, 44, 55, 66, 99};

  assertArrayEquals(waitarr, resarr);
 }

 @Test
 public void tessort2() {

  int[] arr1 = new int[]{1};

  int[] resarr = Level1.funcsort(arr1, 1);
  int[] waitarr = {1};

  assertArrayEquals(waitarr, resarr);
 }

 @Test
 public void tessync2() {
  int[] sid = {99, 1, 10, 2, 3, 11, 2, 4, 5, 6};
  int[] tabsal = {300, 500, 100, 150, 150, 700, 150, 900, 400, 600};

  int[] resarr = Level1.SynchronizingTables(10, sid, tabsal);
  int[] waitarr = {900, 100, 600, 150, 150, 700, 150, 300,400, 500};

  assertArrayEquals(waitarr, resarr);

 }

 @Test
 public void tessync1() {
  int[] sid = {99,};
  int[] tabsal = {300};

  int[] resarr = Level1.SynchronizingTables(1, sid, tabsal);
  int[] waitarr = {300};

  assertArrayEquals(waitarr, resarr);

 }
}