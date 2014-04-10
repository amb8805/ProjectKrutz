// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import com.google.ads.AdRequest;
import java.util.*;

public class MediationAdRequest
{

    public MediationAdRequest(AdRequest adrequest, Context context, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #16  <Field AdRequest a>
    //    5    9:aload_0         
    //    6   10:iload_3         
    //    7   11:putfield        #18  <Field boolean c>
    //    8   14:aload_2         
    //    9   15:ifnonnull       24
    //   10   18:aload_0         
    //   11   19:iconst_1        
    //   12   20:putfield        #20  <Field boolean b>
    //   13   23:return          
    //   14   24:aload_0         
    //   15   25:aload_1         
    //   16   26:aload_2         
    //   17   27:invokevirtual   #26  <Method boolean AdRequest.isTestDevice(Context)>
    //   18   30:putfield        #20  <Field boolean b>
    //   19   33:return          
    }

    public Integer getAgeInYears()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field AdRequest a>
    //    2    4:invokevirtual   #32  <Method Date AdRequest.getBirthday()>
    //    3    7:ifnull          71
    //    4   10:invokestatic    #38  <Method Calendar Calendar.getInstance()>
    //    5   13:astore_1        
    //    6   14:invokestatic    #38  <Method Calendar Calendar.getInstance()>
    //    7   17:astore_2        
    //    8   18:aload_1         
    //    9   19:aload_0         
    //   10   20:getfield        #16  <Field AdRequest a>
    //   11   23:invokevirtual   #32  <Method Date AdRequest.getBirthday()>
    //   12   26:invokevirtual   #42  <Method void Calendar.setTime(Date)>
    //   13   29:aload_2         
    //   14   30:iconst_1        
    //   15   31:invokevirtual   #46  <Method int Calendar.get(int)>
    //   16   34:aload_1         
    //   17   35:iconst_1        
    //   18   36:invokevirtual   #46  <Method int Calendar.get(int)>
    //   19   39:isub            
    //   20   40:invokestatic    #52  <Method Integer Integer.valueOf(int)>
    //   21   43:astore_3        
    //   22   44:aload_2         
    //   23   45:bipush          6
    //   24   47:invokevirtual   #46  <Method int Calendar.get(int)>
    //   25   50:aload_1         
    //   26   51:bipush          6
    //   27   53:invokevirtual   #46  <Method int Calendar.get(int)>
    //   28   56:icmpge          69
    //   29   59:iconst_m1       
    //   30   60:aload_3         
    //   31   61:invokevirtual   #56  <Method int Integer.intValue()>
    //   32   64:iadd            
    //   33   65:invokestatic    #52  <Method Integer Integer.valueOf(int)>
    //   34   68:astore_3        
    //   35   69:aload_3         
    //   36   70:areturn         
    //   37   71:aconst_null     
    //   38   72:areturn         
    }

    public Date getBirthday()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field AdRequest a>
    //    2    4:invokevirtual   #32  <Method Date AdRequest.getBirthday()>
    //    3    7:areturn         
    }

    public com.google.ads.AdRequest.Gender getGender()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field AdRequest a>
    //    2    4:invokevirtual   #60  <Method com.google.ads.AdRequest$Gender AdRequest.getGender()>
    //    3    7:areturn         
    }

    public Set getKeywords()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field AdRequest a>
    //    2    4:invokevirtual   #64  <Method Set AdRequest.getKeywords()>
    //    3    7:ifnonnull       12
    //    4   10:aconst_null     
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #16  <Field AdRequest a>
    //    8   16:invokevirtual   #64  <Method Set AdRequest.getKeywords()>
    //    9   19:invokestatic    #70  <Method Set Collections.unmodifiableSet(Set)>
    //   10   22:areturn         
    }

    public Location getLocation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #16  <Field AdRequest a>
    //    2    4:invokevirtual   #74  <Method Location AdRequest.getLocation()>
    //    3    7:ifnull          17
    //    4   10:aload_0         
    //    5   11:getfield        #18  <Field boolean c>
    //    6   14:ifne            19
    //    7   17:aconst_null     
    //    8   18:areturn         
    //    9   19:new             #76  <Class Location>
    //   10   22:dup             
    //   11   23:aload_0         
    //   12   24:getfield        #16  <Field AdRequest a>
    //   13   27:invokevirtual   #74  <Method Location AdRequest.getLocation()>
    //   14   30:invokespecial   #79  <Method void Location(Location)>
    //   15   33:areturn         
    }

    public boolean isTesting()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field boolean b>
    //    2    4:ireturn         
    }

    private AdRequest a;
    private boolean b;
    private boolean c;
}
