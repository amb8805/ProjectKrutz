package com.spotify.mobile.android.spotlets.browse.util;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class d
{
  private static String a;
  private static String b;
  private static Map<String, Genre> c;
  private static List<String> d;

  public static Genre a(String paramString, Resources paramResources, boolean paramBoolean)
  {
    try
    {
      b(paramResources, paramBoolean);
      Genre localGenre = (Genre)c.get(paramString);
      return localGenre;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static List<Genre> a(Resources paramResources, boolean paramBoolean)
  {
    ArrayList localArrayList;
    try
    {
      b(paramResources, paramBoolean);
      localArrayList = new ArrayList();
      Iterator localIterator = d.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localArrayList.add(c.get(str));
      }
    }
    finally
    {
    }
    List localList = Collections.unmodifiableList(localArrayList);
    return localList;
  }

  public static void a(List<Genre> paramList, boolean paramBoolean)
  {
    int i = 0;
    int j;
    HashMap localHashMap;
    ArrayList localArrayList;
    Iterator localIterator3;
    if (paramList != null)
    {
      try
      {
        Iterator localIterator1 = paramList.iterator();
        do
          if (!localIterator1.hasNext())
            break;
        while (!((Genre)localIterator1.next()).b().equals("new_releases"));
        j = 1;
        localHashMap = new HashMap();
        localArrayList = new ArrayList();
        if (j == 0)
          localHashMap.put("new_releases", c.get("new_releases"));
        Iterator localIterator2 = paramList.iterator();
        while (localIterator2.hasNext())
        {
          Genre localGenre2 = (Genre)localIterator2.next();
          localHashMap.put(localGenre2.b(), localGenre2);
        }
      }
      finally
      {
      }
      localIterator3 = paramList.iterator();
    }
    while (true)
    {
      int k;
      if (localIterator3.hasNext())
      {
        Genre localGenre1 = (Genre)localIterator3.next();
        if (localGenre1.e())
        {
          if ((paramBoolean) && (!FeatureFragment.b.a()) && (!FeatureFragment.c.a()) && (j == 0) && (i == 1))
          {
            localArrayList.add("new_releases");
            i++;
          }
          if (((!paramBoolean) || (FeatureFragment.b.a()) || (FeatureFragment.c.a())) && (localGenre1.b().equals("toplists")))
            continue;
          localArrayList.add(localGenre1.b());
          k = i + 1;
          break label313;
        }
      }
      else
      {
        d = localArrayList;
        c = localHashMap;
        return;
        k = i;
        break label313;
        j = 0;
        break;
        label313: i = k;
      }
    }
  }

  public static Genre b(String paramString, Resources paramResources, boolean paramBoolean)
  {
    try
    {
      b(paramResources, paramBoolean);
      Genre localGenre = (Genre)c.get(paramString);
      if (localGenre != null)
      {
        boolean bool = localGenre.e();
        if (!bool)
          break label45;
      }
      while (true)
      {
        return localGenre;
        localGenre = (Genre)c.get(localGenre.c());
      }
    }
    finally
    {
    }
  }

  private static void b(Resources paramResources, boolean paramBoolean)
  {
    try
    {
      String str = paramResources.getConfiguration().locale.getCountry() + paramResources.getConfiguration().locale.getLanguage();
      if ((c == null) || (b == null) || (!str.equals(b)))
      {
        ArrayList localArrayList = new ArrayList();
        if ((!paramBoolean) && (!FeatureFragment.b.a()) && (!FeatureFragment.c.a()))
        {
          localArrayList.add("toplists");
          localArrayList.add("new_releases");
        }
        localArrayList.add("rock");
        localArrayList.add("party");
        localArrayList.add("pop");
        localArrayList.add("mood");
        localArrayList.add("chill");
        localArrayList.add("club");
        localArrayList.add("urban");
        localArrayList.add("workout");
        localArrayList.add("decades");
        localArrayList.add("popculture");
        localArrayList.add("events");
        localArrayList.add("folk");
        localArrayList.add("jazz");
        localArrayList.add("travel");
        localArrayList.add("romance");
        localArrayList.add("groove");
        localArrayList.add("holidays");
        localArrayList.add("classical");
        localArrayList.add("kids");
        d = localArrayList;
        b = str;
        a = paramResources.getString(2131689520);
        GenresHashMap localGenresHashMap = new GenresHashMap(paramResources);
        localGenresHashMap.a("chill", 2131689534, 2130837655, 2130837656);
        localGenresHashMap.a("classical", 2131689537, 2130837657, 2130837658);
        localGenresHashMap.a("club", 2131689539, 2130837659, 2130837660);
        localGenresHashMap.a("decades", 2131689544, 2130837663, 2130837664);
        localGenresHashMap.a("events", 2131689549, 2130837665, 2130837666);
        localGenresHashMap.a("folk", 2131689553, 2130837661, 2130837662);
        localGenresHashMap.a("groove", 2131689560, 2130837667, 2130837668);
        localGenresHashMap.a("holidays", 2131689564, 2130837669, 2130837670);
        localGenresHashMap.a("jazz", 2131689570, 2130837671, 2130837672);
        localGenresHashMap.a("kids", 2131689573, 2130837673, 2130837674);
        localGenresHashMap.a("mood", 2131689581, 2130837675, 2130837676);
        localGenresHashMap.a("new_releases", 2131689585, 2130837677, 2130837678);
        localGenresHashMap.a("trending_artists", 2131689627, -1, -1);
        localGenresHashMap.a("party", 2131689589, 2130837679, 2130837680);
        localGenresHashMap.a("popculture", 2131689594, 2130837683, 2130837684);
        localGenresHashMap.a("pop", 2131689591, 2130837681, 2130837682);
        localGenresHashMap.a("rock", 2131689606, 2130837685, 2130837686);
        localGenresHashMap.a("romance", 2131689610, 2130837687, 2130837688);
        localGenresHashMap.a("toplists", 2131689622, 2130837689, 2130837690);
        localGenresHashMap.a("travel", 2131689625, 2130837691, 2130837692);
        localGenresHashMap.a("urban", 2131689630, 2130837693, 2130837694);
        localGenresHashMap.a("workout", 2131689635, 2130837695, 2130837696);
        localGenresHashMap.a("chill", "chill_misc", 2131689535);
        localGenresHashMap.a("chill", "lounge", 2131689578);
        localGenresHashMap.a("chill", "relax", 2131689603);
        localGenresHashMap.a("classical", "baroque", 2131689531);
        localGenresHashMap.a("classical", "classical_misc", 2131689538);
        localGenresHashMap.a("classical", "contemporary", 2131689541);
        localGenresHashMap.a("classical", "romanticism", 2131689612);
        localGenresHashMap.a("club", "club_misc", 2131689540);
        localGenresHashMap.a("club", "dubstep", 2131689547);
        localGenresHashMap.a("club", "electro", 2131689548);
        localGenresHashMap.a("club", "house", 2131689567);
        localGenresHashMap.a("club", "techno", 2131689620);
        localGenresHashMap.a("club", "trance", 2131689624);
        localGenresHashMap.a("decades", "00s", 2131689522);
        localGenresHashMap.a("decades", "50s", 2131689523);
        localGenresHashMap.a("decades", "60s", 2131689524);
        localGenresHashMap.a("decades", "70s", 2131689525);
        localGenresHashMap.a("decades", "80s", 2131689526);
        localGenresHashMap.a("decades", "90s", 2131689527);
        localGenresHashMap.a("events", "events_misc", 2131689550);
        localGenresHashMap.a("events", "festivals", 2131689551);
        localGenresHashMap.a("events", "live_concerts", 2131689577);
        localGenresHashMap.a("events", "sporting_events", 2131689616);
        localGenresHashMap.a("folk", "bluegrass", 2131689532);
        localGenresHashMap.a("folk", "country", 2131689542);
        localGenresHashMap.a("folk", "folk_folk", 2131689554);
        localGenresHashMap.a("folk", "folk_misc", 2131689555);
        localGenresHashMap.a("folk", "world_music", 2131689637);
        localGenresHashMap.a("groove", "disco", 2131689546);
        localGenresHashMap.a("groove", "funk", 2131689557);
        localGenresHashMap.a("groove", "gospel", 2131689559);
        localGenresHashMap.a("groove", "groove_misc", 2131689561);
        localGenresHashMap.a("groove", "latino", 2131689576);
        localGenresHashMap.a("groove", "soul", 2131689615);
        localGenresHashMap.a("holidays", "christmas", 2131689536);
        localGenresHashMap.a("holidays", "holidays_misc", 2131689565);
        localGenresHashMap.a("holidays", "national", 2131689584);
        localGenresHashMap.a("holidays", "newyears", 2131689586);
        localGenresHashMap.a("jazz", "blues", 2131689533);
        localGenresHashMap.a("jazz", "jazz_jazz", 2131689571);
        localGenresHashMap.a("jazz", "jazz_misc", 2131689572);
        localGenresHashMap.a("kids", "fun", 2131689556);
        localGenresHashMap.a("kids", "kids_classics", 2131689574);
        localGenresHashMap.a("kids", "kids_misc", 2131689575);
        localGenresHashMap.a("kids", "stories", 2131689617);
        localGenresHashMap.a("mood", "angry", 2131689530);
        localGenresHashMap.a("mood", "happy", 2131689562);
        localGenresHashMap.a("mood", "melancholic", 2131689579);
        localGenresHashMap.a("mood", "mood_misc", 2131689582);
        localGenresHashMap.a("mood", "psyched", 2131689598);
        localGenresHashMap.a("mood", "relaxed", 2131689604);
        localGenresHashMap.a("party", "after_party", 2131689528);
        localGenresHashMap.a("party", "dinner", 2131689545);
        localGenresHashMap.a("party", "floorfillers", 2131689552);
        localGenresHashMap.a("party", "party_misc", 2131689590);
        localGenresHashMap.a("party", "pre_party", 2131689597);
        localGenresHashMap.a("party", "theme_party", 2131689621);
        localGenresHashMap.a("pop", "indie_pop", 2131689569);
        localGenresHashMap.a("pop", "one_hit_wonders", 2131689588);
        localGenresHashMap.a("pop", "pop_misc", 2131689592);
        localGenresHashMap.a("pop", "pop_pop", 2131689593);
        localGenresHashMap.a("pop", "power_pop", 2131689596);
        localGenresHashMap.a("pop", "songwriter", 2131689614);
        localGenresHashMap.a("pop", "synth_pop", 2131689619);
        localGenresHashMap.a("popculture", "movies", 2131689583);
        localGenresHashMap.a("popculture", "popculture_misc", 2131689595);
        localGenresHashMap.a("popculture", "radio", 2131689601);
        localGenresHashMap.a("popculture", "tv", 2131689628);
        localGenresHashMap.a("popculture", "video_games", 2131689633);
        localGenresHashMap.a("rock", "alt_rock", 2131689529);
        localGenresHashMap.a("rock", "hard_rock", 2131689563);
        localGenresHashMap.a("rock", "metal", 2131689580);
        localGenresHashMap.a("rock", "punk", 2131689599);
        localGenresHashMap.a("rock", "rock_misc", 2131689607);
        localGenresHashMap.a("rock", "rock_n_roll", 2131689608);
        localGenresHashMap.a("rock", "rock_rock", 2131689609);
        localGenresHashMap.a("romance", "date", 2131689543);
        localGenresHashMap.a("romance", "romance_misc", 2131689611);
        localGenresHashMap.a("romance", "wedding", 2131689634);
        localGenresHashMap.a("toplists", "sweden", 2131689618);
        localGenresHashMap.a("toplists", "toplists_misc", 2131689623);
        localGenresHashMap.a("toplists", "uk", 2131689629);
        localGenresHashMap.a("toplists", "usa", 2131689632);
        localGenresHashMap.a("travel", "geographical", 2131689558);
        localGenresHashMap.a("travel", "on_the_beach", 2131689587);
        localGenresHashMap.a("travel", "road_trip", 2131689605);
        localGenresHashMap.a("travel", "travel_misc", 2131689626);
        localGenresHashMap.a("urban", "hophop", 2131689566);
        localGenresHashMap.a("urban", "reggae", 2131689602);
        localGenresHashMap.a("urban", "r_n_b", 2131689600);
        localGenresHashMap.a("urban", "urban_misc", 2131689631);
        localGenresHashMap.a("workout", "in_the_gym", 2131689568);
        localGenresHashMap.a("workout", "running", 2131689613);
        localGenresHashMap.a("workout", "workout_misc", 2131689636);
        c = localGenresHashMap;
      }
      return;
    }
    finally
    {
    }
  }

  public static List<Genre> c(String paramString, Resources paramResources, boolean paramBoolean)
  {
    ArrayList localArrayList1;
    Genre localGenre;
    try
    {
      b(paramResources, paramBoolean);
      localArrayList1 = new ArrayList();
      localGenre = b(paramString, paramResources, paramBoolean);
      if (localGenre == null)
      {
        localArrayList2 = localArrayList1;
        return localArrayList2;
      }
      str = localGenre.b();
      localObject2 = null;
      localIterator = c.values().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label142;
        localObject3 = (Genre)localIterator.next();
        if (!str.equals(((Genre)localObject3).c()))
          break;
        if (((Genre)localObject3).b().contains("misc"))
          break label135;
        localArrayList1.add(localObject3);
      }
    }
    finally
    {
    }
    while (true)
    {
      String str;
      Iterator localIterator;
      Object localObject3 = localObject2;
      label135: Object localObject2 = localObject3;
      continue;
      label142: Collections.sort(localArrayList1, new d.1());
      localArrayList1.add(0, new Genre(localGenre.a(), localGenre.b(), localGenre.c(), a, localGenre.f(), localGenre.g(), localGenre.h(), localGenre.i(), localGenre.j(), localGenre.k()));
      if (localObject2 != null)
        localArrayList1.add(localObject2);
      ArrayList localArrayList2 = localArrayList1;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.util.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
