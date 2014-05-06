package com.twitter.android;

import ad;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.widget.CardRowView;
import cr;

public final class be extends BaseAdapter
  implements View.OnClickListener
{
  private ad a;
  private final Context b;
  private final g c;
  private ImageView d;
  private TextView e;
  private TextView f;
  private ViewGroup g;
  private ViewGroup h;
  private ViewGroup i;

  public be(Context paramContext, g paramg)
  {
    this.b = paramContext;
    this.c = paramg;
  }

  private void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      this.d.setBackgroundDrawable(new BitmapDrawable(this.b.getResources(), paramBitmap));
      return;
    }
    this.d.setBackgroundResource(2130837734);
  }

  private void a(View paramView, int paramInt)
  {
    ((TextView)paramView.findViewById(2131165306)).setText(this.b.getString(paramInt).toUpperCase());
    paramView.setOnClickListener(this);
  }

  private void b(View paramView, int paramInt)
  {
    ((TextView)paramView.findViewById(2131165322)).setText(cr.a(this.b.getResources(), paramInt));
  }

  public final void a(ad paramad)
  {
    if ((this.a != null) && (this.a.equals(paramad)))
      return;
    this.a = paramad;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return 2;
  }

  public final Object getItem(int paramInt)
  {
    if ((paramInt == 0) && (this.a != null))
      return new Intent(this.b, ProfileActivity.class).putExtra("user_id", this.a.a);
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt == 0)
      return 0;
    return 1;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView4;
    if (paramInt == 0)
    {
      if (paramView != null)
        break label396;
      localView4 = LayoutInflater.from(this.b).inflate(2130903119, paramViewGroup, false);
      this.d = ((ImageView)localView4.findViewById(2131165258));
      this.e = ((TextView)localView4.findViewById(2131165306));
      this.f = ((TextView)localView4.findViewById(2131165375));
      localView4.findViewById(2131165332).setVisibility(0);
    }
    label396: for (View localView3 = localView4; ; localView3 = paramView)
    {
      ad localad2 = this.a;
      if (localad2 != null)
      {
        a(this.c.b(localad2.a, localad2.c));
        this.e.setText(localad2.b);
        this.f.setText("@" + localad2.g);
      }
      for (Object localObject = localView3; ; localObject = localView3)
      {
        ((CardRowView)localObject).a(paramInt, getCount());
        return localObject;
        a(null);
        this.e.setText(null);
        this.f.setText(null);
      }
      View localView2;
      if (paramView == null)
      {
        localView2 = LayoutInflater.from(this.b).inflate(2130903099, paramViewGroup, false);
        this.g = ((ViewGroup)localView2.findViewById(2131165323));
        a(this.g, 2131427363);
        this.h = ((ViewGroup)localView2.findViewById(2131165324));
        a(this.h, 2131427370);
        this.i = ((ViewGroup)localView2.findViewById(2131165325));
        a(this.i, 2131427371);
      }
      for (View localView1 = localView2; ; localView1 = paramView)
      {
        ad localad1 = this.a;
        if (localad1 != null)
        {
          b(this.g, localad1.n);
          b(this.h, localad1.l);
          b(this.i, localad1.k);
          localObject = localView1;
          break;
        }
        b(this.g, 0);
        b(this.h, 0);
        b(this.i, 0);
        localObject = localView1;
        break;
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final void onClick(View paramView)
  {
    if (this.a == null)
      return;
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165323:
      this.b.startActivity(new Intent(this.b, TimelineActivity.class).putExtra("owner_id", this.a.a).putExtra("type", 1));
      return;
    case 2131165324:
      this.b.startActivity(new Intent(this.b, UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", this.a.a).putExtra("type", 0));
      return;
    case 2131165325:
    }
    this.b.startActivity(new Intent(this.b, UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", this.a.a).putExtra("type", 1));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.be
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
