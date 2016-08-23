package iterative.com.br.testefino;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.HashMap;
import java.util.Map;

public class FinoPagerAdapter extends FragmentPagerAdapter{

    private static Map<Integer,Integer> mapBg;

    static {
        mapBg = new HashMap<>();

        mapBg.put(0, R.drawable.bg1);
        mapBg.put(1, R.drawable.bg2);
        mapBg.put(2, R.drawable.bg3);
        mapBg.put(3, R.drawable.bg4);
    }

    public FinoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override public Fragment getItem(int position) {
        return FinoFragment.newInstance(mapBg.get(position));
    }

    @Override public int getCount() {
        return 4;
    }

}
