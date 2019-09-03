package com.wisn.nestedscrolll.simple;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;

/**
 * Created by Wisn on 2019-09-02 18:08.
 */
public class ScrollFrameLayout extends FrameLayout implements NestedScrollingChild, NestedScrollingParent {
    public ScrollFrameLayout(@NonNull Context context) {
        super(context);
    }

    public ScrollFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }





    //NestedScrollingChild


    public void setNestedScrollingEnabled(boolean enabled) {

    }


    public boolean isNestedScrollingEnabled() {
        return false;

    }

    public boolean startNestedScroll(@ViewCompat.ScrollAxis int axes) {
        return false;

    }


    public void stopNestedScroll() {

    }


    public boolean hasNestedScrollingParent() {
        return false;

    }


    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed,
                                        int dxUnconsumed, int dyUnconsumed, @Nullable int[] offsetInWindow) {
        return false;
    }


    public boolean dispatchNestedPreScroll(int dx, int dy, @Nullable int[] consumed,
                                           @Nullable int[] offsetInWindow) {
        return false;
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return false;
    }


    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return false;
    }

}
