package com.twitter.android;

import ah;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.widget.CursorAdapter;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bc;
import be;
import ch;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.ax;
import com.twitter.android.service.j;
import com.twitter.android.widget.TweetView;
import com.twitter.android.widget.c;
import cr;
import dp;
import du;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import t;
import z;

public final class cz extends CursorAdapter
{
  public static final String[] a = { "_id", "type", "data", "identifier" };
  private SparseArray b = new SparseArray(10);
  private SparseArray c = new SparseArray(10);
  private SparseArray d = new SparseArray(10);
  private String e;
  private SparseArray f = new SparseArray(10);
  private com.twitter.android.client.g g;
  private final ArrayList h = new ArrayList(10);
  private final c i;
  private final bc j;
  private final q k = new q(this, null);
  private final int l;
  private final int m;
  private final int n;

  public cz(Context paramContext, int paramInt1, com.twitter.android.client.g paramg, c paramc, String paramString, int paramInt2, bc parambc, int paramInt3)
  {
    super(paramContext, null, 0);
    this.g = paramg;
    this.i = paramc;
    this.e = paramString;
    this.j = parambc;
    this.l = paramInt3;
    this.m = paramContext.getResources().getDimensionPixelSize(2131492888);
    this.n = paramInt2;
  }

  private void b(View paramView)
  {
    gh localgh = (gh)paramView.getTag();
    Long localLong = (Long)this.d.get(localgh.f);
    if (localLong != null)
      switch (this.n)
      {
      default:
      case 0:
      case 1:
      }
    while (true)
    {
      this.mContext.startActivity(new Intent(this.mContext, TweetActivity.class).setData(aa.a(localLong.longValue(), this.g.e())));
      return;
      com.twitter.android.service.g localg2 = new com.twitter.android.service.g(this.g.e(), j.aa, null);
      this.g.a(localg2);
      continue;
      com.twitter.android.service.g localg1 = new com.twitter.android.service.g(this.g.e(), j.ae, null);
      this.g.a(localg1);
    }
  }

  final void a()
  {
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
      ((gh)localIterator.next()).a(this.g);
  }

