package com.spotify.mobile.android.spotlets.artist;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class c extends a
{
  private TextView Y;
  private TextView Z;
  private ImageView aa;
  private TextView ab;
  private ImageButton ac;
  private g ad;
  private int ae;
  private final SimpleDateFormat af = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
  private final SimpleDateFormat ag = new SimpleDateFormat("cccc dd MMMM yyyy", Locale.getDefault());
  private TextView b;
  private ImageView c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private Button i;

  public c()
  {
  }

  private static String b(ArtistModel.Concert paramConcert)
  {
    try
    {
      String str = URLEncoder.encode(paramConcert.venue + ", " + paramConcert.city, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return "";
  }

  protected final View D()
  {
    View localView = LayoutInflater.from(i()).inflate(this.ad.a(), null);
    this.b = ((TextView)localView.findViewById(2131362524));
    this.c = ((ImageView)localView.findViewById(2131362223));
    this.d = ((TextView)localView.findViewById(2131362522));
    this.e = ((TextView)localView.findViewById(2131362523));
    this.f = ((TextView)localView.findViewById(2131362527));
    this.g = ((TextView)localView.findViewById(2131362528));
    this.h = ((TextView)localView.findViewById(2131362529));
    this.i = ((Button)localView.findViewById(2131362530));
    this.Y = ((TextView)localView.findViewById(2131362531));
    this.Z = ((TextView)localView.findViewById(2131362533));
    this.aa = ((ImageView)localView.findViewById(2131362534));
    this.ab = ((TextView)localView.findViewById(2131362526));
    this.ac = ((ImageButton)localView.findViewById(2131362532));
    return localView;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690075);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ae = g().getInt("concert_id");
    if (f.a(i()));
    for (Object localObject = new e(this, (byte)0); ; localObject = new d(this, (byte)0))
    {
      this.ad = ((g)localObject);
      return;
    }
  }

  protected final void b(ArtistModel paramArtistModel)
  {
    localConcert = (ArtistModel.Concert)paramArtistModel.upcomingConcerts.get(this.ae);
    try
    {
      Date localDate = this.af.parse(localConcert.localtime);
      this.g.setText(this.ag.format(localDate));
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.setTime(localDate);
      String str2 = localCalendar.getDisplayName(2, 1, Locale.getDefault()).toUpperCase(Locale.getDefault());
      String str3 = String.valueOf(localCalendar.get(5));
      this.d.setText(str2);
      this.e.setText(str3);
      if (paramArtistModel.info.portraits.size() > 0)
        this.ad.b(((ArtistModel.Image)paramArtistModel.info.portraits.get(0)).uri);
      this.b.setText(paramArtistModel.info.name);
      this.f.setText(localConcert.title);
      this.h.setText(localConcert.venue + ", " + localConcert.city);
      this.Y.setText(localConcert.venue);
      this.Z.setText(localConcert.city);
      ((l)i()).a(this, paramArtistModel.info.name + " " + i().getString(2131690075));
      Picasso localPicasso = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a();
      String str1 = b(localConcert);
      localPicasso.a("http://maps.googleapis.com/maps/api/staticmap?center=" + str1 + "&zoom=13&scale=2&size=600x300&maptype=roadmap&sensor=false&markers=color:red%7C" + str1).a(this.aa);
      this.ad.b().setOnClickListener(new c.1(this, localConcert));
      this.i.setOnClickListener(new c.2(this, localConcert));
      this.ab.setOnClickListener(new c.3(this, paramArtistModel));
      this.ad.a(paramArtistModel.info.name);
      return;
    }
    catch (ParseException localParseException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localConcert.localtime;
        arrayOfObject[1] = this.af;
        bp.a(localParseException, "Failed to parse date [%s] with formatter [%s]", arrayOfObject);
        this.g.setText("");
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
