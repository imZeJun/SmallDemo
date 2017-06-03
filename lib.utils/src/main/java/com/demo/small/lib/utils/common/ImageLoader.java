package com.demo.small.lib.utils.common;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class ImageLoader {

    public static void loadImage(Context context, String imgUrl, ImageView img) {
        Glide.with(context).load(imgUrl).into(img);
    }
}