  final void a(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131165332:
    case 2131165333:
    case 2131165334:
    case 2131165337:
    case 2131165338:
    case 2131165340:
    case 2131165341:
    case 2131165342:
    default:
    case 2131165335:
    case 2131165331:
    case 2131165330:
    case 2131165336:
    case 2131165339:
    case 2131165343:
    }
    long l1;
    do
    {
      while (true)
      {
        return;
        b(paramView);
        return;
        gh localgh2 = (gh)paramView.getTag();
        switch (localgh2.k)
        {
        case 2:
        case 3:
        default:
        case 4:
        case 1:
        }
        while (true)
        {
          String str2 = (String)this.c.get(localgh2.f);
          if (str2 == null)
            break;
          this.mContext.startActivity(new Intent(this.mContext, SearchTweetsActivity.class).putExtra("query", str2).putExtra("name", localgh2.i.getText()));
          return;
          switch (this.n)
          {
          default:
            break;
          case 0:
            com.twitter.android.service.g localg6 = new com.twitter.android.service.g(this.g.e(), j.Y, null);
            localg6.h = String.valueOf(localgh2.i.getText());
            this.g.a(localg6);
            break;
          case 1:
            com.twitter.android.service.g localg5 = new com.twitter.android.service.g(this.g.e(), j.ac, null);
            localg5.h = String.valueOf(localgh2.i.getText());
            this.g.a(localg5);
            continue;
            switch (this.n)
            {
            default:
              break;
            case 0:
              com.twitter.android.service.g localg4 = new com.twitter.android.service.g(this.g.e(), j.X, null);
              localg4.h = String.valueOf(localgh2.i.getText());
              this.g.a(localg4);
              break;
            case 1:
              com.twitter.android.service.g localg3 = new com.twitter.android.service.g(this.g.e(), j.ab, null);
              localg3.h = String.valueOf(localgh2.i.getText());
              this.g.a(localg3);
            }
            break;
          }
        }
        gh localgh1 = (gh)paramView.getTag();
        String str1 = (String)this.b.get(localgh1.f);
        if (localgh1.k == 1)
          switch (this.n)
          {
          default:
          case 0:
          case 1:
          }
        while (str1 != null)
        {
          BaseActivity.a(this.mContext, Uri.parse(str1));
          return;
          com.twitter.android.service.g localg2 = new com.twitter.android.service.g(this.g.e(), j.Z, null);
          localg2.f = str1;
          this.g.a(localg2);
          continue;
          com.twitter.android.service.g localg1 = new com.twitter.android.service.g(this.g.e(), j.ad, null);
          localg1.f = str1;
          this.g.a(localg1);
        }
      }
      b(paramView);
      return;
      l1 = ((bt)paramView.getTag()).c;
    }
    while (l1 <= 0L);
    this.mContext.startActivity(new Intent(this.mContext, ProfileActivity.class).putExtra("user_id", l1));
  }

  final void a(HashMap paramHashMap)
  {
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      gh localgh = (gh)localIterator.next();
      if (paramHashMap.containsKey(localgh.h))
        localgh.b(this.g);
    }
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i1 = paramCursor.getInt(1);
    int i2 = paramCursor.getInt(3);
    int i3 = paramCursor.getInt(0);
    SoftReference localSoftReference = (SoftReference)this.f.get(i2);
    com.twitter.android.client.g localg = this.g;
    if (localSoftReference != null);
    for (Object localObject = (dp)localSoftReference.get(); ; localObject = null)
    {
      dp localdp;
      if (localObject == null)
      {
        localdp = (dp)cr.a(paramCursor.getBlob(2));
        if (localdp != null);
      }
      label257: gh localgh;
      do
      {
        return;
        this.f.put(i2, new SoftReference(localdp));
        localObject = localdp;
        switch (i1)
        {
        default:
          return;
        case 1:
          fr localfr = (fr)paramView.getTag();
          ch localch = (ch)((dp)localObject).a.get(0);
          if (localch != null)
          {
            this.b.put(i3, localch.b.b);
            localfr.a.setText(localch.a);
            localfr.b.setText(localch.c);
            switch (this.n)
            {
            default:
              localfr.i.setText(localch.e);
              if (localch.b != null)
                localfr.c.setText(localch.b.a);
              if (localch.f != null)
              {
                t localt2 = (t)localch.f.get(0);
                if (localt2 != null)
                {
                  localfr.h = localt2.a;
                  localfr.g.setVisibility(0);
                }
              }
            case 2:
            }
          }
          while (true)
          {
            this.c.put(i3, localch.d);
            localfr.f = i3;
            localfr.l = this.m;
            localfr.b(localg);
            if (this.j == null)
              break;
            this.j.a_(localfr.f);
            return;
            ((TextView)localfr.j).setText(2131427690);
            break label257;
            localfr.g.setVisibility(8);
            continue;
            localfr.g.setVisibility(8);
          }
        case 4:
          localgh = (gh)paramView.getTag();
          localgh.i.setText(((dp)localObject).d);
          ArrayList localArrayList = ((dp)localObject).c;
          if ((localArrayList != null) && (localArrayList.size() > 0))
            localgh.h = ((t)((dp)localObject).c.get(0)).a;
          this.c.put(i3, ((dp)localObject).b);
          if (((dp)localObject).h > 0L)
            this.d.put(i3, Long.valueOf(((dp)localObject).h));
          localgh.f = i3;
          localgh.l = this.l;
          localgh.b(localg);
        case 2:
        case 3:
        case 5:
        }
      }
      while (this.j == null);
      this.j.a_(localgh.f);
      return;
      ge localge = (ge)paramView.getTag();
      z localz2 = ((dp)localObject).e;
      ax localax = new ax();
      Resources localResources2 = paramContext.getResources();
      TweetView localTweetView = localge.a.c;
      int i4 = localz2.g;
      localTweetView.a(localg.b);
      localax.p = localz2.c;
      localax.g = localz2.d;
      localax.d = localz2.f;
      localax.k = localz2.e;
      localax.s = localz2.a;
      localax.n = localz2.b;
      if (localz2.h != null)
        localax.x = localz2.h.a();
      localTweetView.a(localax);
      this.d.put(i3, Long.valueOf(localz2.a));
      localge.f = i3;
      if (i4 < 100)
      {
        TextView localTextView3 = localge.b;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i4);
        localTextView3.setText(localResources2.getString(2131427679, arrayOfObject3));
      }
      while (true)
      {
        localge.a.c.b();
        return;
        localge.b.setText(2131427680);
      }
      Resources localResources1 = paramContext.getResources();
      ap localap = (ap)paramView.getTag();
      z localz1;
      if (((dp)localObject).c != null)
      {
        t localt1 = (t)((dp)localObject).c.get(0);
        if ("photo".equals(localt1.c))
        {
          localz1 = ((dp)localObject).e;
          localap.h = localt1.a;
          localap.a.setText(localz1.c + ":");
          localap.b.setText(localz1.f);
          localap.d = localz1.e;
          localap.e = localz1.b;
          if (localz1.g >= 100)
            break label1041;
          TextView localTextView2 = localap.c;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(localz1.g);
          localTextView2.setText(localResources1.getString(2131427679, arrayOfObject2));
        }
      }
      while (true)
      {
        this.d.put(i3, Long.valueOf(localz1.a));
        localap.f = i3;
        localap.a(localg);
        localap.b(localg);
        return;
        label1041: TextView localTextView1 = localap.c;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(localz1.g);
        localTextView1.setText(localResources1.getString(2131427680, arrayOfObject1));
      }
      bt localbt = (bt)paramView.getTag();
      du localdu = (du)((dp)localObject).g.get(0);
      ImageView localImageView = (ImageView)paramView.findViewById(2131165267);
      ((TextView)localbt.j).setText(2131427691);
      localbt.c = localdu.d;
      localbt.h = localdu.c;
      localbt.a.setText(localdu.b);
      localbt.b.setText('@' + localdu.a);
      if (localdu.f)
      {
        localImageView.setImageResource(2130837805);
        localImageView.setVisibility(0);
      }
      while (true)
      {
        localbt.a(localg);
        return;
        if (localdu.e)
        {
          localImageView.setImageResource(2130837711);
          localImageView.setVisibility(0);
        }
        else
        {
          localImageView.setVisibility(8);
        }
      }
    }
  }

  public final int getItemViewType(int paramInt)
  {
    switch (((Cursor)getItem(paramInt)).getInt(1))
    {
    default:
      return -1;
    case 1:
      return 0;
    case 4:
      return 1;
    case 2:
      return 2;
    case 3:
      return 3;
    case 5:
    }
    return 4;
  }

  public final int getViewTypeCount()
  {
    return 5;
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    int i1 = paramCursor.getInt(1);
    View localView5;
    Object localObject1;
    Object localObject2;
    switch (i1)
    {
    default:
      return null;
    case 1:
      switch (this.n)
      {
      default:
        localView5 = localLayoutInflater.inflate(2130903103, paramViewGroup, false);
        fr localfr = new fr(localView5);
        if (this.n != 2)
        {
          localfr.j.setOnClickListener(this.k);
          localfr.j.setTag(localfr);
        }
        this.h.add(localfr);
        localView5.setTag(localfr);
        localObject1 = localView5;
        localObject2 = localfr;
      case 2:
      }
      break;
    case 4:
    case 2:
    case 3:
    case 5:
    }
    while (true)
    {
      ((gh)localObject2).k = i1;
      return localObject1;
      localView5 = localLayoutInflater.inflate(2130903102, paramViewGroup, false);
      break;
      View localView4 = localLayoutInflater.inflate(2130903104, paramViewGroup, false);
      gh localgh = new gh(localView4);
      localgh.j.setOnClickListener(this.k);
      localgh.j.setTag(localgh);
      this.h.add(localgh);
      localView4.setTag(localgh);
      localObject1 = localView4;
      localObject2 = localgh;
      continue;
      View localView3 = localLayoutInflater.inflate(2130903105, paramViewGroup, false);
      ge localge = new ge(localView3);
      ((ge)localge).a.c.a(this.i);
      localView3.setTag(localge);
      this.h.add(localge);
      localObject2 = localge;
      localObject1 = localView3;
      continue;
      View localView2 = localLayoutInflater.inflate(2130903106, null);
      ap localap = new ap(localView2);
      localView2.setTag(localap);
      this.h.add(localap);
      localObject1 = localView2;
      localObject2 = localap;
      continue;
      View localView1 = localLayoutInflater.inflate(2130903107, null);
      bt localbt = new bt(localView1);
      localView1.setTag(localbt);
      this.h.add(localbt);
      localObject1 = localView1;
      localObject2 = localbt;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
