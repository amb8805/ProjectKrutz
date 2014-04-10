// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.store;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import codeadore.textgram.StoreActivity;
import codeadore.textgram.custom_widgets.NoScrollViewPager;
import codeadore.textgram.lazylist.ImageLoader;
import java.util.ArrayList;

public class StoreFeaturedGalleryAdapter extends PagerAdapter
{

    public StoreFeaturedGalleryAdapter(Context context1, ArrayList arraylist, ArrayList arraylist1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #17  <Method void PagerAdapter()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #19  <Field Context context>
    //    5    9:aload_0         
    //    6   10:aload_2         
    //    7   11:putfield        #21  <Field ArrayList iconsList>
    //    8   14:aload_0         
    //    9   15:aload_3         
    //   10   16:putfield        #23  <Field ArrayList uniqueIDSList>
    //   11   19:aload_0         
    //   12   20:new             #25  <Class ImageLoader>
    //   13   23:dup             
    //   14   24:aload_1         
    //   15   25:invokevirtual   #31  <Method Context Context.getApplicationContext()>
    //   16   28:invokespecial   #34  <Method void ImageLoader(Context)>
    //   17   31:putfield        #36  <Field ImageLoader imageLoader>
    //   18   34:return          
    }

    public void destroyItem(View view, int i, Object obj)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #40  <Class ViewPager>
    //    2    4:aload_3         
    //    3    5:checkcast       #42  <Class ImageView>
    //    4    8:invokevirtual   #46  <Method void ViewPager.removeView(View)>
    //    5   11:return          
    }

    public void finishUpdate(View view)
    {
    //    0    0:return          
    }

    public int getCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field ArrayList iconsList>
    //    2    4:invokevirtual   #54  <Method int ArrayList.size()>
    //    3    7:ireturn         
    }

    public Object instantiateItem(View view, int i)
    {
    //    0    0:new             #42  <Class ImageView>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #19  <Field Context context>
    //    4    8:invokespecial   #57  <Method void ImageView(Context)>
    //    5   11:astore_3        
    //    6   12:aload_0         
    //    7   13:getfield        #36  <Field ImageLoader imageLoader>
    //    8   16:aload_0         
    //    9   17:getfield        #21  <Field ArrayList iconsList>
    //   10   20:iload_2         
    //   11   21:invokevirtual   #61  <Method Object ArrayList.get(int)>
    //   12   24:checkcast       #63  <Class String>
    //   13   27:aload_3         
    //   14   28:invokevirtual   #67  <Method void ImageLoader.DisplayImage(String, ImageView)>
    //   15   31:aload_3         
    //   16   32:new             #69  <Class StoreFeaturedGalleryAdapter$1>
    //   17   35:dup             
    //   18   36:aload_0         
    //   19   37:invokespecial   #72  <Method void StoreFeaturedGalleryAdapter$1(StoreFeaturedGalleryAdapter)>
    //   20   40:invokevirtual   #76  <Method void ImageView.setOnTouchListener(android.view.View$OnTouchListener)>
    //   21   43:aload_3         
    //   22   44:new             #78  <Class StoreFeaturedGalleryAdapter$2>
    //   23   47:dup             
    //   24   48:aload_0         
    //   25   49:iload_2         
    //   26   50:invokespecial   #81  <Method void StoreFeaturedGalleryAdapter$2(StoreFeaturedGalleryAdapter, int)>
    //   27   53:invokevirtual   #85  <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
    //   28   56:aload_1         
    //   29   57:checkcast       #40  <Class ViewPager>
    //   30   60:aload_3         
    //   31   61:iconst_0        
    //   32   62:invokevirtual   #89  <Method void ViewPager.addView(View, int)>
    //   33   65:aload_3         
    //   34   66:areturn         
    }

    public boolean isViewFromObject(View view, Object obj)
    {
    //    0    0:aload_1         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #97  <Method boolean Object.equals(Object)>
    //    3    5:ireturn         
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    //    0    0:return          
    }

    public Parcelable saveState()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public void startUpdate(View view)
    {
    //    0    0:return          
    }

    private final Context context;
    ArrayList iconsList;
    ImageLoader imageLoader;
    ArrayList uniqueIDSList;

    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedGalleryAdapter$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnTouchListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StoreFeaturedGalleryAdapter this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #28  <Method int MotionEvent.getAction()>
        //    2    4:tableswitch     0 1: default 28
        //                       0 30
        //                       1 39
        //    3   28:iconst_0        
        //    4   29:ireturn         
        //    5   30:getstatic       #34  <Field NoScrollViewPager StoreActivity.viewPager>
        //    6   33:invokevirtual   #39  <Method void NoScrollViewPager.disableScroll()>
        //    7   36:goto            28
        //    8   39:getstatic       #34  <Field NoScrollViewPager StoreActivity.viewPager>
        //    9   42:invokevirtual   #42  <Method void NoScrollViewPager.enableScroll()>
        //   10   45:goto            28
        }

        final StoreFeaturedGalleryAdapter this$0;
    }


    // Unreferenced inner class codeadore/textgram/store/StoreFeaturedGalleryAdapter$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StoreFeaturedGalleryAdapter this$0>
        //    3    5:aload_0         
        //    4    6:iload_2         
        //    5    7:putfield        #21  <Field int val$position>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field StoreFeaturedGalleryAdapter this$0>
        //    2    4:getfield        #30  <Field ArrayList StoreFeaturedGalleryAdapter.uniqueIDSList>
        //    3    7:aload_0         
        //    4    8:getfield        #21  <Field int val$position>
        //    5   11:invokevirtual   #36  <Method Object ArrayList.get(int)>
        //    6   14:checkcast       #38  <Class String>
        //    7   17:invokestatic    #44  <Method void StoreActivity.viewItem(String)>
        //    8   20:return          
        }

        final StoreFeaturedGalleryAdapter this$0;
        private final int val$position;
    }

}
