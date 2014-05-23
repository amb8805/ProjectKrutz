package com.spotify.mobile.android.spotlets.listenlater.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ListenLaterModel
  implements Parcelable
{
  public static final Parcelable.Creator<ListenLaterModel> CREATOR = new ListenLaterModel.1();
  private final List<ListenLaterModel.Item> a;

  private ListenLaterModel(Parcel paramParcel)
  {
    Parcelable.Creator localCreator = ListenLaterModel.Item.CREATOR;
    ArrayList localArrayList = new ArrayList();
    paramParcel.readTypedList(localArrayList, localCreator);
    this.a = ImmutableList.a(localArrayList);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedList(this.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.listenlater.model.ListenLaterModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
