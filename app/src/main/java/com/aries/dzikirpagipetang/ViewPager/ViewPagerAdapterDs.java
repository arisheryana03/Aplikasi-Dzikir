package com.aries.dzikirpagipetang.ViewPager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import com.aries.dzikirpagipetang.Activity.DzikirSholatActivity;
import com.aries.dzikirpagipetang.R;

public class ViewPagerAdapterDs extends PagerAdapter {
    String juduldzikir[];
    String keterangandzikir[];
    String keteranganarti[];
    DzikirSholatActivity context;

    LayoutInflater inflater;

    public ViewPagerAdapterDs(DzikirSholatActivity dzikirSholatActivity, String[] juduldzikir, String[] keterangandzikir, String[] keteranganarti ) {

        this.context = dzikirSholatActivity;
        this.juduldzikir = juduldzikir;
        this.keterangandzikir = keterangandzikir;
        this.keteranganarti = keteranganarti;
    }

    @Override
    public int getCount() {
        return juduldzikir.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_sholat, container, false);

        TextView jdldzikir = view.findViewById(R.id.juduldzikir);
        TextView ktrngdzikir = view.findViewById(R.id.keterangandzikir);
        TextView ktrngarti = view.findViewById(R.id.keteranganarti);

        jdldzikir.setText(juduldzikir[position]);
        ktrngdzikir.setText(keterangandzikir[position]);
        ktrngarti.setText(keteranganarti[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int positon, Object object) {
        container.removeView((LinearLayout) object);
    }
}
