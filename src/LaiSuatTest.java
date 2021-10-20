import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaiSuatTest {
    LaiSuat tongTien = new LaiSuat();

//    Test cua kiem thu lop tuong duong
    @Test
    void test1(){
        assertEquals(tongTien.tongTienLai(2000000, 3, 90),21000 );
    }
    @Test
    void test2(){
        assertEquals(tongTien.tongTienLai(2000000, 3, -5),-1 );
    }
    @Test
    void test3(){
        assertEquals(tongTien.tongTienLai(2000000, 9, 90),-1 );
    }
    @Test
    void test4(){
        assertEquals(tongTien.tongTienLai(2000000, 9, -5),-1 );
    }
    @Test
    void test5(){
        assertEquals(tongTien.tongTienLai(50000, 3, 90),-1 );
    }
    @Test
    void test6(){
        assertEquals(tongTien.tongTienLai(50000, 3, -5),-1 );
    }
    @Test
    void test7(){
        assertEquals(tongTien.tongTienLai(50000, 9, 90),-1 );
    }
    @Test
    void test8(){
        assertEquals(tongTien.tongTienLai(50000, 3, -5),-1);
    }

//    Test cua kiem thu bang quyet dinh
    @Test
    void test9(){
    assertEquals(tongTien.tongTienLai(2000000, 0, -5),-1 );
}
    @Test
    void test10(){
        assertEquals(tongTien.tongTienLai(2000000, 1, -5),-1 );
    }
    @Test
    void test11(){
        assertEquals(tongTien.tongTienLai(2000000, 3, -5),-1 );
    }
    @Test
    void test12(){
        assertEquals(tongTien.tongTienLai(2000000, 6, -5),-1 );
    }
    @Test
    void test13(){
        assertEquals(tongTien.tongTienLai(2000000, 12, -5),-1 );
    }
    @Test
    void test14(){
        assertEquals(tongTien.tongTienLai(2000000, 9, -5),-1 );
    }
    @Test
    void test15(){
        assertEquals(tongTien.tongTienLai(50000, 0, -5),-1 );
    }
    @Test
    void test16(){
        assertEquals(tongTien.tongTienLai(50000, 1, -5),-1 );
    }
    @Test
    void test17(){
        assertEquals(tongTien.tongTienLai(50000, 3, -5),-1 );
    }
    @Test
    void test18(){
        assertEquals(tongTien.tongTienLai(50000, 6, -5),-1 );
    }
    @Test
    void test19(){
        assertEquals(tongTien.tongTienLai(50000, 12, -5),-1 );
    }
    @Test
    void test20(){
        assertEquals(tongTien.tongTienLai(50000, 9, -5),-1 );
    }
    @Test
    void test21(){
        assertEquals(tongTien.tongTienLai(2000000, 0, 90),4000 );
    }
    @Test
    void test22(){
        assertEquals(tongTien.tongTienLai(2000000, 1, 90),15000 );
    }
    @Test
    void test22fix(){
        assertEquals(tongTien.tongTienLai(2000000, 1, 90),5000 );
    }
    @Test
    void test23(){
        assertEquals(tongTien.tongTienLai(2000000, 3, 90),21000 );
    }
    @Test
    void test24(){
        assertEquals(tongTien.tongTienLai(2000000, 6, 90),54000 );
    }
    @Test
    void test25(){
        assertEquals(tongTien.tongTienLai(2000000, 12, 90),133833.33333333334 );
    }
    @Test
    void test26(){
        assertEquals(tongTien.tongTienLai(50000, 9, 90),-1 );
    }
    @Test
    void test27(){
        assertEquals(tongTien.tongTienLai(50000, 0, 90),-1 );
    }
    @Test
    void test28(){
        assertEquals(tongTien.tongTienLai(50000, 1, 90),-1 );
    }
    @Test
    void test29(){
        assertEquals(tongTien.tongTienLai(50000, 3, 90),-1 );
    }
    @Test
    void test30(){
        assertEquals(tongTien.tongTienLai(50000, 6, 90),-1 );
    }
    @Test
    void test31(){
        assertEquals(tongTien.tongTienLai(50000, 12, 90),-1 );
    }
    @Test
    void test32(){
        assertEquals(tongTien.tongTienLai(50000, 9, 90),-1 );
    }


}