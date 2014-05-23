package eu.janmuller.android.simplecropimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Log;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class BitmapManager
{
  private static final String TAG = "BitmapManager";
  private static BitmapManager sManager = null;
  private final WeakHashMap<Thread, BitmapManager.ThreadStatus> mThreadStatus = new WeakHashMap();

  private BitmapManager()
  {
  }

  private BitmapManager.ThreadStatus getOrCreateThreadStatus(Thread paramThread)
  {
    try
    {
      BitmapManager.ThreadStatus localThreadStatus = (BitmapManager.ThreadStatus)this.mThreadStatus.get(paramThread);
      if (localThreadStatus == null)
      {
        localThreadStatus = new BitmapManager.ThreadStatus(null);
        this.mThreadStatus.put(paramThread, localThreadStatus);
      }
      return localThreadStatus;
    }
    finally
    {
    }
  }

  public static BitmapManager instance()
  {
    try
    {
      if (sManager == null)
        sManager = new BitmapManager();
      BitmapManager localBitmapManager = sManager;
      return localBitmapManager;
    }
    finally
    {
    }
  }

  private void setDecodingOptions(Thread paramThread, BitmapFactory.Options paramOptions)
  {
    try
    {
      getOrCreateThreadStatus(paramThread).mOptions = paramOptions;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void allowThreadDecoding(BitmapManager.ThreadSet paramThreadSet)
  {
    try
    {
      Iterator localIterator = paramThreadSet.iterator();
      while (true)
      {
        boolean bool = localIterator.hasNext();
        if (!bool)
          return;
        allowThreadDecoding((Thread)localIterator.next());
      }
    }
    finally
    {
    }
  }

  public void allowThreadDecoding(Thread paramThread)
  {
    try
    {
      getOrCreateThreadStatus(paramThread).mState = BitmapManager.State.ALLOW;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean canThreadDecoding(Thread paramThread)
  {
    bool = true;
    try
    {
      BitmapManager.ThreadStatus localThreadStatus = (BitmapManager.ThreadStatus)this.mThreadStatus.get(paramThread);
      if (localThreadStatus == null);
      while (true)
      {
        return bool;
        BitmapManager.State localState1 = localThreadStatus.mState;
        BitmapManager.State localState2 = BitmapManager.State.CANCEL;
        if (localState1 == localState2)
          bool = false;
      }
    }
    finally
    {
    }
  }

  public void cancelThreadDecoding(BitmapManager.ThreadSet paramThreadSet)
  {
    try
    {
      Iterator localIterator = paramThreadSet.iterator();
      while (true)
      {
        boolean bool = localIterator.hasNext();
        if (!bool)
          return;
        cancelThreadDecoding((Thread)localIterator.next());
      }
    }
    finally
    {
    }
  }

  public void cancelThreadDecoding(Thread paramThread)
  {
    try
    {
      BitmapManager.ThreadStatus localThreadStatus = getOrCreateThreadStatus(paramThread);
      localThreadStatus.mState = BitmapManager.State.CANCEL;
      if (localThreadStatus.mOptions != null)
        localThreadStatus.mOptions.requestCancelDecode();
      notifyAll();
      return;
    }
    finally
    {
    }
  }

  public Bitmap decodeFileDescriptor(FileDescriptor paramFileDescriptor, BitmapFactory.Options paramOptions)
  {
    if (paramOptions.mCancel);
    Thread localThread;
    do
    {
      return null;
      localThread = Thread.currentThread();
    }
    while (!canThreadDecoding(localThread));
    setDecodingOptions(localThread, paramOptions);
    Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, paramOptions);
    removeDecodingOptions(localThread);
    return localBitmap;
  }

  public void dump()
  {
    try
    {
      Iterator localIterator = this.mThreadStatus.entrySet().iterator();
      while (true)
      {
        boolean bool = localIterator.hasNext();
        if (!bool)
          return;
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Log.v("BitmapManager", "[Dump] Thread " + localEntry.getKey() + " (" + ((Thread)localEntry.getKey()).getId() + ")'s status is " + localEntry.getValue());
      }
    }
    finally
    {
    }
  }

  BitmapFactory.Options getDecodingOptions(Thread paramThread)
  {
    try
    {
      BitmapManager.ThreadStatus localThreadStatus = (BitmapManager.ThreadStatus)this.mThreadStatus.get(paramThread);
      if (localThreadStatus != null);
      for (BitmapFactory.Options localOptions = localThreadStatus.mOptions; ; localOptions = null)
        return localOptions;
    }
    finally
    {
    }
  }

  void removeDecodingOptions(Thread paramThread)
  {
    try
    {
      ((BitmapManager.ThreadStatus)this.mThreadStatus.get(paramThread)).mOptions = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     eu.janmuller.android.simplecropimage.BitmapManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
