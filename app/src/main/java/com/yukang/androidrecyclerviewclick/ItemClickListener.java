package com.yukang.androidrecyclerviewclick;

import android.view.View;

/**
 * Created by simple on 17-3-14.
 */

public interface ItemClickListener {
    void onClick(View view, int position, boolean isLongClick);
}
