package com.guozhe.android.recyclerview;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guozhe on 2017. 9. 24..
 */

public class Loader {
    public static List<Data> getData(Context context){
        List<Data> result = new ArrayList<>();
        for(int i=1;i<=10;i++){
            Data data =new Data();
            data.title = "사진"+i;
            data.setImage("image"+i, context);
            result.add(data);
        }
        return result;
    }
}
