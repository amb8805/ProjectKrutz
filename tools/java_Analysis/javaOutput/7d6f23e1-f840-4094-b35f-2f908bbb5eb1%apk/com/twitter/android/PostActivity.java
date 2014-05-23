package com.twitter.android;

import ad;
import ag;
import android.accounts.Account;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.provider.MediaStore.Images.Media;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import ar;
import be;
import bl;
import cj;
import com.twitter.android.platform.f;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.aj;
import com.twitter.android.provider.ax;
import com.twitter.android.widget.Navbar;
import com.twitter.android.widget.ShadowTextView;
import dy;
import dz;
import ea;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostActivity extends BaseActivity
  implements LocationListener, TextWatcher, View.OnLongClickListener, TextView.OnEditorActionListener, ar, bx, do
{
  static final boolean d = Log.isLoggable("PostActivity", 3);
  private int A;
  private cb B;
  private ImageButton C;
  private LocationManager D;
  private g E;
  private gb F;
  private SharedPreferences G;
  private String H;
  private TextView I;
  private em J;
  private cq K;
  private ImageView L;
  private TextView M;
  boolean e;
  long f;
  long g;
  View h;
  ImageView i;
  ProgressBar j;
  ShadowTextView k;
  MultiAutoCompleteTextView l;
  d m;
  com.twitter.android.client.j n;
  private HashMap o = new HashMap();
  private int p;
  private int q;
  private boolean r;
  private ImageButton s;
  private ImageButton t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private int y;
  private int z;

  public PostActivity()
  {
    super(true);
  }

  private cq a(Uri paramUri)
  {
    cq localcq = new cq(null, paramUri);
    this.m.a(localcq);
    localcq.f = 3;
    this.K = localcq;
    return localcq;
  }

  private void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      this.L.setBackgroundDrawable(new BitmapDrawable(getResources(), paramBitmap));
      return;
    }
    this.L.setBackgroundResource(2130837734);
  }

  private void a(CharSequence paramCharSequence)
  {
    this.l.setText(paramCharSequence);
    this.x = false;
  }

  private void h()
  {
    this.r = true;
    String str = f();
    Location localLocation = this.m.a();
    if (this.f != 0L)
      this.a.c(this.n, this.f);
    if (localLocation != null)
      a(this.a.a(this.n, str, this.g, localLocation.getLatitude(), localLocation.getLongitude(), this.H, g()));
    while (true)
    {
      Intent localIntent = (Intent)getIntent().getParcelableExtra("android.intent.extra.INTENT");
      if (localIntent == null)
        break;
      localIntent.setFlags(67108864);
      startActivity(localIntent);
      finish();
      return;
      a(this.a.a(this.n, str, this.g, 0.0D, 0.0D, this.H, g()));
    }
    super.c("home");
  }

  private boolean i()
  {
    return (this.f > 0L) || ((f().length() > 0) && (this.x)) || (this.K != null);
  }

  private int j()
  {
    int i1 = f().length();
    int i2;
    if (this.K == null)
    {
      i2 = 0;
      if (i1 <= 0)
        break label48;
      i1 = i1 + this.y + i2 * (1 + this.a.a(false));
    }
    label48: 
    while (i2 <= 0)
    {
      return i1;
      i2 = 1;
      break;
    }
    return i1 + 1 * (1 + this.a.a(false)) - 1;
  }

  protected final void a()
  {
    if (i())
    {
      showDialog(3);
      return;
    }
    super.a();
  }

  final void a(cq paramcq)
  {
    String str = (String)this.o.get(paramcq.e);
    if (str != null)
      paramcq.a(str);
    new br(this, null).execute(new cq[] { paramcq });
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    this.J.notifyDataSetChanged();
    bl localbl = (bl)paramHashMap.get(Long.valueOf(this.n.g()));
    if (localbl != null)
      a(localbl.a());
  }

  public final void a(ArrayList paramArrayList)
  {
    this.m.a = paramArrayList;
    showDialog(2);
  }

  final void a(boolean paramBoolean)
  {
    ImageButton localImageButton = this.C;
    if (paramBoolean)
      localImageButton.setImageResource(2130837684);
    while (true)
    {
      this.v = paramBoolean;
      return;
      localImageButton.setImageResource(2130837683);
    }
  }

  final void a(Parcelable[] paramArrayOfParcelable)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = new ArrayList();
    long l1 = this.n.g();
    for (int i1 = paramArrayOfParcelable.length - 1; i1 >= 0; i1--)
    {
      ax localax = (ax)paramArrayOfParcelable[i1];
      String str = localax.p;
      be localbe = this.a.b(localax);
      if ((!localArrayList.contains(str)) && (i1 == paramArrayOfParcelable.length - 1))
      {
        localStringBuilder.append((char)'@').append(str).append((char)' ');
        localArrayList.add(str);
        this.g = localax.o;
        if ((localbe != null) && (localbe.c != null))
          this.H = localbe.c.a;
      }
      if ((localbe != null) && (localbe.b != null))
      {
        Iterator localIterator = localbe.b.iterator();
        while (localIterator.hasNext())
        {
          ea localea = (ea)localIterator.next();
          if ((l1 != localea.d) && (!localArrayList.contains(localea.c)))
          {
            localArrayList.add(localea.c);
            localStringBuilder.append((char)'@').append(localea.c).append((char)' ');
          }
        }
      }
    }
    MultiAutoCompleteTextView localMultiAutoCompleteTextView = this.l;
    Editable localEditable = localMultiAutoCompleteTextView.getText();
    if ((localEditable.length() == 0) || (localEditable.charAt(0) != '@'))
      a(localStringBuilder.toString());
    if (localArrayList.size() > 0);
    for (int i2 = 2 + ((String)localArrayList.get(0)).length(); ; i2 = 0)
    {
      localMultiAutoCompleteTextView.setSelection(i2, localStringBuilder.length());
      return;
    }
  }

  public final void a_(String paramString)
  {
    com.twitter.android.client.g localg = this.a;
    com.twitter.android.client.j localj = localg.b(paramString);
    localg.a(localj);
    a(localg.b(localj.g(), localj.f().c));
    this.M.setText('@' + paramString);
    this.n = localj;
  }

  public void afterTextChanged(Editable paramEditable)
  {
    this.x = true;
    Matcher localMatcher = ag.b.matcher(paramEditable);
    int i1 = 0;
    while (localMatcher.find())
    {
      i1 += this.a.c(localMatcher.group());
      if (this.w)
      {
        Toast localToast = Toast.makeText(this, 2131427594, 1);
        localToast.setGravity(17, 0, 0);
        localToast.show();
        this.w = false;
        this.z = (1 + this.z);
      }
    }
    this.y = i1;
    e();
  }

  final void b()
  {
    if (!this.u)
    {
      this.u = f.a(this.D, this);
      if (this.E == null)
        this.E = new g(this, null);
      this.F.postDelayed(this.E, 15000L);
    }
  }

  public final void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      super.b(paramInt);
      return;
    case 2131165284:
      if (i())
      {
        showDialog(1);
        return;
      }
      finish();
      return;
    case 2131165255:
    }
    ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.l.getWindowToken(), 0);
    h();
  }

  final void b(boolean paramBoolean)
  {
    int i1 = this.l.getInputType();
    if (paramBoolean);
    for (int i2 = i1 | 0x10000; ; i2 = i1 & 0xFFFEFFFF)
    {
      this.l.setRawInputType(i2);
      return;
    }
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  final void c()
  {
    if (this.u)
    {
      this.D.removeUpdates(this);
      this.u = false;
      if (this.E != null)
        this.F.removeCallbacks(this.E);
    }
  }

  public final void c(int paramInt)
  {
    this.m.a(paramInt);
  }

  final void d()
  {
    this.m.b(this.K);
    switch (this.p)
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      this.p = 0;
      this.K = null;
      e();
      return;
      this.s.setImageResource(2130837677);
      continue;
      this.t.setImageResource(2130837693);
    }
  }

  final void e()
  {
    int i1 = j();
    this.I.setText(Integer.toString(140 - i1));
    ShadowTextView localShadowTextView = this.k;
    if ((i1 != 0) && (i1 <= 140));
    for (boolean bool = true; ; bool = false)
    {
      localShadowTextView.setEnabled(bool);
      return;
    }
  }

  final String f()
  {
    return this.l.getText().toString().trim();
  }

  final be g()
  {
    cq localcq = this.K;
    if (localcq != null)
    {
      be localbe = new be();
      localbe.d = new ArrayList(1);
      if (localcq.e != null)
      {
        dy localdy = new dy();
        localdy.f = 0L;
        localdy.c = localcq.e.toString();
        localdy.e = localcq.d;
        localbe.d.add(localdy);
      }
      return localbe;
    }
    return null;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 0);
    label239: Account localAccount;
    do
    {
      do
      {
        Uri localUri;
        ArrayList localArrayList;
        do
        {
          do
          {
            return;
            switch (paramInt1)
            {
            default:
              return;
            case 1:
              localUri = paramIntent.getData();
              if (this.m.a(localUri) == null)
                break label239;
              Toast.makeText(this, getString(2131427494), 0).show();
              return;
            case 3:
            case 2:
            case 4:
            }
          }
          while (paramIntent == null);
          localArrayList = paramIntent.getStringArrayListExtra("username");
        }
        while (localArrayList == null);
        StringBuilder localStringBuilder = new StringBuilder(140);
        int i1 = this.l.getSelectionStart();
        char[] arrayOfChar = new char[1];
        if (i1 > 0)
        {
          this.l.getText().getChars(i1 - 1, i1, arrayOfChar, 0);
          if (arrayOfChar[0] != ' ')
            localStringBuilder.append((char)' ');
        }
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localStringBuilder.append((char)'@').append(str).append((char)' ');
        }
        this.l.getEditableText().insert(i1, localStringBuilder.toString());
        return;
        if (this.p != 0)
          d();
        this.p = 1;
        this.t.setImageResource(2130837694);
        a(a(localUri));
        return;
        if (this.p != 0)
          d();
        this.p = 2;
        this.s.setImageResource(2130837678);
        new p(this, new File(Environment.getExternalStorageDirectory(), "camera-t.jpg"), a(null), null).execute(new Void[0]);
        return;
      }
      while (paramInt2 != 1);
      localAccount = (Account)paramIntent.getParcelableExtra("account");
    }
    while (localAccount.name.equals(this.n.e()));
    this.B.a(localAccount);
  }

  public void onBackPressed()
  {
    if (i())
    {
      showDialog(1);
      return;
    }
    super.onBackPressed();
  }

  public final void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131165287:
    case 2131165288:
    case 2131165289:
    case 2131165291:
    case 2131165292:
    case 2131165294:
    default:
    case 2131165286:
    case 2131165298:
    case 2131165296:
    case 2131165295:
    case 2131165297:
    case 2131165293:
    case 2131165290:
    }
    InputMethodManager localInputMethodManager;
    do
    {
      cc localcc;
      do
      {
        do
          return;
        while (com.twitter.android.platform.d.a(this) <= 1);
        startActivityForResult(new Intent(this, AccountsDialogActivity.class).putExtra("account", this.n.e()), 4);
        return;
        if (!f.a(this.D))
        {
          showDialog(5);
          return;
        }
        if (!this.v)
          break;
        a(false);
        c();
        localcc = this.m.b();
      }
      while (localcc == null);
      this.m.b(localcc);
      return;
      if (this.e)
      {
        a(true);
        b();
        return;
      }
      showDialog(4);
      return;
      if (this.p == 1)
      {
        this.h.setVisibility(8);
        d();
        return;
      }
      startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI).setType("vnd.android.cursor.dir/image"), 1);
      return;
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      if (localStatFs.getBlockSize() * localStatFs.getAvailableBlocks() <= 1048576L)
      {
        Toast.makeText(this, getString(2131427490), 1).show();
        return;
      }
      if (this.p == 2)
      {
        this.h.setVisibility(8);
        d();
        return;
      }
      Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
      File localFile = new File(Environment.getExternalStorageDirectory(), "camera-t.jpg");
      if (d)
        Log.d("PostActivity", "Capture photo to file: " + localFile.getAbsolutePath());
      localIntent.putExtra("output", Uri.fromFile(localFile));
      startActivityForResult(localIntent, 2);
      return;
      long l1 = this.n.g();
      startActivityForResult(new Intent(this, UsersActivity.class).putExtra("owner_id", l1).putExtra("session_owner_id", l1).setAction("com.twitter.android.pick_multiple"), 3);
      return;
      this.h.setVisibility(8);
      d();
      return;
      localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    }
    while (localInputMethodManager == null);
    localInputMethodManager.showSoftInput(this.l, 2);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903085);
    if (!this.a.h())
      return;
    this.B = new cb(this, findViewById(2131165245), this);
    this.G = getPreferences(0);
    this.z = this.G.getInt("url_hints", 0);
    boolean bool1;
    com.twitter.android.client.g localg;
    Intent localIntent1;
    com.twitter.android.client.j localj;
    label117: boolean bool2;
    label428: boolean bool4;
    int i3;
    label583: l locall;
    if (this.z < 3)
    {
      bool1 = true;
      this.w = bool1;
      localg = this.a;
      localIntent1 = getIntent();
      String str1 = localIntent1.getStringExtra("account_name");
      if (TextUtils.isEmpty(str1))
        break label680;
      localj = localg.b(str1);
      this.n = localj;
      Navbar localNavbar = this.c;
      this.I = ((TextView)localNavbar.findViewById(2131165279));
      this.k = ((ShadowTextView)localNavbar.findViewById(2131165255));
      this.C = ((ImageButton)findViewById(2131165298));
      this.s = ((ImageButton)findViewById(2131165295));
      this.t = ((ImageButton)findViewById(2131165296));
      this.I.setText(Integer.toString(140));
      this.D = ((LocationManager)getSystemService("location"));
      String str2 = String.valueOf(localj.g());
      this.J = new em(this, aj.h.buildUpon().appendEncodedPath(str2).appendQueryParameter("ownerId", str2).build(), localg);
      View localView1 = findViewById(2131165292);
      this.h = localView1;
      this.i = ((ImageView)localView1.findViewById(2131165293));
      this.j = ((ProgressBar)localView1.findViewById(2131165294));
      MultiAutoCompleteTextView localMultiAutoCompleteTextView1 = (MultiAutoCompleteTextView)findViewById(2131165291);
      localMultiAutoCompleteTextView1.setEditableFactory(n.getInstance());
      localMultiAutoCompleteTextView1.addTextChangedListener(this);
      localMultiAutoCompleteTextView1.setOnEditorActionListener(this);
      localMultiAutoCompleteTextView1.setMovementMethod(s.getInstance());
      localMultiAutoCompleteTextView1.setAdapter(this.J);
      localMultiAutoCompleteTextView1.setTokenizer(new bi(this, null));
      this.l = localMultiAutoCompleteTextView1;
      findViewById(2131165290).setOnLongClickListener(this);
      b(false);
      cb localcb = localg.f().j();
      if ((localcb == null) || (!localcb.a))
        break label689;
      bool2 = true;
      this.e = bool2;
      if (paramBundle == null)
        break label1035;
      this.m = ((d)paramBundle.getParcelable("data"));
      if (d)
        Log.d("PostActivity", "Restored storage: " + this.m);
      bool4 = paramBundle.getBoolean("loc");
      this.A = paramBundle.getInt("mode");
      this.r = paramBundle.getBoolean("do_post");
      String str8 = paramBundle.getString("text");
      if (!TextUtils.isEmpty(str8))
      {
        localIntent1.putExtra("android.intent.extra.TEXT", str8);
        localIntent1.putExtra("selection", paramBundle.getIntArray("selection"));
      }
      List localList = this.m.c();
      i3 = 0;
      Iterator localIterator = localList.iterator();
      if (!localIterator.hasNext())
        break label809;
      locall = (l)localIterator.next();
      if (d)
        Log.d("PostActivity", "Restored storage of type: " + locall.a());
      switch (locall.a())
      {
      default:
      case 2:
      }
    }
    for (int i4 = i3; ; i4 = 1)
    {
      i3 = i4;
      break label583;
      bool1 = false;
      break;
      label680: localj = localg.f();
      break label117;
      label689: bool2 = false;
      break label428;
      cq localcq2 = (cq)locall;
      if (d)
        Log.d("PostActivity", "Restoring media item: " + localcq2.e);
      this.K = localcq2;
      this.p = paramBundle.getInt("a");
      if (localcq2.e != null)
      {
        if (this.p == 2)
          this.s.setImageResource(2130837678);
        while (true)
        {
          a(localcq2);
          break;
          this.t.setImageResource(2130837694);
        }
      }
    }
    label809: if (i3 != 0)
      d();
    boolean bool3 = bool4;
    this.F = new gb(this, this);
    a(bool3);
    this.g = 0L;
    this.H = null;
    Intent localIntent2 = getIntent();
    this.f = localIntent2.getLongExtra("draft_id", 0L);
    MultiAutoCompleteTextView localMultiAutoCompleteTextView2 = this.l;
    switch (this.A)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      localg.a(1, this);
      View localView2 = findViewById(2131165286);
      this.L = ((ImageView)localView2.findViewById(2131165287));
      this.M = ((TextView)localView2.findViewById(2131165288));
      a(localg.b(localj.g(), localj.f().c));
      this.M.setText('@' + localj.e());
      if (!localIntent1.hasExtra("ref_event"))
        break label1742;
      localg.a(localj.g(), com.twitter.android.service.j.l, (com.twitter.android.service.j)localIntent1.getSerializableExtra("ref_event"));
      return;
      label1035: this.m = new d();
      bool3 = this.G.getBoolean("location_enabled", false);
      this.r = false;
      String str3 = getIntent().getAction();
      if (str3 == null)
        this.A = 0;
      while (true)
      {
        be localbe = (be)localIntent1.getSerializableExtra("entities");
        if ((localbe == null) || (localbe.d == null) || (localbe.d.isEmpty()))
          break;
        dy localdy = (dy)localbe.d.get(0);
        cq localcq1 = a(Uri.parse(localdy.c));
        localcq1.a(localdy.e);
        this.p = 1;
        this.t.setImageResource(2130837694);
        a(localcq1);
        break;
        if ("com.twitter.android.post.status".equals(str3))
        {
          this.A = 0;
        }
        else if ("com.twitter.android.post.reply".equals(str3))
        {
          this.A = 1;
        }
        else if ("android.intent.action.SEND".equals(str3))
        {
          this.A = 0;
        }
        else if ("com.twitter.android.post.quote".equals(str3))
        {
          this.A = 0;
        }
        else
        {
          if (!"android.intent.action.VIEW".equals(str3))
            break label1279;
          this.A = 0;
        }
      }
      label1279: throw new IllegalArgumentException("Unknown action: " + str3);
      localMultiAutoCompleteTextView2.setImeActionLabel(getText(2131427485), 101);
      String str4 = localIntent2.getAction();
      Uri localUri3;
      String str6;
      String str7;
      if ("twitter".equals(localIntent2.getScheme()))
      {
        localUri3 = localIntent2.getData();
        str6 = localUri3.getHost();
        str7 = localUri3.getQueryParameter("text");
        if (str7 == null)
          str7 = localUri3.getQueryParameter("message");
        if ("post".equals(str6))
          try
          {
            this.g = Long.parseLong(localUri3.getQueryParameter("in_reply_to_status_id"));
            str5 = str7;
            if ("android.intent.action.SEND".equals(str4))
            {
              localBundle = localIntent2.getExtras();
              if (localBundle != null)
              {
                localUri2 = (Uri)localBundle.getParcelable("android.intent.extra.STREAM");
                if ((localUri2 != null) && (this.m.a(localUri2) == null))
                  a(a(localUri2));
              }
            }
            if ((str5 == null) || (localMultiAutoCompleteTextView2.length() != 0))
              break label1643;
            a(str5);
            if (!localIntent2.hasExtra("selection"))
              break label1643;
            arrayOfInt = localIntent2.getIntArrayExtra("selection");
            if (arrayOfInt.length != 2)
              break label1643;
            i1 = arrayOfInt[0];
            i2 = arrayOfInt[1];
            if ((i1 < 0) || (i2 > str5.length()))
              break label1643;
            localMultiAutoCompleteTextView2.setSelection(i1, i2);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            while (true)
            {
              this.g = 0L;
              str5 = str7;
            }
          }
      }
      else
      {
        while (true)
        {
          String str5;
          Bundle localBundle;
          Uri localUri2;
          int[] arrayOfInt;
          int i1;
          int i2;
          if ("quote".equals(str6))
          {
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = localUri3.getQueryParameter("screen_name");
            arrayOfObject[1] = str7;
            str5 = getString(2131427328, arrayOfObject);
          }
          else
          {
            str5 = null;
            continue;
            str5 = localIntent2.getStringExtra("android.intent.extra.TEXT");
          }
        }
        label1643: localMultiAutoCompleteTextView2.setSelection(localMultiAutoCompleteTextView2.length());
        continue;
        localMultiAutoCompleteTextView2.setImeActionLabel(getText(2131427488), 101);
        Parcelable[] arrayOfParcelable = localIntent2.getParcelableArrayExtra("reply_to_tweet");
        if ((arrayOfParcelable != null) && (arrayOfParcelable.length > 0))
        {
          a(arrayOfParcelable);
        }
        else
        {
          Uri localUri1 = localIntent2.getData();
          if (localUri1 != null)
            this.F.startQuery(1, null, aa.a(localUri1, this.n.g()), ax.b, null, null, null);
        }
      }
    }
    label1742: localg.a(localj.g(), com.twitter.android.service.j.l);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 2:
      ek localek = new ek(this);
      return new AlertDialog.Builder(this).setTitle(2131427486).setIcon(17301659).setMessage(2131427492).setPositiveButton(2131427505, localek).setNegativeButton(2131427506, null).create();
    case 1:
    case 3:
      ej localej = new ej(this, paramInt);
      return new AlertDialog.Builder(this).setTitle(2131427486).setIcon(17301659).setMessage(getString(2131427545)).setPositiveButton(2131427538, localej).setNeutralButton(2131427539, localej).setNegativeButton(2131427504, null).create();
    case 4:
      ep localep = new ep(this);
      return new AlertDialog.Builder(this).setTitle(2131427602).setMessage(2131427603).setPositiveButton(2131427604, localep).setNegativeButton(2131427504, null).create();
    case 5:
    }
    en localen = new en(this);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this).setTitle(2131427602).setIcon(17301543).setMessage(2131427605).setNegativeButton(2131427504, null);
    Intent localIntent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    if (!getPackageManager().queryIntentActivities(localIntent, 65536).isEmpty())
      localBuilder.setPositiveButton(2131427464, localen);
    return localBuilder.create();
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    getMenuInflater().inflate(2131755013, paramMenu);
    return bool;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    SharedPreferences localSharedPreferences = this.G;
    if (localSharedPreferences != null)
    {
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putInt("url_hints", this.z);
      localEditor.putBoolean("location_enabled", this.v);
      localEditor.commit();
    }
    this.o.clear();
    this.a.b(1, this);
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 101)
    {
      int i1 = j();
      if ((i1 > 0) && (i1 <= 140))
        h();
    }
    return false;
  }

  public void onLocationChanged(Location paramLocation)
  {
    if ((d) && (paramLocation != null))
      Log.d("PostActivity", paramLocation.getProvider() + ": " + paramLocation.getLatitude() + ", " + paramLocation.getLongitude() + ", " + paramLocation.getAccuracy());
    cc localcc = this.m.b();
    if (localcc == null)
    {
      localcc = new cc(null);
      this.m.a(localcc);
    }
    Location localLocation = localcc.d;
    if ((paramLocation != null) && ((localLocation == null) || (localLocation.getAccuracy() > paramLocation.getAccuracy())))
    {
      localcc.a(paramLocation);
      if (paramLocation.getAccuracy() <= 20.0F)
        c();
    }
  }

  public boolean onLongClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return false;
    case 2131165290:
    }
    return this.l.performLongClick();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165396:
    }
    startActivityForResult(new Intent(this, AccountsDialogActivity.class).putExtra("account", this.n.e()), 4);
    return true;
  }

  protected void onPause()
  {
    super.onPause();
    removeDialog(2);
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
      return;
    case 2:
      paramDialog.setTitle(2131427486);
      return;
    case 1:
      paramDialog.setTitle(2131427486);
      return;
    case 3:
    }
    paramDialog.setTitle(2131427486);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if (com.twitter.android.platform.d.a(this) <= 1)
      paramMenu.findItem(2131165396).setVisible(false);
    return super.onPrepareOptionsMenu(paramMenu);
  }

  public void onProviderDisabled(String paramString)
  {
  }

  public void onProviderEnabled(String paramString)
  {
  }

  protected void onResume()
  {
    super.onResume();
    if (!this.a.h());
    do
    {
      return;
      this.q = Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(this).getString("photo_service", Integer.toString(2)));
      ((as)this.l.getEditableText()).a(this);
    }
    while (f.a(this.D));
    a(false);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("data", this.m);
    paramBundle.putInt("mode", this.A);
    paramBundle.putBoolean("loc", this.v);
    paramBundle.putBoolean("do_post", this.r);
    paramBundle.putString("text", this.l.getText().toString());
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = this.l.getSelectionStart();
    arrayOfInt[1] = this.l.getSelectionEnd();
    paramBundle.putIntArray("selection", arrayOfInt);
    paramBundle.putInt("a", this.p);
  }

  protected void onStart()
  {
    super.onStart();
    if ((this.v) && (!this.r))
      b();
  }

  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }

  protected void onStop()
  {
    super.onStop();
    c();
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    if (paramInt3 > 0)
    {
      i1 = paramCharSequence.charAt(paramInt3 - 1);
      if ((paramInt3 != 1) || (paramCharSequence.charAt(0) != '@'))
        break label41;
      b(true);
    }
    label41: 
    while (((i1 <= 47) || (i1 >= 58)) && ((i1 <= 64) || (i1 >= 91)) && ((i1 <= 96) || (i1 >= 122)) && (i1 != 95))
      return;
    b(false);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.PostActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
