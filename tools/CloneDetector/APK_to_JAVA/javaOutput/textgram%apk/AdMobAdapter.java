// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.mediation.admob;

import android.app.Activity;
import android.view.View;
import com.google.ads.*;
import com.google.ads.mediation.*;
import com.google.ads.util.AdUtil;

// Referenced classes of package com.google.ads.mediation.admob:
//            AdMobAdapterExtras, AdMobAdapterServerParameters

public class AdMobAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private class a
        implements AdListener
    {

        private a(AdMobAdapter admobadapter)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field AdMobAdapter a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        a(AdMobAdapter admobadapter, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void AdMobAdapter$a(AdMobAdapter)>
        //    3    5:return          
        }

        public void onDismissScreen(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #25  <Method MediationBannerListener AdMobAdapter.a(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #30  <Method void MediationBannerListener.onDismissScreen(MediationBannerAdapter)>
        //    6   16:return          
        }

        public void onFailedToReceiveAd(Ad ad, com.google.ads.AdRequest.ErrorCode errorcode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #25  <Method MediationBannerListener AdMobAdapter.a(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:aload_2         
        //    6   12:invokeinterface #35  <Method void MediationBannerListener.onFailedToReceiveAd(MediationBannerAdapter, com.google.ads.AdRequest$ErrorCode)>
        //    7   17:return          
        }

        public void onLeaveApplication(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #25  <Method MediationBannerListener AdMobAdapter.a(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #38  <Method void MediationBannerListener.onLeaveApplication(MediationBannerAdapter)>
        //    6   16:return          
        }

        public void onPresentScreen(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #25  <Method MediationBannerListener AdMobAdapter.a(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #42  <Method void MediationBannerListener.onClick(MediationBannerAdapter)>
        //    6   16:aload_0         
        //    7   17:getfield        #12  <Field AdMobAdapter a>
        //    8   20:invokestatic    #25  <Method MediationBannerListener AdMobAdapter.a(AdMobAdapter)>
        //    9   23:aload_0         
        //   10   24:getfield        #12  <Field AdMobAdapter a>
        //   11   27:invokeinterface #44  <Method void MediationBannerListener.onPresentScreen(MediationBannerAdapter)>
        //   12   32:return          
        }

        public void onReceiveAd(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #25  <Method MediationBannerListener AdMobAdapter.a(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #48  <Method void MediationBannerListener.onReceivedAd(MediationBannerAdapter)>
        //    6   16:return          
        }

        final AdMobAdapter a;
    }

    private class b
        implements AdListener
    {

        private b(AdMobAdapter admobadapter)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field AdMobAdapter a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        b(AdMobAdapter admobadapter, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void AdMobAdapter$b(AdMobAdapter)>
        //    3    5:return          
        }

        public void onDismissScreen(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #26  <Method MediationInterstitialListener AdMobAdapter.b(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #31  <Method void MediationInterstitialListener.onDismissScreen(MediationInterstitialAdapter)>
        //    6   16:return          
        }

        public void onFailedToReceiveAd(Ad ad, com.google.ads.AdRequest.ErrorCode errorcode)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #26  <Method MediationInterstitialListener AdMobAdapter.b(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:aload_2         
        //    6   12:invokeinterface #36  <Method void MediationInterstitialListener.onFailedToReceiveAd(MediationInterstitialAdapter, com.google.ads.AdRequest$ErrorCode)>
        //    7   17:return          
        }

        public void onLeaveApplication(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #26  <Method MediationInterstitialListener AdMobAdapter.b(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #39  <Method void MediationInterstitialListener.onLeaveApplication(MediationInterstitialAdapter)>
        //    6   16:return          
        }

        public void onPresentScreen(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #26  <Method MediationInterstitialListener AdMobAdapter.b(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #42  <Method void MediationInterstitialListener.onPresentScreen(MediationInterstitialAdapter)>
        //    6   16:return          
        }

        public void onReceiveAd(Ad ad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AdMobAdapter a>
        //    2    4:invokestatic    #26  <Method MediationInterstitialListener AdMobAdapter.b(AdMobAdapter)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field AdMobAdapter a>
        //    5   11:invokeinterface #46  <Method void MediationInterstitialListener.onReceivedAd(MediationInterstitialAdapter)>
        //    6   16:return          
        }

        final AdMobAdapter a;
    }


    public AdMobAdapter()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:return          
    }

    private AdRequest a(Activity activity, AdMobAdapterServerParameters admobadapterserverparameters, MediationAdRequest mediationadrequest, AdMobAdapterExtras admobadapterextras)
    {
    //    0    0:new             #24  <Class AdMobAdapterExtras>
    //    1    3:dup             
    //    2    4:aload           4
    //    3    6:invokespecial   #27  <Method void AdMobAdapterExtras(AdMobAdapterExtras)>
    //    4    9:astore          5
    //    5   11:aload           5
    //    6   13:ldc1            #29  <String "_norefresh">
    //    7   15:ldc1            #31  <String "t">
    //    8   17:invokevirtual   #35  <Method AdMobAdapterExtras AdMobAdapterExtras.addExtra(String, Object)>
    //    9   20:pop             
    //   10   21:aload           5
    //   11   23:ldc1            #37  <String "gw">
    //   12   25:iconst_1        
    //   13   26:invokestatic    #43  <Method Integer Integer.valueOf(int)>
    //   14   29:invokevirtual   #35  <Method AdMobAdapterExtras AdMobAdapterExtras.addExtra(String, Object)>
    //   15   32:pop             
    //   16   33:aload_2         
    //   17   34:getfield        #49  <Field String AdMobAdapterServerParameters.allowHouseAds>
    //   18   37:ifnull          52
    //   19   40:aload           5
    //   20   42:ldc1            #51  <String "mad_hac">
    //   21   44:aload_2         
    //   22   45:getfield        #49  <Field String AdMobAdapterServerParameters.allowHouseAds>
    //   23   48:invokevirtual   #35  <Method AdMobAdapterExtras AdMobAdapterExtras.addExtra(String, Object)>
    //   24   51:pop             
    //   25   52:new             #53  <Class AdRequest>
    //   26   55:dup             
    //   27   56:invokespecial   #54  <Method void AdRequest()>
    //   28   59:aload_3         
    //   29   60:invokevirtual   #60  <Method java.util.Date MediationAdRequest.getBirthday()>
    //   30   63:invokevirtual   #64  <Method AdRequest AdRequest.setBirthday(java.util.Date)>
    //   31   66:aload_3         
    //   32   67:invokevirtual   #68  <Method com.google.ads.AdRequest$Gender MediationAdRequest.getGender()>
    //   33   70:invokevirtual   #72  <Method AdRequest AdRequest.setGender(com.google.ads.AdRequest$Gender)>
    //   34   73:aload_3         
    //   35   74:invokevirtual   #76  <Method java.util.Set MediationAdRequest.getKeywords()>
    //   36   77:invokevirtual   #80  <Method AdRequest AdRequest.setKeywords(java.util.Set)>
    //   37   80:aload_3         
    //   38   81:invokevirtual   #84  <Method android.location.Location MediationAdRequest.getLocation()>
    //   39   84:invokevirtual   #88  <Method AdRequest AdRequest.setLocation(android.location.Location)>
    //   40   87:aload           5
    //   41   89:invokevirtual   #92  <Method AdRequest AdRequest.setNetworkExtras(NetworkExtras)>
    //   42   92:astore          8
    //   43   94:aload_3         
    //   44   95:invokevirtual   #96  <Method boolean MediationAdRequest.isTesting()>
    //   45   98:ifeq            111
    //   46  101:aload           8
    //   47  103:aload_1         
    //   48  104:invokestatic    #101 <Method String AdUtil.a(android.content.Context)>
    //   49  107:invokevirtual   #105 <Method AdRequest AdRequest.addTestDevice(String)>
    //   50  110:pop             
    //   51  111:aload           8
    //   52  113:areturn         
    }

    static MediationBannerListener a(AdMobAdapter admobadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field MediationBannerListener a>
    //    2    4:areturn         
    }

    private void a()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #110 <Method boolean b()>
    //    2    4:ifeq            17
    //    3    7:new             #112 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #114 <String "Adapter has already been destroyed">
    //    6   13:invokespecial   #117 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:return          
    }

    static MediationInterstitialListener b(AdMobAdapter admobadapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #120 <Field MediationInterstitialListener b>
    //    2    4:areturn         
    }

    private boolean b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field AdView c>
    //    2    4:ifnonnull       16
    //    3    7:aload_0         
    //    4    8:getfield        #124 <Field InterstitialAd d>
    //    5   11:ifnonnull       16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    protected AdView a(Activity activity, AdSize adsize, String s)
    {
    //    0    0:new             #127 <Class AdView>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:invokespecial   #130 <Method void AdView(Activity, AdSize, String)>
    //    6   10:areturn         
    }

    protected InterstitialAd a(Activity activity, String s)
    {
    //    0    0:new             #133 <Class InterstitialAd>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokespecial   #136 <Method void InterstitialAd(Activity, String)>
    //    5    9:areturn         
    }

    public void destroy()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #139 <Method void a()>
    //    2    4:aload_0         
    //    3    5:getfield        #122 <Field AdView c>
    //    4    8:ifnull          30
    //    5   11:aload_0         
    //    6   12:getfield        #122 <Field AdView c>
    //    7   15:invokevirtual   #142 <Method void AdView.stopLoading()>
    //    8   18:aload_0         
    //    9   19:getfield        #122 <Field AdView c>
    //   10   22:invokevirtual   #144 <Method void AdView.destroy()>
    //   11   25:aload_0         
    //   12   26:aconst_null     
    //   13   27:putfield        #122 <Field AdView c>
    //   14   30:aload_0         
    //   15   31:getfield        #124 <Field InterstitialAd d>
    //   16   34:ifnull          49
    //   17   37:aload_0         
    //   18   38:getfield        #124 <Field InterstitialAd d>
    //   19   41:invokevirtual   #145 <Method void InterstitialAd.stopLoading()>
    //   20   44:aload_0         
    //   21   45:aconst_null     
    //   22   46:putfield        #124 <Field InterstitialAd d>
    //   23   49:return          
    }

    public Class getAdditionalParametersType()
    {
    //    0    0:ldc1            #24  <Class AdMobAdapterExtras>
    //    1    2:areturn         
    }

    public View getBannerView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field AdView c>
    //    2    4:areturn         
    }

    public Class getServerParametersType()
    {
    //    0    0:ldc1            #45  <Class AdMobAdapterServerParameters>
    //    1    2:areturn         
    }

    public volatile void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:checkcast       #45  <Class AdMobAdapterServerParameters>
    //    5    7:aload           4
    //    6    9:aload           5
    //    7   11:aload           6
    //    8   13:checkcast       #24  <Class AdMobAdapterExtras>
    //    9   16:invokevirtual   #155 <Method void requestBannerAd(MediationBannerListener, Activity, AdMobAdapterServerParameters, AdSize, MediationAdRequest, AdMobAdapterExtras)>
    //   10   19:return          
    }

    public void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, AdMobAdapterServerParameters admobadapterserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, AdMobAdapterExtras admobadapterextras)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #108 <Field MediationBannerListener a>
    //    3    5:aload           4
    //    4    7:invokevirtual   #160 <Method boolean AdSize.isAutoHeight()>
    //    5   10:ifne            21
    //    6   13:aload           4
    //    7   15:invokevirtual   #163 <Method boolean AdSize.isFullWidth()>
    //    8   18:ifeq            70
    //    9   21:aload_0         
    //   10   22:aload_0         
    //   11   23:aload_2         
    //   12   24:aload           4
    //   13   26:aload_3         
    //   14   27:getfield        #166 <Field String AdMobAdapterServerParameters.adUnitId>
    //   15   30:invokevirtual   #168 <Method AdView a(Activity, AdSize, String)>
    //   16   33:putfield        #122 <Field AdView c>
    //   17   36:aload_0         
    //   18   37:getfield        #122 <Field AdView c>
    //   19   40:new             #170 <Class AdMobAdapter$a>
    //   20   43:dup             
    //   21   44:aload_0         
    //   22   45:aconst_null     
    //   23   46:invokespecial   #173 <Method void AdMobAdapter$a(AdMobAdapter, AdMobAdapter$1)>
    //   24   49:invokevirtual   #177 <Method void AdView.setAdListener(AdListener)>
    //   25   52:aload_0         
    //   26   53:getfield        #122 <Field AdView c>
    //   27   56:aload_0         
    //   28   57:aload_2         
    //   29   58:aload_3         
    //   30   59:aload           5
    //   31   61:aload           6
    //   32   63:invokespecial   #179 <Method AdRequest a(Activity, AdMobAdapterServerParameters, MediationAdRequest, AdMobAdapterExtras)>
    //   33   66:invokevirtual   #183 <Method void AdView.loadAd(AdRequest)>
    //   34   69:return          
    //   35   70:aload           6
    //   36   72:ifnull          83
    //   37   75:aload           6
    //   38   77:invokevirtual   #186 <Method boolean AdMobAdapterExtras.getUseExactAdSize()>
    //   39   80:ifne            21
    //   40   83:iconst_5        
    //   41   84:anewarray       AdSize[]
    //   42   87:astore          7
    //   43   89:aload           7
    //   44   91:iconst_0        
    //   45   92:getstatic       #190 <Field AdSize AdSize.BANNER>
    //   46   95:aastore         
    //   47   96:aload           7
    //   48   98:iconst_1        
    //   49   99:getstatic       #193 <Field AdSize AdSize.IAB_BANNER>
    //   50  102:aastore         
    //   51  103:aload           7
    //   52  105:iconst_2        
    //   53  106:getstatic       #196 <Field AdSize AdSize.IAB_LEADERBOARD>
    //   54  109:aastore         
    //   55  110:aload           7
    //   56  112:iconst_3        
    //   57  113:getstatic       #199 <Field AdSize AdSize.IAB_MRECT>
    //   58  116:aastore         
    //   59  117:aload           7
    //   60  119:iconst_4        
    //   61  120:getstatic       #202 <Field AdSize AdSize.IAB_WIDE_SKYSCRAPER>
    //   62  123:aastore         
    //   63  124:aload           4
    //   64  126:aload           7
    //   65  128:invokevirtual   #206 <Method AdSize AdSize.findBestSize(AdSize[])>
    //   66  131:astore          4
    //   67  133:aload           4
    //   68  135:ifnonnull       21
    //   69  138:aload_1         
    //   70  139:aload_0         
    //   71  140:getstatic       #212 <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.NO_FILL>
    //   72  143:invokeinterface #218 <Method void MediationBannerListener.onFailedToReceiveAd(MediationBannerAdapter, com.google.ads.AdRequest$ErrorCode)>
    //   73  148:return          
    }

    public volatile void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:checkcast       #45  <Class AdMobAdapterServerParameters>
    //    5    7:aload           4
    //    6    9:aload           5
    //    7   11:checkcast       #24  <Class AdMobAdapterExtras>
    //    8   14:invokevirtual   #223 <Method void requestInterstitialAd(MediationInterstitialListener, Activity, AdMobAdapterServerParameters, MediationAdRequest, AdMobAdapterExtras)>
    //    9   17:return          
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, AdMobAdapterServerParameters admobadapterserverparameters, MediationAdRequest mediationadrequest, AdMobAdapterExtras admobadapterextras)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #120 <Field MediationInterstitialListener b>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:aload_2         
    //    6    8:aload_3         
    //    7    9:getfield        #166 <Field String AdMobAdapterServerParameters.adUnitId>
    //    8   12:invokevirtual   #225 <Method InterstitialAd a(Activity, String)>
    //    9   15:putfield        #124 <Field InterstitialAd d>
    //   10   18:aload_0         
    //   11   19:getfield        #124 <Field InterstitialAd d>
    //   12   22:new             #227 <Class AdMobAdapter$b>
    //   13   25:dup             
    //   14   26:aload_0         
    //   15   27:aconst_null     
    //   16   28:invokespecial   #228 <Method void AdMobAdapter$b(AdMobAdapter, AdMobAdapter$1)>
    //   17   31:invokevirtual   #229 <Method void InterstitialAd.setAdListener(AdListener)>
    //   18   34:aload_0         
    //   19   35:getfield        #124 <Field InterstitialAd d>
    //   20   38:aload_0         
    //   21   39:aload_2         
    //   22   40:aload_3         
    //   23   41:aload           4
    //   24   43:aload           5
    //   25   45:invokespecial   #179 <Method AdRequest a(Activity, AdMobAdapterServerParameters, MediationAdRequest, AdMobAdapterExtras)>
    //   26   48:invokevirtual   #230 <Method void InterstitialAd.loadAd(AdRequest)>
    //   27   51:return          
    }

    public void showInterstitial()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #124 <Field InterstitialAd d>
    //    2    4:invokevirtual   #234 <Method void InterstitialAd.show()>
    //    3    7:return          
    }

    private MediationBannerListener a;
    private MediationInterstitialListener b;
    private AdView c;
    private InterstitialAd d;

    // Unreferenced inner class com/google/ads/mediation/admob/AdMobAdapter$1

/* anonymous class */
    static class _cls1
    {
    }

}
