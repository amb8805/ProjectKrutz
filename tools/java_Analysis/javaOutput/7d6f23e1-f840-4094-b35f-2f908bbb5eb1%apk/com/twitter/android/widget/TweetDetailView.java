package com.twitter.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import ap;
import be;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import cr;
import do;
import dy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s;

public class TweetDetailView extends CardRowView
{
  ax a;
  public ImageView b;
  public RelativeLayout c;
  public View d;
  public ImageButton e;
  public ImageButton f;
  public ImageButton g;
  public ImageButton h;
  public ImageButton i;
  public Button j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private ImageView q;
  private RelativeLayout r;
  private HashMap s;
  private ImageView t;
  private Bitmap u;
  private String v;

  public TweetDetailView(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public TweetDetailView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public TweetDetailView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private void a()
  {
    Resources localResources = getResources();
    this.u = BitmapFactory.decodeResource(localResources, 2130837735);
    this.v = s.a(localResources.getDisplayMetrics().widthPixels, localResources.getDimensionPixelSize(2131492873));
  }

  private void a(be parambe, g paramg)
  {
    if ((parambe == null) || (!parambe.b()))
    {
      this.r.setVisibility(8);
      return;
    }
    Resources localResources = getResources();
    int i1 = localResources.getDimensionPixelSize(2131492878);
    int i2 = localResources.getDimensionPixelSize(2131492879);
    int i3 = localResources.getDimensionPixelSize(2131492880);
    int i4 = localResources.getDimensionPixelSize(2131492881);
    Context localContext = getContext();
    Iterator localIterator = parambe.d.iterator();
    int i5 = 1;
    while (localIterator.hasNext())
    {
      dy localdy = (dy)localIterator.next();
      String str = localdy.g;
      if (str != null)
      {
        OverlayImageView localOverlayImageView = (OverlayImageView)this.s.get(str);
        if (localOverlayImageView == null)
        {
          localOverlayImageView = new OverlayImageView(localContext);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
          localOverlayImageView.setId(i5);
          localOverlayImageView.setAdjustViewBounds(true);
          if (i5 > 1)
            localLayoutParams.addRule(3, i5 - 1);
          localLayoutParams.setMargins(i1, i2, i3, i4);
          localOverlayImageView.setLayoutParams(localLayoutParams);
          localOverlayImageView.setOnClickListener(new j(this, localContext, localdy, str));
          this.s.put(str, localOverlayImageView);
          this.r.addView(localOverlayImageView);
        }
        Bitmap localBitmap = paramg.g(str);
        if (localBitmap != null)
        {
          localOverlayImageView.a(localOverlayImageView.getResources().getDrawable(2130837806));
          localOverlayImageView.setImageBitmap(localBitmap);
        }
        while (true)
        {
          i5++;
          break;
          localOverlayImageView.a(null);
          localOverlayImageView.setImageBitmap(this.u);
        }
      }
    }
    this.r.setVisibility(0);
  }

  public final void a(ax paramax, g paramg, long paramLong, o paramo, be parambe)
  {
    this.a = paramax;
    Resources localResources = getResources();
    Button localButton;
    label188: ImageView localImageView1;
    label249: String str2;
    label288: label355: TextView localTextView1;
    ImageView localImageView2;
    ap localap;
    StringBuilder localStringBuilder;
    if (paramax.r)
    {
      TextView localTextView3 = this.n;
      b localb = new b(paramo, paramax.q);
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = paramax.b();
      localTextView3.setText(cr.a(localb, localResources.getString(2131427386, arrayOfObject4), (char)'"'));
      this.n.setVisibility(0);
      d.a(localResources, this.k, paramax.d, parambe, paramo);
      this.m.setText('@' + paramax.p);
      this.l.setText(paramax.g);
      localButton = this.j;
      if (!ax.a(parambe))
        break label568;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paramax.g;
      localButton.setText(localResources.getString(2131427529, arrayOfObject3));
      localButton.setVisibility(0);
      localImageView1 = this.q;
      String str1 = paramax.k;
      Bitmap localBitmap = null;
      if (str1 != null)
        localBitmap = paramg.a(paramax.t, paramax.n, paramax.k);
      if (localBitmap == null)
        break label578;
      localImageView1.setBackgroundDrawable(new BitmapDrawable(getResources(), localBitmap));
      this.c.setTag(Long.valueOf(paramax.n));
      if (!paramax.A)
        break label589;
      this.t.setImageResource(2130837805);
      this.t.setVisibility(0);
      str2 = cr.a(localResources, paramax.h, false);
      if (paramax.i == null)
        break label629;
      TextView localTextView2 = this.o;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = str2;
      arrayOfObject2[1] = paramax.i;
      localTextView2.setText(new SpannableStringBuilder(localResources.getString(2131427400, arrayOfObject2)));
      localTextView1 = this.p;
      localImageView2 = this.b;
      if ((!paramax.u) && (paramax.C == null))
        break label754;
      localap = paramax.C;
      if ((localap != null) && (localap.b != null))
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localap.b;
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(localResources.getString(2131427399, arrayOfObject1));
        localSpannableStringBuilder.setSpan(new i(paramo, paramax.s), localSpannableStringBuilder.length() - localap.b.length(), localSpannableStringBuilder.length(), 33);
        localTextView1.setText(localSpannableStringBuilder);
        localTextView1.setVisibility(0);
      }
      localStringBuilder = new StringBuilder(this.v);
      if (!paramax.u)
        break label641;
      localStringBuilder.append(paramax.v).append((char)',').append(paramax.w);
      label528: localImageView2.setImageBitmap(paramg.g(localStringBuilder.toString()));
      localImageView2.setVisibility(0);
    }
    while (true)
    {
      a(parambe, paramg);
      return;
      this.n.setVisibility(8);
      break;
      label568: localButton.setVisibility(8);
      break label188;
      label578: localImageView1.setBackgroundResource(2130837734);
      break label249;
      label589: if (paramax.m)
      {
        this.t.setImageResource(2130837711);
        this.t.setVisibility(0);
        break label288;
      }
      this.t.setVisibility(8);
      break label288;
      label629: this.o.setText(str2);
      break label355;
      label641: if (localap == null)
        break label528;
      localStringBuilder.append(cr.a(localap.b));
      if (localap.c == null)
        break label528;
      localStringBuilder.append("&path=color:0x00000000%7Cfillcolor:0xAA000033");
      ArrayList localArrayList = do.a(localap.c);
      if (localArrayList == null)
        break label528;
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        Pair localPair = (Pair)localIterator.next();
        localStringBuilder.append("%7C").append(localPair.first).append((char)',').append(localPair.second);
      }
      break label528;
      label754: localTextView1.setVisibility(8);
      localImageView2.setVisibility(8);
    }
  }

  protected void onFinishInflate()
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)findViewById(2131165355);
    this.c = localRelativeLayout;
    this.t = ((ImageView)localRelativeLayout.findViewById(2131165267));
    this.m = ((TextView)localRelativeLayout.findViewById(2131165375));
    this.l = ((TextView)localRelativeLayout.findViewById(2131165306));
    this.q = ((ImageView)localRelativeLayout.findViewById(2131165258));
    this.k = ((TextView)findViewById(2131165253));
    this.n = ((TextView)findViewById(2131165347));
    this.o = ((TextView)findViewById(2131165357));
    this.p = ((TextView)findViewById(2131165298));
    this.s = new HashMap(3);
    this.r = ((RelativeLayout)findViewById(2131165358));
    this.b = ((ImageView)findViewById(2131165359));
    MovementMethod localMovementMethod = LinkMovementMethod.getInstance();
    this.k.setMovementMethod(localMovementMethod);
    this.n.setMovementMethod(localMovementMethod);
    this.o.setMovementMethod(localMovementMethod);
    this.p.setMovementMethod(localMovementMethod);
    View localView = findViewById(2131165360);
    this.d = localView;
    this.e = ((ImageButton)localView.findViewById(2131165346));
    this.f = ((ImageButton)localView.findViewById(2131165347));
    this.g = ((ImageButton)localView.findViewById(2131165348));
    this.h = ((ImageButton)localView.findViewById(2131165351));
    this.i = ((ImageButton)localView.findViewById(2131165349));
    this.j = ((Button)findViewById(2131165356));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.TweetDetailView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
