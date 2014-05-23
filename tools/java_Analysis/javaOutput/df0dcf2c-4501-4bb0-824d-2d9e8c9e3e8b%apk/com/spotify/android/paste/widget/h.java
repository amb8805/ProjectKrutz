package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.b;
import com.spotify.android.paste.d;
import com.spotify.android.paste.graphics.a;
import com.spotify.android.paste.graphics.g;

public final class h
{
  private static Button a(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    Button localButton;
    if (paramInt != 0)
      localButton = new Button(paramContext, null, paramInt);
    while (true)
    {
      ViewGroup.LayoutParams localLayoutParams = l(paramContext, paramViewGroup);
      if (localLayoutParams != null)
        localButton.setLayoutParams(localLayoutParams);
      localButton.setTypeface(g.a(paramContext, null, paramInt));
      a.a(paramContext, localButton, null, paramInt);
      return localButton;
      localButton = new Button(paramContext);
      paramInt = 16842824;
    }
  }

  public static EditText a(Context paramContext)
  {
    EditText localEditText = new EditText(paramContext);
    ViewGroup.LayoutParams localLayoutParams = l(paramContext, null);
    if (localLayoutParams != null)
      localEditText.setLayoutParams(localLayoutParams);
    localEditText.setTypeface(g.a(paramContext, null, 16842862));
    a.a(paramContext, localEditText, null, 16842862);
    return localEditText;
  }

  public static TextView a(Context paramContext, ViewGroup paramViewGroup)
  {
    TextView localTextView = new TextView(paramContext);
    ViewGroup.LayoutParams localLayoutParams = l(paramContext, paramViewGroup);
    if (localLayoutParams != null)
      localTextView.setLayoutParams(localLayoutParams);
    localTextView.setTypeface(g.a(paramContext, null, 16842884));
    a.a(paramContext, localTextView, null, 16842884);
    return localTextView;
  }

  public static ToggleButton a(Context paramContext, ViewGroup paramViewGroup, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    int i = b.e;
    ToggleButton localToggleButton;
    if (i != 0)
      localToggleButton = new ToggleButton(paramContext, null, i);
    while (true)
    {
      localToggleButton.setTextOn(paramCharSequence1);
      localToggleButton.setTextOff(paramCharSequence2);
      ViewGroup.LayoutParams localLayoutParams = l(paramContext, paramViewGroup);
      if (localLayoutParams != null)
        localToggleButton.setLayoutParams(localLayoutParams);
      localToggleButton.setTypeface(g.a(paramContext, null, i));
      a.a(paramContext, localToggleButton, null, i);
      localToggleButton.setEllipsize(null);
      return localToggleButton;
      localToggleButton = new ToggleButton(paramContext);
      i = 16842824;
    }
  }

  public static AutoCompleteTextView b(Context paramContext)
  {
    AutoCompleteTextView localAutoCompleteTextView = new AutoCompleteTextView(paramContext);
    ViewGroup.LayoutParams localLayoutParams = l(paramContext, null);
    if (localLayoutParams != null)
      localAutoCompleteTextView.setLayoutParams(localLayoutParams);
    localAutoCompleteTextView.setTypeface(g.a(paramContext, null, 16842859));
    a.a(paramContext, localAutoCompleteTextView, null, 16842859);
    return localAutoCompleteTextView;
  }

  public static Button b(Context paramContext, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramViewGroup, 0);
  }

  private static SpotifyIconView b(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt != 0);
    for (SpotifyIconView localSpotifyIconView = new SpotifyIconView(paramContext, null, paramInt); ; localSpotifyIconView = new SpotifyIconView(paramContext))
    {
      ViewGroup.LayoutParams localLayoutParams = l(paramContext, paramViewGroup);
      if (localLayoutParams != null)
        localSpotifyIconView.setLayoutParams(localLayoutParams);
      return localSpotifyIconView;
    }
  }

  public static Button c(Context paramContext, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramViewGroup, b.e);
  }

  public static CheckBox c(Context paramContext)
  {
    CheckBox localCheckBox = new CheckBox(paramContext);
    ViewGroup.LayoutParams localLayoutParams = l(paramContext, null);
    if (localLayoutParams != null)
      localCheckBox.setLayoutParams(localLayoutParams);
    localCheckBox.setTypeface(g.a(paramContext, null, 16842860));
    a.a(paramContext, localCheckBox, null, 16842860);
    return localCheckBox;
  }

  private static ListItemView c(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt != 0);
    for (ListItemView localListItemView = new ListItemView(paramContext, null, paramInt); ; localListItemView = new ListItemView(paramContext))
    {
      ViewGroup.LayoutParams localLayoutParams = m(paramContext, paramViewGroup);
      if (localLayoutParams != null)
        localListItemView.setLayoutParams(localLayoutParams);
      return localListItemView;
    }
  }

  public static Button d(Context paramContext)
  {
    return a(paramContext, null, b.d);
  }

  public static Button d(Context paramContext, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramViewGroup, b.c);
  }

  public static Button e(Context paramContext, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramViewGroup, b.b);
  }

  public static SpotifyIconView f(Context paramContext, ViewGroup paramViewGroup)
  {
    return b(paramContext, paramViewGroup, 0);
  }

  public static SpotifyIconView g(Context paramContext, ViewGroup paramViewGroup)
  {
    return b(paramContext, paramViewGroup, b.z);
  }

  public static ListItemView h(Context paramContext, ViewGroup paramViewGroup)
  {
    return c(paramContext, paramViewGroup, 0);
  }

  public static ListItemView i(Context paramContext, ViewGroup paramViewGroup)
  {
    return c(paramContext, paramViewGroup, b.w);
  }

  public static ListItemView j(Context paramContext, ViewGroup paramViewGroup)
  {
    return c(paramContext, paramViewGroup, b.y);
  }

  public static ListItemView k(Context paramContext, ViewGroup paramViewGroup)
  {
    return c(paramContext, paramViewGroup, b.x);
  }

  private static ViewGroup.LayoutParams l(Context paramContext, ViewGroup paramViewGroup)
  {
    if (paramViewGroup == null)
      return null;
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getLayout(d.g);
    try
    {
      while (localXmlResourceParser.nextToken() != 2);
      ViewGroup.LayoutParams localLayoutParams = paramViewGroup.generateLayoutParams(localXmlResourceParser);
      return localLayoutParams;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }

  private static ViewGroup.LayoutParams m(Context paramContext, ViewGroup paramViewGroup)
  {
    if (paramViewGroup == null)
      return null;
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getLayout(d.e);
    try
    {
      while (localXmlResourceParser.nextToken() != 2);
      ViewGroup.LayoutParams localLayoutParams = paramViewGroup.generateLayoutParams(localXmlResourceParser);
      return localLayoutParams;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
