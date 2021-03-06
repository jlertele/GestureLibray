package com.lock.util;

import android.content.Context;
import android.graphics.Color;

import com.lock.R;
import com.r0adkll.slidr.model.SlidrConfig;
import com.r0adkll.slidr.model.SlidrListener;
import com.r0adkll.slidr.model.SlidrPosition;

/**
 * Created by leo on 16/4/6.
 */
public class SlidrUtil {

    /**
     * 获取手势返回上一页库配置
     */
    public static SlidrConfig getConfig(Context context, SlidrListener slidrListener) {
        SlidrConfig config = new SlidrConfig.Builder()
                .primaryColor(context.getResources().getColor(R.color.colorPrimary, null))
                .secondaryColor(context.getResources().getColor(R.color.colorPrimaryDark, null))
                .position(SlidrPosition.LEFT)
                .sensitivity(1f)
                .scrimColor(Color.BLACK)
                .scrimStartAlpha(0.8f)
                .scrimEndAlpha(0f)
                .velocityThreshold(2400)
                .distanceThreshold(0.25f)
                .listener(slidrListener)
                .edge(true)
                .edgeSize(0.18f)
                .build();
        return config;
    }
}
