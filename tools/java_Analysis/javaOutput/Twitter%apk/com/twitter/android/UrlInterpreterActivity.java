package com.twitter.android;

import android.app.Activity;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.android.client.g;
import com.twitter.android.provider.ao;
import java.util.List;

public class UrlInterpreterActivity extends Activity
{
  private static final UriMatcher b;
  private g a;

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    b = localUriMatcher;
    localUriMatcher.addURI("*", "search", 1);
    b.addURI("*", "search/users/*", 2);
    b.addURI("*", "search/realtime/*", 3);
    b.addURI("*", "search/links/*", 4);
    b.addURI("*", "search/*", 5);
    b.addURI("*", "search/*/grid/*", 6);
    b.addURI("*", "compose/tweet", 7);
    b.addURI("*", "compose/dm", 8);
    b.addURI("*", "compose/dm/*", 9);
    b.addURI("*", "mentions", 10);
    b.addURI("*", "messages", 11);
    b.addURI("*", "messages/*/#", 12);
    b.addURI("*", "who_to_follow", 13);
    b.addURI("*", "who_to_follow/suggestions", 14);
    b.addURI("*", "who_to_follow/interests", 15);
    b.addURI("*", "who_to_follow/interests/*", 16);
    b.addURI("*", "who_to_follow/import", 17);
    b.addURI("*", "who_to_follow/search/*", 18);
    b.addURI("*", "lists", 19);
    b.addURI("*", "favorites", 20);
    b.addURI("*", "settings/profile", 21);
    b.addURI("*", "similar_to/*", 22);
    b.addURI("*", "*/status/#", 23);
    b.addURI("*", "*/lists", 24);
    b.addURI("*", "*/lists/*", 25);
    b.addURI("*", "*/following", 26);
    b.addURI("*", "*/following/*", 27);
    b.addURI("*", "*/followers", 28);
    b.addURI("*", "*/followers_you_follow", 29);
    b.addURI("*", "*/favorites", 30);
    b.addURI("*", "*/activity", 31);
    b.addURI("*", "*/*", 32);
    b.addURI("*", "*/*/members", 33);
    b.addURI("*", "*/*/subscribers", 34);
    b.addURI("*", "*", 35);
  }

  public UrlInterpreterActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent1 = getIntent();
    this.a = g.a(this);
    Uri localUri1 = localIntent1.getData();
    String str1 = localUri1.toString();
    int i = str1.indexOf("/#!");
    if (i != -1)
      localUri1 = Uri.parse(str1.substring(0, i) + str1.substring(i + 3));
    List localList = localUri1.getPathSegments();
    switch (b.match(localUri1))
    {
    default:
      startActivity(new Intent(this, HomeTabActivity.class));
    case 23:
    case 5:
    case 6:
    case 3:
    case 4:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 35:
    case 32:
    case 34:
    case 33:
    case 7:
    case 16:
    case 2:
    case 18:
    case 24:
    case 1:
    case 8:
    case 9:
    case 12:
    case 10:
    case 11:
    case 13:
    case 14:
    case 17:
    case 15:
    case 19:
    case 20:
    case 21:
    case 22:
    }
    while (true)
    {
      finish();
      return;
      Uri localUri10 = new Uri.Builder().scheme("twitter").authority("tweet").appendQueryParameter("status_id", (String)localList.get(2)).build();
      startActivity(new Intent(this, TweetActivity.class).setData(localUri10));
      continue;
      startActivity(new Intent(this, SearchTweetsActivity.class).putExtra("query", (String)localList.get(1)));
      continue;
      startActivity(new Intent(this, SearchTweetsActivity.class).putExtra("query", (String)localList.get(2)));
      continue;
      Uri localUri9 = new Uri.Builder().scheme("twitter").authority("user").appendQueryParameter("screen_name", (String)localList.get(0)).build();
      startActivity(new Intent(this, ProfileActivity.class).setData(localUri9));
      continue;
      Uri localUri8 = new Uri.Builder().scheme("twitter").authority("list").appendQueryParameter("screen_name", (String)localList.get(0)).appendQueryParameter("slug", (String)localList.get(1)).build();
      startActivity(new Intent(this, ListTabActivity.class).setData(localUri8));
      continue;
      Uri localUri7 = new Uri.Builder().scheme("twitter").authority("list").appendQueryParameter("screen_name", (String)localList.get(0)).appendQueryParameter("slug", (String)localList.get(1)).build();
      startActivity(new Intent(this, ListTabActivity.class).setData(localUri7).putExtra("tab", "members"));
      continue;
      Intent localIntent2 = new Intent(this, PostActivity.class);
      Uri.Builder localBuilder = new Uri.Builder().scheme("twitter").authority("post");
      String str3 = localUri1.getQueryParameter("status");
      if (!TextUtils.isEmpty(str3))
        localBuilder.appendQueryParameter("text", str3);
      String str4 = localUri1.getQueryParameter("cursor");
      if (!TextUtils.isEmpty(str4))
      {
        int j = Integer.valueOf(str4).intValue();
        localIntent2.putExtra("selection", new int[] { j, j });
      }
      localIntent2.setData(localBuilder.build()).setFlags(67108864);
      startActivity(localIntent2);
      continue;
      startActivity(new Intent(this, ListTabActivity.class).putExtra("screen_name", getString(2131427329)).putExtra("list_name", getString(2131427577)).putExtra("slug", (String)localList.get(2)));
      continue;
      startActivity(new Intent(this, SearchTweetsActivity.class).putExtra("query", (String)localList.get(2)));
      continue;
      Uri localUri6 = new Uri.Builder().scheme("twitter").authority("list").appendQueryParameter("screen_name", (String)localList.get(0)).build();
      startActivity(new Intent(this, ProfileActivity.class).setData(localUri6));
      continue;
      onSearchRequested();
      continue;
      startActivity(new Intent(this, MessagesThreadActivity.class).putExtra("owner_id", this.a.j()));
      continue;
      startActivity(new Intent(this, MessagesThreadActivity.class).putExtra("owner_id", this.a.e()).putExtra("user_name", (String)localList.get(2)));
      continue;
      try
      {
        startActivity(new Intent(this, MessagesThreadActivity.class).putExtra("user_id", Long.valueOf((String)localList.get(2))).putExtra("owner_id", this.a.e()).putExtra("user_name", (String)localList.get(1)));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        startActivity(new Intent(this, HomeTabActivity.class));
      }
      continue;
      Uri localUri5 = new Uri.Builder().scheme("twitter").authority("mentions").build();
      startActivity(new Intent(this, HomeTabActivity.class).setData(localUri5));
      continue;
      Uri localUri4 = new Uri.Builder().scheme("twitter").authority("messages").build();
      startActivity(new Intent(this, MessagesActivity.class).setData(localUri4));
      continue;
      startActivity(new Intent(this, UsersActivity.class).putExtra("type", 7).setAction("com.twitter.android.intent.action.FOLLOW"));
      continue;
      startActivity(new Intent(this, SULActivity.class));
      continue;
      Uri localUri3 = new Uri.Builder().scheme("twitter").authority("list").build();
      startActivity(new Intent(this, HomeTabActivity.class).setData(localUri3));
      continue;
      startActivity(new Intent(this, TimelineActivity.class).putExtra("owner_id", this.a.e()).putExtra("type", 2));
      continue;
      String str2 = String.valueOf(this.a.j());
      startActivity(new Intent(this, EditProfileActivity.class).setData(ao.c.buildUpon().appendEncodedPath(str2).appendQueryParameter("ownerId", str2).build()));
      continue;
      Uri localUri2 = new Uri.Builder().scheme("twitter").authority("user").appendQueryParameter("screen_name", (String)localList.get(1)).build();
      startActivity(new Intent(this, ProfileActivity.class).setData(localUri2));
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.UrlInterpreterActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
