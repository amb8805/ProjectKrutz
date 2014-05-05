package com.twitter.android;

import ad;
import ag;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import ar;
import bl;
import com.twitter.android.client.g;
import com.twitter.android.widget.m;
import dz;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditProfileActivity extends BaseActivity
  implements TextWatcher, ar, m
{
  static final boolean d = Log.isLoggable("EditProfile", 3);
  private static final String[] j = { "user_id", "name", "description", "web_url", "location", "image_url", "username" };
  Uri e;
  EditText f;
  EditText g;
  EditText h;
  EditText i;
  private ImageView k;
  private boolean l;
  private long m;

  public EditProfileActivity()
  {
    super(true);
  }

  private void a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5, String paramString6)
  {
    this.f.setText(paramString1);
    this.f.addTextChangedListener(this);
    this.g.setText(paramString2);
    this.g.addTextChangedListener(this);
    this.h.setText(paramString3);
    this.h.addTextChangedListener(this);
    this.i.setText(paramString4);
    this.i.addTextChangedListener(this);
    a(2131427536);
    this.m = paramLong;
    a(this.a.b(this.m, paramString5));
  }

  final void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      this.k.setBackgroundDrawable(new BitmapDrawable(getResources(), paramBitmap));
      return;
    }
    this.k.setBackgroundResource(2130837734);
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    bl localbl = (bl)paramHashMap.get(Long.valueOf(this.m));
    if (localbl != null)
      a(localbl.a());
  }

  public void afterTextChanged(Editable paramEditable)
  {
    this.l = true;
  }

  final void b()
  {
    String str = this.h.getText().toString();
    if (!TextUtils.isEmpty(str))
    {
      if (!str.contains("://"))
        str = "http://" + str;
      if (!ag.b.matcher(str).matches())
      {
        Toast.makeText(this, getString(2131427647), 0).show();
        return;
      }
      this.h.setText(str);
    }
    showDialog(2);
    this.a.a(this.f.getText().toString(), str, this.i.getText().toString(), this.g.getText().toString());
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  // ERROR //
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: aload_3
    //   4: invokespecial 218	com/twitter/android/BaseActivity:onActivityResult	(IILandroid/content/Intent;)V
    //   7: iload_2
    //   8: ifne +4 -> 12
    //   11: return
    //   12: iload_1
    //   13: tableswitch	default:+19 -> 32, 1:+20->33
    //   33: aload_3
    //   34: invokevirtual 224	android/content/Intent:getData	()Landroid/net/Uri;
    //   37: astore 4
    //   39: aload 4
    //   41: ifnull +164 -> 205
    //   44: aconst_null
    //   45: astore 5
    //   47: aload_0
    //   48: invokevirtual 228	com/twitter/android/EditProfileActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   51: aload 4
    //   53: invokevirtual 234	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   56: astore 14
    //   58: aload 14
    //   60: astore 5
    //   62: aload 5
    //   64: invokevirtual 240	java/io/InputStream:available	()I
    //   67: istore 16
    //   69: aload 5
    //   71: invokestatic 245	cr:a	(Ljava/io/Closeable;)V
    //   74: iload 16
    //   76: istore 11
    //   78: iload 11
    //   80: ldc 246
    //   82: if_icmpge +89 -> 171
    //   85: aload_0
    //   86: aload 4
    //   88: putfield 248	com/twitter/android/EditProfileActivity:e	Landroid/net/Uri;
    //   91: new 250	com/twitter/android/bh
    //   94: dup
    //   95: aload_0
    //   96: invokespecial 253	com/twitter/android/bh:<init>	(Lcom/twitter/android/EditProfileActivity;)V
    //   99: iconst_1
    //   100: anewarray 255	android/net/Uri
    //   103: dup
    //   104: iconst_0
    //   105: aload 4
    //   107: aastore
    //   108: invokevirtual 259	com/twitter/android/bh:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   111: pop
    //   112: return
    //   113: astore 7
    //   115: aconst_null
    //   116: astore 8
    //   118: aload 7
    //   120: astore 9
    //   122: ldc 30
    //   124: new 164	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   131: ldc_w 261
    //   134: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload 9
    //   139: invokevirtual 264	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 267	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   148: pop
    //   149: aload 8
    //   151: invokestatic 245	cr:a	(Ljava/io/Closeable;)V
    //   154: ldc 246
    //   156: istore 11
    //   158: goto -80 -> 78
    //   161: astore 6
    //   163: aload 5
    //   165: invokestatic 245	cr:a	(Ljava/io/Closeable;)V
    //   168: aload 6
    //   170: athrow
    //   171: iconst_1
    //   172: anewarray 147	java/lang/Object
    //   175: astore 12
    //   177: aload 12
    //   179: iconst_0
    //   180: sipush 700
    //   183: invokestatic 272	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   186: aastore
    //   187: aload_0
    //   188: aload_0
    //   189: ldc_w 273
    //   192: aload 12
    //   194: invokevirtual 276	com/twitter/android/EditProfileActivity:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   197: iconst_1
    //   198: invokestatic 201	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   201: invokevirtual 204	android/widget/Toast:show	()V
    //   204: return
    //   205: aload_0
    //   206: ldc_w 277
    //   209: iconst_1
    //   210: invokestatic 280	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   213: invokevirtual 204	android/widget/Toast:show	()V
    //   216: return
    //   217: astore 6
    //   219: aload 8
    //   221: astore 5
    //   223: goto -60 -> 163
    //   226: astore 15
    //   228: aload 5
    //   230: astore 8
    //   232: aload 15
    //   234: astore 9
    //   236: goto -114 -> 122
    //
    // Exception table:
    //   from	to	target	type
    //   47	58	113	java/io/IOException
    //   47	58	161	finally
    //   62	69	161	finally
    //   122	149	217	finally
    //   62	69	226	java/io/IOException
  }

  public void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165259:
      startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1);
      return;
    case 2131165264:
      if (this.l)
      {
        b();
        return;
      }
      finish();
      return;
    case 2131165251:
    }
    setResult(0);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903061);
    if (!this.a.h())
      return;
    Intent localIntent = getIntent();
    Uri localUri = localIntent.getData();
    ContentResolver localContentResolver = getContentResolver();
    this.f = ((EditText)findViewById(2131165260));
    this.g = ((EditText)findViewById(2131165261));
    this.h = ((EditText)findViewById(2131165262));
    this.i = ((EditText)findViewById(2131165263));
    this.k = ((ImageView)findViewById(2131165258));
    if (localIntent.hasExtra("user"))
    {
      ad localad = (ad)localIntent.getParcelableExtra("user");
      a(localad.b, localad.d, localad.e, localad.j, localad.a, localad.c, localad.g);
    }
    while (true)
    {
      this.b = new ei(this, null);
      this.a.a(1, this);
      if (paramBundle != null)
        this.e = ((Uri)paramBundle.getParcelable("photo_uri"));
      this.f.setSelection(this.f.length());
      return;
      if (!"vnd.android.cursor.item/vnd.twitter.android.users".equals(localContentResolver.getType(localUri)))
        break;
      Cursor localCursor = localContentResolver.query(localUri, j, null, null, null);
      if (localCursor != null)
      {
        if (localCursor.moveToFirst())
          a(localCursor.getString(1), localCursor.getString(2), localCursor.getString(3), localCursor.getString(4), localCursor.getLong(0), localCursor.getString(5), localCursor.getString(6));
        localCursor.close();
      }
    }
    throw new IllegalArgumentException("Intent data must be Twitter User content:// URI");
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
      ef localef = new ef(this);
      ee localee = new ee(this);
      ed localed = new ed(this);
      return new AlertDialog.Builder(this).setTitle(2131427376).setIcon(17301543).setMessage(2131427379).setPositiveButton(2131427508, localef).setNegativeButton(2131427504, localee).setOnCancelListener(localed).create();
    case 2:
      return ProgressDialog.show(this, null, getString(2131427381), true);
    case 3:
    }
    ec localec = new ec(this);
    return new AlertDialog.Builder(this).setTitle(2131427536).setIcon(17301543).setMessage(2131427380).setPositiveButton(2131427508, localec).setNegativeButton(2131427504, null).setCancelable(false).create();
  }

  protected void onDestroy()
  {
    this.a.b(1, this);
    super.onDestroy();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.e != null)
      paramBundle.putParcelable("photo_uri", this.e);
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.EditProfileActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
