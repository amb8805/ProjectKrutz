package android.support.v4.widget;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class x extends w
{
  private Method a;
  private Field b;

  // ERROR //
  x()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 16	android/support/v4/widget/w:<init>	()V
    //   4: aload_0
    //   5: ldc 18
    //   7: ldc 20
    //   9: aconst_null
    //   10: invokevirtual 26	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   13: putfield 28	android/support/v4/widget/x:a	Ljava/lang/reflect/Method;
    //   16: aload_0
    //   17: ldc 18
    //   19: ldc 30
    //   21: invokevirtual 34	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   24: putfield 36	android/support/v4/widget/x:b	Ljava/lang/reflect/Field;
    //   27: aload_0
    //   28: getfield 36	android/support/v4/widget/x:b	Ljava/lang/reflect/Field;
    //   31: iconst_1
    //   32: invokevirtual 42	java/lang/reflect/Field:setAccessible	(Z)V
    //   35: return
    //   36: astore_1
    //   37: ldc 44
    //   39: ldc 46
    //   41: aload_1
    //   42: invokestatic 52	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   45: pop
    //   46: goto -30 -> 16
    //   49: astore_3
    //   50: ldc 44
    //   52: ldc 54
    //   54: aload_3
    //   55: invokestatic 52	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   58: pop
    //   59: return
    //
    // Exception table:
    //   from	to	target	type
    //   4	16	36	java/lang/NoSuchMethodException
    //   16	35	49	java/lang/NoSuchFieldException
  }

  public final void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    if ((this.a != null) && (this.b != null))
      try
      {
        this.b.setBoolean(paramView, true);
        this.a.invoke(paramView, null);
        super.a(paramSlidingPaneLayout, paramView);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          Log.e("SlidingPaneLayout", "Error refreshing display list state", localException);
      }
    paramView.invalidate();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
