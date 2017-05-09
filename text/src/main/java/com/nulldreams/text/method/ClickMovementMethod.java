package com.nulldreams.text.method;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.widget.TextView;

/**
 * Created by boybe on 2017/5/9.
 */

public class ClickMovementMethod extends LinkMovementMethod {
    @Override
    protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode,
                                        int movementMetaState, KeyEvent event) {
        /*switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_ENTER:
                if (KeyEvent.metaStateHasNoModifiers(movementMetaState)) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN &&
                            event.getRepeatCount() == 0 && action(CLICK, widget, buffer)) {
                        return true;
                    }
                }
                break;
        }
        return super.handleMovementKey(widget, buffer, keyCode, movementMetaState, event);*/
        return false;
    }
}
