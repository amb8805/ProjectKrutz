// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AdapterViewICS

abstract class AbsSpinnerICS extends AdapterViewICS
{
    class RecycleBin
    {

        RecycleBin()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field AbsSpinnerICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #16  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:new             #18  <Class SparseArray>
        //    7   13:dup             
        //    8   14:invokespecial   #19  <Method void SparseArray()>
        //    9   17:putfield        #21  <Field SparseArray mScrapHeap>
        //   10   20:return          
        }

        void clear()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field SparseArray mScrapHeap>
        //    2    4:astore_1        
        //    3    5:aload_1         
        //    4    6:invokevirtual   #26  <Method int SparseArray.size()>
        //    5    9:istore_2        
        //    6   10:iconst_0        
        //    7   11:istore_3        
        //    8   12:iload_3         
        //    9   13:iload_2         
        //   10   14:icmpge          48
        //   11   17:aload_1         
        //   12   18:iload_3         
        //   13   19:invokevirtual   #30  <Method Object SparseArray.valueAt(int)>
        //   14   22:checkcast       #32  <Class View>
        //   15   25:astore          4
        //   16   27:aload           4
        //   17   29:ifnull          42
        //   18   32:aload_0         
        //   19   33:getfield        #13  <Field AbsSpinnerICS this$0>
        //   20   36:aload           4
        //   21   38:iconst_1        
        //   22   39:invokestatic    #38  <Method void AbsSpinnerICS.access$100(AbsSpinnerICS, View, boolean)>
        //   23   42:iinc            3  1
        //   24   45:goto            12
        //   25   48:aload_1         
        //   26   49:invokevirtual   #40  <Method void SparseArray.clear()>
        //   27   52:return          
        }

        View get(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field SparseArray mScrapHeap>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #44  <Method Object SparseArray.get(int)>
        //    4    8:checkcast       #32  <Class View>
        //    5   11:astore_2        
        //    6   12:aload_2         
        //    7   13:ifnull          24
        //    8   16:aload_0         
        //    9   17:getfield        #21  <Field SparseArray mScrapHeap>
        //   10   20:iload_1         
        //   11   21:invokevirtual   #48  <Method void SparseArray.delete(int)>
        //   12   24:aload_2         
        //   13   25:areturn         
        }

        public void put(int i, View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field SparseArray mScrapHeap>
        //    2    4:iload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #53  <Method void SparseArray.put(int, Object)>
        //    5    9:return          
        }

        private final SparseArray mScrapHeap;
        final AbsSpinnerICS this$0;
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #15  <Class AbsSpinnerICS$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #18  <Method void AbsSpinnerICS$SavedState$1()>
        //    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        private SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #23  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:invokevirtual   #29  <Method long Parcel.readLong()>
        //    6   10:putfield        #31  <Field long selectedId>
        //    7   13:aload_0         
        //    8   14:aload_1         
        //    9   15:invokevirtual   #35  <Method int Parcel.readInt()>
        //   10   18:putfield        #37  <Field int position>
        //   11   21:return          
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #39  <Method void AbsSpinnerICS$SavedState(Parcel)>
        //    3    5:return          
        }

        SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #42  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public String toString()
        {
        //    0    0:new             #46  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #47  <Method void StringBuilder()>
        //    3    7:ldc1            #49  <String "AbsSpinner.SavedState{">
        //    4    9:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
        //    5   12:aload_0         
        //    6   13:invokestatic    #59  <Method int System.identityHashCode(Object)>
        //    7   16:invokestatic    #65  <Method String Integer.toHexString(int)>
        //    8   19:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
        //    9   22:ldc1            #67  <String " selectedId=">
        //   10   24:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
        //   11   27:aload_0         
        //   12   28:getfield        #31  <Field long selectedId>
        //   13   31:invokevirtual   #70  <Method StringBuilder StringBuilder.append(long)>
        //   14   34:ldc1            #72  <String " position=">
        //   15   36:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
        //   16   39:aload_0         
        //   17   40:getfield        #37  <Field int position>
        //   18   43:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
        //   19   46:ldc1            #77  <String "}">
        //   20   48:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
        //   21   51:invokevirtual   #79  <Method String StringBuilder.toString()>
        //   22   54:areturn         
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #83  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #31  <Field long selectedId>
        //    7   11:invokevirtual   #87  <Method void Parcel.writeLong(long)>
        //    8   14:aload_1         
        //    9   15:aload_0         
        //   10   16:getfield        #37  <Field int position>
        //   11   19:invokevirtual   #91  <Method void Parcel.writeInt(int)>
        //   12   22:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        int position;
        long selectedId;
    }


    AbsSpinnerICS(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #27  <Method void AdapterViewICS(Context)>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #29  <Field int mSelectionLeftPadding>
    //    6   10:aload_0         
    //    7   11:iconst_0        
    //    8   12:putfield        #31  <Field int mSelectionTopPadding>
    //    9   15:aload_0         
    //   10   16:iconst_0        
    //   11   17:putfield        #33  <Field int mSelectionRightPadding>
    //   12   20:aload_0         
    //   13   21:iconst_0        
    //   14   22:putfield        #35  <Field int mSelectionBottomPadding>
    //   15   25:aload_0         
    //   16   26:new             #37  <Class Rect>
    //   17   29:dup             
    //   18   30:invokespecial   #40  <Method void Rect()>
    //   19   33:putfield        #42  <Field Rect mSpinnerPadding>
    //   20   36:aload_0         
    //   21   37:new             #44  <Class AbsSpinnerICS$RecycleBin>
    //   22   40:dup             
    //   23   41:aload_0         
    //   24   42:invokespecial   #47  <Method void AbsSpinnerICS$RecycleBin(AbsSpinnerICS)>
    //   25   45:putfield        #49  <Field AbsSpinnerICS$RecycleBin mRecycler>
    //   26   48:aload_0         
    //   27   49:invokespecial   #52  <Method void initAbsSpinner()>
    //   28   52:return          
    }

    AbsSpinnerICS(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #56  <Method void AbsSpinnerICS(Context, AttributeSet, int)>
    //    5    7:return          
    }

    AbsSpinnerICS(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #57  <Method void AdapterViewICS(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:iconst_0        
    //    7    9:putfield        #29  <Field int mSelectionLeftPadding>
    //    8   12:aload_0         
    //    9   13:iconst_0        
    //   10   14:putfield        #31  <Field int mSelectionTopPadding>
    //   11   17:aload_0         
    //   12   18:iconst_0        
    //   13   19:putfield        #33  <Field int mSelectionRightPadding>
    //   14   22:aload_0         
    //   15   23:iconst_0        
    //   16   24:putfield        #35  <Field int mSelectionBottomPadding>
    //   17   27:aload_0         
    //   18   28:new             #37  <Class Rect>
    //   19   31:dup             
    //   20   32:invokespecial   #40  <Method void Rect()>
    //   21   35:putfield        #42  <Field Rect mSpinnerPadding>
    //   22   38:aload_0         
    //   23   39:new             #44  <Class AbsSpinnerICS$RecycleBin>
    //   24   42:dup             
    //   25   43:aload_0         
    //   26   44:invokespecial   #47  <Method void AbsSpinnerICS$RecycleBin(AbsSpinnerICS)>
    //   27   47:putfield        #49  <Field AbsSpinnerICS$RecycleBin mRecycler>
    //   28   50:aload_0         
    //   29   51:invokespecial   #52  <Method void initAbsSpinner()>
    //   30   54:return          
    }

    static void access$100(AbsSpinnerICS absspinnerics, View view, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokevirtual   #63  <Method void removeDetachedView(View, boolean)>
    //    4    6:return          
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:iload_2         
    //    8    3:invokevirtual   #63  <Method void removeDetachedView(View, boolean)>
    //    9    6:return          
    }

    private void initAbsSpinner()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:invokevirtual   #67  <Method void setFocusable(boolean)>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:invokevirtual   #70  <Method void setWillNotDraw(boolean)>
    //    6   10:return          
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:new             #74  <Class android.view.ViewGroup$LayoutParams>
    //    1    3:dup             
    //    2    4:iconst_m1       
    //    3    5:bipush          -2
    //    4    7:invokespecial   #77  <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //    5   10:areturn         
    }

    public volatile Adapter getAdapter()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #82  <Method SpinnerAdapter getAdapter()>
    //    2    4:areturn         
    }

    public SpinnerAdapter getAdapter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #84  <Field SpinnerAdapter mAdapter>
    //    2    4:areturn         
    }

    int getChildHeight(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #92  <Method int View.getMeasuredHeight()>
    //    2    4:ireturn         
    }

    int getChildWidth(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #96  <Method int View.getMeasuredWidth()>
    //    2    4:ireturn         
    }

    public int getCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field int mItemCount>
    //    2    4:ireturn         
    }

    public View getSelectedView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field int mItemCount>
    //    2    4:ifle            28
    //    3    7:aload_0         
    //    4    8:getfield        #105 <Field int mSelectedPosition>
    //    5   11:iflt            28
    //    6   14:aload_0         
    //    7   15:aload_0         
    //    8   16:getfield        #105 <Field int mSelectedPosition>
    //    9   19:aload_0         
    //   10   20:getfield        #108 <Field int mFirstPosition>
    //   11   23:isub            
    //   12   24:invokevirtual   #112 <Method View getChildAt(int)>
    //   13   27:areturn         
    //   14   28:aconst_null     
    //   15   29:areturn         
    }

    abstract void layout(int i, boolean flag);

    protected void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #121 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:aload_0         
    //    4    6:invokevirtual   #124 <Method int getPaddingLeft()>
    //    5    9:istore          4
    //    6   11:aload_0         
    //    7   12:invokevirtual   #127 <Method int getPaddingTop()>
    //    8   15:istore          5
    //    9   17:aload_0         
    //   10   18:invokevirtual   #130 <Method int getPaddingRight()>
    //   11   21:istore          6
    //   12   23:aload_0         
    //   13   24:invokevirtual   #133 <Method int getPaddingBottom()>
    //   14   27:istore          7
    //   15   29:aload_0         
    //   16   30:getfield        #42  <Field Rect mSpinnerPadding>
    //   17   33:astore          8
    //   18   35:iload           4
    //   19   37:aload_0         
    //   20   38:getfield        #29  <Field int mSelectionLeftPadding>
    //   21   41:icmple          429
    //   22   44:aload           8
    //   23   46:iload           4
    //   24   48:putfield        #136 <Field int Rect.left>
    //   25   51:aload_0         
    //   26   52:getfield        #42  <Field Rect mSpinnerPadding>
    //   27   55:astore          9
    //   28   57:iload           5
    //   29   59:aload_0         
    //   30   60:getfield        #31  <Field int mSelectionTopPadding>
    //   31   63:icmple          438
    //   32   66:aload           9
    //   33   68:iload           5
    //   34   70:putfield        #139 <Field int Rect.top>
    //   35   73:aload_0         
    //   36   74:getfield        #42  <Field Rect mSpinnerPadding>
    //   37   77:astore          10
    //   38   79:iload           6
    //   39   81:aload_0         
    //   40   82:getfield        #33  <Field int mSelectionRightPadding>
    //   41   85:icmple          447
    //   42   88:aload           10
    //   43   90:iload           6
    //   44   92:putfield        #142 <Field int Rect.right>
    //   45   95:aload_0         
    //   46   96:getfield        #42  <Field Rect mSpinnerPadding>
    //   47   99:astore          11
    //   48  101:iload           7
    //   49  103:aload_0         
    //   50  104:getfield        #35  <Field int mSelectionBottomPadding>
    //   51  107:icmple          456
    //   52  110:aload           11
    //   53  112:iload           7
    //   54  114:putfield        #145 <Field int Rect.bottom>
    //   55  117:aload_0         
    //   56  118:getfield        #148 <Field boolean mDataChanged>
    //   57  121:ifeq            128
    //   58  124:aload_0         
    //   59  125:invokevirtual   #151 <Method void handleDataChanged()>
    //   60  128:iconst_1        
    //   61  129:istore          12
    //   62  131:aload_0         
    //   63  132:invokevirtual   #154 <Method int getSelectedItemPosition()>
    //   64  135:istore          13
    //   65  137:iconst_0        
    //   66  138:istore          14
    //   67  140:iconst_0        
    //   68  141:istore          15
    //   69  143:iload           13
    //   70  145:iflt            333
    //   71  148:aload_0         
    //   72  149:getfield        #84  <Field SpinnerAdapter mAdapter>
    //   73  152:astore          19
    //   74  154:iconst_0        
    //   75  155:istore          14
    //   76  157:iconst_0        
    //   77  158:istore          15
    //   78  160:aload           19
    //   79  162:ifnull          333
    //   80  165:aload_0         
    //   81  166:getfield        #84  <Field SpinnerAdapter mAdapter>
    //   82  169:invokeinterface #158 <Method int SpinnerAdapter.getCount()>
    //   83  174:istore          20
    //   84  176:iconst_0        
    //   85  177:istore          14
    //   86  179:iconst_0        
    //   87  180:istore          15
    //   88  182:iload           13
    //   89  184:iload           20
    //   90  186:icmpge          333
    //   91  189:aload_0         
    //   92  190:getfield        #49  <Field AbsSpinnerICS$RecycleBin mRecycler>
    //   93  193:iload           13
    //   94  195:invokevirtual   #161 <Method View AbsSpinnerICS$RecycleBin.get(int)>
    //   95  198:astore          21
    //   96  200:aload           21
    //   97  202:ifnonnull       220
    //   98  205:aload_0         
    //   99  206:getfield        #84  <Field SpinnerAdapter mAdapter>
    //  100  209:iload           13
    //  101  211:aconst_null     
    //  102  212:aload_0         
    //  103  213:invokeinterface #165 <Method View SpinnerAdapter.getView(int, View, android.view.ViewGroup)>
    //  104  218:astore          21
    //  105  220:aload           21
    //  106  222:ifnull          236
    //  107  225:aload_0         
    //  108  226:getfield        #49  <Field AbsSpinnerICS$RecycleBin mRecycler>
    //  109  229:iload           13
    //  110  231:aload           21
    //  111  233:invokevirtual   #169 <Method void AbsSpinnerICS$RecycleBin.put(int, View)>
    //  112  236:iconst_0        
    //  113  237:istore          14
    //  114  239:iconst_0        
    //  115  240:istore          15
    //  116  242:aload           21
    //  117  244:ifnull          333
    //  118  247:aload           21
    //  119  249:invokevirtual   #172 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  120  252:ifnonnull       274
    //  121  255:aload_0         
    //  122  256:iconst_1        
    //  123  257:putfield        #174 <Field boolean mBlockLayoutRequests>
    //  124  260:aload           21
    //  125  262:aload_0         
    //  126  263:invokevirtual   #176 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
    //  127  266:invokevirtual   #180 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //  128  269:aload_0         
    //  129  270:iconst_0        
    //  130  271:putfield        #174 <Field boolean mBlockLayoutRequests>
    //  131  274:aload_0         
    //  132  275:aload           21
    //  133  277:iload_1         
    //  134  278:iload_2         
    //  135  279:invokevirtual   #184 <Method void measureChild(View, int, int)>
    //  136  282:aload_0         
    //  137  283:aload           21
    //  138  285:invokevirtual   #186 <Method int getChildHeight(View)>
    //  139  288:aload_0         
    //  140  289:getfield        #42  <Field Rect mSpinnerPadding>
    //  141  292:getfield        #139 <Field int Rect.top>
    //  142  295:iadd            
    //  143  296:aload_0         
    //  144  297:getfield        #42  <Field Rect mSpinnerPadding>
    //  145  300:getfield        #145 <Field int Rect.bottom>
    //  146  303:iadd            
    //  147  304:istore          14
    //  148  306:aload_0         
    //  149  307:aload           21
    //  150  309:invokevirtual   #188 <Method int getChildWidth(View)>
    //  151  312:aload_0         
    //  152  313:getfield        #42  <Field Rect mSpinnerPadding>
    //  153  316:getfield        #136 <Field int Rect.left>
    //  154  319:iadd            
    //  155  320:aload_0         
    //  156  321:getfield        #42  <Field Rect mSpinnerPadding>
    //  157  324:getfield        #142 <Field int Rect.right>
    //  158  327:iadd            
    //  159  328:istore          15
    //  160  330:iconst_0        
    //  161  331:istore          12
    //  162  333:iload           12
    //  163  335:ifeq            376
    //  164  338:aload_0         
    //  165  339:getfield        #42  <Field Rect mSpinnerPadding>
    //  166  342:getfield        #139 <Field int Rect.top>
    //  167  345:aload_0         
    //  168  346:getfield        #42  <Field Rect mSpinnerPadding>
    //  169  349:getfield        #145 <Field int Rect.bottom>
    //  170  352:iadd            
    //  171  353:istore          14
    //  172  355:iload_3         
    //  173  356:ifne            376
    //  174  359:aload_0         
    //  175  360:getfield        #42  <Field Rect mSpinnerPadding>
    //  176  363:getfield        #136 <Field int Rect.left>
    //  177  366:aload_0         
    //  178  367:getfield        #42  <Field Rect mSpinnerPadding>
    //  179  370:getfield        #142 <Field int Rect.right>
    //  180  373:iadd            
    //  181  374:istore          15
    //  182  376:iload           14
    //  183  378:aload_0         
    //  184  379:invokevirtual   #191 <Method int getSuggestedMinimumHeight()>
    //  185  382:invokestatic    #197 <Method int Math.max(int, int)>
    //  186  385:istore          16
    //  187  387:iload           15
    //  188  389:aload_0         
    //  189  390:invokevirtual   #200 <Method int getSuggestedMinimumWidth()>
    //  190  393:invokestatic    #197 <Method int Math.max(int, int)>
    //  191  396:istore          17
    //  192  398:iload           16
    //  193  400:iload_2         
    //  194  401:invokestatic    #203 <Method int resolveSize(int, int)>
    //  195  404:istore          18
    //  196  406:aload_0         
    //  197  407:iload           17
    //  198  409:iload_1         
    //  199  410:invokestatic    #203 <Method int resolveSize(int, int)>
    //  200  413:iload           18
    //  201  415:invokevirtual   #206 <Method void setMeasuredDimension(int, int)>
    //  202  418:aload_0         
    //  203  419:iload_2         
    //  204  420:putfield        #208 <Field int mHeightMeasureSpec>
    //  205  423:aload_0         
    //  206  424:iload_1         
    //  207  425:putfield        #210 <Field int mWidthMeasureSpec>
    //  208  428:return          
    //  209  429:aload_0         
    //  210  430:getfield        #29  <Field int mSelectionLeftPadding>
    //  211  433:istore          4
    //  212  435:goto            44
    //  213  438:aload_0         
    //  214  439:getfield        #31  <Field int mSelectionTopPadding>
    //  215  442:istore          5
    //  216  444:goto            66
    //  217  447:aload_0         
    //  218  448:getfield        #33  <Field int mSelectionRightPadding>
    //  219  451:istore          6
    //  220  453:goto            88
    //  221  456:aload_0         
    //  222  457:getfield        #35  <Field int mSelectionBottomPadding>
    //  223  460:istore          7
    //  224  462:goto            110
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #214 <Class AbsSpinnerICS$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #218 <Method Parcelable AbsSpinnerICS$SavedState.getSuperState()>
    //    6   10:invokespecial   #220 <Method void AdapterViewICS.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_2         
    //    8   14:getfield        #224 <Field long AbsSpinnerICS$SavedState.selectedId>
    //    9   17:lconst_0        
    //   10   18:lcmp            
    //   11   19:iflt            57
    //   12   22:aload_0         
    //   13   23:iconst_1        
    //   14   24:putfield        #148 <Field boolean mDataChanged>
    //   15   27:aload_0         
    //   16   28:iconst_1        
    //   17   29:putfield        #227 <Field boolean mNeedSync>
    //   18   32:aload_0         
    //   19   33:aload_2         
    //   20   34:getfield        #224 <Field long AbsSpinnerICS$SavedState.selectedId>
    //   21   37:putfield        #230 <Field long mSyncRowId>
    //   22   40:aload_0         
    //   23   41:aload_2         
    //   24   42:getfield        #233 <Field int AbsSpinnerICS$SavedState.position>
    //   25   45:putfield        #236 <Field int mSyncPosition>
    //   26   48:aload_0         
    //   27   49:iconst_0        
    //   28   50:putfield        #239 <Field int mSyncMode>
    //   29   53:aload_0         
    //   30   54:invokevirtual   #242 <Method void requestLayout()>
    //   31   57:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #214 <Class AbsSpinnerICS$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #245 <Method Parcelable AdapterViewICS.onSaveInstanceState()>
    //    4    8:invokespecial   #247 <Method void AbsSpinnerICS$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:invokevirtual   #251 <Method long getSelectedItemId()>
    //    9   17:putfield        #224 <Field long AbsSpinnerICS$SavedState.selectedId>
    //   10   20:aload_1         
    //   11   21:getfield        #224 <Field long AbsSpinnerICS$SavedState.selectedId>
    //   12   24:lconst_0        
    //   13   25:lcmp            
    //   14   26:iflt            39
    //   15   29:aload_1         
    //   16   30:aload_0         
    //   17   31:invokevirtual   #154 <Method int getSelectedItemPosition()>
    //   18   34:putfield        #233 <Field int AbsSpinnerICS$SavedState.position>
    //   19   37:aload_1         
    //   20   38:areturn         
    //   21   39:aload_1         
    //   22   40:iconst_m1       
    //   23   41:putfield        #233 <Field int AbsSpinnerICS$SavedState.position>
    //   24   44:aload_1         
    //   25   45:areturn         
    }

    public int pointToPosition(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #254 <Field Rect mTouchFrame>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:ifnonnull       25
    //    5    9:aload_0         
    //    6   10:new             #37  <Class Rect>
    //    7   13:dup             
    //    8   14:invokespecial   #40  <Method void Rect()>
    //    9   17:putfield        #254 <Field Rect mTouchFrame>
    //   10   20:aload_0         
    //   11   21:getfield        #254 <Field Rect mTouchFrame>
    //   12   24:astore_3        
    //   13   25:iconst_m1       
    //   14   26:aload_0         
    //   15   27:invokevirtual   #257 <Method int getChildCount()>
    //   16   30:iadd            
    //   17   31:istore          4
    //   18   33:iload           4
    //   19   35:iflt            83
    //   20   38:aload_0         
    //   21   39:iload           4
    //   22   41:invokevirtual   #112 <Method View getChildAt(int)>
    //   23   44:astore          5
    //   24   46:aload           5
    //   25   48:invokevirtual   #260 <Method int View.getVisibility()>
    //   26   51:ifne            77
    //   27   54:aload           5
    //   28   56:aload_3         
    //   29   57:invokevirtual   #264 <Method void View.getHitRect(Rect)>
    //   30   60:aload_3         
    //   31   61:iload_1         
    //   32   62:iload_2         
    //   33   63:invokevirtual   #268 <Method boolean Rect.contains(int, int)>
    //   34   66:ifeq            77
    //   35   69:iload           4
    //   36   71:aload_0         
    //   37   72:getfield        #108 <Field int mFirstPosition>
    //   38   75:iadd            
    //   39   76:ireturn         
    //   40   77:iinc            4  -1
    //   41   80:goto            33
    //   42   83:iconst_m1       
    //   43   84:ireturn         
    }

    void recycleAllViews()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #257 <Method int getChildCount()>
    //    2    4:istore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #49  <Field AbsSpinnerICS$RecycleBin mRecycler>
    //    5    9:astore_2        
    //    6   10:aload_0         
    //    7   11:getfield        #108 <Field int mFirstPosition>
    //    8   14:istore_3        
    //    9   15:iconst_0        
    //   10   16:istore          4
    //   11   18:iload           4
    //   12   20:iload_1         
    //   13   21:icmpge          48
    //   14   24:aload_0         
    //   15   25:iload           4
    //   16   27:invokevirtual   #112 <Method View getChildAt(int)>
    //   17   30:astore          5
    //   18   32:aload_2         
    //   19   33:iload_3         
    //   20   34:iload           4
    //   21   36:iadd            
    //   22   37:aload           5
    //   23   39:invokevirtual   #169 <Method void AbsSpinnerICS$RecycleBin.put(int, View)>
    //   24   42:iinc            4  1
    //   25   45:goto            18
    //   26   48:return          
    }

    public void requestLayout()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #174 <Field boolean mBlockLayoutRequests>
    //    2    4:ifne            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #270 <Method void AdapterViewICS.requestLayout()>
    //    5   11:return          
    }

    void resetList()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #148 <Field boolean mDataChanged>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #227 <Field boolean mNeedSync>
    //    6   10:aload_0         
    //    7   11:invokevirtual   #274 <Method void removeAllViewsInLayout()>
    //    8   14:aload_0         
    //    9   15:iconst_m1       
    //   10   16:putfield        #277 <Field int mOldSelectedPosition>
    //   11   19:aload_0         
    //   12   20:ldc2w           #278 <Long 0x8000000000000000L>
    //   13   23:putfield        #282 <Field long mOldSelectedRowId>
    //   14   26:aload_0         
    //   15   27:iconst_m1       
    //   16   28:invokevirtual   #286 <Method void setSelectedPositionInt(int)>
    //   17   31:aload_0         
    //   18   32:iconst_m1       
    //   19   33:invokevirtual   #289 <Method void setNextSelectedPositionInt(int)>
    //   20   36:aload_0         
    //   21   37:invokevirtual   #292 <Method void invalidate()>
    //   22   40:return          
    }

    public volatile void setAdapter(Adapter adapter)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #156 <Class SpinnerAdapter>
    //    3    5:invokevirtual   #297 <Method void setAdapter(SpinnerAdapter)>
    //    4    8:return          
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
    //    0    0:iconst_m1       
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #84  <Field SpinnerAdapter mAdapter>
    //    4    6:ifnull          26
    //    5    9:aload_0         
    //    6   10:getfield        #84  <Field SpinnerAdapter mAdapter>
    //    7   13:aload_0         
    //    8   14:getfield        #299 <Field DataSetObserver mDataSetObserver>
    //    9   17:invokeinterface #303 <Method void SpinnerAdapter.unregisterDataSetObserver(DataSetObserver)>
    //   10   22:aload_0         
    //   11   23:invokevirtual   #305 <Method void resetList()>
    //   12   26:aload_0         
    //   13   27:aload_1         
    //   14   28:putfield        #84  <Field SpinnerAdapter mAdapter>
    //   15   31:aload_0         
    //   16   32:iload_2         
    //   17   33:putfield        #277 <Field int mOldSelectedPosition>
    //   18   36:aload_0         
    //   19   37:ldc2w           #278 <Long 0x8000000000000000L>
    //   20   40:putfield        #282 <Field long mOldSelectedRowId>
    //   21   43:aload_0         
    //   22   44:getfield        #84  <Field SpinnerAdapter mAdapter>
    //   23   47:ifnull          135
    //   24   50:aload_0         
    //   25   51:aload_0         
    //   26   52:getfield        #100 <Field int mItemCount>
    //   27   55:putfield        #308 <Field int mOldItemCount>
    //   28   58:aload_0         
    //   29   59:aload_0         
    //   30   60:getfield        #84  <Field SpinnerAdapter mAdapter>
    //   31   63:invokeinterface #158 <Method int SpinnerAdapter.getCount()>
    //   32   68:putfield        #100 <Field int mItemCount>
    //   33   71:aload_0         
    //   34   72:invokevirtual   #311 <Method void checkFocus()>
    //   35   75:aload_0         
    //   36   76:new             #313 <Class AdapterViewICS$AdapterDataSetObserver>
    //   37   79:dup             
    //   38   80:aload_0         
    //   39   81:invokespecial   #316 <Method void AdapterViewICS$AdapterDataSetObserver(AdapterViewICS)>
    //   40   84:putfield        #299 <Field DataSetObserver mDataSetObserver>
    //   41   87:aload_0         
    //   42   88:getfield        #84  <Field SpinnerAdapter mAdapter>
    //   43   91:aload_0         
    //   44   92:getfield        #299 <Field DataSetObserver mDataSetObserver>
    //   45   95:invokeinterface #319 <Method void SpinnerAdapter.registerDataSetObserver(DataSetObserver)>
    //   46  100:aload_0         
    //   47  101:getfield        #100 <Field int mItemCount>
    //   48  104:ifle            109
    //   49  107:iconst_0        
    //   50  108:istore_2        
    //   51  109:aload_0         
    //   52  110:iload_2         
    //   53  111:invokevirtual   #286 <Method void setSelectedPositionInt(int)>
    //   54  114:aload_0         
    //   55  115:iload_2         
    //   56  116:invokevirtual   #289 <Method void setNextSelectedPositionInt(int)>
    //   57  119:aload_0         
    //   58  120:getfield        #100 <Field int mItemCount>
    //   59  123:ifne            130
    //   60  126:aload_0         
    //   61  127:invokevirtual   #322 <Method void checkSelectionChanged()>
    //   62  130:aload_0         
    //   63  131:invokevirtual   #242 <Method void requestLayout()>
    //   64  134:return          
    //   65  135:aload_0         
    //   66  136:invokevirtual   #311 <Method void checkFocus()>
    //   67  139:aload_0         
    //   68  140:invokevirtual   #305 <Method void resetList()>
    //   69  143:aload_0         
    //   70  144:invokevirtual   #322 <Method void checkSelectionChanged()>
    //   71  147:goto            130
    }

    public void setSelection(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #289 <Method void setNextSelectedPositionInt(int)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #242 <Method void requestLayout()>
    //    5    9:aload_0         
    //    6   10:invokevirtual   #292 <Method void invalidate()>
    //    7   13:return          
    }

    public void setSelection(int i, boolean flag)
    {
    //    0    0:iload_2         
    //    1    1:ifeq            36
    //    2    4:aload_0         
    //    3    5:getfield        #108 <Field int mFirstPosition>
    //    4    8:iload_1         
    //    5    9:icmpgt          36
    //    6   12:iload_1         
    //    7   13:iconst_m1       
    //    8   14:aload_0         
    //    9   15:getfield        #108 <Field int mFirstPosition>
    //   10   18:aload_0         
    //   11   19:invokevirtual   #257 <Method int getChildCount()>
    //   12   22:iadd            
    //   13   23:iadd            
    //   14   24:icmpgt          36
    //   15   27:iconst_1        
    //   16   28:istore_3        
    //   17   29:aload_0         
    //   18   30:iload_1         
    //   19   31:iload_3         
    //   20   32:invokevirtual   #326 <Method void setSelectionInt(int, boolean)>
    //   21   35:return          
    //   22   36:iconst_0        
    //   23   37:istore_3        
    //   24   38:goto            29
    }

    void setSelectionInt(int i, boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #277 <Field int mOldSelectedPosition>
    //    3    5:icmpeq          36
    //    4    8:aload_0         
    //    5    9:iconst_1        
    //    6   10:putfield        #174 <Field boolean mBlockLayoutRequests>
    //    7   13:iload_1         
    //    8   14:aload_0         
    //    9   15:getfield        #105 <Field int mSelectedPosition>
    //   10   18:isub            
    //   11   19:istore_3        
    //   12   20:aload_0         
    //   13   21:iload_1         
    //   14   22:invokevirtual   #289 <Method void setNextSelectedPositionInt(int)>
    //   15   25:aload_0         
    //   16   26:iload_3         
    //   17   27:iload_2         
    //   18   28:invokevirtual   #328 <Method void layout(int, boolean)>
    //   19   31:aload_0         
    //   20   32:iconst_0        
    //   21   33:putfield        #174 <Field boolean mBlockLayoutRequests>
    //   22   36:return          
    }

    SpinnerAdapter mAdapter;
    boolean mBlockLayoutRequests;
    private DataSetObserver mDataSetObserver;
    int mHeightMeasureSpec;
    final RecycleBin mRecycler;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    final Rect mSpinnerPadding;
    private Rect mTouchFrame;
    int mWidthMeasureSpec;

    static void access$100(AbsSpinnerICS absspinnerics, View view, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokevirtual   #63  <Method void removeDetachedView(View, boolean)>
    //    4    6:return          
    }

    // Unreferenced inner class android/support/v7/internal/widget/AbsSpinnerICS$1

/* anonymous class */
    static class _cls1
    {
    }


    // Unreferenced inner class android/support/v7/internal/widget/AbsSpinnerICS$SavedState$1

/* anonymous class */
    static final class SavedState._cls1
        implements android.os.Parcelable.Creator
    {

        SavedState._cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public SavedState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class AbsSpinnerICS$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void AbsSpinnerICS$SavedState(Parcel, AbsSpinnerICS$1)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method AbsSpinnerICS$SavedState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public SavedState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       SavedState[]
        //    2    4:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method AbsSpinnerICS$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
