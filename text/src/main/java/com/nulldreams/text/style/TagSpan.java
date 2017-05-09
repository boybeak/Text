package com.nulldreams.text.style;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/**
 * Created by boybe on 2017/5/9.
 */

public class TagSpan extends ClickableSpan {

    @Override
    public void onClick(View widget) {

    }

    @Override
    public void updateDrawState(TextPaint ds) {
        super.updateDrawState(ds);
    }
}
