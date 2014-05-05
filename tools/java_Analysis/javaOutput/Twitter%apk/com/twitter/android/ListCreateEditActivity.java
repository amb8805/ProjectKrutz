package com.twitter.android;

import ag;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.twitter.android.client.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListCreateEditActivity extends BaseActivity
{
  private long d;
  private TextView e;
  private TextView f;
  private Spinner g;
  private String h;
  private String i;
  private int j;

  public ListCreateEditActivity()
  {
    super(true);
  }

  private int b()
  {
    switch (this.g.getSelectedItemPosition())
    {
    default:
      throw new IllegalArgumentException("Illegal index");
    case 0:
      return 0;
    case 1:
    }
    return 1;
  }

  private boolean c()
  {
    if (!this.e.getText().toString().trim().equals(this.h))
      return true;
    return (!this.f.getText().toString().trim().equals(this.i)) || (this.j != b());
  }

  protected final void a()
  {
    if (c())
    {
      showDialog(2);
      return;
    }
    super.a();
  }

  public void onBackPressed()
  {
    if (c())
    {
      showDialog(1);
      return;
    }
    super.onBackPressed();
  }

  public final void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131165250:
      String str1;
      int k;
      do
      {
        return;
        str1 = this.e.getText().toString().trim().replace(" ", "-");
        if (str1.length() == 0)
        {
          Toast.makeText(this, 2131427456, 0).show();
          return;
        }
        if (!ag.f.matcher(str1).matches())
        {
          Toast.makeText(this, 2131427457, 1).show();
          return;
        }
        this.e.setText(str1);
        k = b();
        if (this.d <= 0L)
          break;
      }
      while (!c());
      this.a.a(this.d, str1, k, this.f.getText().toString());
      while (true)
      {
        Intent localIntent = new Intent();
        String str2 = this.e.getText().toString().trim();
        localIntent.putExtra("name", str2);
        String str3 = getIntent().getStringExtra("full_name");
        if (str3 != null)
        {
          int m = str3.lastIndexOf('/');
          if (m > 0)
            localIntent.putExtra("full_name", str3.substring(0, m + 1) + str2);
        }
        localIntent.putExtra("description", this.f.getText().toString().trim());
        localIntent.putExtra("mode", b());
        setResult(-1, localIntent);
        finish();
        return;
        this.a.a(str1, k, this.f.getText().toString());
      }
    case 2131165251:
    }
    if (c())
    {
      showDialog(1);
      return;
    }
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903056);
    if (!this.a.h())
      return;
    this.e = ((TextView)findViewById(2131165247));
    this.f = ((TextView)findViewById(2131165248));
    this.g = ((Spinner)findViewById(2131165249));
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this, 17367048);
    localArrayAdapter.setDropDownViewResource(17367049);
    localArrayAdapter.add(getString(2131427450));
    localArrayAdapter.add(getString(2131427449));
    this.g.setAdapter(localArrayAdapter);
    this.g.setPromptId(2131427448);
    Intent localIntent = getIntent();
    if (localIntent.hasExtra("list_id"))
    {
      this.d = localIntent.getLongExtra("list_id", -1L);
      this.h = localIntent.getStringExtra("name");
      this.i = localIntent.getStringExtra("description");
      this.j = localIntent.getIntExtra("mode", 0);
      this.e.setText(this.h);
      this.f.setText(this.i);
      switch (this.j)
      {
      default:
        a(2131427441);
      case 0:
      case 1:
      }
    }
    while (true)
    {
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new InputFilter.LengthFilter(25);
      this.e.setFilters(arrayOfInputFilter);
      return;
      this.g.setSelection(0);
      break;
      this.g.setSelection(1);
      break;
      this.h = "";
      this.i = "";
      this.j = 0;
      a(2131427452);
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    case 2:
    }
    ax localax = new ax(this, paramInt);
    if (this.d > 0L);
    for (String str = getString(2131427441); ; str = getString(2131427452))
      return new AlertDialog.Builder(this).setTitle(str).setIcon(17301659).setMessage(2131427455).setPositiveButton(2131427505, localax).setNegativeButton(2131427506, null).create();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ListCreateEditActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
