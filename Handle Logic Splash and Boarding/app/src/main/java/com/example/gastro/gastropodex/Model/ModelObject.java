package com.example.gastro.gastropodex.Model;

import com.example.gastro.gastropodex.R;

/**
 * Created by gastro on 11/3/17.
 */

public enum  ModelObject {
    RED(R.string.app_name, R.layout.view_red),
    BLUE(R.string.app_name, R.layout.view_blue),
    GREEN(R.string.app_name, R.layout.view_green);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId){
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId(){
        return mTitleResId;
    }

    public int getLayoutResId(){
        return mLayoutResId;
    }
}
