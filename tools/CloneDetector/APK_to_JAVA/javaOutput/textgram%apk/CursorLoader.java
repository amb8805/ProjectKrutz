// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

// Referenced classes of package android.support.v4.content:
//            AsyncTaskLoader

public class CursorLoader extends AsyncTaskLoader
{

    public CursorLoader(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #22  <Method void AsyncTaskLoader(Context)>
    //    3    5:aload_0         
    //    4    6:new             #24  <Class Loader$ForceLoadContentObserver>
    //    5    9:dup             
    //    6   10:aload_0         
    //    7   11:invokespecial   #27  <Method void Loader$ForceLoadContentObserver(Loader)>
    //    8   14:putfield        #29  <Field Loader$ForceLoadContentObserver mObserver>
    //    9   17:return          
    }

    public CursorLoader(Context context, Uri uri, String as[], String s, String as1[], String s1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #22  <Method void AsyncTaskLoader(Context)>
    //    3    5:aload_0         
    //    4    6:new             #24  <Class Loader$ForceLoadContentObserver>
    //    5    9:dup             
    //    6   10:aload_0         
    //    7   11:invokespecial   #27  <Method void Loader$ForceLoadContentObserver(Loader)>
    //    8   14:putfield        #29  <Field Loader$ForceLoadContentObserver mObserver>
    //    9   17:aload_0         
    //   10   18:aload_2         
    //   11   19:putfield        #32  <Field Uri mUri>
    //   12   22:aload_0         
    //   13   23:aload_3         
    //   14   24:putfield        #34  <Field String[] mProjection>
    //   15   27:aload_0         
    //   16   28:aload           4
    //   17   30:putfield        #36  <Field String mSelection>
    //   18   33:aload_0         
    //   19   34:aload           5
    //   20   36:putfield        #38  <Field String[] mSelectionArgs>
    //   21   39:aload_0         
    //   22   40:aload           6
    //   23   42:putfield        #40  <Field String mSortOrder>
    //   24   45:return          
    }

