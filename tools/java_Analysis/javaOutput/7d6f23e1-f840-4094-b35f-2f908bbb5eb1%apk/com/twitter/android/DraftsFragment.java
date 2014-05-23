package com.twitter.android;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import be;
import com.twitter.android.client.g;
import com.twitter.android.client.j;
import com.twitter.android.provider.az;

public class DraftsFragment extends BaseListFragment
{
  private static final String[] a = { "_id", "g_status_id", "in_r_status_id", "content", "entities" };
  private j b;
  private cs c;
  private String d;
  private boolean e;
  private Button f;

  public DraftsFragment()
  {
  }

  public final void a(Loader paramLoader, Cursor paramCursor)
  {
    this.c.swapCursor(paramCursor);
    Button localButton;
    if (this.f != null)
    {
      localButton = this.f;
      if (this.c.isEmpty())
        break label48;
    }
    label48: for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      c(3);
      return;
    }
  }

  protected final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    Cursor localCursor = (Cursor)paramListView.getItemAtPosition(paramInt);
    Intent localIntent = new Intent().putExtra("draft_id", localCursor.getLong(1)).putExtra("entities", be.a(localCursor.getBlob(4))).putExtra("android.intent.extra.UID", localCursor.getLong(2)).putExtra("android.intent.extra.TEXT", localCursor.getString(3));
    FragmentActivity localFragmentActivity = getActivity();
    if (this.e)
    {
      localIntent.setClass(localFragmentActivity, PostActivity.class).putExtra("account_name", this.d).putExtra("return_to_drafts", true);
      startActivity(localIntent);
      return;
    }
    localFragmentActivity.setResult(-1, localIntent);
    localFragmentActivity.finish();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.c == null)
      this.c = new cs(this, getActivity());
    this.p.setAdapter(this.c);
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.f = ((Button)paramActivity.findViewById(2131165255));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    String str = localBundle.getString("account_name");
    this.e = localBundle.getBoolean("return_to_drafts", false);
    if (TextUtils.isEmpty(str))
    {
      this.b = this.j.f();
      this.d = this.b.e();
      return;
    }
    this.b = this.j.b(str);
    this.d = str;
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    String str = String.valueOf(this.b.g());
    return new CursorLoader(getActivity(), az.l.buildUpon().appendEncodedPath(str).appendQueryParameter("ownerId", str).build(), a, null, null, null);
  }

  public void onLoaderReset(Loader paramLoader)
  {
    this.c.swapCursor(null);
  }

  public void onResume()
  {
    super.onResume();
    if (this.c.getCursor() == null)
    {
      getLoaderManager().initLoader(0, null, this);
      f(3);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.DraftsFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
