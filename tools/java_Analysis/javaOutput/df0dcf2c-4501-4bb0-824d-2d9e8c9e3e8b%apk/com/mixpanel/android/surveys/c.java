package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.Survey.QuestionType;
import com.mixpanel.android.mpmetrics.w;

final class c
{
  private w b;
  private final View c;
  private final TextView d;
  private final TextView e;
  private final ListView f;

  public c(CardCarouselLayout paramCardCarouselLayout, View paramView)
  {
    this.c = paramView;
    this.d = ((TextView)paramView.findViewWithTag("com_mixpanel_android_TAG_prompt_text"));
    this.e = ((EditText)paramView.findViewWithTag("com_mixpanel_android_TAG_text_answer"));
    this.f = ((ListView)paramView.findViewWithTag("com_mixpanel_android_TAG_choice_list"));
    this.e.setText("");
    this.e.setOnEditorActionListener(new c.1(this, paramCardCarouselLayout));
    this.f.setOnItemClickListener(new c.2(this, paramCardCarouselLayout));
  }

  public final View a()
  {
    return this.c;
  }

  public final void a(w paramw, String paramString)
  {
    this.b = paramw;
    this.d.setText(this.b.b());
    InputMethodManager localInputMethodManager = (InputMethodManager)this.c.getContext().getSystemService("input_method");
    Survey.QuestionType localQuestionType = paramw.d();
    if (Survey.QuestionType.c == localQuestionType)
    {
      this.f.setVisibility(8);
      this.e.setVisibility(0);
      if (paramString != null)
        this.e.setText(paramString);
      if (this.a.getResources().getConfiguration().orientation == 1)
      {
        this.e.requestFocus();
        localInputMethodManager.showSoftInput(this.e, 0);
      }
    }
    while (true)
    {
      this.c.invalidate();
      return;
      localInputMethodManager.hideSoftInputFromWindow(this.c.getWindowToken(), 0);
      continue;
      if (Survey.QuestionType.b != localQuestionType)
        break;
      localInputMethodManager.hideSoftInputFromWindow(this.c.getWindowToken(), 0);
      this.f.setVisibility(0);
      this.e.setVisibility(8);
      a locala = new a(paramw.c(), LayoutInflater.from(this.a.getContext()));
      this.f.setAdapter(locala);
      this.f.clearChoices();
      if (paramString != null)
        for (int i = 0; i < locala.getCount(); i++)
          if (locala.a(i).equals(paramString))
            this.f.setItemChecked(i, true);
    }
    throw new CardCarouselLayout.UnrecognizedAnswerTypeException("No way to display question type " + localQuestionType, (byte)0);
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.surveys.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
