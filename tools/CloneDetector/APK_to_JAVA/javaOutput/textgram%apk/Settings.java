// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.graphics.Bitmap;
import android.os.Environment;
import java.io.File;
import org.json.JSONObject;

public class Settings
{

    static 
    {
    //    0    0:new             #34  <Class File>
    //    1    3:dup             
    //    2    4:invokestatic    #40  <Method File Environment.getExternalStorageDirectory()>
    //    3    7:ldc1            #42  <String ".textgram">
    //    4    9:invokespecial   #46  <Method void File(File, String)>
    //    5   12:putstatic       #48  <Field File sdCardFolder>
    //    6   15:getstatic       #48  <Field File sdCardFolder>
    //    7   18:invokevirtual   #52  <Method String File.getAbsolutePath()>
    //    8   21:putstatic       #54  <Field String sdCardPath>
    //    9   24:iconst_0        
    //   10   25:putstatic       #56  <Field boolean dataUpToDate>
    //   11   28:iconst_0        
    //   12   29:putstatic       #58  <Field boolean isPro>
    //   13   32:ldc1            #60  <String "playstore">
    //   14   34:putstatic       #62  <Field String buildFor>
    //   15   37:iconst_0        
    //   16   38:putstatic       #64  <Field boolean testMode>
    //   17   41:ldc1            #66  <String "http://www.codeadore.net/secure/tg_store/api">
    //   18   43:putstatic       #68  <Field String store_api_url>
    //   19   46:aconst_null     
    //   20   47:putstatic       #70  <Field String store_auth_key>
    //   21   50:bipush          10
    //   22   52:putstatic       #72  <Field int store_items_per_page>
    //   23   55:iconst_0        
    //   24   56:putstatic       #74  <Field boolean store_request_refresh>
    //   25   59:ldc1            #76  <String "a14f9411207592b">
    //   26   61:putstatic       #78  <Field String adMobPublisherID>
    //   27   64:ldc1            #80  <String "UA-30793583-2">
    //   28   66:putstatic       #82  <Field String googleAnalyticsKey>
    //   29   69:ldc1            #84  <String "8e31dc26-1219-493c-e98a-fd5afca696b5">
    //   30   71:putstatic       #86  <Field String getJarAppKey>
    //   31   74:ldc1            #88  <String "0000MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCdtiyib/AmJJJfOySpguG121Nk5dRaxarzi3DElADwJbRtjZGwULdXGNiNMK3PkwmRViiNBtP0PiqllIgeWP9DH040yKdMv/YM3edyW6PRaaN1rtB9d0oReN4WUzn2sncltScZtNwb2WPCjjtRRx83egRN4Qg4t2sXUNdyUvZz2wIDAQAB">
    //   32   76:putstatic       #90  <Field String getJarEncryptionKey>
    //   33   79:ldc1            #92  <String "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgzbc3CpcOk3UYZsGtZ1/VY1y52s2VpJbeV06hf584AVmkjzzsQwhjvUl9lRN7pVT4OBzBo5PbjtFj8W1kkJgy530lkRMWD7msJ15+cSnWk7TPe4cUyLQKd+d/OTQRbEUt7bVgYfA+Yzvn9atITg1ih/w0Z3q7I+Tlrri9eY9T/oGKaykDB7miqE0HfDTzO0yVKVybb1QzAWgU4bpsl8OXUioe3VIiLhOPLlMDMKJ0swmE9lrfKPY1YkEKdcdRR1GKovtDiLs56CWmQt9QFgHAutowTvCKE3rumKmySY3HoycJ8iDDW/a/C+nzsAJzcMmu9LaonkpDgzalqWDpULZ+wIDAQAB">
    //   34   81:putstatic       #94  <Field String base64EncodedPublicKey>
    //   35   84:ldc1            #96  <String "ff7565d2a14783548a8af47a7e92628a2a5c63de">
    //   36   86:putstatic       #98  <Field String pocketChangeAppID>
    //   37   89:aconst_null     
    //   38   90:putstatic       #100 <Field Bitmap prepareReturnBitmap>
    //   39   93:iconst_0        
    //   40   94:putstatic       #102 <Field int prepareReturnID>
    //   41   97:ldc1            #104 <String "MainActivity">
    //   42   99:putstatic       #106 <Field String currentEmojisActivity>
    //   43  102:return          
    }

    public Settings()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #108 <Method void Object()>
    //    2    4:return          
    }

    public static String adMobPublisherID;
    public static String base64EncodedPublicKey;
    public static String buildFor;
    public static String currentEmojisActivity;
    public static boolean dataUpToDate;
    public static String getJarAppKey;
    public static String getJarEncryptionKey;
    public static String googleAnalyticsKey;
    public static boolean isPro;
    public static JSONObject json;
    public static String pocketChangeAppID;
    public static Bitmap prepareReturnBitmap;
    public static int prepareReturnID;
    public static File sdCardFolder;
    public static String sdCardPath;
    public static String store_api_url;
    public static String store_auth_key;
    public static int store_items_per_page;
    public static boolean store_request_refresh;
    static boolean testMode;
}
