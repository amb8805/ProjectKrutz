package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import net.hockeyapp.android.a.a;
import net.hockeyapp.android.c.d;
import net.hockeyapp.android.d.e;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.objects.FeedbackMessage;

public class FeedbackActivity extends Activity
  implements View.OnClickListener
{
  private final int a = 0;
  private Context b;
  private TextView c;
  private EditText d;
  private EditText e;
  private EditText f;
  private EditText g;
  private Button h;
  private Button i;
  private Button j;
  private ScrollView k;
  private LinearLayout l;
  private ListView m;
  private d n;
  private Handler o;
  private net.hockeyapp.android.c.c p;
  private Handler q;
  private String r;
  private ErrorObject s;
  private a t;
  private ArrayList<FeedbackMessage> u;
  private boolean v;
  private String w;

  public FeedbackActivity()
  {
  }

  private void a()
  {
    this.w = e.a().a(this);
    if (this.w == null)
    {
      a(false);
      return;
    }
    a(true);
    a(this.r, null, null, null, null, this.w, this.o, true);
  }

  private void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Handler paramHandler, boolean paramBoolean)
  {
    this.n = new d(this.b, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramHandler, paramBoolean);
    this.n.execute(new Void[0]);
  }

  protected final void a(boolean paramBoolean)
  {
    this.k = ((ScrollView)findViewById(131095));
    this.l = ((LinearLayout)findViewById(131093));
    this.m = ((ListView)findViewById(131094));
    if (paramBoolean)
    {
      this.l.setVisibility(0);
      this.k.setVisibility(8);
      this.c = ((TextView)findViewById(8192));
      this.i = ((Button)findViewById(131088));
      this.i.setOnClickListener(this);
      this.j = ((Button)findViewById(131089));
      this.j.setOnClickListener(this);
      return;
    }
    this.l.setVisibility(8);
    this.k.setVisibility(0);
    this.d = ((EditText)findViewById(8194));
    this.e = ((EditText)findViewById(8196));
    this.f = ((EditText)findViewById(8198));
    this.g = ((EditText)findViewById(8200));
    String str = e.a().b(this.b);
    if (str != null)
    {
      String[] arrayOfString = str.split("\\|");
      if ((arrayOfString != null) && (arrayOfString.length == 3))
      {
        this.d.setText(arrayOfString[0]);
        this.e.setText(arrayOfString[1]);
        this.f.setText(arrayOfString[2]);
      }
      this.g.setText("");
      if (e.a().a(this.b) == null)
        break label336;
      this.f.setVisibility(8);
    }
    while (true)
    {
      this.h = ((Button)findViewById(8201));
      this.h.setOnClickListener(this);
      return;
      this.d.setText("");
      this.e.setText("");
      this.f.setText("");
      break;
      label336: this.f.setVisibility(0);
    }
  }

  public final void b(boolean paramBoolean)
  {
    if (this.h != null)
      this.h.setEnabled(paramBoolean);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 8201:
      b(false);
      if ((this.d.getText().toString().trim().length() <= 0) || (this.e.getText().toString().trim().length() <= 0) || (this.f.getText().toString().trim().length() <= 0) || (this.g.getText().toString().trim().length() <= 0))
      {
        this.s = new ErrorObject();
        this.s.a("Please provide all details");
        showDialog(0);
        b(true);
        return;
      }
      e.a().a(this.b, this.d.getText().toString(), this.e.getText().toString(), this.f.getText().toString());
      a(this.r, this.d.getText().toString(), this.e.getText().toString(), this.f.getText().toString(), this.g.getText().toString(), e.a().a(this.b), this.o, false);
      return;
    case 131088:
      a(false);
      this.v = true;
      return;
    case 131089:
    }
    a(this.r, null, null, null, null, e.a().a(this.b), this.o, true);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(new net.hockeyapp.android.views.c(this));
    setTitle("Feedback");
    this.b = this;
    this.v = false;
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
      this.r = localBundle.getString("url");
    this.o = new FeedbackActivity.2(this);
    this.q = new FeedbackActivity.3(this);
    a();
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 0:
    }
    return new AlertDialog.Builder(this).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(17301543).setPositiveButton("OK", new FeedbackActivity.5(this)).create();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.v)
      {
        this.v = false;
        a();
      }
      while (true)
      {
        return true;
        finish();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    AlertDialog localAlertDialog = (AlertDialog)paramDialog;
    if (this.s != null)
    {
      localAlertDialog.setMessage(this.s.a());
      return;
    }
    localAlertDialog.setMessage("An error has occured");
  }

  public Object onRetainNonConfigurationInstance()
  {
    if (this.n != null)
      this.n.a();
    return this.n;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.FeedbackActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
