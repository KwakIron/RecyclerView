package com.guozhe.android.recyclerview;

import android.content.Context;

/**
 * Created by guozhe on 2017. 9. 24..
 */

public class Data {
    public String image;
    public String title;
    public int imageId;
    public void setImage(String str,Context context){
        image = str;
        imageId = context.getResources().getIdentifier(image, "mipmap", context.getPackageName());
    }
}
