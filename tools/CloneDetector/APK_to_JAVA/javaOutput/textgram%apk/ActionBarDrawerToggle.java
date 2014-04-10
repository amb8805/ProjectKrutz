// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.*;

// Referenced classes of package android.support.v4.app:
//            ActionBarDrawerToggleHoneycomb

public class ActionBarDrawerToggle
    implements android.support.v4.widget.DrawerLayout.DrawerListener
{
    private static interface ActionBarDrawerToggleImpl
    {

        public abstract Drawable getThemeUpIndicator(Activity activity);

        public abstract Object setActionBarDescription(Object obj, Activity activity, int i);

        public abstract Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i);
    }

    private static class ActionBarDrawerToggleImplBase
        implements ActionBarDrawerToggleImpl
    {

        private ActionBarDrawerToggleImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        ActionBarDrawerToggleImplBase(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #12  <Method void ActionBarDrawerToggle$ActionBarDrawerToggleImplBase()>
        //    2    4:return          
        }

        public Drawable getThemeUpIndicator(Activity activity)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public Object setActionBarDescription(Object obj, Activity activity, int i)
        {
        //    0    0:aload_1         
        //    1    1:areturn         
        }

        public Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
        {
        //    0    0:aload_1         
        //    1    1:areturn         
        }
    }

    private static class ActionBarDrawerToggleImplHC
        implements ActionBarDrawerToggleImpl
    {

        private ActionBarDrawerToggleImplHC()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        ActionBarDrawerToggleImplHC(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #12  <Method void ActionBarDrawerToggle$ActionBarDrawerToggleImplHC()>
        //    2    4:return          
        }

        public Drawable getThemeUpIndicator(Activity activity)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #18  <Method Drawable ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(Activity)>
        //    2    4:areturn         
        }

        public Object setActionBarDescription(Object obj, Activity activity, int i)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:iload_3         
        //    3    3:invokestatic    #22  <Method Object ActionBarDrawerToggleHoneycomb.setActionBarDescription(Object, Activity, int)>
        //    4    6:areturn         
        }

        public Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:iload           4
        //    4    5:invokestatic    #26  <Method Object ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(Object, Activity, Drawable, int)>
        //    5    8:areturn         
        }
    }

    public static interface Delegate
    {

        public abstract Drawable getThemeUpIndicator();

        public abstract void setActionBarDescription(int i);

        public abstract void setActionBarUpIndicator(Drawable drawable, int i);
    }

    public static interface DelegateProvider
    {

        public abstract Delegate getDrawerToggleDelegate();
    }

    private class SlideDrawable extends LevelListDrawable
        implements android.graphics.drawable.Drawable.Callback
    {

        private SlideDrawable(Drawable drawable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field ActionBarDrawerToggle this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #22  <Method void LevelListDrawable()>
        //    5    9:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
        //    6   12:bipush          18
        //    7   14:icmple          55
        //    8   17:iconst_1        
        //    9   18:istore_3        
        //   10   19:aload_0         
        //   11   20:iload_3         
        //   12   21:putfield        #30  <Field boolean mHasMirroring>
        //   13   24:aload_0         
        //   14   25:new             #32  <Class Rect>
        //   15   28:dup             
        //   16   29:invokespecial   #33  <Method void Rect()>
        //   17   32:putfield        #35  <Field Rect mTmpRect>
        //   18   35:aload_2         
        //   19   36:invokestatic    #41  <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
        //   20   39:ifeq            47
        //   21   42:aload_0         
        //   22   43:iconst_1        
        //   23   44:invokestatic    #45  <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
        //   24   47:aload_0         
        //   25   48:iconst_0        
        //   26   49:iconst_0        
        //   27   50:aload_2         
        //   28   51:invokevirtual   #49  <Method void addLevel(int, int, Drawable)>
        //   29   54:return          
        //   30   55:iconst_0        
        //   31   56:istore_3        
        //   32   57:goto            19
        }

        SlideDrawable(Drawable drawable, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #52  <Method void ActionBarDrawerToggle$SlideDrawable(ActionBarDrawerToggle, Drawable)>
        //    4    6:return          
        }

        public void draw(Canvas canvas)
        {
        //    0    0:iconst_1        
        //    1    1:istore_2        
        //    2    2:aload_0         
        //    3    3:aload_0         
        //    4    4:getfield        #35  <Field Rect mTmpRect>
        //    5    7:invokevirtual   #58  <Method void copyBounds(Rect)>
        //    6   10:aload_1         
        //    7   11:invokevirtual   #64  <Method int Canvas.save()>
        //    8   14:pop             
        //    9   15:aload_0         
        //   10   16:getfield        #19  <Field ActionBarDrawerToggle this$0>
        //   11   19:invokestatic    #70  <Method Activity ActionBarDrawerToggle.access$300(ActionBarDrawerToggle)>
        //   12   22:invokevirtual   #76  <Method Window Activity.getWindow()>
        //   13   25:invokevirtual   #82  <Method View Window.getDecorView()>
        //   14   28:invokestatic    #88  <Method int ViewCompat.getLayoutDirection(View)>
        //   15   31:iload_2         
        //   16   32:icmpne          113
        //   17   35:iload_2         
        //   18   36:istore          4
        //   19   38:iload           4
        //   20   40:ifeq            45
        //   21   43:iconst_m1       
        //   22   44:istore_2        
        //   23   45:aload_0         
        //   24   46:getfield        #35  <Field Rect mTmpRect>
        //   25   49:invokevirtual   #91  <Method int Rect.width()>
        //   26   52:istore          5
        //   27   54:aload_1         
        //   28   55:aload_0         
        //   29   56:getfield        #93  <Field float mOffset>
        //   30   59:fneg            
        //   31   60:iload           5
        //   32   62:i2f             
        //   33   63:fmul            
        //   34   64:aload_0         
        //   35   65:getfield        #95  <Field float mPosition>
        //   36   68:fmul            
        //   37   69:iload_2         
        //   38   70:i2f             
        //   39   71:fmul            
        //   40   72:fconst_0        
        //   41   73:invokevirtual   #99  <Method void Canvas.translate(float, float)>
        //   42   76:iload           4
        //   43   78:ifeq            103
        //   44   81:aload_0         
        //   45   82:getfield        #30  <Field boolean mHasMirroring>
        //   46   85:ifne            103
        //   47   88:aload_1         
        //   48   89:iload           5
        //   49   91:i2f             
        //   50   92:fconst_0        
        //   51   93:invokevirtual   #99  <Method void Canvas.translate(float, float)>
        //   52   96:aload_1         
        //   53   97:ldc1            #100 <Float -1F>
        //   54   99:fconst_1        
        //   55  100:invokevirtual   #103 <Method void Canvas.scale(float, float)>
        //   56  103:aload_0         
        //   57  104:aload_1         
        //   58  105:invokespecial   #105 <Method void LevelListDrawable.draw(Canvas)>
        //   59  108:aload_1         
        //   60  109:invokevirtual   #108 <Method void Canvas.restore()>
        //   61  112:return          
        //   62  113:iconst_0        
        //   63  114:istore          4
        //   64  116:goto            38
        }

        public float getPosition()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #95  <Field float mPosition>
        //    2    4:freturn         
        }

        public void setOffset(float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:putfield        #93  <Field float mOffset>
        //    3    5:aload_0         
        //    4    6:invokevirtual   #115 <Method void invalidateSelf()>
        //    5    9:return          
        }

        public void setPosition(float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:putfield        #95  <Field float mPosition>
        //    3    5:aload_0         
        //    4    6:invokevirtual   #115 <Method void invalidateSelf()>
        //    5    9:return          
        }

        private final boolean mHasMirroring;
        private float mOffset;
        private float mPosition;
        private final Rect mTmpRect;
        final ActionBarDrawerToggle this$0;
    }


    static 
    {
    //    0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          20
    //    3    8:new             #41  <Class ActionBarDrawerToggle$ActionBarDrawerToggleImplHC>
    //    4   11:dup             
    //    5   12:aconst_null     
    //    6   13:invokespecial   #45  <Method void ActionBarDrawerToggle$ActionBarDrawerToggleImplHC(ActionBarDrawerToggle$1)>
    //    7   16:putstatic       #47  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
    //    8   19:return          
    //    9   20:new             #49  <Class ActionBarDrawerToggle$ActionBarDrawerToggleImplBase>
    //   10   23:dup             
    //   11   24:aconst_null     
    //   12   25:invokespecial   #50  <Method void ActionBarDrawerToggle$ActionBarDrawerToggleImplBase(ActionBarDrawerToggle$1)>
    //   13   28:putstatic       #47  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
    //   14   31:return          
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, int i, int j, int k)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #53  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #57  <Field Activity mActivity>
    //    8   14:aload_1         
    //    9   15:instanceof      #59  <Class ActionBarDrawerToggle$DelegateProvider>
    //   10   18:ifeq            103
    //   11   21:aload_0         
    //   12   22:aload_1         
    //   13   23:checkcast       #59  <Class ActionBarDrawerToggle$DelegateProvider>
    //   14   26:invokeinterface #63  <Method ActionBarDrawerToggle$Delegate ActionBarDrawerToggle$DelegateProvider.getDrawerToggleDelegate()>
    //   15   31:putfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //   16   34:aload_0         
    //   17   35:aload_2         
    //   18   36:putfield        #67  <Field DrawerLayout mDrawerLayout>
    //   19   39:aload_0         
    //   20   40:iload_3         
    //   21   41:putfield        #69  <Field int mDrawerImageResource>
    //   22   44:aload_0         
    //   23   45:iload           4
    //   24   47:putfield        #71  <Field int mOpenDrawerContentDescRes>
    //   25   50:aload_0         
    //   26   51:iload           5
    //   27   53:putfield        #73  <Field int mCloseDrawerContentDescRes>
    //   28   56:aload_0         
    //   29   57:aload_0         
    //   30   58:invokevirtual   #77  <Method Drawable getThemeUpIndicator()>
    //   31   61:putfield        #79  <Field Drawable mThemeImage>
    //   32   64:aload_0         
    //   33   65:aload_1         
    //   34   66:invokevirtual   #85  <Method Resources Activity.getResources()>
    //   35   69:iload_3         
    //   36   70:invokevirtual   #91  <Method Drawable Resources.getDrawable(int)>
    //   37   73:putfield        #93  <Field Drawable mDrawerImage>
    //   38   76:aload_0         
    //   39   77:new             #95  <Class ActionBarDrawerToggle$SlideDrawable>
    //   40   80:dup             
    //   41   81:aload_0         
    //   42   82:aload_0         
    //   43   83:getfield        #93  <Field Drawable mDrawerImage>
    //   44   86:aconst_null     
    //   45   87:invokespecial   #98  <Method void ActionBarDrawerToggle$SlideDrawable(ActionBarDrawerToggle, Drawable, ActionBarDrawerToggle$1)>
    //   46   90:putfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //   47   93:aload_0         
    //   48   94:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //   49   97:ldc1            #14  <Float 0.3333333F>
    //   50   99:invokevirtual   #104 <Method void ActionBarDrawerToggle$SlideDrawable.setOffset(float)>
    //   51  102:return          
    //   52  103:aload_0         
    //   53  104:aconst_null     
    //   54  105:putfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //   55  108:goto            34
    }

    static Activity access$300(ActionBarDrawerToggle actionbardrawertoggle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field Activity mActivity>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #57  <Field Activity mActivity>
    //    5    4:areturn         
    }

    Drawable getThemeUpIndicator()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //    5   11:invokeinterface #109 <Method Drawable ActionBarDrawerToggle$Delegate.getThemeUpIndicator()>
    //    6   16:areturn         
    //    7   17:getstatic       #47  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
    //    8   20:aload_0         
    //    9   21:getfield        #57  <Field Activity mActivity>
    //   10   24:invokeinterface #114 <Method Drawable ActionBarDrawerToggle$ActionBarDrawerToggleImpl.getThemeUpIndicator(Activity)>
    //   11   29:areturn         
    }

    public boolean isDrawerIndicatorEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //    2    4:ireturn         
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #77  <Method Drawable getThemeUpIndicator()>
    //    3    5:putfield        #79  <Field Drawable mThemeImage>
    //    4    8:aload_0         
    //    5    9:aload_0         
    //    6   10:getfield        #57  <Field Activity mActivity>
    //    7   13:invokevirtual   #85  <Method Resources Activity.getResources()>
    //    8   16:aload_0         
    //    9   17:getfield        #69  <Field int mDrawerImageResource>
    //   10   20:invokevirtual   #91  <Method Drawable Resources.getDrawable(int)>
    //   11   23:putfield        #93  <Field Drawable mDrawerImage>
    //   12   26:aload_0         
    //   13   27:invokevirtual   #121 <Method void syncState()>
    //   14   30:return          
    }

    public void onDrawerClosed(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //    2    4:fconst_0        
    //    3    5:invokevirtual   #126 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
    //    4    8:aload_0         
    //    5    9:getfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //    6   12:ifeq            23
    //    7   15:aload_0         
    //    8   16:aload_0         
    //    9   17:getfield        #71  <Field int mOpenDrawerContentDescRes>
    //   10   20:invokevirtual   #130 <Method void setActionBarDescription(int)>
    //   11   23:return          
    }

    public void onDrawerOpened(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //    2    4:fconst_1        
    //    3    5:invokevirtual   #126 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
    //    4    8:aload_0         
    //    5    9:getfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //    6   12:ifeq            23
    //    7   15:aload_0         
    //    8   16:aload_0         
    //    9   17:getfield        #73  <Field int mCloseDrawerContentDescRes>
    //   10   20:invokevirtual   #130 <Method void setActionBarDescription(int)>
    //   11   23:return          
    }

    public void onDrawerSlide(View view, float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //    2    4:invokevirtual   #137 <Method float ActionBarDrawerToggle$SlideDrawable.getPosition()>
    //    3    7:fstore_3        
    //    4    8:fload_2         
    //    5    9:ldc1            #138 <Float 0.5F>
    //    6   11:fcmpl           
    //    7   12:ifle            41
    //    8   15:fload_3         
    //    9   16:fconst_2        
    //   10   17:fconst_0        
    //   11   18:fload_2         
    //   12   19:ldc1            #138 <Float 0.5F>
    //   13   21:fsub            
    //   14   22:invokestatic    #144 <Method float Math.max(float, float)>
    //   15   25:fmul            
    //   16   26:invokestatic    #144 <Method float Math.max(float, float)>
    //   17   29:fstore          4
    //   18   31:aload_0         
    //   19   32:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //   20   35:fload           4
    //   21   37:invokevirtual   #126 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
    //   22   40:return          
    //   23   41:fload_3         
    //   24   42:fload_2         
    //   25   43:fconst_2        
    //   26   44:fmul            
    //   27   45:invokestatic    #147 <Method float Math.min(float, float)>
    //   28   48:fstore          4
    //   29   50:goto            31
    }

    public void onDrawerStateChanged(int i)
    {
    //    0    0:return          
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          57
    //    2    4:aload_1         
    //    3    5:invokeinterface #156 <Method int MenuItem.getItemId()>
    //    4   10:ldc1            #9   <Int 0x102002c>
    //    5   12:icmpne          57
    //    6   15:aload_0         
    //    7   16:getfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //    8   19:ifeq            57
    //    9   22:aload_0         
    //   10   23:getfield        #67  <Field DrawerLayout mDrawerLayout>
    //   11   26:ldc1            #157 <Int 0x800003>
    //   12   28:invokevirtual   #163 <Method boolean DrawerLayout.isDrawerVisible(int)>
    //   13   31:ifeq            45
    //   14   34:aload_0         
    //   15   35:getfield        #67  <Field DrawerLayout mDrawerLayout>
    //   16   38:ldc1            #157 <Int 0x800003>
    //   17   40:invokevirtual   #166 <Method void DrawerLayout.closeDrawer(int)>
    //   18   43:iconst_1        
    //   19   44:ireturn         
    //   20   45:aload_0         
    //   21   46:getfield        #67  <Field DrawerLayout mDrawerLayout>
    //   22   49:ldc1            #157 <Int 0x800003>
    //   23   51:invokevirtual   #169 <Method void DrawerLayout.openDrawer(int)>
    //   24   54:goto            43
    //   25   57:iconst_0        
    //   26   58:ireturn         
    }

    void setActionBarDescription(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //    5   11:iload_1         
    //    6   12:invokeinterface #170 <Method void ActionBarDrawerToggle$Delegate.setActionBarDescription(int)>
    //    7   17:return          
    //    8   18:aload_0         
    //    9   19:getstatic       #47  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
    //   10   22:aload_0         
    //   11   23:getfield        #172 <Field Object mSetIndicatorInfo>
    //   12   26:aload_0         
    //   13   27:getfield        #57  <Field Activity mActivity>
    //   14   30:iload_1         
    //   15   31:invokeinterface #175 <Method Object ActionBarDrawerToggle$ActionBarDrawerToggleImpl.setActionBarDescription(Object, Activity, int)>
    //   16   36:putfield        #172 <Field Object mSetIndicatorInfo>
    //   17   39:return          
    }

    void setActionBarUpIndicator(Drawable drawable, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #65  <Field ActionBarDrawerToggle$Delegate mActivityImpl>
    //    5   11:aload_1         
    //    6   12:iload_2         
    //    7   13:invokeinterface #179 <Method void ActionBarDrawerToggle$Delegate.setActionBarUpIndicator(Drawable, int)>
    //    8   18:return          
    //    9   19:aload_0         
    //   10   20:getstatic       #47  <Field ActionBarDrawerToggle$ActionBarDrawerToggleImpl IMPL>
    //   11   23:aload_0         
    //   12   24:getfield        #172 <Field Object mSetIndicatorInfo>
    //   13   27:aload_0         
    //   14   28:getfield        #57  <Field Activity mActivity>
    //   15   31:aload_1         
    //   16   32:iload_2         
    //   17   33:invokeinterface #182 <Method Object ActionBarDrawerToggle$ActionBarDrawerToggleImpl.setActionBarUpIndicator(Object, Activity, Drawable, int)>
    //   18   38:putfield        #172 <Field Object mSetIndicatorInfo>
    //   19   41:return          
    }

    public void setDrawerIndicatorEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //    3    5:icmpeq          45
    //    4    8:iload_1         
    //    5    9:ifeq            54
    //    6   12:aload_0         
    //    7   13:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //    8   16:astore_2        
    //    9   17:aload_0         
    //   10   18:getfield        #67  <Field DrawerLayout mDrawerLayout>
    //   11   21:ldc1            #157 <Int 0x800003>
    //   12   23:invokevirtual   #187 <Method boolean DrawerLayout.isDrawerOpen(int)>
    //   13   26:ifeq            46
    //   14   29:aload_0         
    //   15   30:getfield        #73  <Field int mCloseDrawerContentDescRes>
    //   16   33:istore_3        
    //   17   34:aload_0         
    //   18   35:aload_2         
    //   19   36:iload_3         
    //   20   37:invokevirtual   #188 <Method void setActionBarUpIndicator(Drawable, int)>
    //   21   40:aload_0         
    //   22   41:iload_1         
    //   23   42:putfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //   24   45:return          
    //   25   46:aload_0         
    //   26   47:getfield        #71  <Field int mOpenDrawerContentDescRes>
    //   27   50:istore_3        
    //   28   51:goto            34
    //   29   54:aload_0         
    //   30   55:aload_0         
    //   31   56:getfield        #79  <Field Drawable mThemeImage>
    //   32   59:iconst_0        
    //   33   60:invokevirtual   #188 <Method void setActionBarUpIndicator(Drawable, int)>
    //   34   63:goto            40
    }

    public void syncState()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #67  <Field DrawerLayout mDrawerLayout>
    //    2    4:ldc1            #157 <Int 0x800003>
    //    3    6:invokevirtual   #187 <Method boolean DrawerLayout.isDrawerOpen(int)>
    //    4    9:ifeq            56
    //    5   12:aload_0         
    //    6   13:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //    7   16:fconst_1        
    //    8   17:invokevirtual   #126 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
    //    9   20:aload_0         
    //   10   21:getfield        #55  <Field boolean mDrawerIndicatorEnabled>
    //   11   24:ifeq            55
    //   12   27:aload_0         
    //   13   28:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //   14   31:astore_1        
    //   15   32:aload_0         
    //   16   33:getfield        #67  <Field DrawerLayout mDrawerLayout>
    //   17   36:ldc1            #157 <Int 0x800003>
    //   18   38:invokevirtual   #187 <Method boolean DrawerLayout.isDrawerOpen(int)>
    //   19   41:ifeq            67
    //   20   44:aload_0         
    //   21   45:getfield        #73  <Field int mCloseDrawerContentDescRes>
    //   22   48:istore_2        
    //   23   49:aload_0         
    //   24   50:aload_1         
    //   25   51:iload_2         
    //   26   52:invokevirtual   #188 <Method void setActionBarUpIndicator(Drawable, int)>
    //   27   55:return          
    //   28   56:aload_0         
    //   29   57:getfield        #100 <Field ActionBarDrawerToggle$SlideDrawable mSlider>
    //   30   60:fconst_0        
    //   31   61:invokevirtual   #126 <Method void ActionBarDrawerToggle$SlideDrawable.setPosition(float)>
    //   32   64:goto            20
    //   33   67:aload_0         
    //   34   68:getfield        #71  <Field int mOpenDrawerContentDescRes>
    //   35   71:istore_2        
    //   36   72:goto            49
    }

    private static final int ID_HOME = 0x102002c;
    private static final ActionBarDrawerToggleImpl IMPL;
    private static final float TOGGLE_DRAWABLE_OFFSET = 0.3333333F;
    private final Activity mActivity;
    private final Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    private Drawable mDrawerImage;
    private final int mDrawerImageResource;
    private boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private final int mOpenDrawerContentDescRes;
    private Object mSetIndicatorInfo;
    private SlideDrawable mSlider;
    private Drawable mThemeImage;

    static Activity access$300(ActionBarDrawerToggle actionbardrawertoggle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field Activity mActivity>
    //    2    4:areturn         
    }

    // Unreferenced inner class android/support/v4/app/ActionBarDrawerToggle$1

/* anonymous class */
    static class _cls1
    {
    }

}
