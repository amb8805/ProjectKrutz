package codeadore.textgram;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.widget.LinearLayout;
import codeadore.textgram.custom_widgets.el7rTextView;

public class SuperSurfaceItem
{
  public Bitmap bitmap = null;
  public String bitmapPath = null;
  public Bitmap cachedBitmap = null;
  public Bitmap cachedHighlightBitmap = null;
  public StylingActivity context;
  boolean deletable = true;
  public float height = 100.0F;
  public boolean highlight = false;
  public String highlightColor = null;
  boolean highlightMatchesDelete = false;
  public int highlightOpacity = 70;
  public LinearLayout layout;
  public int lineSpacing = 0;
  boolean matchesDelete = false;
  public int opacity = 100;
  public float posX = 0.0F;
  public float posY = 0.0F;
  public int reflection = 0;
  boolean resizePinActive = false;
  boolean rotatePinActive = false;
  public int rotation = 0;
  public boolean selected = false;
  public float tempHeight = 100.0F;
  public float tempPosX = 0.0F;
  public float tempPosY = 0.0F;
  public float tempWidth = 100.0F;
  SpannableString text = new SpannableString("double tap here to edit the text.");
  public String textColor = "#000000";
  public int textGravity = 3;
  public int textHeight = 0;
  public int textShadowColor = 0;
  public float textSize = 10.0F;
  public el7rTextView textViewDraw = StylingActivity.textViewDraw;
  public String type = "bitmap";
  public String typeFacePath = null;
  public float width = 100.0F;

  public SuperSurfaceItem()
  {
  }

  public void clearTextShadow()
  {
    this.textViewDraw.clearShadow();
    this.textShadowColor = 0;
  }

  public SpannableString getText()
  {
    return this.text;
  }

  public int getTextGravity()
  {
    return this.textGravity;
  }

  public int getTextHeight()
  {
    return this.textHeight;
  }

  public void setText(SpannableString paramSpannableString)
  {
    this.text = paramSpannableString;
    updateTextBitmap();
  }

  public void setText(String paramString)
  {
    this.text = new SpannableString(paramString);
    updateTextBitmap();
  }

  public void setTextGravity(int paramInt)
  {
    this.textGravity = paramInt;
    this.textViewDraw.setGravity(this.textGravity);
  }

  public void setTextHeight(int paramInt)
  {
    this.textHeight = paramInt;
  }

  public void setup(StylingActivity paramStylingActivity)
  {
    this.context = paramStylingActivity;
    this.textViewDraw = StylingActivity.textViewDraw;
  }

  public void updateTextBitmap()
  {
    this.textViewDraw.setText(this.text);
    this.textViewDraw.layout(0, 0, (int)this.width, (int)this.height);
    this.textViewDraw.setPadding(5, 5, 5, 5);
    this.textViewDraw.setTextSize(0, 1.0F + this.textSize);
    this.textViewDraw.setTextSize(0, this.textSize);
    this.textViewDraw.setSuperTextColor(this.textColor);
    if (this.highlightColor != null)
    {
      this.textViewDraw.setSuperHighlightColor(this.highlightColor, this.highlightOpacity);
      if (this.textShadowColor != 0)
        break label250;
      this.textViewDraw.setShadowColor(null);
    }
    while (true)
    {
      if (this.lineSpacing != 0)
        this.textViewDraw.setLineSpacing(this.lineSpacing, 1.0F);
      if ((this.typeFacePath != null) && (this.typeFacePath != ""))
        this.textViewDraw.setTypeface(Utilities.getTypefaceFromPath(this.context, this.typeFacePath));
      Bitmap localBitmap = Bitmap.createBitmap((int)this.width, (int)this.height, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      this.textViewDraw.setDrawingCacheQuality(1048576);
      this.textViewDraw.draw(localCanvas);
      this.bitmap = localBitmap;
      setTextHeight(this.textViewDraw.getLineHeight() * this.textViewDraw.getLineCount());
      return;
      this.textViewDraw.setSuperHighlightColor("#FFFFFF", 0);
      break;
      label250: this.textViewDraw.setShadowColor(this.textShadowColor);
      this.textViewDraw.setSuperTextColor(this.textColor);
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.SuperSurfaceItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
