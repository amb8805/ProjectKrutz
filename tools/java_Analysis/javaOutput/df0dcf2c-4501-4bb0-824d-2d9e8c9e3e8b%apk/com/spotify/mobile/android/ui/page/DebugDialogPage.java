package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public final class DebugDialogPage extends j
{
  private Context b;
  private final AdapterView.OnItemSelectedListener c = new DebugDialogPage.1(this);

  public DebugDialogPage(Context paramContext, ViewGroup paramViewGroup)
  {
    super(paramContext, paramViewGroup);
    this.b = paramContext;
    b(2130903215);
    Spinner localSpinner = (Spinner)c(2131362568);
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this.b, 17367048, 16908308);
    localArrayAdapter.setDropDownViewResource(17367049);
    DebugDialogPage.Dialog[] arrayOfDialog = DebugDialogPage.Dialog.values();
    int i = arrayOfDialog.length;
    for (int j = 0; j < i; j++)
      localArrayAdapter.add(DebugDialogPage.Dialog.a(arrayOfDialog[j]));
    localSpinner.setAdapter(localArrayAdapter);
    localSpinner.setOnItemSelectedListener(this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.DebugDialogPage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
