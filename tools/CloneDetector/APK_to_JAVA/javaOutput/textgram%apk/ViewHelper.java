// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.view;

import android.view.View;
import com.nineoldandroids.view.animation.AnimatorProxy;

public final class ViewHelper
{
    private static final class Honeycomb
    {

        private Honeycomb()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Object()>
        //    2    4:return          
        }

        static float getAlpha(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #15  <Method float View.getAlpha()>
        //    2    4:freturn         
        }

        static float getPivotX(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #18  <Method float View.getPivotX()>
        //    2    4:freturn         
        }

        static float getPivotY(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #21  <Method float View.getPivotY()>
        //    2    4:freturn         
        }

        static float getRotation(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #24  <Method float View.getRotation()>
        //    2    4:freturn         
        }

        static float getRotationX(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #27  <Method float View.getRotationX()>
        //    2    4:freturn         
        }

        static float getRotationY(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #30  <Method float View.getRotationY()>
        //    2    4:freturn         
        }

        static float getScaleX(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #33  <Method float View.getScaleX()>
        //    2    4:freturn         
        }

        static float getScaleY(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #36  <Method float View.getScaleY()>
        //    2    4:freturn         
        }

        static float getScrollX(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #40  <Method int View.getScrollX()>
        //    2    4:i2f             
        //    3    5:freturn         
        }

        static float getScrollY(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #43  <Method int View.getScrollY()>
        //    2    4:i2f             
        //    3    5:freturn         
        }

        static float getTranslationX(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #46  <Method float View.getTranslationX()>
        //    2    4:freturn         
        }

        static float getTranslationY(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #49  <Method float View.getTranslationY()>
        //    2    4:freturn         
        }

        static float getX(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #52  <Method float View.getX()>
        //    2    4:freturn         
        }

