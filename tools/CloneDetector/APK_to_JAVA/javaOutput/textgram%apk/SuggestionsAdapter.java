// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.*;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class SuggestionsAdapter extends ResourceCursorAdapter
    implements android.view.View.OnClickListener
{
    private static final class ChildViewCache
    {

        public ChildViewCache(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:ldc1            #17  <Int 0x1020014>
        //    5    8:invokevirtual   #23  <Method View View.findViewById(int)>
        //    6   11:checkcast       #25  <Class TextView>
        //    7   14:putfield        #27  <Field TextView mText1>
        //    8   17:aload_0         
        //    9   18:aload_1         
        //   10   19:ldc1            #28  <Int 0x1020015>
        //   11   21:invokevirtual   #23  <Method View View.findViewById(int)>
        //   12   24:checkcast       #25  <Class TextView>
        //   13   27:putfield        #30  <Field TextView mText2>
        //   14   30:aload_0         
        //   15   31:aload_1         
        //   16   32:ldc1            #31  <Int 0x1020007>
        //   17   34:invokevirtual   #23  <Method View View.findViewById(int)>
        //   18   37:checkcast       #33  <Class ImageView>
        //   19   40:putfield        #35  <Field ImageView mIcon1>
        //   20   43:aload_0         
        //   21   44:aload_1         
        //   22   45:ldc1            #36  <Int 0x1020008>
        //   23   47:invokevirtual   #23  <Method View View.findViewById(int)>
        //   24   50:checkcast       #33  <Class ImageView>
        //   25   53:putfield        #38  <Field ImageView mIcon2>
        //   26   56:aload_0         
        //   27   57:aload_1         
        //   28   58:getstatic       #44  <Field int android.support.v7.appcompat.R$id.edit_query>
        //   29   61:invokevirtual   #23  <Method View View.findViewById(int)>
        //   30   64:checkcast       #33  <Class ImageView>
        //   31   67:putfield        #46  <Field ImageView mIconRefine>
        //   32   70:return          
        }

        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;
    }


    public SuggestionsAdapter(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getstatic       #51  <Field int android.support.v7.appcompat.R$layout.abc_search_dropdown_item_icons_2line>
    //    3    5:aconst_null     
    //    4    6:iconst_1        
    //    5    7:invokespecial   #54  <Method void ResourceCursorAdapter(Context, int, Cursor, boolean)>
    //    6   10:aload_0         
    //    7   11:iconst_0        
    //    8   12:putfield        #56  <Field boolean mClosed>
    //    9   15:aload_0         
    //   10   16:iconst_1        
    //   11   17:putfield        #58  <Field int mQueryRefinement>
    //   12   20:aload_0         
    //   13   21:iconst_m1       
    //   14   22:putfield        #60  <Field int mText1Col>
    //   15   25:aload_0         
    //   16   26:iconst_m1       
    //   17   27:putfield        #62  <Field int mText2Col>
    //   18   30:aload_0         
    //   19   31:iconst_m1       
    //   20   32:putfield        #64  <Field int mText2UrlCol>
    //   21   35:aload_0         
    //   22   36:iconst_m1       
    //   23   37:putfield        #66  <Field int mIconName1Col>
    //   24   40:aload_0         
    //   25   41:iconst_m1       
    //   26   42:putfield        #68  <Field int mIconName2Col>
    //   27   45:aload_0         
    //   28   46:iconst_m1       
    //   29   47:putfield        #70  <Field int mFlagsCol>
    //   30   50:aload_0         
    //   31   51:aload_0         
    //   32   52:getfield        #73  <Field Context mContext>
    //   33   55:ldc1            #75  <String "search">
    //   34   57:invokevirtual   #81  <Method Object Context.getSystemService(String)>
    //   35   60:checkcast       #83  <Class SearchManager>
    //   36   63:putfield        #85  <Field SearchManager mSearchManager>
    //   37   66:aload_0         
    //   38   67:aload_2         
    //   39   68:putfield        #87  <Field SearchView mSearchView>
    //   40   71:aload_0         
    //   41   72:aload_3         
    //   42   73:putfield        #89  <Field SearchableInfo mSearchable>
    //   43   76:aload_0         
    //   44   77:aload_1         
    //   45   78:putfield        #91  <Field Context mProviderContext>
    //   46   81:aload_0         
    //   47   82:aload           4
    //   48   84:putfield        #93  <Field WeakHashMap mOutsideDrawablesCache>
    //   49   87:return          
    }

    private Drawable checkIconCache(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #93  <Field WeakHashMap mOutsideDrawablesCache>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #101 <Method Object WeakHashMap.get(Object)>
    //    4    8:checkcast       #103 <Class android.graphics.drawable.Drawable$ConstantState>
    //    5   11:astore_2        
    //    6   12:aload_2         
    //    7   13:ifnonnull       18
    //    8   16:aconst_null     
    //    9   17:areturn         
    //   10   18:aload_2         
    //   11   19:invokevirtual   #107 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
    //   12   22:areturn         
    }

    private CharSequence formatUrl(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #111 <Field ColorStateList mUrlColor>
    //    2    4:ifnonnull       49
    //    3    7:new             #113 <Class TypedValue>
    //    4   10:dup             
    //    5   11:invokespecial   #116 <Method void TypedValue()>
    //    6   14:astore_2        
    //    7   15:aload_0         
    //    8   16:getfield        #73  <Field Context mContext>
    //    9   19:invokevirtual   #120 <Method android.content.res.Resources$Theme Context.getTheme()>
    //   10   22:getstatic       #125 <Field int android.support.v7.appcompat.R$attr.textColorSearchUrl>
    //   11   25:aload_2         
    //   12   26:iconst_1        
    //   13   27:invokevirtual   #131 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
    //   14   30:pop             
    //   15   31:aload_0         
    //   16   32:aload_0         
    //   17   33:getfield        #73  <Field Context mContext>
    //   18   36:invokevirtual   #135 <Method Resources Context.getResources()>
    //   19   39:aload_2         
    //   20   40:getfield        #138 <Field int TypedValue.resourceId>
    //   21   43:invokevirtual   #144 <Method ColorStateList Resources.getColorStateList(int)>
    //   22   46:putfield        #111 <Field ColorStateList mUrlColor>
    //   23   49:new             #146 <Class SpannableString>
    //   24   52:dup             
    //   25   53:aload_1         
    //   26   54:invokespecial   #149 <Method void SpannableString(CharSequence)>
    //   27   57:astore          4
    //   28   59:aload           4
    //   29   61:new             #151 <Class TextAppearanceSpan>
    //   30   64:dup             
    //   31   65:aconst_null     
    //   32   66:iconst_0        
    //   33   67:iconst_0        
    //   34   68:aload_0         
    //   35   69:getfield        #111 <Field ColorStateList mUrlColor>
    //   36   72:aconst_null     
    //   37   73:invokespecial   #154 <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
    //   38   76:iconst_0        
    //   39   77:aload_1         
    //   40   78:invokeinterface #160 <Method int CharSequence.length()>
    //   41   83:bipush          33
    //   42   85:invokevirtual   #164 <Method void SpannableString.setSpan(Object, int, int, int)>
    //   43   88:aload           4
    //   44   90:areturn         
    }

    private Drawable getActivityIcon(ComponentName componentname)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field Context mContext>
    //    2    4:invokevirtual   #172 <Method PackageManager Context.getPackageManager()>
    //    3    7:astore_2        
    // try 8 18 handler(s) 36
    //    4    8:aload_2         
    //    5    9:aload_1         
    //    6   10:sipush          128
    //    7   13:invokevirtual   #178 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
    //    8   16:astore          5
    //    9   18:aload           5
    //   10   20:invokevirtual   #183 <Method int ActivityInfo.getIconResource()>
    //   11   23:istore          6
    //   12   25:iload           6
    //   13   27:ifne            49
    //   14   30:aconst_null     
    //   15   31:astore          7
    //   16   33:aload           7
    //   17   35:areturn         
    // catch android.content.pm.PackageManager.NameNotFoundException
    //   18   36:astore_3        
    //   19   37:ldc1            #16  <String "SuggestionsAdapter">
    //   20   39:aload_3         
    //   21   40:invokevirtual   #187 <Method String android.content.pm.PackageManager$NameNotFoundException.toString()>
    //   22   43:invokestatic    #193 <Method int Log.w(String, String)>
    //   23   46:pop             
    //   24   47:aconst_null     
    //   25   48:areturn         
    //   26   49:aload_2         
    //   27   50:aload_1         
    //   28   51:invokevirtual   #198 <Method String ComponentName.getPackageName()>
    //   29   54:iload           6
    //   30   56:aload           5
    //   31   58:getfield        #202 <Field android.content.pm.ApplicationInfo ActivityInfo.applicationInfo>
    //   32   61:invokevirtual   #206 <Method Drawable PackageManager.getDrawable(String, int, android.content.pm.ApplicationInfo)>
    //   33   64:astore          7
    //   34   66:aload           7
    //   35   68:ifnonnull       33
    //   36   71:ldc1            #16  <String "SuggestionsAdapter">
    //   37   73:new             #208 <Class StringBuilder>
    //   38   76:dup             
    //   39   77:invokespecial   #209 <Method void StringBuilder()>
    //   40   80:ldc1            #211 <String "Invalid icon resource ">
    //   41   82:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   42   85:iload           6
    //   43   87:invokevirtual   #218 <Method StringBuilder StringBuilder.append(int)>
    //   44   90:ldc1            #220 <String " for ">
    //   45   92:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   46   95:aload_1         
    //   47   96:invokevirtual   #223 <Method String ComponentName.flattenToShortString()>
    //   48   99:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   49  102:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   50  105:invokestatic    #193 <Method int Log.w(String, String)>
    //   51  108:pop             
    //   52  109:aconst_null     
    //   53  110:areturn         
    }

    private Drawable getActivityIconWithCache(ComponentName componentname)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #223 <Method String ComponentName.flattenToShortString()>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:getfield        #93  <Field WeakHashMap mOutsideDrawablesCache>
    //    5    9:aload_2         
    //    6   10:invokevirtual   #229 <Method boolean WeakHashMap.containsKey(Object)>
    //    7   13:ifeq            49
    //    8   16:aload_0         
    //    9   17:getfield        #93  <Field WeakHashMap mOutsideDrawablesCache>
    //   10   20:aload_2         
    //   11   21:invokevirtual   #101 <Method Object WeakHashMap.get(Object)>
    //   12   24:checkcast       #103 <Class android.graphics.drawable.Drawable$ConstantState>
    //   13   27:astore          6
    //   14   29:aload           6
    //   15   31:ifnonnull       36
    //   16   34:aconst_null     
    //   17   35:areturn         
    //   18   36:aload           6
    //   19   38:aload_0         
    //   20   39:getfield        #91  <Field Context mProviderContext>
    //   21   42:invokevirtual   #135 <Method Resources Context.getResources()>
    //   22   45:invokevirtual   #232 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
    //   23   48:areturn         
    //   24   49:aload_0         
    //   25   50:aload_1         
    //   26   51:invokespecial   #234 <Method Drawable getActivityIcon(ComponentName)>
    //   27   54:astore_3        
    //   28   55:aload_3         
    //   29   56:ifnonnull       75
    //   30   59:aconst_null     
    //   31   60:astore          4
    //   32   62:aload_0         
    //   33   63:getfield        #93  <Field WeakHashMap mOutsideDrawablesCache>
    //   34   66:aload_2         
    //   35   67:aload           4
    //   36   69:invokevirtual   #238 <Method Object WeakHashMap.put(Object, Object)>
    //   37   72:pop             
    //   38   73:aload_3         
    //   39   74:areturn         
    //   40   75:aload_3         
    //   41   76:invokevirtual   #244 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
    //   42   79:astore          4
    //   43   81:goto            62
    }

    public static String getColumnString(Cursor cursor, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:aload_1         
    //    3    3:invokeinterface #252 <Method int Cursor.getColumnIndex(String)>
    //    4    8:invokestatic    #256 <Method String getStringOrNull(Cursor, int)>
    //    5   11:areturn         
    }

    private Drawable getDefaultIcon1(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #89  <Field SearchableInfo mSearchable>
    //    3    5:invokevirtual   #264 <Method ComponentName SearchableInfo.getSearchActivity()>
    //    4    8:invokespecial   #266 <Method Drawable getActivityIconWithCache(ComponentName)>
    //    5   11:astore_2        
    //    6   12:aload_2         
    //    7   13:ifnull          18
    //    8   16:aload_2         
    //    9   17:areturn         
    //   10   18:aload_0         
    //   11   19:getfield        #73  <Field Context mContext>
    //   12   22:invokevirtual   #172 <Method PackageManager Context.getPackageManager()>
    //   13   25:invokevirtual   #269 <Method Drawable PackageManager.getDefaultActivityIcon()>
    //   14   28:areturn         
    }

    private Drawable getDrawable(Uri uri)
    {
    // try 0 12 handler(s) 57
    //    0    0:ldc2            #278 <String "android.resource">
    //    1    3:aload_1         
    //    2    4:invokevirtual   #283 <Method String Uri.getScheme()>
    //    3    7:invokevirtual   #288 <Method boolean String.equals(Object)>
    //    4   10:istore          4
    //    5   12:iload           4
    //    6   14:ifeq            99
    // try 17 24 handler(s) 27 57
    //    7   17:aload_0         
    //    8   18:aload_1         
    //    9   19:invokevirtual   #291 <Method Drawable getDrawableFromResourceUri(Uri)>
    //   10   22:astore          13
    //   11   24:aload           13
    //   12   26:areturn         
    // catch android.content.res.Resources.NotFoundException
    //   13   27:astore          12
    // try 29 57 handler(s) 57
    //   14   29:new             #272 <Class FileNotFoundException>
    //   15   32:dup             
    //   16   33:new             #208 <Class StringBuilder>
    //   17   36:dup             
    //   18   37:invokespecial   #209 <Method void StringBuilder()>
    //   19   40:ldc2            #293 <String "Resource does not exist: ">
    //   20   43:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   21   46:aload_1         
    //   22   47:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   23   50:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   24   53:invokespecial   #299 <Method void FileNotFoundException(String)>
    //   25   56:athrow          
    // catch FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException FileNotFoundException
    //   26   57:astore_2        
    //   27   58:ldc1            #16  <String "SuggestionsAdapter">
    //   28   60:new             #208 <Class StringBuilder>
    //   29   63:dup             
    //   30   64:invokespecial   #209 <Method void StringBuilder()>
    //   31   67:ldc2            #301 <String "Icon not found: ">
    //   32   70:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   33   73:aload_1         
    //   34   74:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   35   77:ldc2            #303 <String ", ">
    //   36   80:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   37   83:aload_2         
    //   38   84:invokevirtual   #306 <Method String FileNotFoundException.getMessage()>
    //   39   87:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   40   90:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   41   93:invokestatic    #193 <Method int Log.w(String, String)>
    //   42   96:pop             
    //   43   97:aconst_null     
    //   44   98:areturn         
    // try 99 112 handler(s) 57
    //   45   99:aload_0         
    //   46  100:getfield        #91  <Field Context mProviderContext>
    //   47  103:invokevirtual   #310 <Method ContentResolver Context.getContentResolver()>
    //   48  106:aload_1         
    //   49  107:invokevirtual   #316 <Method InputStream ContentResolver.openInputStream(Uri)>
    //   50  110:astore          5
    //   51  112:aload           5
    //   52  114:ifnonnull       145
    // try 117 145 handler(s) 57
    //   53  117:new             #272 <Class FileNotFoundException>
    //   54  120:dup             
    //   55  121:new             #208 <Class StringBuilder>
    //   56  124:dup             
    //   57  125:invokespecial   #209 <Method void StringBuilder()>
    //   58  128:ldc2            #318 <String "Failed to open ">
    //   59  131:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   60  134:aload_1         
    //   61  135:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   62  138:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   63  141:invokespecial   #299 <Method void FileNotFoundException(String)>
    //   64  144:athrow          
    // try 145 153 handler(s) 194
    //   65  145:aload           5
    //   66  147:aconst_null     
    //   67  148:invokestatic    #322 <Method Drawable Drawable.createFromStream(InputStream, String)>
    //   68  151:astore          9
    // try 153 158 handler(s) 161 57
    //   69  153:aload           5
    //   70  155:invokevirtual   #327 <Method void InputStream.close()>
    //   71  158:aload           9
    //   72  160:areturn         
    // catch IOException
    //   73  161:astore          10
    // try 163 191 handler(s) 57
    //   74  163:ldc1            #16  <String "SuggestionsAdapter">
    //   75  165:new             #208 <Class StringBuilder>
    //   76  168:dup             
    //   77  169:invokespecial   #209 <Method void StringBuilder()>
    //   78  172:ldc2            #329 <String "Error closing icon stream for ">
    //   79  175:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   80  178:aload_1         
    //   81  179:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   82  182:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   83  185:aload           10
    //   84  187:invokestatic    #333 <Method int Log.e(String, String, Throwable)>
    //   85  190:pop             
    //   86  191:aload           9
    //   87  193:areturn         
    // finally
    //   88  194:astore          6
    // try 196 201 handler(s) 204 57
    //   89  196:aload           5
    //   90  198:invokevirtual   #327 <Method void InputStream.close()>
    // try 201 204 handler(s) 57
    //   91  201:aload           6
    //   92  203:athrow          
    // catch IOException
    //   93  204:astore          7
    // try 206 234 handler(s) 57
    //   94  206:ldc1            #16  <String "SuggestionsAdapter">
    //   95  208:new             #208 <Class StringBuilder>
    //   96  211:dup             
    //   97  212:invokespecial   #209 <Method void StringBuilder()>
    //   98  215:ldc2            #329 <String "Error closing icon stream for ">
    //   99  218:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //  100  221:aload_1         
    //  101  222:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //  102  225:invokevirtual   #224 <Method String StringBuilder.toString()>
    //  103  228:aload           7
    //  104  230:invokestatic    #333 <Method int Log.e(String, String, Throwable)>
    //  105  233:pop             
    //  106  234:goto            201
    }

    private Drawable getDrawableFromResourceValue(String s)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          21
    //    2    4:aload_1         
    //    3    5:invokevirtual   #337 <Method int String.length()>
    //    4    8:ifeq            21
    //    5   11:ldc2            #339 <String "0">
    //    6   14:aload_1         
    //    7   15:invokevirtual   #288 <Method boolean String.equals(Object)>
    //    8   18:ifeq            25
    //    9   21:aconst_null     
    //   10   22:astore_2        
    //   11   23:aload_2         
    //   12   24:areturn         
    // try 25 77 handler(s) 106 138
    //   13   25:aload_1         
    //   14   26:invokestatic    #344 <Method int Integer.parseInt(String)>
    //   15   29:istore          7
    //   16   31:new             #208 <Class StringBuilder>
    //   17   34:dup             
    //   18   35:invokespecial   #209 <Method void StringBuilder()>
    //   19   38:ldc2            #346 <String "android.resource://">
    //   20   41:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   21   44:aload_0         
    //   22   45:getfield        #91  <Field Context mProviderContext>
    //   23   48:invokevirtual   #347 <Method String Context.getPackageName()>
    //   24   51:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   25   54:ldc2            #349 <String "/">
    //   26   57:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   27   60:iload           7
    //   28   62:invokevirtual   #218 <Method StringBuilder StringBuilder.append(int)>
    //   29   65:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   30   68:astore          8
    //   31   70:aload_0         
    //   32   71:aload           8
    //   33   73:invokespecial   #351 <Method Drawable checkIconCache(String)>
    //   34   76:astore_2        
    //   35   77:aload_2         
    //   36   78:ifnonnull       23
    // try 81 103 handler(s) 106 138
    //   37   81:aload_0         
    //   38   82:getfield        #91  <Field Context mProviderContext>
    //   39   85:invokevirtual   #135 <Method Resources Context.getResources()>
    //   40   88:iload           7
    //   41   90:invokevirtual   #354 <Method Drawable Resources.getDrawable(int)>
    //   42   93:astore          9
    //   43   95:aload_0         
    //   44   96:aload           8
    //   45   98:aload           9
    //   46  100:invokespecial   #358 <Method void storeInIconCache(String, Drawable)>
    //   47  103:aload           9
    //   48  105:areturn         
    // catch NumberFormatException NumberFormatException
    //   49  106:astore          5
    //   50  108:aload_0         
    //   51  109:aload_1         
    //   52  110:invokespecial   #351 <Method Drawable checkIconCache(String)>
    //   53  113:astore_2        
    //   54  114:aload_2         
    //   55  115:ifnonnull       23
    //   56  118:aload_0         
    //   57  119:aload_1         
    //   58  120:invokestatic    #362 <Method Uri Uri.parse(String)>
    //   59  123:invokespecial   #364 <Method Drawable getDrawable(Uri)>
    //   60  126:astore          6
    //   61  128:aload_0         
    //   62  129:aload_1         
    //   63  130:aload           6
    //   64  132:invokespecial   #358 <Method void storeInIconCache(String, Drawable)>
    //   65  135:aload           6
    //   66  137:areturn         
    // catch android.content.res.Resources.NotFoundException android.content.res.Resources.NotFoundException
    //   67  138:astore_3        
    //   68  139:ldc1            #16  <String "SuggestionsAdapter">
    //   69  141:new             #208 <Class StringBuilder>
    //   70  144:dup             
    //   71  145:invokespecial   #209 <Method void StringBuilder()>
    //   72  148:ldc2            #366 <String "Icon resource not found: ">
    //   73  151:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   74  154:aload_1         
    //   75  155:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   76  158:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   77  161:invokestatic    #193 <Method int Log.w(String, String)>
    //   78  164:pop             
    //   79  165:aconst_null     
    //   80  166:areturn         
    }

    private Drawable getIcon1(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field int mIconName1Col>
    //    2    4:iconst_m1       
    //    3    5:icmpne          12
    //    4    8:aconst_null     
    //    5    9:astore_2        
    //    6   10:aload_2         
    //    7   11:areturn         
    //    8   12:aload_0         
    //    9   13:aload_1         
    //   10   14:aload_0         
    //   11   15:getfield        #66  <Field int mIconName1Col>
    //   12   18:invokeinterface #371 <Method String Cursor.getString(int)>
    //   13   23:invokespecial   #373 <Method Drawable getDrawableFromResourceValue(String)>
    //   14   26:astore_2        
    //   15   27:aload_2         
    //   16   28:ifnonnull       10
    //   17   31:aload_0         
    //   18   32:aload_1         
    //   19   33:invokespecial   #375 <Method Drawable getDefaultIcon1(Cursor)>
    //   20   36:areturn         
    }

    private Drawable getIcon2(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field int mIconName2Col>
    //    2    4:iconst_m1       
    //    3    5:icmpne          10
    //    4    8:aconst_null     
    //    5    9:areturn         
    //    6   10:aload_0         
    //    7   11:aload_1         
    //    8   12:aload_0         
    //    9   13:getfield        #68  <Field int mIconName2Col>
    //   10   16:invokeinterface #371 <Method String Cursor.getString(int)>
    //   11   21:invokespecial   #373 <Method Drawable getDrawableFromResourceValue(String)>
    //   12   24:areturn         
    }

    private static String getStringOrNull(Cursor cursor, int i)
    {
    //    0    0:iload_1         
    //    1    1:iconst_m1       
    //    2    2:icmpne          7
    //    3    5:aconst_null     
    //    4    6:areturn         
    // try 7 16 handler(s) 19
    //    5    7:aload_0         
    //    6    8:iload_1         
    //    7    9:invokeinterface #371 <Method String Cursor.getString(int)>
    //    8   14:astore          4
    //    9   16:aload           4
    //   10   18:areturn         
    // catch Exception
    //   11   19:astore_2        
    //   12   20:ldc1            #16  <String "SuggestionsAdapter">
    //   13   22:ldc2            #380 <String "unexpected error retrieving valid column from cursor, did the remote process die?">
    //   14   25:aload_2         
    //   15   26:invokestatic    #333 <Method int Log.e(String, String, Throwable)>
    //   16   29:pop             
    //   17   30:aconst_null     
    //   18   31:areturn         
    }

    private void setViewDrawable(ImageView imageview, Drawable drawable, int i)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #388 <Method void ImageView.setImageDrawable(Drawable)>
    //    3    5:aload_2         
    //    4    6:ifnonnull       15
    //    5    9:aload_1         
    //    6   10:iload_3         
    //    7   11:invokevirtual   #392 <Method void ImageView.setVisibility(int)>
    //    8   14:return          
    //    9   15:aload_1         
    //   10   16:iconst_0        
    //   11   17:invokevirtual   #392 <Method void ImageView.setVisibility(int)>
    //   12   20:aload_2         
    //   13   21:iconst_0        
    //   14   22:iconst_0        
    //   15   23:invokevirtual   #396 <Method boolean Drawable.setVisible(boolean, boolean)>
    //   16   26:pop             
    //   17   27:aload_2         
    //   18   28:iconst_1        
    //   19   29:iconst_0        
    //   20   30:invokevirtual   #396 <Method boolean Drawable.setVisible(boolean, boolean)>
    //   21   33:pop             
    //   22   34:return          
    }

    private void setViewText(TextView textview, CharSequence charsequence)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #403 <Method void TextView.setText(CharSequence)>
    //    3    5:aload_2         
    //    4    6:invokestatic    #409 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    5    9:ifeq            19
    //    6   12:aload_1         
    //    7   13:bipush          8
    //    8   15:invokevirtual   #410 <Method void TextView.setVisibility(int)>
    //    9   18:return          
    //   10   19:aload_1         
    //   11   20:iconst_0        
    //   12   21:invokevirtual   #410 <Method void TextView.setVisibility(int)>
    //   13   24:return          
    }

    private void storeInIconCache(String s, Drawable drawable)
    {
    //    0    0:aload_2         
    //    1    1:ifnull          17
    //    2    4:aload_0         
    //    3    5:getfield        #93  <Field WeakHashMap mOutsideDrawablesCache>
    //    4    8:aload_1         
    //    5    9:aload_2         
    //    6   10:invokevirtual   #244 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
    //    7   13:invokevirtual   #238 <Method Object WeakHashMap.put(Object, Object)>
    //    8   16:pop             
    //    9   17:return          
    }

    private void updateSpinnerState(Cursor cursor)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          26
    //    2    4:aload_1         
    //    3    5:invokeinterface #416 <Method Bundle Cursor.getExtras()>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          25
    //    7   15:aload_2         
    //    8   16:ldc2            #418 <String "in_progress">
    //    9   19:invokevirtual   #424 <Method boolean Bundle.getBoolean(String)>
    //   10   22:ifeq            25
    //   11   25:return          
    //   12   26:aconst_null     
    //   13   27:astore_2        
    //   14   28:goto            11
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #432 <Method Object View.getTag()>
    //    2    4:checkcast       #434 <Class SuggestionsAdapter$ChildViewCache>
    //    3    7:astore          4
    //    4    9:aload_0         
    //    5   10:getfield        #70  <Field int mFlagsCol>
    //    6   13:istore          5
    //    7   15:iconst_0        
    //    8   16:istore          6
    //    9   18:iload           5
    //   10   20:iconst_m1       
    //   11   21:icmpeq          36
    //   12   24:aload_3         
    //   13   25:aload_0         
    //   14   26:getfield        #70  <Field int mFlagsCol>
    //   15   29:invokeinterface #438 <Method int Cursor.getInt(int)>
    //   16   34:istore          6
    //   17   36:aload           4
    //   18   38:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //   19   41:ifnull          65
    //   20   44:aload_3         
    //   21   45:aload_0         
    //   22   46:getfield        #60  <Field int mText1Col>
    //   23   49:invokestatic    #256 <Method String getStringOrNull(Cursor, int)>
    //   24   52:astore          9
    //   25   54:aload_0         
    //   26   55:aload           4
    //   27   57:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //   28   60:aload           9
    //   29   62:invokespecial   #444 <Method void setViewText(TextView, CharSequence)>
    //   30   65:aload           4
    //   31   67:getfield        #447 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
    //   32   70:ifnull          141
    //   33   73:aload_3         
    //   34   74:aload_0         
    //   35   75:getfield        #64  <Field int mText2UrlCol>
    //   36   78:invokestatic    #256 <Method String getStringOrNull(Cursor, int)>
    //   37   81:astore          7
    //   38   83:aload           7
    //   39   85:ifnull          246
    //   40   88:aload_0         
    //   41   89:aload           7
    //   42   91:invokespecial   #449 <Method CharSequence formatUrl(CharSequence)>
    //   43   94:astore          8
    //   44   96:aload           8
    //   45   98:invokestatic    #409 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   46  101:ifeq            259
    //   47  104:aload           4
    //   48  106:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //   49  109:ifnull          130
    //   50  112:aload           4
    //   51  114:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //   52  117:iconst_0        
    //   53  118:invokevirtual   #453 <Method void TextView.setSingleLine(boolean)>
    //   54  121:aload           4
    //   55  123:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //   56  126:iconst_2        
    //   57  127:invokevirtual   #456 <Method void TextView.setMaxLines(int)>
    //   58  130:aload_0         
    //   59  131:aload           4
    //   60  133:getfield        #447 <Field TextView SuggestionsAdapter$ChildViewCache.mText2>
    //   61  136:aload           8
    //   62  138:invokespecial   #444 <Method void setViewText(TextView, CharSequence)>
    //   63  141:aload           4
    //   64  143:getfield        #460 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
    //   65  146:ifnull          164
    //   66  149:aload_0         
    //   67  150:aload           4
    //   68  152:getfield        #460 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon1>
    //   69  155:aload_0         
    //   70  156:aload_3         
    //   71  157:invokespecial   #462 <Method Drawable getIcon1(Cursor)>
    //   72  160:iconst_4        
    //   73  161:invokespecial   #464 <Method void setViewDrawable(ImageView, Drawable, int)>
    //   74  164:aload           4
    //   75  166:getfield        #467 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
    //   76  169:ifnull          188
    //   77  172:aload_0         
    //   78  173:aload           4
    //   79  175:getfield        #467 <Field ImageView SuggestionsAdapter$ChildViewCache.mIcon2>
    //   80  178:aload_0         
    //   81  179:aload_3         
    //   82  180:invokespecial   #469 <Method Drawable getIcon2(Cursor)>
    //   83  183:bipush          8
    //   84  185:invokespecial   #464 <Method void setViewDrawable(ImageView, Drawable, int)>
    //   85  188:aload_0         
    //   86  189:getfield        #58  <Field int mQueryRefinement>
    //   87  192:iconst_2        
    //   88  193:icmpeq          211
    //   89  196:aload_0         
    //   90  197:getfield        #58  <Field int mQueryRefinement>
    //   91  200:iconst_1        
    //   92  201:icmpne          288
    //   93  204:iload           6
    //   94  206:iconst_1        
    //   95  207:iand            
    //   96  208:ifeq            288
    //   97  211:aload           4
    //   98  213:getfield        #472 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
    //   99  216:iconst_0        
    //  100  217:invokevirtual   #392 <Method void ImageView.setVisibility(int)>
    //  101  220:aload           4
    //  102  222:getfield        #472 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
    //  103  225:aload           4
    //  104  227:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //  105  230:invokevirtual   #476 <Method CharSequence TextView.getText()>
    //  106  233:invokevirtual   #480 <Method void ImageView.setTag(Object)>
    //  107  236:aload           4
    //  108  238:getfield        #472 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
    //  109  241:aload_0         
    //  110  242:invokevirtual   #484 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
    //  111  245:return          
    //  112  246:aload_3         
    //  113  247:aload_0         
    //  114  248:getfield        #62  <Field int mText2Col>
    //  115  251:invokestatic    #256 <Method String getStringOrNull(Cursor, int)>
    //  116  254:astore          8
    //  117  256:goto            96
    //  118  259:aload           4
    //  119  261:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //  120  264:ifnull          130
    //  121  267:aload           4
    //  122  269:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //  123  272:iconst_1        
    //  124  273:invokevirtual   #453 <Method void TextView.setSingleLine(boolean)>
    //  125  276:aload           4
    //  126  278:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //  127  281:iconst_1        
    //  128  282:invokevirtual   #456 <Method void TextView.setMaxLines(int)>
    //  129  285:goto            130
    //  130  288:aload           4
    //  131  290:getfield        #472 <Field ImageView SuggestionsAdapter$ChildViewCache.mIconRefine>
    //  132  293:bipush          8
    //  133  295:invokevirtual   #392 <Method void ImageView.setVisibility(int)>
    //  134  298:return          
    }

    public void changeCursor(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field boolean mClosed>
    //    2    4:ifeq            27
    //    3    7:ldc1            #16  <String "SuggestionsAdapter">
    //    4    9:ldc2            #487 <String "Tried to change cursor after adapter was closed.">
    //    5   12:invokestatic    #193 <Method int Log.w(String, String)>
    //    6   15:pop             
    //    7   16:aload_1         
    //    8   17:ifnull          26
    //    9   20:aload_1         
    //   10   21:invokeinterface #488 <Method void Cursor.close()>
    //   11   26:return          
    // try 27 32 handler(s) 115
    //   12   27:aload_0         
    //   13   28:aload_1         
    //   14   29:invokespecial   #490 <Method void ResourceCursorAdapter.changeCursor(Cursor)>
    //   15   32:aload_1         
    //   16   33:ifnull          26
    // try 36 114 handler(s) 115
    //   17   36:aload_0         
    //   18   37:aload_1         
    //   19   38:ldc2            #492 <String "suggest_text_1">
    //   20   41:invokeinterface #252 <Method int Cursor.getColumnIndex(String)>
    //   21   46:putfield        #60  <Field int mText1Col>
    //   22   49:aload_0         
    //   23   50:aload_1         
    //   24   51:ldc2            #494 <String "suggest_text_2">
    //   25   54:invokeinterface #252 <Method int Cursor.getColumnIndex(String)>
    //   26   59:putfield        #62  <Field int mText2Col>
    //   27   62:aload_0         
    //   28   63:aload_1         
    //   29   64:ldc2            #496 <String "suggest_text_2_url">
    //   30   67:invokeinterface #252 <Method int Cursor.getColumnIndex(String)>
    //   31   72:putfield        #64  <Field int mText2UrlCol>
    //   32   75:aload_0         
    //   33   76:aload_1         
    //   34   77:ldc2            #498 <String "suggest_icon_1">
    //   35   80:invokeinterface #252 <Method int Cursor.getColumnIndex(String)>
    //   36   85:putfield        #66  <Field int mIconName1Col>
    //   37   88:aload_0         
    //   38   89:aload_1         
    //   39   90:ldc2            #500 <String "suggest_icon_2">
    //   40   93:invokeinterface #252 <Method int Cursor.getColumnIndex(String)>
    //   41   98:putfield        #68  <Field int mIconName2Col>
    //   42  101:aload_0         
    //   43  102:aload_1         
    //   44  103:ldc2            #502 <String "suggest_flags">
    //   45  106:invokeinterface #252 <Method int Cursor.getColumnIndex(String)>
    //   46  111:putfield        #70  <Field int mFlagsCol>
    //   47  114:return          
    // catch Exception Exception
    //   48  115:astore_2        
    //   49  116:ldc1            #16  <String "SuggestionsAdapter">
    //   50  118:ldc2            #504 <String "error changing cursor and caching columns">
    //   51  121:aload_2         
    //   52  122:invokestatic    #333 <Method int Log.e(String, String, Throwable)>
    //   53  125:pop             
    //   54  126:return          
    }

    public void close()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:invokevirtual   #505 <Method void changeCursor(Cursor)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #56  <Field boolean mClosed>
    //    6   10:return          
    }

    public CharSequence convertToString(Cursor cursor)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       8
    //    2    4:aconst_null     
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:areturn         
    //    6    8:aload_1         
    //    7    9:ldc2            #509 <String "suggest_intent_query">
    //    8   12:invokestatic    #511 <Method String getColumnString(Cursor, String)>
    //    9   15:astore_2        
    //   10   16:aload_2         
    //   11   17:ifnonnull       6
    //   12   20:aload_0         
    //   13   21:getfield        #89  <Field SearchableInfo mSearchable>
    //   14   24:invokevirtual   #515 <Method boolean SearchableInfo.shouldRewriteQueryFromData()>
    //   15   27:ifeq            47
    //   16   30:aload_1         
    //   17   31:ldc2            #517 <String "suggest_intent_data">
    //   18   34:invokestatic    #511 <Method String getColumnString(Cursor, String)>
    //   19   37:astore          4
    //   20   39:aload           4
    //   21   41:ifnull          47
    //   22   44:aload           4
    //   23   46:areturn         
    //   24   47:aload_0         
    //   25   48:getfield        #89  <Field SearchableInfo mSearchable>
    //   26   51:invokevirtual   #520 <Method boolean SearchableInfo.shouldRewriteQueryFromText()>
    //   27   54:ifeq            71
    //   28   57:aload_1         
    //   29   58:ldc2            #492 <String "suggest_text_1">
    //   30   61:invokestatic    #511 <Method String getColumnString(Cursor, String)>
    //   31   64:astore_3        
    //   32   65:aload_3         
    //   33   66:ifnull          71
    //   34   69:aload_3         
    //   35   70:areturn         
    //   36   71:aconst_null     
    //   37   72:areturn         
    }

    Drawable getDrawableFromResourceUri(Uri uri)
        throws FileNotFoundException
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #523 <Method String Uri.getAuthority()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:invokestatic    #409 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    5    9:ifeq            40
    //    6   12:new             #272 <Class FileNotFoundException>
    //    7   15:dup             
    //    8   16:new             #208 <Class StringBuilder>
    //    9   19:dup             
    //   10   20:invokespecial   #209 <Method void StringBuilder()>
    //   11   23:ldc2            #525 <String "No authority: ">
    //   12   26:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   13   29:aload_1         
    //   14   30:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   15   33:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   16   36:invokespecial   #299 <Method void FileNotFoundException(String)>
    //   17   39:athrow          
    // try 40 53 handler(s) 92
    //   18   40:aload_0         
    //   19   41:getfield        #73  <Field Context mContext>
    //   20   44:invokevirtual   #172 <Method PackageManager Context.getPackageManager()>
    //   21   47:aload_2         
    //   22   48:invokevirtual   #529 <Method Resources PackageManager.getResourcesForApplication(String)>
    //   23   51:astore          4
    //   24   53:aload_1         
    //   25   54:invokevirtual   #533 <Method List Uri.getPathSegments()>
    //   26   57:astore          5
    //   27   59:aload           5
    //   28   61:ifnonnull       121
    //   29   64:new             #272 <Class FileNotFoundException>
    //   30   67:dup             
    //   31   68:new             #208 <Class StringBuilder>
    //   32   71:dup             
    //   33   72:invokespecial   #209 <Method void StringBuilder()>
    //   34   75:ldc2            #535 <String "No path: ">
    //   35   78:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   36   81:aload_1         
    //   37   82:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   38   85:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   39   88:invokespecial   #299 <Method void FileNotFoundException(String)>
    //   40   91:athrow          
    // catch android.content.pm.PackageManager.NameNotFoundException
    //   41   92:astore_3        
    //   42   93:new             #272 <Class FileNotFoundException>
    //   43   96:dup             
    //   44   97:new             #208 <Class StringBuilder>
    //   45  100:dup             
    //   46  101:invokespecial   #209 <Method void StringBuilder()>
    //   47  104:ldc2            #537 <String "No package found for authority: ">
    //   48  107:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   49  110:aload_1         
    //   50  111:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   51  114:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   52  117:invokespecial   #299 <Method void FileNotFoundException(String)>
    //   53  120:athrow          
    //   54  121:aload           5
    //   55  123:invokeinterface #542 <Method int List.size()>
    //   56  128:istore          6
    //   57  130:iload           6
    //   58  132:iconst_1        
    //   59  133:icmpne          219
    // try 136 152 handler(s) 189
    //   60  136:aload           5
    //   61  138:iconst_0        
    //   62  139:invokeinterface #545 <Method Object List.get(int)>
    //   63  144:checkcast       #285 <Class String>
    //   64  147:invokestatic    #344 <Method int Integer.parseInt(String)>
    //   65  150:istore          9
    //   66  152:iload           9
    //   67  154:istore          7
    //   68  156:iload           7
    //   69  158:ifne            286
    //   70  161:new             #272 <Class FileNotFoundException>
    //   71  164:dup             
    //   72  165:new             #208 <Class StringBuilder>
    //   73  168:dup             
    //   74  169:invokespecial   #209 <Method void StringBuilder()>
    //   75  172:ldc2            #547 <String "No resource found for: ">
    //   76  175:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   77  178:aload_1         
    //   78  179:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   79  182:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   80  185:invokespecial   #299 <Method void FileNotFoundException(String)>
    //   81  188:athrow          
    // catch NumberFormatException
    //   82  189:astore          8
    //   83  191:new             #272 <Class FileNotFoundException>
    //   84  194:dup             
    //   85  195:new             #208 <Class StringBuilder>
    //   86  198:dup             
    //   87  199:invokespecial   #209 <Method void StringBuilder()>
    //   88  202:ldc2            #549 <String "Single path segment is not a resource ID: ">
    //   89  205:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //   90  208:aload_1         
    //   91  209:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //   92  212:invokevirtual   #224 <Method String StringBuilder.toString()>
    //   93  215:invokespecial   #299 <Method void FileNotFoundException(String)>
    //   94  218:athrow          
    //   95  219:iload           6
    //   96  221:iconst_2        
    //   97  222:icmpne          258
    //   98  225:aload           4
    //   99  227:aload           5
    //  100  229:iconst_1        
    //  101  230:invokeinterface #545 <Method Object List.get(int)>
    //  102  235:checkcast       #285 <Class String>
    //  103  238:aload           5
    //  104  240:iconst_0        
    //  105  241:invokeinterface #545 <Method Object List.get(int)>
    //  106  246:checkcast       #285 <Class String>
    //  107  249:aload_2         
    //  108  250:invokevirtual   #553 <Method int Resources.getIdentifier(String, String, String)>
    //  109  253:istore          7
    //  110  255:goto            156
    //  111  258:new             #272 <Class FileNotFoundException>
    //  112  261:dup             
    //  113  262:new             #208 <Class StringBuilder>
    //  114  265:dup             
    //  115  266:invokespecial   #209 <Method void StringBuilder()>
    //  116  269:ldc2            #555 <String "More than two path segments: ">
    //  117  272:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
    //  118  275:aload_1         
    //  119  276:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
    //  120  279:invokevirtual   #224 <Method String StringBuilder.toString()>
    //  121  282:invokespecial   #299 <Method void FileNotFoundException(String)>
    //  122  285:athrow          
    //  123  286:aload           4
    //  124  288:iload           7
    //  125  290:invokevirtual   #354 <Method Drawable Resources.getDrawable(int)>
    //  126  293:areturn         
    }

    public int getQueryRefinement()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field int mQueryRefinement>
    //    2    4:ireturn         
    }

    Cursor getSearchManagerSuggestions(SearchableInfo searchableinfo, String s, int i)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       6
    //    2    4:aconst_null     
    //    3    5:areturn         
    //    4    6:aload_1         
    //    5    7:invokevirtual   #561 <Method String SearchableInfo.getSuggestAuthority()>
    //    6   10:astore          4
    //    7   12:aload           4
    //    8   14:ifnull          4
    //    9   17:new             #563 <Class android.net.Uri$Builder>
    //   10   20:dup             
    //   11   21:invokespecial   #564 <Method void android.net.Uri$Builder()>
    //   12   24:ldc2            #566 <String "content">
    //   13   27:invokevirtual   #570 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
    //   14   30:aload           4
    //   15   32:invokevirtual   #573 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
    //   16   35:ldc2            #575 <String "">
    //   17   38:invokevirtual   #578 <Method android.net.Uri$Builder android.net.Uri$Builder.query(String)>
    //   18   41:ldc2            #575 <String "">
    //   19   44:invokevirtual   #581 <Method android.net.Uri$Builder android.net.Uri$Builder.fragment(String)>
    //   20   47:astore          5
    //   21   49:aload_1         
    //   22   50:invokevirtual   #584 <Method String SearchableInfo.getSuggestPath()>
    //   23   53:astore          6
    //   24   55:aload           6
    //   25   57:ifnull          68
    //   26   60:aload           5
    //   27   62:aload           6
    //   28   64:invokevirtual   #587 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
    //   29   67:pop             
    //   30   68:aload           5
    //   31   70:ldc2            #589 <String "search_suggest_query">
    //   32   73:invokevirtual   #592 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
    //   33   76:pop             
    //   34   77:aload_1         
    //   35   78:invokevirtual   #595 <Method String SearchableInfo.getSuggestSelection()>
    //   36   81:astore          8
    //   37   83:aload           8
    //   38   85:ifnull          141
    //   39   88:iconst_1        
    //   40   89:anewarray       String[]
    //   41   92:dup             
    //   42   93:iconst_0        
    //   43   94:aload_2         
    //   44   95:aastore         
    //   45   96:astore          9
    //   46   98:iload_3         
    //   47   99:ifle            115
    //   48  102:aload           5
    //   49  104:ldc2            #597 <String "limit">
    //   50  107:iload_3         
    //   51  108:invokestatic    #600 <Method String String.valueOf(int)>
    //   52  111:invokevirtual   #604 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
    //   53  114:pop             
    //   54  115:aload           5
    //   55  117:invokevirtual   #608 <Method Uri android.net.Uri$Builder.build()>
    //   56  120:astore          10
    //   57  122:aload_0         
    //   58  123:getfield        #73  <Field Context mContext>
    //   59  126:invokevirtual   #310 <Method ContentResolver Context.getContentResolver()>
    //   60  129:aload           10
    //   61  131:aconst_null     
    //   62  132:aload           8
    //   63  134:aload           9
    //   64  136:aconst_null     
    //   65  137:invokevirtual   #611 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
    //   66  140:areturn         
    //   67  141:aload           5
    //   68  143:aload_2         
    //   69  144:invokevirtual   #592 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
    //   70  147:pop             
    //   71  148:aconst_null     
    //   72  149:astore          9
    //   73  151:goto            98
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    // try 0 9 handler(s) 16
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #617 <Method View ResourceCursorAdapter.getView(int, View, ViewGroup)>
    //    5    7:astore          7
    //    6    9:aload           7
    //    7   11:astore          6
    //    8   13:aload           6
    //    9   15:areturn         
    // catch RuntimeException
    //   10   16:astore          4
    //   11   18:ldc1            #16  <String "SuggestionsAdapter">
    //   12   20:ldc2            #619 <String "Search suggestions cursor threw exception.">
    //   13   23:aload           4
    //   14   25:invokestatic    #621 <Method int Log.w(String, String, Throwable)>
    //   15   28:pop             
    //   16   29:aload_0         
    //   17   30:aload_0         
    //   18   31:getfield        #73  <Field Context mContext>
    //   19   34:aload_0         
    //   20   35:getfield        #625 <Field Cursor mCursor>
    //   21   38:aload_3         
    //   22   39:invokevirtual   #629 <Method View newView(Context, Cursor, ViewGroup)>
    //   23   42:astore          6
    //   24   44:aload           6
    //   25   46:ifnull          13
    //   26   49:aload           6
    //   27   51:invokevirtual   #432 <Method Object View.getTag()>
    //   28   54:checkcast       #434 <Class SuggestionsAdapter$ChildViewCache>
    //   29   57:getfield        #442 <Field TextView SuggestionsAdapter$ChildViewCache.mText1>
    //   30   60:aload           4
    //   31   62:invokevirtual   #630 <Method String RuntimeException.toString()>
    //   32   65:invokevirtual   #403 <Method void TextView.setText(CharSequence)>
    //   33   68:aload           6
    //   34   70:areturn         
    }

    public boolean hasStableIds()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #632 <Method View ResourceCursorAdapter.newView(Context, Cursor, ViewGroup)>
    //    5    7:astore          4
    //    6    9:aload           4
    //    7   11:new             #434 <Class SuggestionsAdapter$ChildViewCache>
    //    8   14:dup             
    //    9   15:aload           4
    //   10   17:invokespecial   #635 <Method void SuggestionsAdapter$ChildViewCache(View)>
    //   11   20:invokevirtual   #636 <Method void View.setTag(Object)>
    //   12   23:aload           4
    //   13   25:areturn         
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #639 <Method void ResourceCursorAdapter.notifyDataSetChanged()>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #643 <Method Cursor getCursor()>
    //    5    9:invokespecial   #645 <Method void updateSpinnerState(Cursor)>
    //    6   12:return          
    }

    public void notifyDataSetInvalidated()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #648 <Method void ResourceCursorAdapter.notifyDataSetInvalidated()>
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #643 <Method Cursor getCursor()>
    //    5    9:invokespecial   #645 <Method void updateSpinnerState(Cursor)>
    //    6   12:return          
    }

    public void onClick(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #432 <Method Object View.getTag()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:instanceof      #156 <Class CharSequence>
    //    5    9:ifeq            23
    //    6   12:aload_0         
    //    7   13:getfield        #87  <Field SearchView mSearchView>
    //    8   16:aload_2         
    //    9   17:checkcast       #156 <Class CharSequence>
    //   10   20:invokevirtual   #654 <Method void SearchView.onQueryRefine(CharSequence)>
    //   11   23:return          
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       30
    //    2    4:ldc2            #575 <String "">
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:getfield        #87  <Field SearchView mSearchView>
    //    6   12:invokevirtual   #659 <Method int SearchView.getVisibility()>
    //    7   15:ifne            28
    //    8   18:aload_0         
    //    9   19:getfield        #87  <Field SearchView mSearchView>
    //   10   22:invokevirtual   #662 <Method int SearchView.getWindowVisibility()>
    //   11   25:ifeq            38
    //   12   28:aconst_null     
    //   13   29:areturn         
    //   14   30:aload_1         
    //   15   31:invokevirtual   #665 <Method String Object.toString()>
    //   16   34:astore_2        
    //   17   35:goto            8
    // try 38 51 handler(s) 67
    //   18   38:aload_0         
    //   19   39:aload_0         
    //   20   40:getfield        #89  <Field SearchableInfo mSearchable>
    //   21   43:aload_2         
    //   22   44:bipush          50
    //   23   46:invokevirtual   #667 <Method Cursor getSearchManagerSuggestions(SearchableInfo, String, int)>
    //   24   49:astore          5
    //   25   51:aload           5
    //   26   53:ifnull          28
    // try 56 64 handler(s) 67
    //   27   56:aload           5
    //   28   58:invokeinterface #670 <Method int Cursor.getCount()>
    //   29   63:pop             
    //   30   64:aload           5
    //   31   66:areturn         
    // catch RuntimeException RuntimeException
    //   32   67:astore_3        
    //   33   68:ldc1            #16  <String "SuggestionsAdapter">
    //   34   70:ldc2            #672 <String "Search suggestions query threw an exception.">
    //   35   73:aload_3         
    //   36   74:invokestatic    #621 <Method int Log.w(String, String, Throwable)>
    //   37   77:pop             
    //   38   78:aconst_null     
    //   39   79:areturn         
    }

    public void setQueryRefinement(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #58  <Field int mQueryRefinement>
    //    3    5:return          
    }

    private static final boolean DBG = false;
    static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_ALL = 2;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_NONE;
    private boolean mClosed;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private WeakHashMap mOutsideDrawablesCache;
    private Context mProviderContext;
    private int mQueryRefinement;
    private SearchManager mSearchManager;
    private SearchView mSearchView;
    private SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;
}
