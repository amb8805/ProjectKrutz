package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ActivityChooserModel extends DataSetObservable
{
  private static final String ATTRIBUTE_ACTIVITY = "activity";
  private static final String ATTRIBUTE_TIME = "time";
  private static final String ATTRIBUTE_WEIGHT = "weight";
  private static final boolean DEBUG = false;
  private static final int DEFAULT_ACTIVITY_INFLATION = 5;
  private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0F;
  public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
  public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
  private static final String HISTORY_FILE_EXTENSION = ".xml";
  private static final int INVALID_INDEX = -1;
  private static final String LOG_TAG = ActivityChooserModel.class.getSimpleName();
  private static final String TAG_HISTORICAL_RECORD = "historical-record";
  private static final String TAG_HISTORICAL_RECORDS = "historical-records";
  private static final Map<String, ActivityChooserModel> sDataModelRegistry = new HashMap();
  private static final Object sRegistryLock = new Object();
  private final List<ActivityChooserModel.ActivityResolveInfo> mActivities = new ArrayList();
  private ActivityChooserModel.OnChooseActivityListener mActivityChoserModelPolicy;
  private ActivityChooserModel.ActivitySorter mActivitySorter = new ActivityChooserModel.DefaultSorter(this, null);
  private boolean mCanReadHistoricalData = true;
  private final Context mContext;
  private final List<ActivityChooserModel.HistoricalRecord> mHistoricalRecords = new ArrayList();
  private boolean mHistoricalRecordsChanged = true;
  private final String mHistoryFileName;
  private int mHistoryMaxSize = 50;
  private final Object mInstanceLock = new Object();
  private Intent mIntent;
  private boolean mReadShareHistoryCalled = false;
  private boolean mReloadActivities = false;

  private ActivityChooserModel(Context paramContext, String paramString)
  {
    this.mContext = paramContext.getApplicationContext();
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.endsWith(".xml")))
    {
      this.mHistoryFileName = (paramString + ".xml");
      return;
    }
    this.mHistoryFileName = paramString;
  }

  private boolean addHisoricalRecord(ActivityChooserModel.HistoricalRecord paramHistoricalRecord)
  {
    boolean bool = this.mHistoricalRecords.add(paramHistoricalRecord);
    if (bool)
    {
      this.mHistoricalRecordsChanged = true;
      pruneExcessiveHistoricalRecordsIfNeeded();
      persistHistoricalDataIfNeeded();
      sortActivitiesIfNeeded();
      notifyChanged();
    }
    return bool;
  }

  private void ensureConsistentState()
  {
    boolean bool = loadActivitiesIfNeeded() | readHistoricalDataIfNeeded();
    pruneExcessiveHistoricalRecordsIfNeeded();
    if (bool)
    {
      sortActivitiesIfNeeded();
      notifyChanged();
    }
  }

  private void executePersistHistoryAsyncTaskBase()
  {
    ActivityChooserModel.PersistHistoryAsyncTask localPersistHistoryAsyncTask = new ActivityChooserModel.PersistHistoryAsyncTask(this, null);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = new ArrayList(this.mHistoricalRecords);
    arrayOfObject[1] = this.mHistoryFileName;
    localPersistHistoryAsyncTask.execute(arrayOfObject);
  }

  private void executePersistHistoryAsyncTaskSDK11()
  {
    ActivityChooserModel.PersistHistoryAsyncTask localPersistHistoryAsyncTask = new ActivityChooserModel.PersistHistoryAsyncTask(this, null);
    Executor localExecutor = AsyncTask.SERIAL_EXECUTOR;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = new ArrayList(this.mHistoricalRecords);
    arrayOfObject[1] = this.mHistoryFileName;
    localPersistHistoryAsyncTask.executeOnExecutor(localExecutor, arrayOfObject);
  }

  public static ActivityChooserModel get(Context paramContext, String paramString)
  {
    synchronized (sRegistryLock)
    {
      ActivityChooserModel localActivityChooserModel = (ActivityChooserModel)sDataModelRegistry.get(paramString);
      if (localActivityChooserModel == null)
      {
        localActivityChooserModel = new ActivityChooserModel(paramContext, paramString);
        sDataModelRegistry.put(paramString, localActivityChooserModel);
      }
      return localActivityChooserModel;
    }
  }

  private boolean loadActivitiesIfNeeded()
  {
    boolean bool1 = this.mReloadActivities;
    boolean bool2 = false;
    if (bool1)
    {
      Intent localIntent = this.mIntent;
      bool2 = false;
      if (localIntent != null)
      {
        this.mReloadActivities = false;
        this.mActivities.clear();
        List localList = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
        int i = localList.size();
        for (int j = 0; j < i; j++)
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localList.get(j);
          this.mActivities.add(new ActivityChooserModel.ActivityResolveInfo(this, localResolveInfo));
        }
        bool2 = true;
      }
    }
    return bool2;
  }

  private void persistHistoricalDataIfNeeded()
  {
    if (!this.mReadShareHistoryCalled)
      throw new IllegalStateException("No preceding call to #readHistoricalData");
    if (!this.mHistoricalRecordsChanged);
    do
    {
      return;
      this.mHistoricalRecordsChanged = false;
    }
    while (TextUtils.isEmpty(this.mHistoryFileName));
    if (Build.VERSION.SDK_INT >= 11)
    {
      executePersistHistoryAsyncTaskSDK11();
      return;
    }
    executePersistHistoryAsyncTaskBase();
  }

  private void pruneExcessiveHistoricalRecordsIfNeeded()
  {
    int i = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
    if (i <= 0);
    while (true)
    {
      return;
      this.mHistoricalRecordsChanged = true;
      for (int j = 0; j < i; j++)
        ((ActivityChooserModel.HistoricalRecord)this.mHistoricalRecords.remove(0));
    }
  }

  private boolean readHistoricalDataIfNeeded()
  {
    if ((this.mCanReadHistoricalData) && (this.mHistoricalRecordsChanged) && (!TextUtils.isEmpty(this.mHistoryFileName)))
    {
      this.mCanReadHistoricalData = false;
      this.mReadShareHistoryCalled = true;
      readHistoricalDataImpl();
      return true;
    }
    return false;
  }

  private void readHistoricalDataImpl()
  {
    FileInputStream localFileInputStream;
    try
    {
      localFileInputStream = this.mContext.openFileInput(this.mHistoryFileName);
      try
      {
        localXmlPullParser = Xml.newPullParser();
        localXmlPullParser.setInput(localFileInputStream, null);
        for (int i = 0; (i != 1) && (i != 2); i = localXmlPullParser.next());
        if (!"historical-records".equals(localXmlPullParser.getName()))
          throw new XmlPullParserException("Share records file does not start with historical-records tag.");
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        Log.e(LOG_TAG, "Error reading historical recrod file: " + this.mHistoryFileName, localXmlPullParserException);
        if (localFileInputStream != null)
        {
          try
          {
            localFileInputStream.close();
            return;
          }
          catch (IOException localIOException4)
          {
            return;
          }
          localList = this.mHistoricalRecords;
          localList.clear();
          int j;
          do
          {
            j = localXmlPullParser.next();
            if (j == 1)
            {
              if (localFileInputStream == null)
                break;
              try
              {
                localFileInputStream.close();
                return;
              }
              catch (IOException localIOException5)
              {
                return;
              }
            }
          }
          while ((j == 3) || (j == 4));
          if (!"historical-record".equals(localXmlPullParser.getName()))
            throw new XmlPullParserException("Share records file not well-formed.");
        }
      }
      catch (IOException localIOException2)
      {
        while (true)
        {
          XmlPullParser localXmlPullParser;
          List localList;
          Log.e(LOG_TAG, "Error reading historical recrod file: " + this.mHistoryFileName, localIOException2);
          if (localFileInputStream == null)
            break;
          try
          {
            localFileInputStream.close();
            return;
          }
          catch (IOException localIOException3)
          {
            return;
          }
          localList.add(new ActivityChooserModel.HistoricalRecord(localXmlPullParser.getAttributeValue(null, "activity"), Long.parseLong(localXmlPullParser.getAttributeValue(null, "time")), Float.parseFloat(localXmlPullParser.getAttributeValue(null, "weight"))));
        }
      }
      finally
      {
        if (localFileInputStream != null);
        try
        {
          localFileInputStream.close();
          throw localObject;
        }
        catch (IOException localIOException1)
        {
          break label312;
        }
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    label312:
  }

  private boolean sortActivitiesIfNeeded()
  {
    if ((this.mActivitySorter != null) && (this.mIntent != null) && (!this.mActivities.isEmpty()) && (!this.mHistoricalRecords.isEmpty()))
    {
      this.mActivitySorter.sort(this.mIntent, this.mActivities, Collections.unmodifiableList(this.mHistoricalRecords));
      return true;
    }
    return false;
  }

  public Intent chooseActivity(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mIntent == null)
        return null;
      ensureConsistentState();
      ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo = (ActivityChooserModel.ActivityResolveInfo)this.mActivities.get(paramInt);
      ComponentName localComponentName = new ComponentName(localActivityResolveInfo.resolveInfo.activityInfo.packageName, localActivityResolveInfo.resolveInfo.activityInfo.name);
      Intent localIntent1 = new Intent(this.mIntent);
      localIntent1.setComponent(localComponentName);
      if (this.mActivityChoserModelPolicy != null)
      {
        Intent localIntent2 = new Intent(localIntent1);
        if (this.mActivityChoserModelPolicy.onChooseActivity(this, localIntent2))
          return null;
      }
      addHisoricalRecord(new ActivityChooserModel.HistoricalRecord(localComponentName, System.currentTimeMillis(), 1.0F));
      return localIntent1;
    }
  }

  public ResolveInfo getActivity(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      ResolveInfo localResolveInfo = ((ActivityChooserModel.ActivityResolveInfo)this.mActivities.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }

  public int getActivityCount()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      int i = this.mActivities.size();
      return i;
    }
  }

  public int getActivityIndex(ResolveInfo paramResolveInfo)
  {
    while (true)
    {
      int j;
      synchronized (this.mInstanceLock)
      {
        ensureConsistentState();
        List localList = this.mActivities;
        int i = localList.size();
        j = 0;
        if (j < i)
        {
          if (((ActivityChooserModel.ActivityResolveInfo)localList.get(j)).resolveInfo == paramResolveInfo)
            return j;
        }
        else
          return -1;
      }
      j++;
    }
  }

  public ResolveInfo getDefaultActivity()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      if (!this.mActivities.isEmpty())
      {
        ResolveInfo localResolveInfo = ((ActivityChooserModel.ActivityResolveInfo)this.mActivities.get(0)).resolveInfo;
        return localResolveInfo;
      }
      return null;
    }
  }

  public int getHistoryMaxSize()
  {
    synchronized (this.mInstanceLock)
    {
      int i = this.mHistoryMaxSize;
      return i;
    }
  }

  public int getHistorySize()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      int i = this.mHistoricalRecords.size();
      return i;
    }
  }

  public Intent getIntent()
  {
    synchronized (this.mInstanceLock)
    {
      Intent localIntent = this.mIntent;
      return localIntent;
    }
  }

  public void setActivitySorter(ActivityChooserModel.ActivitySorter paramActivitySorter)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mActivitySorter == paramActivitySorter)
        return;
      this.mActivitySorter = paramActivitySorter;
      if (sortActivitiesIfNeeded())
        notifyChanged();
      return;
    }
  }

  public void setDefaultActivity(int paramInt)
  {
    while (true)
    {
      synchronized (this.mInstanceLock)
      {
        ensureConsistentState();
        ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo1 = (ActivityChooserModel.ActivityResolveInfo)this.mActivities.get(paramInt);
        ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo2 = (ActivityChooserModel.ActivityResolveInfo)this.mActivities.get(0);
        if (localActivityResolveInfo2 != null)
        {
          f = 5.0F + (localActivityResolveInfo2.weight - localActivityResolveInfo1.weight);
          addHisoricalRecord(new ActivityChooserModel.HistoricalRecord(new ComponentName(localActivityResolveInfo1.resolveInfo.activityInfo.packageName, localActivityResolveInfo1.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
          return;
        }
      }
      float f = 1.0F;
    }
  }

  public void setHistoryMaxSize(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mHistoryMaxSize == paramInt)
        return;
      this.mHistoryMaxSize = paramInt;
      pruneExcessiveHistoricalRecordsIfNeeded();
      if (sortActivitiesIfNeeded())
        notifyChanged();
      return;
    }
  }

  public void setIntent(Intent paramIntent)
  {
    synchronized (this.mInstanceLock)
    {
      if (this.mIntent == paramIntent)
        return;
      this.mIntent = paramIntent;
      this.mReloadActivities = true;
      ensureConsistentState();
      return;
    }
  }

  public void setOnChooseActivityListener(ActivityChooserModel.OnChooseActivityListener paramOnChooseActivityListener)
  {
    synchronized (this.mInstanceLock)
    {
      this.mActivityChoserModelPolicy = paramOnChooseActivityListener;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ActivityChooserModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
