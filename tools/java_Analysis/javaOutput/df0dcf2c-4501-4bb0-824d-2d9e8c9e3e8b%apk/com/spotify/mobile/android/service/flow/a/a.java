package com.spotify.mobile.android.service.flow.a;

import android.content.Intent;
import android.content.Intent;;
import android.net.Uri;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.service.flow.FlowActivity;
import com.spotify.mobile.android.ui.AnimationDirection;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bp;
import java.util.HashMap;
import java.util.Map;

public abstract class a extends Fragment
{
  private Map<Class<? extends com.spotify.mobile.android.service.flow.a>, Object> a = new HashMap();

  public a()
  {
  }

  public final void C()
  {
    FlowActivity localFlowActivity = (FlowActivity)i();
    if (localFlowActivity == null)
    {
      bp.e("Could not finish flow - activity not attached", new Object[0]);
      return;
    }
    if (localFlowActivity.isFinishing())
    {
      bp.d("Already finishing.", new Object[0]);
      return;
    }
    Intent localIntent = localFlowActivity.e();
    if (localIntent != null)
      localFlowActivity.startActivity(localIntent);
    localFlowActivity.setResult(-1);
    localFlowActivity.finish();
  }

  public final void D()
  {
    FlowActivity localFlowActivity = (FlowActivity)i();
    if (localFlowActivity == null)
    {
      bp.e("Could not finish flow - activity not attached", new Object[0]);
      return;
    }
    if (localFlowActivity.isFinishing())
    {
      bp.d("Already finishing.", new Object[0]);
      return;
    }
    Object localObject = localFlowActivity.e();
    if (localObject == null)
      localObject = new Intent();
    if (!"android.intent.action.VIEW".equals(((Intent)localObject).getAction()))
    {
      Intent localIntent = new Intent((Intent)localObject);
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setData(Uri.parse("spotify:internal:startpage"));
      localObject = localIntent;
    }
    localFlowActivity.startActivity((Intent)localObject);
    localFlowActivity.setResult(-1);
    localFlowActivity.finish();
  }

  public final <T> T a(com.spotify.mobile.android.service.flow.a parama)
  {
    return this.a.get(parama.getClass());
  }

  protected final void a(com.spotify.mobile.android.service.flow.a parama, AnimationDirection paramAnimationDirection)
  {
    FlowActivity localFlowActivity = (FlowActivity)i();
    if (localFlowActivity == null)
    {
      bp.e("Could not switch fragment - activity not attached", new Object[0]);
      return;
    }
    localFlowActivity.a(parama, paramAnimationDirection);
  }

  public final void a(ViewUri.Verified paramVerified, ClientEvent.SubEvent paramSubEvent)
  {
    FlowActivity localFlowActivity = (FlowActivity)i();
    if (localFlowActivity == null)
    {
      bp.e("Could not finish flow - activity not attached", new Object[0]);
      return;
    }
    localFlowActivity.a(paramVerified, paramSubEvent);
  }

  protected final <T> void a(Class<? extends com.spotify.mobile.android.service.flow.a> paramClass, T paramT)
  {
    this.a.put(paramClass, paramT);
  }

  protected final com.spotify.mobile.android.service.flow.a b()
  {
    FlowActivity localFlowActivity = (FlowActivity)i();
    if (localFlowActivity == null)
      return null;
    return localFlowActivity.f();
  }

  protected final void b(com.spotify.mobile.android.service.flow.a parama, AnimationDirection paramAnimationDirection)
  {
    FlowActivity localFlowActivity = (FlowActivity)i();
    if (localFlowActivity == null)
    {
      bp.e("Could not switch fragment - activity not attached", new Object[0]);
      return;
    }
    localFlowActivity.a(parama, paramAnimationDirection, false);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
