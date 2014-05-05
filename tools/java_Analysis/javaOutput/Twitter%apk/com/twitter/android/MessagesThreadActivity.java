package com.twitter.android;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.twitter.android.client.g;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.aj;
import com.twitter.android.widget.Navbar;
import dl;
import dz;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessagesThreadActivity extends BaseListActivity
  implements TextWatcher, AdapterView.OnItemLongClickListener, TextView.OnEditorActionListener, com.twitter.android.widget.o
{
  private static final String[] h = { "_id", "msg_id", "sender_id", "content", "created", "s_profile_image_url", "entities" };
  EditText e;
  Button f;
  String g;
  private TextView i;
  private ProgressBar j;
  private int k;
  private AutoCompleteTextView l;
  private em m;
  private long n;

  public MessagesThreadActivity()
  {
  }

  private boolean f()
  {
    int i1 = this.e.length() + this.k;
    return ((this.l == null) || (!TextUtils.isEmpty(this.g))) && (i1 > 0) && (i1 <= 140);
  }

  public final void a(dl paramdl)
  {
    BaseActivity.a(this, paramdl, this.a.e());
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (this.m != null)
    {
      this.m.notifyDataSetChanged();
      return;
    }
    super.a(paramdz, paramHashMap);
  }

  public final void a(String paramString)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    Matcher localMatcher = ag.b.matcher(paramEditable);
    int i1 = 0;
    while (localMatcher.find())
      i1 += this.a.c(localMatcher.group());
    this.k = i1;
    this.i.setText(Integer.toString(140 - (i1 + paramEditable.length())));
    d();
  }

  public final void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      super.b(paramInt);
      return;
    case 2131165255:
    }
    ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.e.getWindowToken(), 0);
    e();
  }

  final void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.i.setVisibility(8);
      this.j.setVisibility(0);
      return;
    }
    this.i.setVisibility(0);
    this.j.setVisibility(8);
  }

  public final void b_(long paramLong)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void c(long paramLong)
  {
  }

  final void d()
  {
    this.f.setEnabled(f());
  }

  final void e()
  {
    this.e.setEnabled(false);
    this.f.setEnabled(false);
    b(true);
    String str1 = this.e.getText().toString().trim();
    if (this.g == null);
    for (String str2 = this.a.a(this.n, str1); ; str2 = this.a.b(this.g, str1))
    {
      c(str2);
      return;
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1)
      return;
    switch (paramInt1)
    {
    default:
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    case 1:
    }
    String str = paramIntent.getStringExtra("username");
    this.l.setText(str);
    this.e.requestFocus();
  }

  public final void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165282:
    }
    Intent localIntent = new Intent(this, UsersActivity.class);
    localIntent.setAction("android.intent.action.PICK");
    localIntent.putExtra("type", 1);
    startActivityForResult(localIntent, 1);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903082, false, true);
    if (!this.a.h())
      return;
    Navbar localNavbar = this.d;
    this.e = ((EditText)findViewById(2131165283));
    this.e.addTextChangedListener(this);
    this.e.setOnEditorActionListener(this);
    this.f = ((Button)localNavbar.findViewById(2131165255));
    this.f.setText(2131427489);
    this.j = ((ProgressBar)localNavbar.findViewById(2131165280));
    this.i = ((TextView)localNavbar.findViewById(2131165279));
    this.i.setText(Integer.toString(140));
    Intent localIntent = getIntent();
    this.n = localIntent.getLongExtra("user_id", 0L);
    this.g = localIntent.getStringExtra("user_name");
    long l1 = localIntent.getLongExtra("owner_id", 0L);
    AutoCompleteTextView localAutoCompleteTextView;
    if (this.n == 0L)
    {
      localAutoCompleteTextView = (AutoCompleteTextView)findViewById(2131165281);
      localAutoCompleteTextView.addTextChangedListener(new ag(this));
      String str2 = String.valueOf(l1);
      this.m = new em(this, aj.h.buildUpon().appendEncodedPath(str2).appendQueryParameter("ownerId", str2).build(), this.a);
      localAutoCompleteTextView.setAdapter(this.m);
      this.l = localAutoCompleteTextView;
      a(2131427531);
      if (!TextUtils.isEmpty(this.g))
      {
        localAutoCompleteTextView.setText(this.g);
        this.e.requestFocus();
      }
    }
    while (true)
    {
      this.b = new bb(this, null);
      return;
      localAutoCompleteTextView.requestFocus();
      continue;
      long l2 = this.n;
      String str1 = Math.min(l2, l1) + ":" + Math.max(l2, l1);
      Cursor localCursor = managedQuery(aa.a(com.twitter.android.provider.o.a, this.a.e()), h, "thread=?", new String[] { str1 }, null);
      getListView().setOnItemLongClickListener(this);
      az localaz = new az(this, localCursor);
      this.c = localaz;
      setListAdapter(localaz);
      b(this.g);
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
      ah localah = new ah(this);
      return new AlertDialog.Builder(this).setTitle(2131427487).setMessage(2131427491).setPositiveButton(2131427508, localah).setNegativeButton(2131427504, null).create();
    case 2:
      ai localai = new ai(this);
      return new AlertDialog.Builder(this).setTitle(2131427613).setIcon(17301543).setMessage(2131427614).setPositiveButton(2131427505, localai).setNegativeButton(2131427506, null).create();
    case 3:
    }
    ak localak = new ak(this);
    return new AlertDialog.Builder(this).setTitle(2131427623).setMessage(2131427624).setIcon(17301543).setPositiveButton(2131427505, localak).setNegativeButton(2131427506, null).create();
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    getMenuInflater().inflate(2131755012, paramMenu);
    return bool;
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (f())
    {
      e();
      return true;
    }
    return false;
  }

  public boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    showDialog(3);
    return true;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165403:
    }
    showDialog(2);
    return true;
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    MenuItem localMenuItem = paramMenu.findItem(2131165403);
    if (this.c != null);
    for (boolean bool = true; ; bool = false)
    {
      localMenuItem.setVisible(bool);
      return super.onPrepareOptionsMenu(paramMenu);
    }
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.MessagesThreadActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
