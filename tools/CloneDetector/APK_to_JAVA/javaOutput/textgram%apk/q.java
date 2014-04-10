// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.internal.a;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import com.google.ads.util.f;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o

public class q
    implements o
{

    static 
    {
    //    0    0:getstatic       #15  <Field f a.a>
    //    1    3:invokeinterface #21  <Method Object f.b()>
    //    2    8:checkcast       #12  <Class a>
    //    3   11:putstatic       #23  <Field a a>
    //    4   14:return          
    }

    public q()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #26  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #29  <String "urls">
    //    2    3:invokevirtual   #35  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #37  <Class String>
    //    4    9:astore          4
    //    5   11:aload           4
    //    6   13:ifnonnull       22
    //    7   16:ldc1            #39  <String "Could not get the urls param from canOpenURLs gmsg.">
    //    8   18:invokestatic    #45  <Method void b.e(String)>
    //    9   21:return          
    //   10   22:aload           4
    //   11   24:ldc1            #47  <String ",">
    //   12   26:invokevirtual   #51  <Method String[] String.split(String)>
    //   13   29:astore          5
    //   14   31:new             #31  <Class HashMap>
    //   15   34:dup             
    //   16   35:invokespecial   #52  <Method void HashMap()>
    //   17   38:astore          6
    //   18   40:aload_3         
    //   19   41:invokevirtual   #58  <Method Context WebView.getContext()>
    //   20   44:invokevirtual   #64  <Method PackageManager Context.getPackageManager()>
    //   21   47:astore          7
    //   22   49:aload           5
    //   23   51:arraylength     
    //   24   52:istore          8
    //   25   54:iconst_0        
    //   26   55:istore          9
    //   27   57:iload           9
    //   28   59:iload           8
    //   29   61:icmpge          159
    //   30   64:aload           5
    //   31   66:iload           9
    //   32   68:aaload          
    //   33   69:astore          10
    //   34   71:aload           10
    //   35   73:ldc1            #66  <String ";">
    //   36   75:iconst_2        
    //   37   76:invokevirtual   #69  <Method String[] String.split(String, int)>
    //   38   79:astore          11
    //   39   81:aload           11
    //   40   83:iconst_0        
    //   41   84:aaload          
    //   42   85:astore          12
    //   43   87:aload           11
    //   44   89:arraylength     
    //   45   90:iconst_2        
    //   46   91:icmplt          146
    //   47   94:aload           11
    //   48   96:iconst_1        
    //   49   97:aaload          
    //   50   98:astore          13
    //   51  100:aload           7
    //   52  102:new             #71  <Class Intent>
    //   53  105:dup             
    //   54  106:aload           13
    //   55  108:aload           12
    //   56  110:invokestatic    #77  <Method Uri Uri.parse(String)>
    //   57  113:invokespecial   #80  <Method void Intent(String, Uri)>
    //   58  116:ldc1            #81  <Int 0x10000>
    //   59  118:invokevirtual   #87  <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
    //   60  121:ifnull          153
    //   61  124:iconst_1        
    //   62  125:istore          14
    //   63  127:aload           6
    //   64  129:aload           10
    //   65  131:iload           14
    //   66  133:invokestatic    #93  <Method Boolean Boolean.valueOf(boolean)>
    //   67  136:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
    //   68  139:pop             
    //   69  140:iinc            9  1
    //   70  143:goto            57
    //   71  146:ldc1            #99  <String "android.intent.action.VIEW">
    //   72  148:astore          13
    //   73  150:goto            100
    //   74  153:iconst_0        
    //   75  154:istore          14
    //   76  156:goto            127
    //   77  159:getstatic       #23  <Field a a>
    //   78  162:aload_3         
    //   79  163:aload           6
    //   80  165:invokevirtual   #102 <Method void a.a(WebView, java.util.Map)>
    //   81  168:return          
    }

    private static final a a;
}