        static float getY(View view)
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #55  <Method float View.getY()>
        //    2    4:freturn         
        }

        static void setAlpha(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #60  <Method void View.setAlpha(float)>
        //    3    5:return          
        }

        static void setPivotX(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #63  <Method void View.setPivotX(float)>
        //    3    5:return          
        }

        static void setPivotY(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #66  <Method void View.setPivotY(float)>
        //    3    5:return          
        }

        static void setRotation(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #69  <Method void View.setRotation(float)>
        //    3    5:return          
        }

        static void setRotationX(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #72  <Method void View.setRotationX(float)>
        //    3    5:return          
        }

        static void setRotationY(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #75  <Method void View.setRotationY(float)>
        //    3    5:return          
        }

        static void setScaleX(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #78  <Method void View.setScaleX(float)>
        //    3    5:return          
        }

        static void setScaleY(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #81  <Method void View.setScaleY(float)>
        //    3    5:return          
        }

        static void setScrollX(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #86  <Method void View.setScrollX(int)>
        //    3    5:return          
        }

        static void setScrollY(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #89  <Method void View.setScrollY(int)>
        //    3    5:return          
        }

        static void setTranslationX(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #92  <Method void View.setTranslationX(float)>
        //    3    5:return          
        }

        static void setTranslationY(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #95  <Method void View.setTranslationY(float)>
        //    3    5:return          
        }

        static void setX(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #98  <Method void View.setX(float)>
        //    3    5:return          
        }

        static void setY(View view, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokevirtual   #101 <Method void View.setY(float)>
        //    3    5:return          
        }
    }


    private ViewHelper()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static float getAlpha(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #23  <Method float AnimatorProxy.getAlpha()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #27  <Method float ViewHelper$Honeycomb.getAlpha(View)>
    //    8   18:freturn         
    }

    public static float getPivotX(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #30  <Method float AnimatorProxy.getPivotX()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #32  <Method float ViewHelper$Honeycomb.getPivotX(View)>
    //    8   18:freturn         
    }

    public static float getPivotY(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #35  <Method float AnimatorProxy.getPivotY()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #37  <Method float ViewHelper$Honeycomb.getPivotY(View)>
    //    8   18:freturn         
    }

    public static float getRotation(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #40  <Method float AnimatorProxy.getRotation()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #42  <Method float ViewHelper$Honeycomb.getRotation(View)>
    //    8   18:freturn         
    }

    public static float getRotationX(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #45  <Method float AnimatorProxy.getRotationX()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #47  <Method float ViewHelper$Honeycomb.getRotationX(View)>
    //    8   18:freturn         
    }

    public static float getRotationY(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #50  <Method float AnimatorProxy.getRotationY()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #52  <Method float ViewHelper$Honeycomb.getRotationY(View)>
    //    8   18:freturn         
    }

    public static float getScaleX(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #55  <Method float AnimatorProxy.getScaleX()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #57  <Method float ViewHelper$Honeycomb.getScaleX(View)>
    //    8   18:freturn         
    }

    public static float getScaleY(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #60  <Method float AnimatorProxy.getScaleY()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #62  <Method float ViewHelper$Honeycomb.getScaleY(View)>
    //    8   18:freturn         
    }

    public static float getScrollX(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #66  <Method int AnimatorProxy.getScrollX()>
    //    5   13:i2f             
    //    6   14:freturn         
    //    7   15:aload_0         
    //    8   16:invokestatic    #68  <Method float ViewHelper$Honeycomb.getScrollX(View)>
    //    9   19:freturn         
    }

    public static float getScrollY(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #71  <Method int AnimatorProxy.getScrollY()>
    //    5   13:i2f             
    //    6   14:freturn         
    //    7   15:aload_0         
    //    8   16:invokestatic    #73  <Method float ViewHelper$Honeycomb.getScrollY(View)>
    //    9   19:freturn         
    }

    public static float getTranslationX(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #76  <Method float AnimatorProxy.getTranslationX()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #78  <Method float ViewHelper$Honeycomb.getTranslationX(View)>
    //    8   18:freturn         
    }

    public static float getTranslationY(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #81  <Method float AnimatorProxy.getTranslationY()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #83  <Method float ViewHelper$Honeycomb.getTranslationY(View)>
    //    8   18:freturn         
    }

    public static float getX(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #86  <Method float AnimatorProxy.getX()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #88  <Method float ViewHelper$Honeycomb.getX(View)>
    //    8   18:freturn         
    }

    public static float getY(View view)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            14
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:invokevirtual   #91  <Method float AnimatorProxy.getY()>
    //    5   13:freturn         
    //    6   14:aload_0         
    //    7   15:invokestatic    #93  <Method float ViewHelper$Honeycomb.getY(View)>
    //    8   18:freturn         
    }

    public static void setAlpha(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #98  <Method void AnimatorProxy.setAlpha(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #100 <Method void ViewHelper$Honeycomb.setAlpha(View, float)>
    //   10   20:return          
    }

    public static void setPivotX(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #103 <Method void AnimatorProxy.setPivotX(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #105 <Method void ViewHelper$Honeycomb.setPivotX(View, float)>
    //   10   20:return          
    }

    public static void setPivotY(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #108 <Method void AnimatorProxy.setPivotY(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #110 <Method void ViewHelper$Honeycomb.setPivotY(View, float)>
    //   10   20:return          
    }

    public static void setRotation(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #113 <Method void AnimatorProxy.setRotation(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #115 <Method void ViewHelper$Honeycomb.setRotation(View, float)>
    //   10   20:return          
    }

    public static void setRotationX(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #118 <Method void AnimatorProxy.setRotationX(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #120 <Method void ViewHelper$Honeycomb.setRotationX(View, float)>
    //   10   20:return          
    }

    public static void setRotationY(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #123 <Method void AnimatorProxy.setRotationY(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #125 <Method void ViewHelper$Honeycomb.setRotationY(View, float)>
    //   10   20:return          
    }

    public static void setScaleX(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #128 <Method void AnimatorProxy.setScaleX(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #130 <Method void ViewHelper$Honeycomb.setScaleX(View, float)>
    //   10   20:return          
    }

    public static void setScaleY(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #133 <Method void AnimatorProxy.setScaleY(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #135 <Method void ViewHelper$Honeycomb.setScaleY(View, float)>
    //   10   20:return          
    }

    public static void setScrollX(View view, int i)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:iload_1         
    //    5   11:invokevirtual   #140 <Method void AnimatorProxy.setScrollX(int)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:iload_1         
    //    9   17:invokestatic    #142 <Method void ViewHelper$Honeycomb.setScrollX(View, int)>
    //   10   20:return          
    }

    public static void setScrollY(View view, int i)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:iload_1         
    //    5   11:invokevirtual   #145 <Method void AnimatorProxy.setScrollY(int)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:iload_1         
    //    9   17:invokestatic    #147 <Method void ViewHelper$Honeycomb.setScrollY(View, int)>
    //   10   20:return          
    }

    public static void setTranslationX(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #150 <Method void AnimatorProxy.setTranslationX(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #152 <Method void ViewHelper$Honeycomb.setTranslationX(View, float)>
    //   10   20:return          
    }

    public static void setTranslationY(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #155 <Method void AnimatorProxy.setTranslationY(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #157 <Method void ViewHelper$Honeycomb.setTranslationY(View, float)>
    //   10   20:return          
    }

    public static void setX(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #160 <Method void AnimatorProxy.setX(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #162 <Method void ViewHelper$Honeycomb.setX(View, float)>
    //   10   20:return          
    }

    public static void setY(View view, float f)
    {
    //    0    0:getstatic       #16  <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    1    3:ifeq            15
    //    2    6:aload_0         
    //    3    7:invokestatic    #20  <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //    4   10:fload_1         
    //    5   11:invokevirtual   #165 <Method void AnimatorProxy.setY(float)>
    //    6   14:return          
    //    7   15:aload_0         
    //    8   16:fload_1         
    //    9   17:invokestatic    #167 <Method void ViewHelper$Honeycomb.setY(View, float)>
    //   10   20:return          
    }
}
