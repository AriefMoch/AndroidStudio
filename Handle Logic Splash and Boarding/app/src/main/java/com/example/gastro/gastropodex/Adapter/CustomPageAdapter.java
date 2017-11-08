package com.example.gastro.gastropodex.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gastro.gastropodex.Model.ModelObject;

/**
 * Created by gastro on 11/3/17.
 */

public class CustomPageAdapter extends PagerAdapter {

    private Context mContext;
    public CustomPageAdapter (Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position){
        ModelObject modelObject = ModelObject.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection,int position, Object view){
        collection.removeView((View)view);
    }

    @Override
    public int getCount(){
        return ModelObject.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position){
        ModelObject customPagerEnum = ModelObject.values()[position];
        return
                mContext.getString(customPagerEnum.getTitleResId());
    }
}
