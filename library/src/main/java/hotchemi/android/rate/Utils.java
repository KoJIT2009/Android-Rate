package hotchemi.android.rate;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.v7.app.AlertDialog;

final class Utils {

    private Utils() {
    }

    static boolean underHoneyComb() {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB;
    }

    static boolean isLollipopOrHigh() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    static int getDialogTheme() {
        return isLollipopOrHigh() ? R.style.CustomLollipopDialogStyle : 0;
    }

    @SuppressLint("NewApi")
    static AlertDialog.Builder getDialogBuilder(Context context) {
        if (underHoneyComb()) {
            return new AlertDialog.Builder(context);
        } else {
            return new AlertDialog.Builder(context, getDialogTheme());
        }
    }

}
