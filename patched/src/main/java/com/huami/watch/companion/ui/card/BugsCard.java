package com.huami.watch.companion.ui.card;

import android.app.Activity;

import com.edotasx.amazfit.Constants;
import com.edotasx.amazfit.R;
import com.huami.watch.util.Log;

import lanchon.dexpatcher.annotation.DexAdd;

/**
 * Created by edoardotassinari on 11/02/18.
 */

@DexAdd
public class BugsCard extends BaseCard {

    public static BaseCard create(Activity activity) {
        return new BugsCard(activity);
    }

    private BugsCard(Activity activity) {
        super(activity);
    }

    @Override
    protected void clickView() {
        Log.d(Constants.TAG, "click");
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.card_bugs;
    }

    @Override
    protected void initView() {

    }

    @Override
    public String tag() {
        return "bugs";
    }
}
