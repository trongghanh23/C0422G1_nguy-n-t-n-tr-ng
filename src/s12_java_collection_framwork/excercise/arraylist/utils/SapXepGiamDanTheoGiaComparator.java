package s12_java_collection_framwork.excercise.arraylist.utils;

import s12_java_collection_framwork.excercise.arraylist.modle.SanPham;

import java.util.Comparator;

public class SapXepGiamDanTheoGiaComparator implements Comparator<SanPham> {
    @Override
    public int compare(SanPham o1, SanPham o2) {

        if (o1.getGiaSanPham() - o2.getGiaSanPham() > 0) {
            return -1;
        }else if (o1.getGiaSanPham() - o2.getGiaSanPham() < 0){
            return 1;
        }else {
            return 0;
        }

    }
}
