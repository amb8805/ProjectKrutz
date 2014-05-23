package com.twitter.android.provider;

import ag;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.database.MergeCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwitterProvider extends ContentProvider
{
  private static final boolean a = Log.isLoggable("TwitterProvider", 3);
  private static final UriMatcher b;
  private static final Uri c = Uri.parse("android.resource://com.twitter.android/drawable/ic_search_default");
  private static final Uri d = Uri.parse("android.resource://com.twitter.android/drawable/ic_search_user");
  private static final Uri e = Uri.parse("android.resource://com.twitter.android/drawable/ic_search_saved");
  private static final String[] f = { "_id", "suggest_icon_1", "suggest_text_1", "suggest_intent_query", "suggest_intent_action", "suggest_text_2", "suggest_intent_data" };

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    b = localUriMatcher;
    localUriMatcher.addURI("com.twitter.android.provider.TwitterProvider", "users", 1);
    b.addURI("com.twitter.android.provider.TwitterProvider", "users/id/#", 2);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups", 60);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/#", 70);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/following/#", 72);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/followers/#", 73);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/blocked/#", 74);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/members/#", 75);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/subscribers/#", 76);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/people/#", 77);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/search", 78);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/slug/#", 79);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/contacts/#", 80);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/activity/#", 81);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/favorited/#", 82);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_groups_view/retweeted/#", 83);
    b.addURI("com.twitter.android.provider.TwitterProvider", "statuses", 20);
    b.addURI("com.twitter.android.provider.TwitterProvider", "statuses/id/#", 21);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups", 110);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups/#", 111);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view", 120);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/#", 121);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/id/#", 122);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/timeline/#", 123);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/favorites/#", 124);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/home/#", 125);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/replies/#", 126);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/mentions/#", 128);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/retweetedbyme/#", 129);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/retweetedtome/#", 130);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/retweetsofme/#", 131);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/list/#", 132);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/drafts/#", 133);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/mentions_and_rts/#", 134);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/conversation/#", 136);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_view/search_results/#", 137);
    b.addURI("com.twitter.android.provider.TwitterProvider", "status_groups_retweets_view/rt_timeline/#", 135);
    b.addURI("com.twitter.android.provider.TwitterProvider", "messages", 201);
    b.addURI("com.twitter.android.provider.TwitterProvider", "messages/id/#", 200);
    b.addURI("com.twitter.android.provider.TwitterProvider", "messages_sent_view/#", 213);
    b.addURI("com.twitter.android.provider.TwitterProvider", "messages_received_view/#", 214);
    b.addURI("com.twitter.android.provider.TwitterProvider", "messages_threaded/#", 215);
    b.addURI("com.twitter.android.provider.TwitterProvider", "messages_conversation", 216);
    b.addURI("com.twitter.android.provider.TwitterProvider", "lists", 220);
    b.addURI("com.twitter.android.provider.TwitterProvider", "lists/id/#", 221);
    b.addURI("com.twitter.android.provider.TwitterProvider", "lists_view", 300);
    b.addURI("com.twitter.android.provider.TwitterProvider", "lists_view/#", 301);
    b.addURI("com.twitter.android.provider.TwitterProvider", "lists_view/id/#", 302);
    b.addURI("com.twitter.android.provider.TwitterProvider", "search_queries", 520);
    b.addURI("com.twitter.android.provider.TwitterProvider", "search_queries/#", 521);
    b.addURI("com.twitter.android.provider.TwitterProvider", "search_suggest_query", 600);
    b.addURI("com.twitter.android.provider.TwitterProvider", "search_suggest_query/*", 600);
    b.addURI("com.twitter.android.provider.TwitterProvider", "search_suggest_shortcut", 601);
    b.addURI("com.twitter.android.provider.TwitterProvider", "search_suggest_shortcut/*", 601);
    b.addURI("com.twitter.android.provider.TwitterProvider", "activities", 700);
    b.addURI("com.twitter.android.provider.TwitterProvider", "stories", 800);
    b.addURI("com.twitter.android.provider.TwitterProvider", "slug_users_view", 900);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_recommendations_view", 901);
    b.addURI("com.twitter.android.provider.TwitterProvider", "user_recommendations_view/similar_to/#", 902);
  }

  public TwitterProvider()
  {
  }

  private static long a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    String[] arrayOfString1 = { "in_r_status_id" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramLong);
    localCursor = paramSQLiteDatabase.query("status_groups_view", arrayOfString1, "g_status_id=?", arrayOfString2, null, null, null, "1");
    if (localCursor != null)
      try
      {
        if (localCursor.moveToFirst())
        {
          long l = localCursor.getLong(0);
          return l;
        }
        return 0L;
      }
      finally
      {
        localCursor.close();
      }
  }

  private Cursor a(String paramString)
  {
    String str1 = paramString.toLowerCase();
    if (a)
      Log.d("TwitterProvider", "getSuggestions: " + str1);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("search_queries");
    localSQLiteQueryBuilder.appendWhere("name LIKE ");
    localSQLiteQueryBuilder.appendWhereEscapeString(str1 + "%");
    localSQLiteQueryBuilder.appendWhere(" AND query!=''");
    localSQLiteQueryBuilder.appendWhere(" AND query NOT LIKE 'place:%'");
    localSQLiteQueryBuilder.setDistinct(true);
    Context localContext = getContext();
    Cursor localCursor = localSQLiteQueryBuilder.query(ak.a(localContext, f.b(localContext)).getReadableDatabase(), w.a, "type IN (6,0,4)", null, "name", null, "type ASC, query_id DESC, time ASC");
    MatrixCursor localMatrixCursor = new MatrixCursor(f);
    long l1 = 1L;
    long l3;
    if (!TextUtils.isEmpty(str1))
    {
      boolean bool = ag.g.matcher(str1).matches();
      if ((bool) && (str1.charAt(0) == '@'))
      {
        MatrixCursor.RowBuilder localRowBuilder4 = localMatrixCursor.newRow();
        localRowBuilder4.add(Long.valueOf(1L));
        localRowBuilder4.add(d);
        localRowBuilder4.add(str1);
        localRowBuilder4.add(str1.substring(1));
        localRowBuilder4.add("com.twitter.android.action.USER_SHOW");
        bool = false;
        l1 = 2L;
      }
      MatrixCursor.RowBuilder localRowBuilder2 = localMatrixCursor.newRow();
      l3 = 1L + l1;
      localRowBuilder2.add(Long.valueOf(l1));
      localRowBuilder2.add(c);
      localRowBuilder2.add(localContext.getString(2131427542, new Object[] { str1 }));
      localRowBuilder2.add(str1);
      if (!bool)
        break label845;
      MatrixCursor.RowBuilder localRowBuilder3 = localMatrixCursor.newRow();
      localRowBuilder3.add(Long.valueOf(2L));
      localRowBuilder3.add(d);
      localRowBuilder3.add('@' + str1);
      localRowBuilder3.add(str1);
      localRowBuilder3.add("com.twitter.android.action.USER_SHOW");
    }
    label832: label845: for (l1 = 3L; ; l1 = l3)
    {
      if (localCursor == null)
        return localMatrixCursor;
      if (a)
        Log.d("TwitterProvider", "getSuggestions results: " + localCursor.getCount());
      try
      {
        if (localCursor.moveToNext())
        {
          int i = localCursor.getInt(2);
          Uri.Builder localBuilder = c.a.buildUpon();
          localBuilder.appendQueryParameter("type", Integer.toString(i));
          switch (i)
          {
          case 5:
          default:
            localUri2 = c;
            if ((localCursor.isNull(3)) || (localCursor.isNull(4)))
              break label832;
            str2 = "com.twitter.android.action.SEARCH_NEARBY";
            d1 = localCursor.getDouble(3);
            d2 = localCursor.getDouble(4);
            if (localCursor.isNull(5))
            {
              arrayOfObject = new Object[2];
              arrayOfObject[0] = Double.valueOf(d1);
              arrayOfObject[1] = Double.valueOf(d2);
            }
          case 4:
          case 6:
          }
          for (localObject3 = localContext.getString(2131427544, arrayOfObject); ; localObject3 = str4)
          {
            localBuilder.appendQueryParameter("latitude", Double.toString(d1));
            localBuilder.appendQueryParameter("longitude", Double.toString(d2));
            localObject2 = localObject3;
            localUri1 = localUri2;
            while (true)
            {
              localRowBuilder1 = localMatrixCursor.newRow();
              l2 = 1L + l1;
              localRowBuilder1.add(Long.valueOf(l1));
              localRowBuilder1.add(localUri1);
              localRowBuilder1.add(localCursor.getString(0));
              localRowBuilder1.add(localCursor.getString(1));
              localRowBuilder1.add(str2);
              localRowBuilder1.add(localObject2);
              localRowBuilder1.add(localBuilder.build());
              l1 = l2;
              break;
              localUri1 = c;
              str2 = "com.twitter.android.action.SEARCH_USERS";
              localObject2 = null;
              continue;
              localUri1 = e;
              str2 = null;
              localObject2 = null;
            }
            str3 = localCursor.getString(5);
            str4 = localContext.getString(2131427543, new Object[] { str3 });
            localBuilder.appendQueryParameter("location", str3);
          }
        }
        return localMatrixCursor;
      }
      finally
      {
        localCursor.close();
      }
      while (true)
      {
        Uri localUri2;
        double d1;
        double d2;
        Object[] arrayOfObject;
        Object localObject3;
        MatrixCursor.RowBuilder localRowBuilder1;
        long l2;
        String str3;
        String str4;
        Uri localUri1 = localUri2;
        String str2 = null;
        Object localObject2 = null;
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("Delete not supported: " + paramUri);
  }

  public String getType(Uri paramUri)
  {
    switch (b.match(paramUri))
    {
    default:
      throw new IllegalArgumentException("Unknown URL " + paramUri);
    case 1:
      return "vnd.android.cursor.dir/vnd.twitter.android.users";
    case 2:
      return "vnd.android.cursor.item/vnd.twitter.android.users";
    case 60:
    case 70:
    case 72:
    case 73:
    case 74:
    case 75:
    case 76:
    case 77:
    case 78:
    case 81:
    case 82:
    case 83:
      return "vnd.android.cursor.dir/vnd.twitter.android.users.groups";
    case 20:
      return "vnd.android.cursor.dir/vnd.twitter.android.statuses";
    case 21:
      return "vnd.android.cursor.item/vnd.twitter.android.statuses";
    case 121:
    case 122:
      return "vnd.android.cursor.item/vnd.twitter.android.statuses";
    case 120:
    case 123:
    case 124:
    case 125:
    case 126:
    case 128:
    case 129:
    case 130:
    case 131:
    case 132:
    case 133:
    case 134:
    case 135:
    case 136:
    case 137:
      return "vnd.android.cursor.dir/vnd.twitter.android.statuses";
    case 110:
      return "vnd.android.cursor.dir/vnd.twitter.android.statuses.groups";
    case 111:
      return "vnd.android.cursor.item/vnd.twitter.android.statuses.groups";
    case 200:
      return "vnd.android.cursor.item/vnd.twitter.android.messages";
    case 201:
    case 213:
    case 214:
    case 215:
      return "vnd.android.cursor.dir/vnd.twitter.android.messages";
    case 220:
    case 300:
      return "vnd.android.cursor.dir/vnd.twitter.android.lists";
    case 221:
    case 301:
    case 302:
      return "vnd.android.cursor.item/vnd.twitter.android.lists";
    case 520:
      return "vnd.android.cursor.dir/vnd.twitter.android.search.queries";
    case 521:
      return "vnd.android.cursor.item/vnd.twitter.android.search.queries";
    case 600:
      return "vnd.android.cursor.dir/vnd.android.search.suggest";
    case 601:
      return "vnd.android.cursor.item/vnd.android.search.suggest";
    case 700:
      return "vnd.android.cursor.dir/vnd.twitter.android.activities";
    case 800:
      return "vnd.android.cursor.dir/vnd.twitter.android.stories";
    case 900:
    }
    return "vnd.android.cursor.dir/vnd.twitter.android.search.queries";
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("Insert not supported " + paramUri);
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    String str1 = paramUri.getQueryParameter("limit");
    String str2 = paramUri.getQueryParameter("ownerId");
    if (TextUtils.isEmpty(str2));
    SQLiteQueryBuilder localSQLiteQueryBuilder1;
    int i;
    for (SQLiteDatabase localSQLiteDatabase = ak.a(getContext(), 0L).getReadableDatabase(); ; localSQLiteDatabase = ak.a(getContext(), Long.parseLong(str2)).getReadableDatabase())
    {
      localSQLiteQueryBuilder1 = new SQLiteQueryBuilder();
      if (a)
        Log.d("TwitterProvider", "QUERY uri: " + paramUri + " -> " + b.match(paramUri));
      i = b.match(paramUri);
      switch (i)
      {
      default:
        throw new IllegalArgumentException("Unknown URL " + paramUri);
      case 1:
      case 2:
      case 60:
      case 70:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 78:
      case 77:
      case 79:
      case 80:
      case 81:
      case 82:
      case 83:
      case 20:
      case 21:
      case 110:
      case 111:
      case 120:
      case 121:
      case 122:
      case 123:
      case 135:
      case 124:
      case 125:
      case 126:
      case 128:
      case 129:
      case 130:
      case 131:
      case 132:
      case 133:
      case 134:
      case 136:
      case 137:
      case 220:
      case 221:
      case 300:
      case 301:
      case 302:
      case 200:
      case 201:
      case 213:
      case 214:
      case 215:
      case 216:
      case 520:
      case 521:
      case 600:
      case 601:
      case 700:
      case 800:
      case 900:
      case 901:
      case 902:
      }
    }
    localSQLiteQueryBuilder1.setTables("users");
    if (i == 2)
      localSQLiteQueryBuilder1.appendWhere("user_id=" + paramUri.getLastPathSegment());
    Object localObject2 = null;
    Object localObject1 = "profile_created DESC";
    String[] arrayOfString = paramArrayOfString1;
    while (true)
    {
      Object localObject3;
      label684: String str10;
      String str12;
      if (!TextUtils.isEmpty(paramString2))
      {
        localObject3 = paramString2;
        if (a)
          Log.d("TwitterProvider", "QUERY: " + localSQLiteQueryBuilder1.buildQuery(arrayOfString, paramString1, paramArrayOfString2, null, null, paramString2, str1));
        Cursor localCursor3 = localSQLiteQueryBuilder1.query(localSQLiteDatabase, arrayOfString, paramString1, paramArrayOfString2, (String)localObject2, null, (String)localObject3, str1);
        if (a)
          Log.d("TwitterProvider", "QUERY results: " + localCursor3.getCount());
        localCursor3.setNotificationUri(getContext().getContentResolver(), paramUri);
        return localCursor3;
        localSQLiteQueryBuilder1.setTables("user_groups");
        str10 = "type DESC";
        if (str1 == null)
        {
          str1 = String.valueOf(400);
          localObject1 = str10;
          arrayOfString = paramArrayOfString1;
          localObject2 = null;
          continue;
          localSQLiteQueryBuilder1.setTables("user_groups_view");
          localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment());
          localObject1 = "_id ASC";
          arrayOfString = paramArrayOfString1;
          localObject2 = null;
          continue;
          localSQLiteQueryBuilder1.setTables("user_groups_view");
          localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 0);
          str10 = "_id ASC";
          if (str1 == null)
          {
            str1 = String.valueOf(400);
            localObject1 = str10;
            arrayOfString = paramArrayOfString1;
            localObject2 = null;
            continue;
            localSQLiteQueryBuilder1.setTables("user_groups_view");
            localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 1);
            str10 = "_id ASC";
            if (str1 == null)
            {
              str1 = String.valueOf(400);
              localObject1 = str10;
              arrayOfString = paramArrayOfString1;
              localObject2 = null;
              continue;
              localSQLiteQueryBuilder1.setTables("user_groups_view");
              localSQLiteQueryBuilder1.appendWhere("type=2");
              str10 = "_id ASC";
              if (str1 == null)
              {
                str1 = String.valueOf(400);
                localObject1 = str10;
                arrayOfString = paramArrayOfString1;
                localObject2 = null;
                continue;
                localSQLiteQueryBuilder1.setTables("user_groups_view");
                localSQLiteQueryBuilder1.appendWhere("type=4");
                str10 = "_id ASC";
                if (str1 == null)
                {
                  str1 = String.valueOf(400);
                  localObject1 = str10;
                  arrayOfString = paramArrayOfString1;
                  localObject2 = null;
                  continue;
                  localSQLiteQueryBuilder1.setTables("user_groups_view");
                  localSQLiteQueryBuilder1.appendWhere("type=5");
                  str10 = "_id ASC";
                  if (str1 == null)
                  {
                    str1 = String.valueOf(400);
                    localObject1 = str10;
                    arrayOfString = paramArrayOfString1;
                    localObject2 = null;
                    continue;
                    localSQLiteQueryBuilder1.setTables("user_groups_view");
                    localSQLiteQueryBuilder1.appendWhere("type=3");
                    str10 = "_id ASC";
                    if (str1 == null)
                    {
                      str1 = String.valueOf(400);
                      localObject1 = str10;
                      arrayOfString = paramArrayOfString1;
                      localObject2 = null;
                      continue;
                      localSQLiteQueryBuilder1.setTables("user_groups_view");
                      localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + " IN (" + 1 + "," + 0 + "," + -1 + ")");
                      localObject1 = "_id ASC";
                      str12 = "user_id";
                      if (str1 != null)
                        break label4569;
                      str1 = String.valueOf(400);
                      localObject2 = str12;
                      arrayOfString = paramArrayOfString1;
                      continue;
                      localSQLiteQueryBuilder1.setTables("user_groups_view");
                      localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 6);
                      localObject1 = "_id ASC";
                      str12 = "user_id";
                      if (str1 != null)
                        break label4569;
                      str1 = String.valueOf(400);
                      localObject2 = str12;
                      arrayOfString = paramArrayOfString1;
                      continue;
                      localSQLiteQueryBuilder1.setTables("user_groups_view");
                      localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 7);
                      localObject1 = "_id ASC";
                      str12 = "user_id";
                      if (str1 != null)
                        break label4569;
                      str1 = String.valueOf(400);
                      localObject2 = str12;
                      arrayOfString = paramArrayOfString1;
                      continue;
                      localSQLiteQueryBuilder1.setTables("user_groups_view");
                      localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 8);
                      localObject1 = "_id ASC";
                      str12 = "user_id";
                      if (str1 != null)
                        break label4569;
                      str1 = String.valueOf(400);
                      localObject2 = str12;
                      arrayOfString = paramArrayOfString1;
                      continue;
                      localSQLiteQueryBuilder1.setTables("user_groups_view");
                      localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 11);
                      localObject1 = "_id ASC";
                      str12 = "user_id";
                      if (str1 != null)
                        break label4569;
                      str1 = String.valueOf(400);
                      localObject2 = str12;
                      arrayOfString = paramArrayOfString1;
                      continue;
                      localSQLiteQueryBuilder1.setTables("user_groups_view");
                      localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 12);
                      localObject1 = "_id ASC";
                      str12 = "user_id";
                      if (str1 != null)
                        break label4569;
                      str1 = String.valueOf(400);
                      localObject2 = str12;
                      arrayOfString = paramArrayOfString1;
                      continue;
                      localSQLiteQueryBuilder1.setTables("statuses");
                      if (i == 21)
                        localSQLiteQueryBuilder1.appendWhere("status_id=" + paramUri.getLastPathSegment());
                      str10 = "created DESC";
                      if (str1 == null)
                      {
                        str1 = String.valueOf(400);
                        localObject1 = str10;
                        arrayOfString = paramArrayOfString1;
                        localObject2 = null;
                        continue;
                        localSQLiteQueryBuilder1.setTables("status_groups");
                        if (i == 111)
                          localSQLiteQueryBuilder1.appendWhere("_id=" + paramUri.getLastPathSegment());
                        str10 = "type DESC";
                        if (str1 == null)
                        {
                          str1 = String.valueOf(400);
                          localObject1 = str10;
                          arrayOfString = paramArrayOfString1;
                          localObject2 = null;
                          continue;
                          localSQLiteQueryBuilder1.setTables("status_groups_view");
                          str10 = "updated_at DESC, _id ASC";
                          if (str1 == null)
                          {
                            str1 = String.valueOf(400);
                            localObject1 = str10;
                            arrayOfString = paramArrayOfString1;
                            localObject2 = null;
                            continue;
                            localSQLiteQueryBuilder1.setTables("status_groups_view");
                            localSQLiteQueryBuilder1.appendWhere("_id=" + paramUri.getLastPathSegment());
                            str10 = "updated_at DESC, _id ASC";
                            if (str1 == null)
                            {
                              str1 = String.valueOf(400);
                              localObject1 = str10;
                              arrayOfString = paramArrayOfString1;
                              localObject2 = null;
                              continue;
                              localSQLiteQueryBuilder1.setTables("status_groups_view");
                              localSQLiteQueryBuilder1.appendWhere("g_status_id=" + paramUri.getLastPathSegment());
                              str1 = "1";
                              localObject1 = "updated_at DESC, _id ASC";
                              arrayOfString = paramArrayOfString1;
                              localObject2 = null;
                              continue;
                              localSQLiteQueryBuilder1.setTables("status_groups_view");
                              localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 1);
                              str10 = "updated_at DESC, _id ASC";
                              if (str1 == null)
                              {
                                str1 = String.valueOf(400);
                                localObject1 = str10;
                                arrayOfString = paramArrayOfString1;
                                localObject2 = null;
                                continue;
                                if (paramArrayOfString1 != null)
                                  break label4563;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      else
      {
        label4503: label4563: for (arrayOfString = ax.c; ; arrayOfString = paramArrayOfString1)
        {
          localSQLiteQueryBuilder1.setTables("status_groups_retweets_view");
          localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 1);
          if (str1 == null)
          {
            str1 = String.valueOf(400);
            localObject1 = "updated_at DESC, _id ASC";
            localObject2 = null;
            break;
            localSQLiteQueryBuilder1.setTables("status_groups_view");
            localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 2);
            str10 = "updated_at DESC, _id ASC";
            if (str1 == null)
            {
              str1 = String.valueOf(400);
              localObject1 = str10;
              arrayOfString = paramArrayOfString1;
              localObject2 = null;
              break;
              localSQLiteQueryBuilder1.setTables("status_groups_view");
              localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 0);
              String str11 = paramUri.getQueryParameter("newer");
              if (str11 != null)
                localSQLiteQueryBuilder1.appendWhere(" AND updated_at>" + str11);
              str10 = "updated_at DESC, _id ASC";
              if (str1 == null)
              {
                str1 = String.valueOf(400);
                localObject1 = str10;
                arrayOfString = paramArrayOfString1;
                localObject2 = null;
                break;
                localSQLiteQueryBuilder1.setTables("status_groups_view");
                localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 3);
                str10 = "updated_at DESC, _id ASC";
                if (str1 == null)
                {
                  str1 = String.valueOf(400);
                  localObject1 = str10;
                  arrayOfString = paramArrayOfString1;
                  localObject2 = null;
                  break;
                  localSQLiteQueryBuilder1.setTables("status_groups_view");
                  localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 5);
                  localObject1 = "updated_at DESC, _id ASC";
                  arrayOfString = paramArrayOfString1;
                  localObject2 = null;
                  break;
                  localSQLiteQueryBuilder1.setTables("status_groups_view");
                  localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 6);
                  str10 = "updated_at DESC, _id ASC";
                  if (str1 == null)
                  {
                    str1 = String.valueOf(400);
                    localObject1 = str10;
                    arrayOfString = paramArrayOfString1;
                    localObject2 = null;
                    break;
                    localSQLiteQueryBuilder1.setTables("status_groups_view");
                    localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 7);
                    str10 = "updated_at DESC, _id ASC";
                    if (str1 == null)
                    {
                      str1 = String.valueOf(400);
                      localObject1 = str10;
                      arrayOfString = paramArrayOfString1;
                      localObject2 = null;
                      break;
                      localSQLiteQueryBuilder1.setTables("status_groups_view");
                      localSQLiteQueryBuilder1.appendWhere("type=8");
                      str10 = "updated_at DESC, _id ASC";
                      if (str1 == null)
                      {
                        str1 = String.valueOf(400);
                        localObject1 = str10;
                        arrayOfString = paramArrayOfString1;
                        localObject2 = null;
                        break;
                        localSQLiteQueryBuilder1.setTables("status_groups_view");
                        localSQLiteQueryBuilder1.appendWhere("type=9");
                        str10 = "updated_at DESC, _id ASC";
                        if (str1 == null)
                        {
                          str1 = String.valueOf(400);
                          localObject1 = str10;
                          arrayOfString = paramArrayOfString1;
                          localObject2 = null;
                          break;
                          localSQLiteQueryBuilder1.setTables("status_groups_view");
                          localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 11);
                          str10 = "updated_at DESC, _id ASC";
                          if (str1 == null)
                          {
                            str1 = String.valueOf(400);
                            localObject1 = str10;
                            arrayOfString = paramArrayOfString1;
                            localObject2 = null;
                            break;
                            localSQLiteQueryBuilder1.setTables("status_groups_view");
                            localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND (" + "type" + '=' + 5 + " OR (" + "type" + '=' + 8 + " AND " + "retweet_count" + " > 0))");
                            str10 = "updated_at DESC, _id ASC";
                            if (str1 == null)
                            {
                              str1 = String.valueOf(400);
                              localObject1 = str10;
                              arrayOfString = paramArrayOfString1;
                              localObject2 = null;
                              break;
                              String str8 = paramUri.getLastPathSegment();
                              ArrayList localArrayList = new ArrayList();
                              long l2;
                              for (long l1 = Long.valueOf(str8).longValue(); ; l1 = l2)
                              {
                                l2 = a(localSQLiteDatabase, l1);
                                if (l2 <= 0L)
                                  break;
                                localSQLiteQueryBuilder1.setTables("status_groups_view");
                                localSQLiteQueryBuilder1.appendWhere("g_status_id=" + l2);
                                localArrayList.add(0, localSQLiteQueryBuilder1.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, "g_status_id", null, null, "1"));
                                localSQLiteQueryBuilder1 = new SQLiteQueryBuilder();
                              }
                              localSQLiteQueryBuilder1.setTables("status_groups_view");
                              localSQLiteQueryBuilder1.appendWhere("g_status_id=" + str8);
                              localArrayList.add(localSQLiteQueryBuilder1.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, null, "1"));
                              SQLiteQueryBuilder localSQLiteQueryBuilder2 = new SQLiteQueryBuilder();
                              localSQLiteQueryBuilder2.setTables("status_groups_view");
                              localSQLiteQueryBuilder2.appendWhere("in_r_status_id=" + str8 + " AND (" + "type" + "!=" + 11 + ")");
                              if (str1 == null);
                              for (String str9 = Long.toString(400L); ; str9 = str1)
                              {
                                localArrayList.add(localSQLiteQueryBuilder2.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, "g_status_id", null, "updated_at ASC, _id DESC", str9));
                                Cursor[] arrayOfCursor = new Cursor[localArrayList.size()];
                                localArrayList.toArray(arrayOfCursor);
                                MergeCursor localMergeCursor = new MergeCursor(arrayOfCursor);
                                localMergeCursor.setNotificationUri(getContext().getContentResolver(), paramUri);
                                return localMergeCursor;
                                localSQLiteQueryBuilder1.setTables("status_groups_view");
                                localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND (" + "type" + '=' + 13 + " )");
                                localObject1 = "tag DESC, updated_at DESC";
                                arrayOfString = paramArrayOfString1;
                                localObject2 = null;
                                break;
                                localSQLiteQueryBuilder1.setTables("lists");
                                if (i == 221)
                                  localSQLiteQueryBuilder1.appendWhere("list_id=" + paramUri.getLastPathSegment());
                                localObject1 = "full_name ASC";
                                arrayOfString = paramArrayOfString1;
                                localObject2 = null;
                                break;
                                localSQLiteQueryBuilder1.setTables("lists_view");
                                localObject1 = "full_name ASC";
                                arrayOfString = paramArrayOfString1;
                                localObject2 = null;
                                break;
                                localSQLiteQueryBuilder1.setTables("lists_view");
                                localSQLiteQueryBuilder1.appendWhere("_id=" + paramUri.getLastPathSegment());
                                localObject1 = "full_name ASC";
                                arrayOfString = paramArrayOfString1;
                                localObject2 = null;
                                break;
                                localSQLiteQueryBuilder1.setTables("lists_view");
                                localSQLiteQueryBuilder1.appendWhere("list_id=" + paramUri.getLastPathSegment());
                                localObject1 = "full_name ASC";
                                arrayOfString = paramArrayOfString1;
                                localObject2 = null;
                                break;
                                localSQLiteQueryBuilder1.setTables("messages");
                                localSQLiteQueryBuilder1.appendWhere("_id=" + paramUri.getLastPathSegment());
                                if (str1 == null)
                                {
                                  str1 = "1";
                                  arrayOfString = paramArrayOfString1;
                                  localObject1 = null;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("messages");
                                  localObject1 = "created DESC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("messages_sent_view");
                                  localSQLiteQueryBuilder1.appendWhere("type=0 AND sender_id=" + paramUri.getLastPathSegment());
                                  localObject1 = "created DESC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("messages_received_view");
                                  localSQLiteQueryBuilder1.appendWhere("type=1 AND recipient_id=" + paramUri.getLastPathSegment());
                                  localObject1 = "created DESC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("messages_threaded");
                                  String str7 = paramUri.getLastPathSegment();
                                  localSQLiteQueryBuilder1.appendWhere("sender_id=" + str7 + " OR " + "recipient_id" + "=" + str7);
                                  localObject1 = "created DESC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("messages_conversation");
                                  localObject1 = "created ASC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("search_queries");
                                  String str6 = paramUri.getQueryParameter("like");
                                  if ((str6 != null) && (str6.length() > 0))
                                  {
                                    localSQLiteQueryBuilder1.appendWhere("name LIKE ");
                                    localSQLiteQueryBuilder1.appendWhereEscapeString(str6 + "%");
                                  }
                                  localObject1 = "name ASC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("search_queries");
                                  localSQLiteQueryBuilder1.appendWhere("_id=" + paramUri.getLastPathSegment());
                                  localObject1 = "name ASC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  int m = paramUri.getPathSegments().size();
                                  String str5 = null;
                                  if (m > 1)
                                    str5 = paramUri.getLastPathSegment();
                                  if (str5 == null)
                                    str5 = "";
                                  return a(str5);
                                  return null;
                                  localSQLiteQueryBuilder1.setTables("activities");
                                  localObject1 = "created_at DESC";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("stories");
                                  localObject1 = "_id ASC ";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("slug_users_view");
                                  localObject1 = "query ASC ";
                                  arrayOfString = paramArrayOfString1;
                                  localObject2 = null;
                                  break;
                                  localSQLiteQueryBuilder1.setTables("user_recommendations_view");
                                  localSQLiteQueryBuilder1.appendWhere("type=9");
                                  String str4;
                                  Cursor localCursor2;
                                  if (TextUtils.isEmpty(paramString2))
                                  {
                                    str4 = "_id ASC";
                                    localCursor2 = localSQLiteQueryBuilder1.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, str4, null);
                                    if (!TextUtils.isEmpty(str1))
                                      break label4351;
                                  }
                                  label4351: for (int k = 400; ; k = Integer.parseInt(str1))
                                  {
                                    al localal2 = new al(localCursor2, k);
                                    localal2.a();
                                    localal2.setNotificationUri(getContext().getContentResolver(), paramUri);
                                    return localal2;
                                    str4 = paramString2;
                                    break;
                                  }
                                  localSQLiteQueryBuilder1.setTables("user_recommendations_view");
                                  localSQLiteQueryBuilder1.appendWhere("owner_id=" + paramUri.getLastPathSegment() + " AND " + "type" + '=' + 10);
                                  String str3;
                                  Cursor localCursor1;
                                  if (TextUtils.isEmpty(paramString2))
                                  {
                                    str3 = "_id ASC";
                                    localCursor1 = localSQLiteQueryBuilder1.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, str3, null);
                                    if (!TextUtils.isEmpty(str1))
                                      break label4503;
                                  }
                                  for (int j = 400; ; j = Integer.parseInt(str1))
                                  {
                                    al localal1 = new al(localCursor1, j);
                                    localal1.a();
                                    localal1.setNotificationUri(getContext().getContentResolver(), paramUri);
                                    return localal1;
                                    str3 = paramString2;
                                    break;
                                  }
                                  localObject3 = localObject1;
                                  break label684;
                                }
                                arrayOfString = paramArrayOfString1;
                                localObject1 = null;
                                localObject2 = null;
                                break;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            localObject1 = str10;
            arrayOfString = paramArrayOfString1;
            localObject2 = null;
            break;
          }
          localObject1 = "updated_at DESC, _id ASC";
          localObject2 = null;
          break;
        }
        label4569: localObject2 = str12;
        arrayOfString = paramArrayOfString1;
      }
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("Update not supported: " + paramUri);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.TwitterProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
