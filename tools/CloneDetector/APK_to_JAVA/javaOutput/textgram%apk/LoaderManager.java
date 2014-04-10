// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            LoaderManagerImpl

public abstract class LoaderManager
{
    public static interface LoaderCallbacks
    {

        public abstract Loader onCreateLoader(int i, Bundle bundle);

        public abstract void onLoadFinished(Loader loader, Object obj);

        public abstract void onLoaderReset(Loader loader);
    }


    public LoaderManager()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void enableDebugLogging(boolean flag)
    {
    //    0    0:iload_0         
    //    1    1:putstatic       #16  <Field boolean LoaderManagerImpl.DEBUG>
    //    2    4:return          
    }

    public abstract void destroyLoader(int i);

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract Loader getLoader(int i);

    public boolean hasRunningLoaders()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public abstract Loader initLoader(int i, Bundle bundle, LoaderCallbacks loadercallbacks);

    public abstract Loader restartLoader(int i, Bundle bundle, LoaderCallbacks loadercallbacks);
}
