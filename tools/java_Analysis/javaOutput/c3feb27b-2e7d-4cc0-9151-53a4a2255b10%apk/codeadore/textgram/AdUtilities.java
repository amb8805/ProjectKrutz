package codeadore.textgram;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import org.json.JSONException;
import org.json.JSONObject;

public class AdUtilities
{
  public AdUtilities()
  {
  }

  // ERROR //
  public static void installAd(Activity paramActivity, View paramView)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 16
    //   3: iconst_0
    //   4: invokevirtual 22	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   7: astore_2
    //   8: getstatic 28	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   11: ifnull +25 -> 36
    //   14: getstatic 28	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   17: ldc 30
    //   19: invokevirtual 36	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   22: ifeq +14 -> 36
    //   25: getstatic 28	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   28: ldc 30
    //   30: invokevirtual 40	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   33: putstatic 44	codeadore/textgram/Settings:adMobPublisherID	Ljava/lang/String;
    //   36: getstatic 48	codeadore/textgram/Settings:isPro	Z
    //   39: ifne +97 -> 136
    //   42: aload_2
    //   43: ldc 50
    //   45: iconst_0
    //   46: invokeinterface 56 3 0
    //   51: ifne +85 -> 136
    //   54: ldc 58
    //   56: astore_3
    //   57: ldc 58
    //   59: astore 4
    //   61: getstatic 61	codeadore/textgram/Settings:testMode	Z
    //   64: ifne +35 -> 99
    //   67: getstatic 28	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   70: ldc 63
    //   72: invokevirtual 40	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   75: astore 14
    //   77: aload 14
    //   79: astore 4
    //   81: aload 4
    //   83: ifnull +16 -> 99
    //   86: aload 4
    //   88: ldc 65
    //   90: invokevirtual 71	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   93: ifeq +62 -> 155
    //   96: ldc 65
    //   98: astore_3
    //   99: aload_3
    //   100: ldc 65
    //   102: if_acmpne +85 -> 187
    //   105: new 73	com/applovin/adview/AppLovinAdView
    //   108: dup
    //   109: aload_0
    //   110: invokestatic 79	com/applovin/sdk/AppLovinSdk:getInstance	(Landroid/content/Context;)Lcom/applovin/sdk/AppLovinSdk;
    //   113: getstatic 85	com/applovin/sdk/AppLovinAdSize:BANNER	Lcom/applovin/sdk/AppLovinAdSize;
    //   116: aload_0
    //   117: invokespecial 88	com/applovin/adview/AppLovinAdView:<init>	(Lcom/applovin/sdk/AppLovinSdk;Lcom/applovin/sdk/AppLovinAdSize;Landroid/app/Activity;)V
    //   120: astore 5
    //   122: aload 5
    //   124: invokevirtual 91	com/applovin/adview/AppLovinAdView:loadNextAd	()V
    //   127: aload_1
    //   128: checkcast 93	android/view/ViewGroup
    //   131: aload 5
    //   133: invokevirtual 97	android/view/ViewGroup:addView	(Landroid/view/View;)V
    //   136: return
    //   137: astore 15
    //   139: aload 15
    //   141: invokevirtual 100	org/json/JSONException:printStackTrace	()V
    //   144: goto -108 -> 36
    //   147: astore 13
    //   149: ldc 58
    //   151: astore_3
    //   152: goto -71 -> 81
    //   155: aload 4
    //   157: ldc 102
    //   159: invokevirtual 71	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   162: ifeq +9 -> 171
    //   165: ldc 102
    //   167: astore_3
    //   168: goto -69 -> 99
    //   171: aload 4
    //   173: ldc 104
    //   175: invokevirtual 71	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   178: ifeq -79 -> 99
    //   181: ldc 104
    //   183: astore_3
    //   184: goto -85 -> 99
    //   187: new 106	com/google/ads/AdView
    //   190: dup
    //   191: aload_0
    //   192: getstatic 111	com/google/ads/AdSize:BANNER	Lcom/google/ads/AdSize;
    //   195: getstatic 44	codeadore/textgram/Settings:adMobPublisherID	Ljava/lang/String;
    //   198: invokespecial 114	com/google/ads/AdView:<init>	(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V
    //   201: astore 6
    //   203: aload_1
    //   204: checkcast 93	android/view/ViewGroup
    //   207: aload 6
    //   209: invokevirtual 97	android/view/ViewGroup:addView	(Landroid/view/View;)V
    //   212: new 116	com/google/ads/AdRequest
    //   215: dup
    //   216: invokespecial 117	com/google/ads/AdRequest:<init>	()V
    //   219: astore 7
    //   221: aload 7
    //   223: ldc 119
    //   225: invokevirtual 123	com/google/ads/AdRequest:addTestDevice	(Ljava/lang/String;)Lcom/google/ads/AdRequest;
    //   228: pop
    //   229: aload 7
    //   231: ldc 125
    //   233: invokevirtual 123	com/google/ads/AdRequest:addTestDevice	(Ljava/lang/String;)Lcom/google/ads/AdRequest;
    //   236: pop
    //   237: aload 7
    //   239: ldc 127
    //   241: invokevirtual 123	com/google/ads/AdRequest:addTestDevice	(Ljava/lang/String;)Lcom/google/ads/AdRequest;
    //   244: pop
    //   245: aload 7
    //   247: ldc 129
    //   249: invokevirtual 123	com/google/ads/AdRequest:addTestDevice	(Ljava/lang/String;)Lcom/google/ads/AdRequest;
    //   252: pop
    //   253: aload 7
    //   255: ldc 131
    //   257: invokevirtual 123	com/google/ads/AdRequest:addTestDevice	(Ljava/lang/String;)Lcom/google/ads/AdRequest;
    //   260: pop
    //   261: aload 6
    //   263: aload 7
    //   265: invokevirtual 135	com/google/ads/AdView:loadAd	(Lcom/google/ads/AdRequest;)V
    //   268: return
    //
    // Exception table:
    //   from	to	target	type
    //   25	36	137	org/json/JSONException
    //   67	77	147	java/lang/Exception
  }

  public static void installFullScreenAd(Activity paramActivity, View paramView)
  {
    if (!Settings.isPro)
    {
      str1 = "admob";
      localObject = "admob";
      try
      {
        String str2 = Settings.json.getString("interstitials");
        localObject = str2;
        if (localObject != null)
        {
          if (((String)localObject).contains("applovin"))
            str1 = "applovin";
        }
        else
        {
          if (str1 == "applovin")
          {
            AppLovinAdView localAppLovinAdView = new AppLovinAdView(AppLovinSdk.getInstance(paramActivity), AppLovinAdSize.INTERSTITIAL, paramActivity);
            localAppLovinAdView.loadNextAd();
            localAppLovinAdView.setAdLoadListener(new AdUtilities.1(paramView));
            localAppLovinAdView.setAdClickListener(new AdUtilities.2(paramView));
            ((ViewGroup)paramView).addView(localAppLovinAdView);
          }
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          str1 = "admob";
          continue;
          if (((String)localObject).contains("amazon"))
            str1 = "amazon";
          else if (((String)localObject).contains("inneractive"))
            str1 = "inneractive";
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.AdUtilities
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
