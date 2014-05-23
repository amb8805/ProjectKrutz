package com.twitter.android;

import ad;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class bb extends i
{
  private bb(MessagesThreadActivity paramMessagesThreadActivity)
  {
  }

  public final void b(j paramj, String paramString1, int paramInt, String paramString2, ad paramad)
  {
    Button localButton;
    if (this.a.d(paramString1) != null)
      switch (paramInt)
      {
      default:
        this.a.showDialog(1);
        this.a.e.setEnabled(true);
        localButton = this.a.f;
        if (paramInt == 200);
      case 200:
      case 403:
      case 404:
      }
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      this.a.b(false);
      return;
      if (this.a.c == null)
      {
        this.a.finish();
        return;
      }
      Cursor localCursor = this.a.c.getCursor();
      if (localCursor != null)
      {
        localCursor.requery();
        ListView localListView = this.a.getListView();
        localListView.setSelection(localListView.getCount() - 1);
        this.a.e.setText(null);
      }
      if ((0x1 & paramad.q) != 0)
        break;
      Intent localIntent = new Intent(this.a, DialogActivity.class);
      localIntent.setAction("start");
      localIntent.putExtra("username", paramad.g);
      localIntent.putExtra("user_id", paramad.a);
      this.a.startActivity(localIntent);
      break;
      Toast.makeText(this.a, 2131427493, 0).show();
      break;
      Toast.makeText(this.a, 2131427493, 0).show();
      break;
    }
  }

  public final void f(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if (this.a.d(paramString1) != null)
      this.a.finish();
  }

  public final void g(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if (this.a.d(paramString1) != null)
    {
      Toast.makeText(this.a, 2131427625, 0).show();
      Cursor localCursor = this.a.c.getCursor();
      if (localCursor != null)
        localCursor.requery();
      this.a.b(false);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
