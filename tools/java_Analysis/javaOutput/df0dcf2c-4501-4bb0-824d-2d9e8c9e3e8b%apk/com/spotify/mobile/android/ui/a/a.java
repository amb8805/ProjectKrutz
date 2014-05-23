package com.spotify.mobile.android.ui.a;

import android.support.v4.app.g;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.fragments.logic.c;
import com.spotify.mobile.android.ui.fragments.logic.d;
import com.spotify.mobile.android.ui.fragments.logic.e;
import com.spotify.mobile.android.ui.fragments.logic.i;
import com.spotify.mobile.android.ui.fragments.logic.j;
import com.spotify.mobile.android.ui.fragments.logic.k;
import com.spotify.mobile.android.ui.fragments.logic.q;
import com.spotify.mobile.android.ui.fragments.logic.t;
import com.spotify.mobile.android.ui.fragments.logic.u;
import com.spotify.mobile.android.util.DialogPresenter;

public final class a
{
  public static void a(g paramg)
  {
    DialogPresenter localDialogPresenter = new DialogPresenter();
    localDialogPresenter.r();
    k localk = new k();
    t localt = new t();
    u localu = new u();
    com.spotify.mobile.android.ui.fragments.logic.l locall = new com.spotify.mobile.android.ui.fragments.logic.l();
    j localj = new j();
    d locald = new d();
    e locale = new e();
    q localq = new q();
    com.spotify.mobile.android.ui.fragments.logic.a locala = new com.spotify.mobile.android.ui.fragments.logic.a();
    com.spotify.mobile.android.spotlets.suggestedtweet.a locala1 = new com.spotify.mobile.android.spotlets.suggestedtweet.a();
    c localc = new c();
    paramg.a().a(localDialogPresenter, "dialog_presenter").a(localk, "trial_fragment").a(localt, "settings_dialog_fragment").a(localu, "social_dialog_fragment").a(locall, "playback_error_dialog_fragment").a(localj, "offline_sync_error_fragment").a(locald, "disk_almost_full_fragment").a(locale, "feature_error_fragment").a(localq, "tag_remote_playback_fragment").a(locala, "app_rater_fragment").a(locala1, "cat_feedback_fragment").a(localc, "tag_connect_onboarding_fragment").b();
    localDialogPresenter.a(localu);
    localDialogPresenter.a(localk);
    localDialogPresenter.a(localt);
    localDialogPresenter.a(locall);
    localDialogPresenter.a(localj);
    localDialogPresenter.a(locald);
    localDialogPresenter.a(locale);
    localDialogPresenter.a(localq);
    localDialogPresenter.a(locala);
    localDialogPresenter.a(locala1);
    localDialogPresenter.a(localc);
    if (!FeatureFragment.at.a())
    {
      i locali = new i();
      paramg.a().a(locali, "mft_nux_fragment").b();
      localDialogPresenter.a(locali);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
