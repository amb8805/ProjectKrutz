package com.twitter.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.service.j;
import com.twitter.android.widget.PopupEditText;

public class SignUpActivity extends BaseActivity
  implements TextWatcher, View.OnFocusChangeListener
{
  EditText d;
  EditText e;
  PopupEditText f;
  EditText g;
  TextView h;
  TextView i;
  TextView j;
  TextView k;
  String l;
  Bitmap m;
  String n;
  int o;
  int p;
  int q;
  int r;
  es s;
  private int t;
  private int u;
  private Button v;
  private Drawable w;
  private dw x = new dw(this);

  public SignUpActivity()
  {
    super(false);
  }

  private int a(EditText paramEditText, TextView paramTextView)
  {
    a(paramEditText, false);
    a(paramEditText, paramTextView, null);
    if (paramEditText.length() > 0)
      return 2;
    return 0;
  }

  private static boolean a(int paramInt, EditText paramEditText, TextView paramTextView)
  {
    return (paramInt == 0) && (paramEditText.length() > 0) && (paramTextView.getVisibility() != 0);
  }

  final void a(EditText paramEditText, TextView paramTextView, String paramString)
  {
    if (paramString != null)
    {
      paramEditText.setTextColor(this.t);
      paramTextView.setText(paramString);
      paramTextView.setVisibility(0);
      return;
    }
    paramEditText.setTextColor(this.u);
    paramTextView.setVisibility(8);
  }

  final void a(EditText paramEditText, boolean paramBoolean)
  {
    Drawable[] arrayOfDrawable = paramEditText.getCompoundDrawables();
    if (arrayOfDrawable == null);
    for (Drawable localDrawable = null; paramBoolean; localDrawable = arrayOfDrawable[0])
    {
      paramEditText.setCompoundDrawablesWithIntrinsicBounds(localDrawable, null, this.w, null);
      return;
    }
    paramEditText.setCompoundDrawablesWithIntrinsicBounds(localDrawable, null, null, null);
  }

  public void afterTextChanged(Editable paramEditable)
  {
    int i2;
    int i3;
    if (paramEditable.equals(this.d.getText()))
    {
      int i6 = a(this.d, this.h);
      this.o = i6;
      i2 = i6;
      i3 = 1;
    }
    while (true)
    {
      if (i2 == 2)
      {
        dw localdw = this.x;
        localdw.removeMessages(i3);
        localdw.sendEmptyMessageDelayed(i3, 500L);
      }
      c();
      return;
      if (paramEditable.equals(this.e.getText()))
      {
        int i5 = a(this.e, this.i);
        this.p = i5;
        i2 = i5;
        i3 = 2;
      }
      else
      {
        if (paramEditable.equals(this.f.getText()))
        {
          if (b())
            this.f.a();
          while (true)
          {
            int i4 = a(this.f, this.j);
            this.q = i4;
            i2 = i4;
            i3 = 3;
            break;
            this.f.b();
          }
        }
        int i1 = a(this.g, this.k);
        this.r = i1;
        i2 = i1;
        i3 = 4;
      }
    }
  }

  final boolean b()
  {
    return (this.f.hasFocus()) && (this.f.length() == 0);
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  final void c()
  {
    Button localButton = this.v;
    if ((this.o == 1) && (this.p == 1) && (this.q == 1) && (this.r == 1));
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }

  final void d()
  {
    showDialog(1);
    a(this.a.a(this.d.getText().toString(), this.f.getText().toString(), this.e.getText().toString(), this.g.getText().toString(), this.l, this.n));
  }

  final void e()
  {
    Toast.makeText(this, 2131427591, 1).show();
  }

  final void f()
  {
    if ((this.e.length() > 0) && (this.d.length() > 0))
      a(this.a.a(null, this.d.getText().toString(), this.e.getText().toString()));
  }

  public void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165313:
    }
    d();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903094);
    Resources localResources = getResources();
    this.w = localResources.getDrawable(2130837708);
    this.u = localResources.getColor(17170444);
    this.t = localResources.getColor(2131361810);
    MovementMethod localMovementMethod = LinkMovementMethod.getInstance();
    ((TextView)findViewById(2131165314)).setMovementMethod(localMovementMethod);
    this.d = ((EditText)findViewById(2131165306));
    this.e = ((EditText)findViewById(2131165308));
    this.f = ((PopupEditText)findViewById(2131165225));
    this.g = ((EditText)findViewById(2131165311));
    this.s = new es(this);
    this.f.a(this.s);
    this.e.setOnFocusChangeListener(this);
    this.f.setOnFocusChangeListener(this);
    this.g.setOnFocusChangeListener(this);
    this.h = ((TextView)findViewById(2131165307));
    this.i = ((TextView)findViewById(2131165309));
    this.j = ((TextView)findViewById(2131165310));
    this.k = ((TextView)findViewById(2131165312));
    this.v = ((Button)findViewById(2131165313));
    this.d.addTextChangedListener(this);
    this.e.addTextChangedListener(this);
    this.f.addTextChangedListener(this);
    this.g.addTextChangedListener(this);
    this.g.setTypeface(Typeface.DEFAULT);
    this.b = new ch(this, null);
    if (paramBundle == null)
      this.a.a(this.a.e(), j.F);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
      ProgressDialog localProgressDialog = new ProgressDialog(this);
      localProgressDialog.setProgressStyle(0);
      localProgressDialog.setMessage(getText(2131427588));
      localProgressDialog.setIndeterminate(true);
      localProgressDialog.setCancelable(false);
      return localProgressDialog;
    case 2:
    }
    View localView = LayoutInflater.from(this).inflate(2130903050, null);
    u localu = new u(this);
    return new AlertDialog.Builder(this).setIcon(17301659).setTitle(2131427589).setView(localView).setPositiveButton(2131427575, localu).setNegativeButton(2131427504, localu).create();
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    switch (paramView.getId())
    {
    default:
    case 2131165308:
    case 2131165225:
    case 2131165311:
    }
    do
    {
      do
      {
        do
          return;
        while ((paramBoolean) || (!a(this.p, this.e, this.i)));
        this.i.setText(2131427686);
        this.i.setVisibility(0);
        a(this.e, this.i, getString(2131427686));
        return;
        if ((paramBoolean) && (this.f.length() == 0))
        {
          this.f.a();
          return;
        }
      }
      while ((paramBoolean) || (!a(this.q, this.f, this.j)));
      a(this.f, this.j, getString(2131427687));
      return;
    }
    while ((paramBoolean) || (!a(this.r, this.g, this.k)));
    a(this.g, this.k, getString(2131427688));
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
      super.onPrepareDialog(paramInt, paramDialog);
      return;
    case 2:
    }
    AlertDialog localAlertDialog = (AlertDialog)paramDialog;
    ((ImageView)localAlertDialog.findViewById(2131165238)).setImageBitmap(this.m);
    ((EditText)localAlertDialog.findViewById(2131165239)).setText(null);
  }

  public boolean onSearchRequested()
  {
    return false;
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SignUpActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
