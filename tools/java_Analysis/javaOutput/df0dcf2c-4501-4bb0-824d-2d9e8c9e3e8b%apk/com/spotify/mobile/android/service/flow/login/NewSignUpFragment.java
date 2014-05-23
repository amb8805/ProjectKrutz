package com.spotify.mobile.android.service.flow.login;

import android.app.Activity;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.app.b;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.dj;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dz;
import com.spotify.mobile.android.util.ec;
import com.spotify.mobile.android.util.ei;
import com.spotify.mobile.android.util.ej;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NewSignUpFragment extends d
{
  public static final cy a = cy.a("signup-v1-status");
  public static final cy b = cy.a("signup-v1-email-error");
  public static final cy c = cy.a("signup-v1-username-error");
  public static final cy d = cy.a("signup-v1-birthdate-error");
  public static final cy e = cy.a("signup-v1-other-error");
  private EditText Y;
  private AutoCompleteTextView Z;
  private EditText aa;
  private ProgressBar ab;
  private Spinner ac;
  private n ad;
  private boolean ae;
  private boolean af = false;
  private int ag;
  private Calendar ah = null;
  private NewSignUpFragment.Gender ai;
  private ej aj;
  private dz ak;
  private int al;
  private TextWatcher am = new NewSignUpFragment.1(this);
  private TextWatcher an = new NewSignUpFragment.12(this);
  private DatePickerDialog.OnDateSetListener ao = new NewSignUpFragment.19(this);
  private o ap = new NewSignUpFragment.20(this);
  private AdapterView.OnItemSelectedListener aq = new NewSignUpFragment.21(this);
  private ec ar = new NewSignUpFragment.22(this);
  private ei as = new j(this, false);
  private View at;
  private final Map<EditText, TextWatcher> f = new IdentityHashMap(2);
  private dt g;
  private Button h;
  private EditText i;

  public NewSignUpFragment()
  {
  }

  private String E()
  {
    return dj.a(this.Z).trim();
  }

  private String F()
  {
    return dj.a(this.Y).trim();
  }

  private Calendar G()
  {
    if (this.ah != null)
      return (Calendar)this.ah.clone();
    return null;
  }

  public static NewSignUpFragment a(com.spotify.mobile.android.service.flow.a.a parama)
  {
    NewSignUpFragment localNewSignUpFragment = new NewSignUpFragment();
    localNewSignUpFragment.a(parama);
    return localNewSignUpFragment;
  }

  private ej a(ei paramei)
  {
    return new ej(i(), F(), E(), G(), paramei);
  }

  private void a(ImmutableList<String> paramImmutableList)
  {
    ArrayAdapter localArrayAdapter = new ArrayAdapter(i(), 17367043, paramImmutableList);
    this.Z.setAdapter(localArrayAdapter);
  }

  private void a(CharSequence paramCharSequence)
  {
    if (this.h == null)
      return;
    if (!f.a(this.h.getContext()))
      paramCharSequence = paramCharSequence.toString().toUpperCase(Locale.getDefault());
    this.h.setText(paramCharSequence);
  }

  private static void b(TextView paramTextView, CharSequence paramCharSequence)
  {
    if (paramTextView == null)
      return;
    paramTextView.setError(paramCharSequence);
  }

  private void c(int paramInt)
  {
    if (this.h == null)
      return;
    a(this.h.getContext().getString(paramInt));
  }

  public final i D()
  {
    return (i)((com.spotify.mobile.android.service.flow.a.a)l_()).a(this);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int j = 2130903149;
    int k;
    View localView;
    String[] arrayOfString;
    if (!f.a(i()))
    {
      k = 1;
      if (k != 0)
        j = 2130903150;
      localView = (View)cc.a(paramLayoutInflater.inflate(j, paramViewGroup, false));
      this.Y = ((EditText)cc.a(localView.findViewById(2131362416)));
      this.i = ((EditText)cc.a(localView.findViewById(2131362390)));
      this.Z = ((AutoCompleteTextView)cc.a(localView.findViewById(2131362387)));
      this.aa = ((EditText)cc.a(localView.findViewById(2131362419)));
      this.ac = ((Spinner)cc.a(localView.findViewById(2131362422)));
      this.ab = ((ProgressBar)cc.a(localView.findViewById(2131362425)));
      this.h = ((Button)cc.a(localView.findViewById(2131362424)));
      this.at = ((View)cc.a(localView.findViewById(2131362383)));
      arrayOfString = new String[3];
      arrayOfString[0] = a(2131689668);
      arrayOfString[1] = a(2131689667);
      arrayOfString[2] = a(2131689669);
      this.aa.setInputType(0);
      if (k == 0)
        break label439;
    }
    label439: for (ArrayAdapter localArrayAdapter = new ArrayAdapter(i(), 2130903154, arrayOfString); ; localArrayAdapter = new ArrayAdapter(i(), 2130903121, arrayOfString))
    {
      localArrayAdapter.setDropDownViewResource(17367049);
      this.ac.setAdapter(localArrayAdapter);
      this.ac.post(new NewSignUpFragment.4(this));
      TextView localTextView1 = (TextView)localView.findViewById(2131362415);
      String str = j().getString(2131689654).replaceAll("spotify:", "com.spotify.mobile.android.tos:spotify:");
      localTextView1.setMovementMethod(LinkMovementMethod.getInstance());
      localTextView1.setText(Html.fromHtml(str));
      this.f.put(this.Y, this.am);
      this.f.put(this.i, this.an);
      if (k != 0)
      {
        a(this.h.getText());
        TextView localTextView2 = (TextView)cc.a(localView.findViewById(2131362396));
        localTextView2.setText(localTextView2.getText().toString().toUpperCase(Locale.getDefault()));
      }
      return localView;
      k = 0;
      break;
    }
  }

  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ak = new dz(paramActivity);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.g = dv.b(i(), ViewUri.T);
    this.ad = new n(this.ap);
    this.ak = new dz(i());
    this.al = 2131755258;
    if (((dk)c.a(dk.class)).b())
      this.al = 2131755249;
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    cc.a(this.h);
    if (paramBundle != null)
    {
      this.Z.setText(paramBundle.getString("user_name"));
      this.aa.setText(paramBundle.getString("birth_date_string"));
      this.ah = ((Calendar)paramBundle.getSerializable("birth_date"));
      this.ac.setSelection(paramBundle.getInt("gender"));
      this.Y.setText(paramBundle.getString("email"));
      this.i.setText(paramBundle.getString("password"));
      a(ImmutableList.a(paramBundle.getStringArrayList("suggestions")));
    }
    this.h.setOnClickListener(new NewSignUpFragment.5(this));
    this.at.setOnClickListener(new NewSignUpFragment.6(this));
    this.Y.setOnFocusChangeListener(new NewSignUpFragment.7(this));
    if (f.a(this.i.getContext()))
      this.i.setTypeface(Typeface.DEFAULT);
    this.i.setOnFocusChangeListener(new NewSignUpFragment.8(this));
    this.Z.setOnFocusChangeListener(new NewSignUpFragment.9(this));
    this.aa.setOnFocusChangeListener(new NewSignUpFragment.10(this));
    this.aa.setOnClickListener(new NewSignUpFragment.11(this));
    if (cw.a(i()).a(a, -1) != -1)
      a("Test it!");
  }

  public final void a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      EditText localEditText = this.Y;
      ((InputMethodManager)localEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(localEditText.getWindowToken(), 0);
      com.spotify.android.paste.app.a locala = new b(i(), this.al).a(2131690025).b(2131690024).a(2131690023, new NewSignUpFragment.17(this, paramString)).a();
      locala.setCanceledOnTouchOutside(false);
      locala.setOnCancelListener(new NewSignUpFragment.18(this));
      locala.show();
    }
  }

  public final void d(Bundle paramBundle)
  {
    paramBundle.putString("user_name", E());
    paramBundle.putString("birth_date_string", dj.a(this.aa));
    paramBundle.putSerializable("birth_date", G());
    int j;
    ArrayList localArrayList1;
    int k;
    if (this.ac != null)
    {
      j = this.ac.getSelectedItemPosition();
      paramBundle.putInt("gender", j);
      paramBundle.putString("email", F());
      paramBundle.putString("password", dj.a(this.i));
      localArrayList1 = new ArrayList();
      if (this.Z != null)
      {
        ListAdapter localListAdapter = this.Z.getAdapter();
        k = 0;
        if (localListAdapter != null)
          break label139;
      }
    }
    for (ArrayList localArrayList2 = localArrayList1; ; localArrayList2 = localArrayList1)
    {
      paramBundle.putStringArrayList("suggestions", localArrayList2);
      super.d(paramBundle);
      return;
      j = 0;
      break;
      label139: 
      while (k < this.Z.getAdapter().getCount())
      {
        localArrayList1.add((String)this.Z.getAdapter().getItem(k));
        k++;
      }
    }
  }

  public final void w()
  {
    super.w();
    Iterator localIterator = this.f.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((EditText)localEntry.getKey()).addTextChangedListener((TextWatcher)localEntry.getValue());
    }
    this.g.a();
    this.ae = true;
    this.ak.a(null);
    this.ak.a();
  }

  public final void x()
  {
    super.x();
    Iterator localIterator = this.f.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((EditText)localEntry.getKey()).removeTextChangedListener((TextWatcher)localEntry.getValue());
    }
    this.g.b();
    this.ae = false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.NewSignUpFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
