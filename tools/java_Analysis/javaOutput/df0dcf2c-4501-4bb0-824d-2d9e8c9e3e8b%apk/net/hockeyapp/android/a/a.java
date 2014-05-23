package net.hockeyapp.android.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.views.b;

public final class a extends BaseAdapter
{
  private Context a;
  private ArrayList<FeedbackMessage> b;
  private SimpleDateFormat c;
  private SimpleDateFormat d;
  private Date e;
  private TextView f;
  private TextView g;
  private TextView h;

  public a(Context paramContext, ArrayList<FeedbackMessage> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
    this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    this.d = new SimpleDateFormat("d MMM h:mm a");
  }

  public final void a()
  {
    if (this.b != null)
      this.b.clear();
  }

  public final void a(FeedbackMessage paramFeedbackMessage)
  {
    if ((paramFeedbackMessage != null) && (this.b != null))
      this.b.add(paramFeedbackMessage);
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    localFeedbackMessage = (FeedbackMessage)this.b.get(paramInt);
    if (paramView == null)
    {
      localb = new b(this.a);
      while (true)
        if (localFeedbackMessage != null)
        {
          this.f = ((TextView)localb.findViewById(12289));
          this.g = ((TextView)localb.findViewById(12290));
          this.h = ((TextView)localb.findViewById(12291));
          try
          {
            this.e = this.c.parse(localFeedbackMessage.b());
            this.g.setText(this.d.format(this.e));
            this.f.setText(localFeedbackMessage.c());
            this.h.setText(localFeedbackMessage.a());
            if (paramInt % 2 == 0)
            {
              i = 0;
              localb.a(i);
              return localb;
              localb = (b)paramView;
            }
          }
          catch (ParseException localParseException)
          {
            while (true)
            {
              localParseException.printStackTrace();
              continue;
              int i = 1;
            }
          }
        }
    }
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
