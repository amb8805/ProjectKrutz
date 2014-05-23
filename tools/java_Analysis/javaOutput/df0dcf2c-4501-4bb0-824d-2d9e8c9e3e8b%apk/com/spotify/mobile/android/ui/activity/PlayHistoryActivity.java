package com.spotify.mobile.android.ui.activity;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import com.spotify.mobile.android.ui.adapter.ad;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dv;

public class PlayHistoryActivity extends BaseFragmentActivity
{
  private ad n;
  private TrackMenuDelegate o = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.b, TrackMenuDelegate.CanBrowseArtist.b, TrackMenuDelegate.CanRemoveFromCollection.b, TrackMenuDelegate.CanRemoveTrack.b, new PlayHistoryActivity.1(this));
  private View.OnCreateContextMenuListener p = new PlayHistoryActivity.3(this);
  private AdapterView.OnItemClickListener q = new PlayHistoryActivity.4(this);
  private o<Cursor> r = new PlayHistoryActivity.5(this);

  public PlayHistoryActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903238);
    this.n = new ad(this);
    d().a(2131362134, null, this.r);
    ListView localListView = (ListView)findViewById(16908298);
    localListView.setAdapter(this.n);
    localListView.setOnCreateContextMenuListener(this.p);
    localListView.setOnItemClickListener(this.q);
    ((ImageButton)findViewById(2131362265)).setOnClickListener(new PlayHistoryActivity.2(this));
    a(dv.a(this, ViewUri.v));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.PlayHistoryActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
