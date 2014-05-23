package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.x;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.aw;
import com.spotify.mobile.android.util.ax;
import com.spotify.mobile.android.util.cv;
import java.util.List;

public class FilterHeaderView extends RelativeLayout
{
  private ImageView a;
  private View b;
  private ImageButton c;
  private TextView d;
  private h e;
  private boolean f;
  private boolean g;
  private ViewUri.Verified h;
  private String i;
  private PopupWindow j;
  private ListView k;
  private q l;
  private x m;
  private aw n;
  private Drawable o;
  private Drawable p;
  private Drawable q;
  private final a r = (a)c.a(a.class);
  private final View.OnClickListener s = new FilterHeaderView.1(this);
  private final View.OnClickListener t = new FilterHeaderView.2(this);
  private final AdapterView.OnItemClickListener u = new FilterHeaderView.3(this);
  private final TextWatcher v = new FilterHeaderView.4(this);
  private final View.OnKeyListener w = new FilterHeaderView.5(this);
  private final View.OnFocusChangeListener x = new FilterHeaderView.6(this);

  public FilterHeaderView(Context paramContext)
  {
    super(paramContext);
    c();
  }

  public FilterHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }

  private Drawable a(SpotifyIcon paramSpotifyIcon)
  {
    e locale = new e(getContext(), paramSpotifyIcon);
    locale.a(getResources().getColor(2131296428));
    locale.a(d.b(24.0F, getResources()));
    return locale;
  }

  public static FilterHeaderView a(LayoutInflater paramLayoutInflater, String paramString, List<cv> paramList, cv paramcv, h paramh)
  {
    FilterHeaderView localFilterHeaderView = (FilterHeaderView)paramLayoutInflater.inflate(2130903166, null, false);
    localFilterHeaderView.a(paramString);
    localFilterHeaderView.a(paramList, paramcv);
    localFilterHeaderView.e = paramh;
    return localFilterHeaderView;
  }

  public static FilterHeaderView a(LayoutInflater paramLayoutInflater, String paramString, List<cv> paramList, cv paramcv, h paramh, ListView paramListView)
  {
    FilterHeaderView localFilterHeaderView = (FilterHeaderView)paramLayoutInflater.inflate(2130903166, paramListView, false);
    localFilterHeaderView.a(paramString);
    localFilterHeaderView.a(paramList, paramcv);
    localFilterHeaderView.e = paramh;
    b(paramListView, localFilterHeaderView);
    if ((!paramString.isEmpty()) || (!(paramListView instanceof HideableHeadersListView)))
    {
      paramListView.addHeaderView(localFilterHeaderView);
      return localFilterHeaderView;
    }
    ((HideableHeadersListView)paramListView).a(localFilterHeaderView);
    return localFilterHeaderView;
  }

  public static FilterHeaderView a(LayoutInflater paramLayoutInflater, String paramString, List<cv> paramList, cv paramcv, List<ax> paramList1, h paramh, ListView paramListView)
  {
    FilterHeaderView localFilterHeaderView = (FilterHeaderView)paramLayoutInflater.inflate(2130903166, paramListView, false);
    localFilterHeaderView.a(paramString);
    Assertion.a(paramList1, "We need a non-null filterOptions list");
    if (!paramList1.isEmpty())
    {
      localFilterHeaderView.n = new aw(localFilterHeaderView.getContext(), paramList1);
      localFilterHeaderView.l.a(localFilterHeaderView.n, 2131689953, 0);
      localFilterHeaderView.l.d(new int[] { 0 });
      localFilterHeaderView.k.setAdapter(localFilterHeaderView.l);
    }
    localFilterHeaderView.a(paramList, paramcv);
    localFilterHeaderView.e = paramh;
    b(paramListView, localFilterHeaderView);
    if ((!paramString.isEmpty()) || (!(paramListView instanceof HideableHeadersListView)))
    {
      paramListView.addHeaderView(localFilterHeaderView);
      return localFilterHeaderView;
    }
    ((HideableHeadersListView)paramListView).a(localFilterHeaderView);
    return localFilterHeaderView;
  }

  public static void a(View paramView, FilterHeaderView paramFilterHeaderView)
  {
    paramView.setOnTouchListener(new FilterHeaderView.7(paramFilterHeaderView.d, paramFilterHeaderView));
  }

  public static void a(FilterHeaderView paramFilterHeaderView)
  {
    paramFilterHeaderView.e = null;
  }

  private void a(cv paramcv)
  {
    if (f.a(getContext()))
      return;
    if ((paramcv == null) || (!paramcv.d()))
    {
      this.c.setImageDrawable(this.o);
      return;
    }
    if (paramcv.e())
    {
      this.c.setImageDrawable(this.q);
      return;
    }
    this.c.setImageDrawable(this.p);
  }

  private void a(String paramString)
  {
    TextView localTextView = this.d;
    if (paramString == null)
      paramString = "";
    localTextView.setText(paramString);
    this.f = b();
  }

  private void a(List<cv> paramList, cv paramcv)
  {
    Assertion.a(paramList, "We need a non-null sortOptions list");
    if (paramList.size() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "sortOptions must contain at least one item each.");
      int i1 = paramList.indexOf(paramcv);
      ((cv)paramList.get(i1)).a(paramcv.e());
      this.m = new x(getContext(), paramList, i1);
      this.l.a(this.m, 2131689954, 1);
      this.l.d(new int[] { 1 });
      this.k.setAdapter(this.l);
      a(paramcv);
      return;
    }
  }

  private void a(boolean paramBoolean)
  {
    if (this.g != paramBoolean)
    {
      this.g = paramBoolean;
      if (this.e != null)
        this.e.a(this.g);
    }
  }

  private static void b(View paramView, FilterHeaderView paramFilterHeaderView)
  {
    View localView = null;
    for (ViewParent localViewParent = paramView.getParent(); (localView == null) && (localViewParent != null) && ((localViewParent instanceof View)); localViewParent = localViewParent.getParent())
      localView = ((View)localViewParent).findViewById(2131362508);
    Assertion.a(localView, "View with FilterHeaderView must use list_overlay layout");
    if (localView == null)
      return;
    a(localView, paramFilterHeaderView);
  }

  private void c()
  {
    View localView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903185, null);
    this.j = new PopupWindow(localView, getResources().getDimensionPixelSize(2131427416), -2);
    this.j.setOutsideTouchable(true);
    this.j.setFocusable(true);
    this.j.setBackgroundDrawable(new BitmapDrawable(getContext().getResources()));
    this.k = ((ListView)localView.findViewById(16908298));
    this.k.setOnItemClickListener(this.u);
    this.o = a(SpotifyIcon.cS);
    this.p = a(SpotifyIcon.cU);
    this.q = a(SpotifyIcon.cW);
    this.l = new q(getContext());
  }

  public final void a()
  {
    this.d.clearFocus();
    ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.d.getWindowToken(), 0);
    a(false);
  }

  public final void a(int paramInt)
  {
    this.d.setHint(paramInt);
  }

  public final void a(ViewUri.Verified paramVerified, String paramString)
  {
    this.h = paramVerified;
    this.i = paramString;
  }

  public final boolean b()
  {
    return !this.d.getText().toString().isEmpty();
  }

  protected void onDetachedFromWindow()
  {
    this.j.dismiss();
    super.onDetachedFromWindow();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (isInEditMode())
      return;
    this.a = ((ImageView)findViewById(2131362464));
    this.c = ((ImageButton)findViewById(2131362465));
    this.b = findViewById(2131362463);
    this.d = ((EditText)findViewById(2131362462));
    if (f.a(getContext()))
      this.d.setTextColor(getResources().getColor(2131296489));
    this.a.setOnClickListener(this.s);
    this.c.setOnClickListener(this.t);
    this.d.addTextChangedListener(this.v);
    this.d.setOnKeyListener(this.w);
    this.d.setOnFocusChangeListener(this.x);
    this.f = false;
    this.g = false;
    a(null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.FilterHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