    public void deliverResult(Cursor cursor)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #46  <Method boolean isReset()>
    //    2    4:ifeq            18
    //    3    7:aload_1         
    //    4    8:ifnull          17
    //    5   11:aload_1         
    //    6   12:invokeinterface #52  <Method void Cursor.close()>
    //    7   17:return          
    //    8   18:aload_0         
    //    9   19:getfield        #54  <Field Cursor mCursor>
    //   10   22:astore_2        
    //   11   23:aload_0         
    //   12   24:aload_1         
    //   13   25:putfield        #54  <Field Cursor mCursor>
    //   14   28:aload_0         
    //   15   29:invokevirtual   #57  <Method boolean isStarted()>
    //   16   32:ifeq            40
    //   17   35:aload_0         
    //   18   36:aload_1         
    //   19   37:invokespecial   #60  <Method void AsyncTaskLoader.deliverResult(Object)>
    //   20   40:aload_2         
    //   21   41:ifnull          17
    //   22   44:aload_2         
    //   23   45:aload_1         
    //   24   46:if_acmpeq       17
    //   25   49:aload_2         
    //   26   50:invokeinterface #63  <Method boolean Cursor.isClosed()>
    //   27   55:ifne            17
    //   28   58:aload_2         
    //   29   59:invokeinterface #52  <Method void Cursor.close()>
    //   30   64:return          
    }

    public volatile void deliverResult(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #48  <Class Cursor>
    //    3    5:invokevirtual   #65  <Method void deliverResult(Cursor)>
    //    4    8:return          
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:aload           4
    //    5    6:invokespecial   #69  <Method void AsyncTaskLoader.dump(String, FileDescriptor, PrintWriter, String[])>
    //    6    9:aload_3         
    //    7   10:aload_1         
    //    8   11:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //    9   14:aload_3         
    //   10   15:ldc1            #77  <String "mUri=">
    //   11   17:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   12   20:aload_3         
    //   13   21:aload_0         
    //   14   22:getfield        #32  <Field Uri mUri>
    //   15   25:invokevirtual   #80  <Method void PrintWriter.println(Object)>
    //   16   28:aload_3         
    //   17   29:aload_1         
    //   18   30:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   19   33:aload_3         
    //   20   34:ldc1            #82  <String "mProjection=">
    //   21   36:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   22   39:aload_3         
    //   23   40:aload_0         
    //   24   41:getfield        #34  <Field String[] mProjection>
    //   25   44:invokestatic    #88  <Method String Arrays.toString(Object[])>
    //   26   47:invokevirtual   #90  <Method void PrintWriter.println(String)>
    //   27   50:aload_3         
    //   28   51:aload_1         
    //   29   52:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   30   55:aload_3         
    //   31   56:ldc1            #92  <String "mSelection=">
    //   32   58:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   33   61:aload_3         
    //   34   62:aload_0         
    //   35   63:getfield        #36  <Field String mSelection>
    //   36   66:invokevirtual   #90  <Method void PrintWriter.println(String)>
    //   37   69:aload_3         
    //   38   70:aload_1         
    //   39   71:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   40   74:aload_3         
    //   41   75:ldc1            #94  <String "mSelectionArgs=">
    //   42   77:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   43   80:aload_3         
    //   44   81:aload_0         
    //   45   82:getfield        #38  <Field String[] mSelectionArgs>
    //   46   85:invokestatic    #88  <Method String Arrays.toString(Object[])>
    //   47   88:invokevirtual   #90  <Method void PrintWriter.println(String)>
    //   48   91:aload_3         
    //   49   92:aload_1         
    //   50   93:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   51   96:aload_3         
    //   52   97:ldc1            #96  <String "mSortOrder=">
    //   53   99:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   54  102:aload_3         
    //   55  103:aload_0         
    //   56  104:getfield        #40  <Field String mSortOrder>
    //   57  107:invokevirtual   #90  <Method void PrintWriter.println(String)>
    //   58  110:aload_3         
    //   59  111:aload_1         
    //   60  112:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   61  115:aload_3         
    //   62  116:ldc1            #98  <String "mCursor=">
    //   63  118:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   64  121:aload_3         
    //   65  122:aload_0         
    //   66  123:getfield        #54  <Field Cursor mCursor>
    //   67  126:invokevirtual   #80  <Method void PrintWriter.println(Object)>
    //   68  129:aload_3         
    //   69  130:aload_1         
    //   70  131:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   71  134:aload_3         
    //   72  135:ldc1            #100 <String "mContentChanged=">
    //   73  137:invokevirtual   #75  <Method void PrintWriter.print(String)>
    //   74  140:aload_3         
    //   75  141:aload_0         
    //   76  142:getfield        #104 <Field boolean mContentChanged>
    //   77  145:invokevirtual   #107 <Method void PrintWriter.println(boolean)>
    //   78  148:return          
    }

    public String[] getProjection()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #34  <Field String[] mProjection>
    //    2    4:areturn         
    }

    public String getSelection()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field String mSelection>
    //    2    4:areturn         
    }

    public String[] getSelectionArgs()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field String[] mSelectionArgs>
    //    2    4:areturn         
    }

    public String getSortOrder()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field String mSortOrder>
    //    2    4:areturn         
    }

    public Uri getUri()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #32  <Field Uri mUri>
    //    2    4:areturn         
    }

    public Cursor loadInBackground()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #121 <Method Context getContext()>
    //    2    4:invokevirtual   #127 <Method ContentResolver Context.getContentResolver()>
    //    3    7:aload_0         
    //    4    8:getfield        #32  <Field Uri mUri>
    //    5   11:aload_0         
    //    6   12:getfield        #34  <Field String[] mProjection>
    //    7   15:aload_0         
    //    8   16:getfield        #36  <Field String mSelection>
    //    9   19:aload_0         
    //   10   20:getfield        #38  <Field String[] mSelectionArgs>
    //   11   23:aload_0         
    //   12   24:getfield        #40  <Field String mSortOrder>
    //   13   27:invokevirtual   #133 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
    //   14   30:astore_1        
    //   15   31:aload_1         
    //   16   32:ifnull          52
    //   17   35:aload_1         
    //   18   36:invokeinterface #137 <Method int Cursor.getCount()>
    //   19   41:pop             
    //   20   42:aload_1         
    //   21   43:aload_0         
    //   22   44:getfield        #29  <Field Loader$ForceLoadContentObserver mObserver>
    //   23   47:invokeinterface #141 <Method void Cursor.registerContentObserver(android.database.ContentObserver)>
    //   24   52:aload_1         
    //   25   53:areturn         
    }

    public volatile Object loadInBackground()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #144 <Method Cursor loadInBackground()>
    //    2    4:areturn         
    }

    public void onCanceled(Cursor cursor)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          19
    //    2    4:aload_1         
    //    3    5:invokeinterface #63  <Method boolean Cursor.isClosed()>
    //    4   10:ifne            19
    //    5   13:aload_1         
    //    6   14:invokeinterface #52  <Method void Cursor.close()>
    //    7   19:return          
    }

    public volatile void onCanceled(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #48  <Class Cursor>
    //    3    5:invokevirtual   #147 <Method void onCanceled(Cursor)>
    //    4    8:return          
    }

    protected void onReset()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #150 <Method void AsyncTaskLoader.onReset()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #153 <Method void onStopLoading()>
    //    4    8:aload_0         
    //    5    9:getfield        #54  <Field Cursor mCursor>
    //    6   12:ifnull          36
    //    7   15:aload_0         
    //    8   16:getfield        #54  <Field Cursor mCursor>
    //    9   19:invokeinterface #63  <Method boolean Cursor.isClosed()>
    //   10   24:ifne            36
    //   11   27:aload_0         
    //   12   28:getfield        #54  <Field Cursor mCursor>
    //   13   31:invokeinterface #52  <Method void Cursor.close()>
    //   14   36:aload_0         
    //   15   37:aconst_null     
    //   16   38:putfield        #54  <Field Cursor mCursor>
    //   17   41:return          
    }

    protected void onStartLoading()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field Cursor mCursor>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #54  <Field Cursor mCursor>
    //    6   12:invokevirtual   #65  <Method void deliverResult(Cursor)>
    //    7   15:aload_0         
    //    8   16:invokevirtual   #157 <Method boolean takeContentChanged()>
    //    9   19:ifne            29
    //   10   22:aload_0         
    //   11   23:getfield        #54  <Field Cursor mCursor>
    //   12   26:ifnonnull       33
    //   13   29:aload_0         
    //   14   30:invokevirtual   #160 <Method void forceLoad()>
    //   15   33:return          
    }

    protected void onStopLoading()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #163 <Method boolean cancelLoad()>
    //    2    4:pop             
    //    3    5:return          
    }

    public void setProjection(String as[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #34  <Field String[] mProjection>
    //    3    5:return          
    }

    public void setSelection(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #36  <Field String mSelection>
    //    3    5:return          
    }

    public void setSelectionArgs(String as[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #38  <Field String[] mSelectionArgs>
    //    3    5:return          
    }

    public void setSortOrder(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #40  <Field String mSortOrder>
    //    3    5:return          
    }

    public void setUri(Uri uri)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #32  <Field Uri mUri>
    //    3    5:return          
    }

    Cursor mCursor;
    final Loader.ForceLoadContentObserver mObserver;
    String mProjection[];
    String mSelection;
    String mSelectionArgs[];
    String mSortOrder;
    Uri mUri;
}
