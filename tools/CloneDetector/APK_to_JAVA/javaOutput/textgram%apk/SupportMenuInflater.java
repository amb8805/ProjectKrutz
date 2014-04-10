// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.*;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.util.*;
import android.view.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SupportMenuInflater extends MenuInflater
{
    private static class InflatedOnMenuItemClickListener
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        static 
        {
        //    0    0:iconst_1        
        //    1    1:anewarray       Class[]
        //    2    4:dup             
        //    3    5:iconst_0        
        //    4    6:ldc1            #19  <Class MenuItem>
        //    5    8:aastore         
        //    6    9:putstatic       #21  <Field Class[] PARAM_TYPES>
        //    7   12:return          
        }

        public InflatedOnMenuItemClickListener(Object obj, String s)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #27  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #29  <Field Object mRealOwner>
        //    5    9:aload_1         
        //    6   10:invokevirtual   #33  <Method Class Object.getClass()>
        //    7   13:astore_3        
        // try 14 26 handler(s) 27
        //    8   14:aload_0         
        //    9   15:aload_3         
        //   10   16:aload_2         
        //   11   17:getstatic       #21  <Field Class[] PARAM_TYPES>
        //   12   20:invokevirtual   #37  <Method Method Class.getMethod(String, Class[])>
        //   13   23:putfield        #39  <Field Method mMethod>
        //   14   26:return          
        // catch Exception
        //   15   27:astore          4
        //   16   29:new             #41  <Class InflateException>
        //   17   32:dup             
        //   18   33:new             #43  <Class StringBuilder>
        //   19   36:dup             
        //   20   37:invokespecial   #44  <Method void StringBuilder()>
        //   21   40:ldc1            #46  <String "Couldn't resolve menu item onClick handler ">
        //   22   42:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
        //   23   45:aload_2         
        //   24   46:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
        //   25   49:ldc1            #52  <String " in class ">
        //   26   51:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
        //   27   54:aload_3         
        //   28   55:invokevirtual   #56  <Method String Class.getName()>
        //   29   58:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
        //   30   61:invokevirtual   #59  <Method String StringBuilder.toString()>
        //   31   64:invokespecial   #62  <Method void InflateException(String)>
        //   32   67:astore          5
        //   33   69:aload           5
        //   34   71:aload           4
        //   35   73:invokevirtual   #66  <Method Throwable InflateException.initCause(Throwable)>
        //   36   76:pop             
        //   37   77:aload           5
        //   38   79:athrow          
        }

        public boolean onMenuItemClick(MenuItem menuitem)
        {
        // try 0 39 handler(s) 61
        //    0    0:aload_0         
        //    1    1:getfield        #39  <Field Method mMethod>
        //    2    4:invokevirtual   #73  <Method Class Method.getReturnType()>
        //    3    7:getstatic       #79  <Field Class Boolean.TYPE>
        //    4   10:if_acmpne       39
        //    5   13:aload_0         
        //    6   14:getfield        #39  <Field Method mMethod>
        //    7   17:aload_0         
        //    8   18:getfield        #29  <Field Object mRealOwner>
        //    9   21:iconst_1        
        //   10   22:anewarray       Object[]
        //   11   25:dup             
        //   12   26:iconst_0        
        //   13   27:aload_1         
        //   14   28:aastore         
        //   15   29:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
        //   16   32:checkcast       #75  <Class Boolean>
        //   17   35:invokevirtual   #87  <Method boolean Boolean.booleanValue()>
        //   18   38:ireturn         
        // try 39 59 handler(s) 61
        //   19   39:aload_0         
        //   20   40:getfield        #39  <Field Method mMethod>
        //   21   43:aload_0         
        //   22   44:getfield        #29  <Field Object mRealOwner>
        //   23   47:iconst_1        
        //   24   48:anewarray       Object[]
        //   25   51:dup             
        //   26   52:iconst_0        
        //   27   53:aload_1         
        //   28   54:aastore         
        //   29   55:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
        //   30   58:pop             
        //   31   59:iconst_1        
        //   32   60:ireturn         
        // catch Exception Exception
        //   33   61:astore_2        
        //   34   62:new             #89  <Class RuntimeException>
        //   35   65:dup             
        //   36   66:aload_2         
        //   37   67:invokespecial   #92  <Method void RuntimeException(Throwable)>
        //   38   70:athrow          
        }

        private static final Class PARAM_TYPES[];
        private Method mMethod;
        private Object mRealOwner;
    }

    private class MenuState
    {

        public MenuState(Menu menu1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #52  <Field SupportMenuInflater this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #55  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #57  <Field Menu menu>
        //    8   14:aload_0         
        //    9   15:invokevirtual   #60  <Method void resetGroup()>
        //   10   18:return          
        }

        static ActionProvider access$000(MenuState menustate)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #64  <Field ActionProvider itemActionProvider>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #64  <Field ActionProvider itemActionProvider>
        //    5    4:areturn         
        }

        private char getShortcut(String s)
        {
        //    0    0:aload_1         
        //    1    1:ifnonnull       6
        //    2    4:iconst_0        
        //    3    5:ireturn         
        //    4    6:aload_1         
        //    5    7:iconst_0        
        //    6    8:invokevirtual   #72  <Method char String.charAt(int)>
        //    7   11:ireturn         
        }

        private Object newInstance(String s, Class aclass[], Object aobj[])
        {
        // try 0 24 handler(s) 27
        //    0    0:aload_0         
        //    1    1:getfield        #52  <Field SupportMenuInflater this$0>
        //    2    4:invokestatic    #82  <Method Context SupportMenuInflater.access$100(SupportMenuInflater)>
        //    3    7:invokevirtual   #88  <Method ClassLoader Context.getClassLoader()>
        //    4   10:aload_1         
        //    5   11:invokevirtual   #94  <Method Class ClassLoader.loadClass(String)>
        //    6   14:aload_2         
        //    7   15:invokevirtual   #100 <Method Constructor Class.getConstructor(Class[])>
        //    8   18:aload_3         
        //    9   19:invokevirtual   #105 <Method Object Constructor.newInstance(Object[])>
        //   10   22:astore          6
        //   11   24:aload           6
        //   12   26:areturn         
        // catch Exception
        //   13   27:astore          4
        //   14   29:ldc1            #107 <String "SupportMenuInflater">
        //   15   31:new             #109 <Class StringBuilder>
        //   16   34:dup             
        //   17   35:invokespecial   #110 <Method void StringBuilder()>
        //   18   38:ldc1            #112 <String "Cannot instantiate class: ">
        //   19   40:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
        //   20   43:aload_1         
        //   21   44:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
        //   22   47:invokevirtual   #120 <Method String StringBuilder.toString()>
        //   23   50:aload           4
        //   24   52:invokestatic    #126 <Method int Log.w(String, String, Throwable)>
        //   25   55:pop             
        //   26   56:aconst_null     
        //   27   57:areturn         
        }

        private void setItem(MenuItem menuitem)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #130 <Field boolean itemChecked>
        //    3    5:invokeinterface #136 <Method MenuItem MenuItem.setChecked(boolean)>
        //    4   10:aload_0         
        //    5   11:getfield        #138 <Field boolean itemVisible>
        //    6   14:invokeinterface #141 <Method MenuItem MenuItem.setVisible(boolean)>
        //    7   19:aload_0         
        //    8   20:getfield        #143 <Field boolean itemEnabled>
        //    9   23:invokeinterface #146 <Method MenuItem MenuItem.setEnabled(boolean)>
        //   10   28:astore_2        
        //   11   29:aload_0         
        //   12   30:getfield        #148 <Field int itemCheckable>
        //   13   33:iconst_1        
        //   14   34:icmplt          128
        //   15   37:iconst_1        
        //   16   38:istore_3        
        //   17   39:aload_2         
        //   18   40:iload_3         
        //   19   41:invokeinterface #151 <Method MenuItem MenuItem.setCheckable(boolean)>
        //   20   46:aload_0         
        //   21   47:getfield        #153 <Field CharSequence itemTitleCondensed>
        //   22   50:invokeinterface #157 <Method MenuItem MenuItem.setTitleCondensed(CharSequence)>
        //   23   55:aload_0         
        //   24   56:getfield        #159 <Field int itemIconResId>
        //   25   59:invokeinterface #163 <Method MenuItem MenuItem.setIcon(int)>
        //   26   64:aload_0         
        //   27   65:getfield        #165 <Field char itemAlphabeticShortcut>
        //   28   68:invokeinterface #169 <Method MenuItem MenuItem.setAlphabeticShortcut(char)>
        //   29   73:aload_0         
        //   30   74:getfield        #171 <Field char itemNumericShortcut>
        //   31   77:invokeinterface #174 <Method MenuItem MenuItem.setNumericShortcut(char)>
        //   32   82:pop             
        //   33   83:aload_0         
        //   34   84:getfield        #176 <Field int itemShowAsAction>
        //   35   87:iflt            98
        //   36   90:aload_1         
        //   37   91:aload_0         
        //   38   92:getfield        #176 <Field int itemShowAsAction>
        //   39   95:invokestatic    #182 <Method void MenuItemCompat.setShowAsAction(MenuItem, int)>
        //   40   98:aload_0         
        //   41   99:getfield        #184 <Field String itemListenerMethodName>
        //   42  102:ifnull          158
        //   43  105:aload_0         
        //   44  106:getfield        #52  <Field SupportMenuInflater this$0>
        //   45  109:invokestatic    #82  <Method Context SupportMenuInflater.access$100(SupportMenuInflater)>
        //   46  112:invokevirtual   #188 <Method boolean Context.isRestricted()>
        //   47  115:ifeq            133
        //   48  118:new             #190 <Class IllegalStateException>
        //   49  121:dup             
        //   50  122:ldc1            #192 <String "The android:onClick attribute cannot be used within a restricted context">
        //   51  124:invokespecial   #195 <Method void IllegalStateException(String)>
        //   52  127:athrow          
        //   53  128:iconst_0        
        //   54  129:istore_3        
        //   55  130:goto            39
        //   56  133:aload_1         
        //   57  134:new             #197 <Class SupportMenuInflater$InflatedOnMenuItemClickListener>
        //   58  137:dup             
        //   59  138:aload_0         
        //   60  139:getfield        #52  <Field SupportMenuInflater this$0>
        //   61  142:invokestatic    #201 <Method Object SupportMenuInflater.access$400(SupportMenuInflater)>
        //   62  145:aload_0         
        //   63  146:getfield        #184 <Field String itemListenerMethodName>
        //   64  149:invokespecial   #204 <Method void SupportMenuInflater$InflatedOnMenuItemClickListener(Object, String)>
        //   65  152:invokeinterface #208 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
        //   66  157:pop             
        //   67  158:aload_1         
        //   68  159:instanceof      #210 <Class MenuItemImpl>
        //   69  162:ifeq            271
        //   70  165:aload_1         
        //   71  166:checkcast       #210 <Class MenuItemImpl>
        //   72  169:astore          5
        //   73  171:aload           5
        //   74  173:ifnull          190
        //   75  176:aload_0         
        //   76  177:getfield        #148 <Field int itemCheckable>
        //   77  180:iconst_2        
        //   78  181:icmplt          190
        //   79  184:aload           5
        //   80  186:iconst_1        
        //   81  187:invokevirtual   #214 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
        //   82  190:aload_0         
        //   83  191:getfield        #216 <Field String itemActionViewClassName>
        //   84  194:astore          6
        //   85  196:iconst_0        
        //   86  197:istore          7
        //   87  199:aload           6
        //   88  201:ifnull          233
        //   89  204:aload_1         
        //   90  205:aload_0         
        //   91  206:aload_0         
        //   92  207:getfield        #216 <Field String itemActionViewClassName>
        //   93  210:invokestatic    #220 <Method Class[] SupportMenuInflater.access$500()>
        //   94  213:aload_0         
        //   95  214:getfield        #52  <Field SupportMenuInflater this$0>
        //   96  217:invokestatic    #224 <Method Object[] SupportMenuInflater.access$600(SupportMenuInflater)>
        //   97  220:invokespecial   #226 <Method Object newInstance(String, Class[], Object[])>
        //   98  223:checkcast       #228 <Class View>
        //   99  226:invokestatic    #232 <Method MenuItem MenuItemCompat.setActionView(MenuItem, View)>
        //  100  229:pop             
        //  101  230:iconst_1        
        //  102  231:istore          7
        //  103  233:aload_0         
        //  104  234:getfield        #234 <Field int itemActionViewLayout>
        //  105  237:ifle            254
        //  106  240:iload           7
        //  107  242:ifne            277
        //  108  245:aload_1         
        //  109  246:aload_0         
        //  110  247:getfield        #234 <Field int itemActionViewLayout>
        //  111  250:invokestatic    #237 <Method MenuItem MenuItemCompat.setActionView(MenuItem, int)>
        //  112  253:pop             
        //  113  254:aload_0         
        //  114  255:getfield        #64  <Field ActionProvider itemActionProvider>
        //  115  258:ifnull          270
        //  116  261:aload_1         
        //  117  262:aload_0         
        //  118  263:getfield        #64  <Field ActionProvider itemActionProvider>
        //  119  266:invokestatic    #241 <Method MenuItem MenuItemCompat.setActionProvider(MenuItem, ActionProvider)>
        //  120  269:pop             
        //  121  270:return          
        //  122  271:aconst_null     
        //  123  272:astore          5
        //  124  274:goto            171
        //  125  277:ldc1            #107 <String "SupportMenuInflater">
        //  126  279:ldc1            #243 <String "Ignoring attribute 'itemActionViewLayout'. Action view already specified.">
        //  127  281:invokestatic    #246 <Method int Log.w(String, String)>
        //  128  284:pop             
        //  129  285:goto            254
        }

        public void addItem()
        {
        //    0    0:aload_0         
        //    1    1:iconst_1        
        //    2    2:putfield        #249 <Field boolean itemAdded>
        //    3    5:aload_0         
        //    4    6:aload_0         
        //    5    7:getfield        #57  <Field Menu menu>
        //    6   10:aload_0         
        //    7   11:getfield        #251 <Field int groupId>
        //    8   14:aload_0         
        //    9   15:getfield        #253 <Field int itemId>
        //   10   18:aload_0         
        //   11   19:getfield        #255 <Field int itemCategoryOrder>
        //   12   22:aload_0         
        //   13   23:getfield        #257 <Field CharSequence itemTitle>
        //   14   26:invokeinterface #263 <Method MenuItem Menu.add(int, int, int, CharSequence)>
        //   15   31:invokespecial   #265 <Method void setItem(MenuItem)>
        //   16   34:return          
        }

        public SubMenu addSubMenuItem()
        {
        //    0    0:aload_0         
        //    1    1:iconst_1        
        //    2    2:putfield        #249 <Field boolean itemAdded>
        //    3    5:aload_0         
        //    4    6:getfield        #57  <Field Menu menu>
        //    5    9:aload_0         
        //    6   10:getfield        #251 <Field int groupId>
        //    7   13:aload_0         
        //    8   14:getfield        #253 <Field int itemId>
        //    9   17:aload_0         
        //   10   18:getfield        #255 <Field int itemCategoryOrder>
        //   11   21:aload_0         
        //   12   22:getfield        #257 <Field CharSequence itemTitle>
        //   13   25:invokeinterface #271 <Method SubMenu Menu.addSubMenu(int, int, int, CharSequence)>
        //   14   30:astore_1        
        //   15   31:aload_0         
        //   16   32:aload_1         
        //   17   33:invokeinterface #277 <Method MenuItem SubMenu.getItem()>
        //   18   38:invokespecial   #265 <Method void setItem(MenuItem)>
        //   19   41:aload_1         
        //   20   42:areturn         
        }

        public boolean hasAddedItem()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #249 <Field boolean itemAdded>
        //    2    4:ireturn         
        }

        public void readGroup(AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #52  <Field SupportMenuInflater this$0>
        //    2    4:invokestatic    #82  <Method Context SupportMenuInflater.access$100(SupportMenuInflater)>
        //    3    7:aload_1         
        //    4    8:getstatic       #286 <Field int[] android.support.v7.appcompat.R$styleable.MenuGroup>
        //    5   11:invokevirtual   #290 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
        //    6   14:astore_2        
        //    7   15:aload_0         
        //    8   16:aload_2         
        //    9   17:iconst_1        
        //   10   18:iconst_0        
        //   11   19:invokevirtual   #296 <Method int TypedArray.getResourceId(int, int)>
        //   12   22:putfield        #251 <Field int groupId>
        //   13   25:aload_0         
        //   14   26:aload_2         
        //   15   27:iconst_3        
        //   16   28:iconst_0        
        //   17   29:invokevirtual   #299 <Method int TypedArray.getInt(int, int)>
        //   18   32:putfield        #301 <Field int groupCategory>
        //   19   35:aload_0         
        //   20   36:aload_2         
        //   21   37:iconst_4        
        //   22   38:iconst_0        
        //   23   39:invokevirtual   #299 <Method int TypedArray.getInt(int, int)>
        //   24   42:putfield        #303 <Field int groupOrder>
        //   25   45:aload_0         
        //   26   46:aload_2         
        //   27   47:iconst_5        
        //   28   48:iconst_0        
        //   29   49:invokevirtual   #299 <Method int TypedArray.getInt(int, int)>
        //   30   52:putfield        #305 <Field int groupCheckable>
        //   31   55:aload_0         
        //   32   56:aload_2         
        //   33   57:iconst_2        
        //   34   58:iconst_1        
        //   35   59:invokevirtual   #309 <Method boolean TypedArray.getBoolean(int, boolean)>
        //   36   62:putfield        #311 <Field boolean groupVisible>
        //   37   65:aload_0         
        //   38   66:aload_2         
        //   39   67:iconst_0        
        //   40   68:iconst_1        
        //   41   69:invokevirtual   #309 <Method boolean TypedArray.getBoolean(int, boolean)>
        //   42   72:putfield        #313 <Field boolean groupEnabled>
        //   43   75:aload_2         
        //   44   76:invokevirtual   #316 <Method void TypedArray.recycle()>
        //   45   79:return          
        }

        public void readItem(AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #52  <Field SupportMenuInflater this$0>
        //    2    4:invokestatic    #82  <Method Context SupportMenuInflater.access$100(SupportMenuInflater)>
        //    3    7:aload_1         
        //    4    8:getstatic       #320 <Field int[] android.support.v7.appcompat.R$styleable.MenuItem>
        //    5   11:invokevirtual   #290 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
        //    6   14:astore_2        
        //    7   15:aload_0         
        //    8   16:aload_2         
        //    9   17:iconst_2        
        //   10   18:iconst_0        
        //   11   19:invokevirtual   #296 <Method int TypedArray.getResourceId(int, int)>
        //   12   22:putfield        #253 <Field int itemId>
        //   13   25:aload_2         
        //   14   26:iconst_5        
        //   15   27:aload_0         
        //   16   28:getfield        #301 <Field int groupCategory>
        //   17   31:invokevirtual   #299 <Method int TypedArray.getInt(int, int)>
        //   18   34:istore_3        
        //   19   35:aload_2         
        //   20   36:bipush          6
        //   21   38:aload_0         
        //   22   39:getfield        #303 <Field int groupOrder>
        //   23   42:invokevirtual   #299 <Method int TypedArray.getInt(int, int)>
        //   24   45:istore          4
        //   25   47:aload_0         
        //   26   48:ldc2            #321 <Int 0xffff0000>
        //   27   51:iload_3         
        //   28   52:iand            
        //   29   53:ldc2            #322 <Int 65535>
        //   30   56:iload           4
        //   31   58:iand            
        //   32   59:ior             
        //   33   60:putfield        #255 <Field int itemCategoryOrder>
        //   34   63:aload_0         
        //   35   64:aload_2         
        //   36   65:bipush          7
        //   37   67:invokevirtual   #326 <Method CharSequence TypedArray.getText(int)>
        //   38   70:putfield        #257 <Field CharSequence itemTitle>
        //   39   73:aload_0         
        //   40   74:aload_2         
        //   41   75:bipush          8
        //   42   77:invokevirtual   #326 <Method CharSequence TypedArray.getText(int)>
        //   43   80:putfield        #153 <Field CharSequence itemTitleCondensed>
        //   44   83:aload_0         
        //   45   84:aload_2         
        //   46   85:iconst_0        
        //   47   86:iconst_0        
        //   48   87:invokevirtual   #296 <Method int TypedArray.getResourceId(int, int)>
        //   49   90:putfield        #159 <Field int itemIconResId>
        //   50   93:aload_0         
        //   51   94:aload_0         
        //   52   95:aload_2         
        //   53   96:bipush          9
        //   54   98:invokevirtual   #330 <Method String TypedArray.getString(int)>
        //   55  101:invokespecial   #332 <Method char getShortcut(String)>
        //   56  104:putfield        #165 <Field char itemAlphabeticShortcut>
        //   57  107:aload_0         
        //   58  108:aload_0         
        //   59  109:aload_2         
        //   60  110:bipush          10
        //   61  112:invokevirtual   #330 <Method String TypedArray.getString(int)>
        //   62  115:invokespecial   #332 <Method char getShortcut(String)>
        //   63  118:putfield        #171 <Field char itemNumericShortcut>
        //   64  121:aload_2         
        //   65  122:bipush          11
        //   66  124:invokevirtual   #336 <Method boolean TypedArray.hasValue(int)>
        //   67  127:ifeq            307
        //   68  130:aload_2         
        //   69  131:bipush          11
        //   70  133:iconst_0        
        //   71  134:invokevirtual   #309 <Method boolean TypedArray.getBoolean(int, boolean)>
        //   72  137:ifeq            301
        //   73  140:iconst_1        
        //   74  141:istore          7
        //   75  143:aload_0         
        //   76  144:iload           7
        //   77  146:putfield        #148 <Field int itemCheckable>
        //   78  149:aload_0         
        //   79  150:aload_2         
        //   80  151:iconst_3        
        //   81  152:iconst_0        
        //   82  153:invokevirtual   #309 <Method boolean TypedArray.getBoolean(int, boolean)>
        //   83  156:putfield        #130 <Field boolean itemChecked>
        //   84  159:aload_0         
        //   85  160:aload_2         
        //   86  161:iconst_4        
        //   87  162:aload_0         
        //   88  163:getfield        #311 <Field boolean groupVisible>
        //   89  166:invokevirtual   #309 <Method boolean TypedArray.getBoolean(int, boolean)>
        //   90  169:putfield        #138 <Field boolean itemVisible>
        //   91  172:aload_0         
        //   92  173:aload_2         
        //   93  174:iconst_1        
        //   94  175:aload_0         
        //   95  176:getfield        #313 <Field boolean groupEnabled>
        //   96  179:invokevirtual   #309 <Method boolean TypedArray.getBoolean(int, boolean)>
        //   97  182:putfield        #143 <Field boolean itemEnabled>
        //   98  185:aload_0         
        //   99  186:aload_2         
        //  100  187:bipush          13
        //  101  189:iconst_m1       
        //  102  190:invokevirtual   #299 <Method int TypedArray.getInt(int, int)>
        //  103  193:putfield        #176 <Field int itemShowAsAction>
        //  104  196:aload_0         
        //  105  197:aload_2         
        //  106  198:bipush          12
        //  107  200:invokevirtual   #330 <Method String TypedArray.getString(int)>
        //  108  203:putfield        #184 <Field String itemListenerMethodName>
        //  109  206:aload_0         
        //  110  207:aload_2         
        //  111  208:bipush          14
        //  112  210:iconst_0        
        //  113  211:invokevirtual   #296 <Method int TypedArray.getResourceId(int, int)>
        //  114  214:putfield        #234 <Field int itemActionViewLayout>
        //  115  217:aload_0         
        //  116  218:aload_2         
        //  117  219:bipush          15
        //  118  221:invokevirtual   #330 <Method String TypedArray.getString(int)>
        //  119  224:putfield        #216 <Field String itemActionViewClassName>
        //  120  227:aload_0         
        //  121  228:aload_2         
        //  122  229:bipush          16
        //  123  231:invokevirtual   #330 <Method String TypedArray.getString(int)>
        //  124  234:putfield        #338 <Field String itemActionProviderClassName>
        //  125  237:aload_0         
        //  126  238:getfield        #338 <Field String itemActionProviderClassName>
        //  127  241:ifnull          318
        //  128  244:iconst_1        
        //  129  245:istore          5
        //  130  247:iload           5
        //  131  249:ifeq            324
        //  132  252:aload_0         
        //  133  253:getfield        #234 <Field int itemActionViewLayout>
        //  134  256:ifne            324
        //  135  259:aload_0         
        //  136  260:getfield        #216 <Field String itemActionViewClassName>
        //  137  263:ifnonnull       324
        //  138  266:aload_0         
        //  139  267:aload_0         
        //  140  268:aload_0         
        //  141  269:getfield        #338 <Field String itemActionProviderClassName>
        //  142  272:invokestatic    #341 <Method Class[] SupportMenuInflater.access$200()>
        //  143  275:aload_0         
        //  144  276:getfield        #52  <Field SupportMenuInflater this$0>
        //  145  279:invokestatic    #344 <Method Object[] SupportMenuInflater.access$300(SupportMenuInflater)>
        //  146  282:invokespecial   #226 <Method Object newInstance(String, Class[], Object[])>
        //  147  285:checkcast       #346 <Class ActionProvider>
        //  148  288:putfield        #64  <Field ActionProvider itemActionProvider>
        //  149  291:aload_2         
        //  150  292:invokevirtual   #316 <Method void TypedArray.recycle()>
        //  151  295:aload_0         
        //  152  296:iconst_0        
        //  153  297:putfield        #249 <Field boolean itemAdded>
        //  154  300:return          
        //  155  301:iconst_0        
        //  156  302:istore          7
        //  157  304:goto            143
        //  158  307:aload_0         
        //  159  308:aload_0         
        //  160  309:getfield        #305 <Field int groupCheckable>
        //  161  312:putfield        #148 <Field int itemCheckable>
        //  162  315:goto            149
        //  163  318:iconst_0        
        //  164  319:istore          5
        //  165  321:goto            247
        //  166  324:iload           5
        //  167  326:ifeq            338
        //  168  329:ldc1            #107 <String "SupportMenuInflater">
        //  169  331:ldc2            #348 <String "Ignoring attribute 'actionProviderClass'. Action view already specified.">
        //  170  334:invokestatic    #246 <Method int Log.w(String, String)>
        //  171  337:pop             
        //  172  338:aload_0         
        //  173  339:aconst_null     
        //  174  340:putfield        #64  <Field ActionProvider itemActionProvider>
        //  175  343:goto            291
        }

        public void resetGroup()
        {
        //    0    0:aload_0         
        //    1    1:iconst_0        
        //    2    2:putfield        #251 <Field int groupId>
        //    3    5:aload_0         
        //    4    6:iconst_0        
        //    5    7:putfield        #301 <Field int groupCategory>
        //    6   10:aload_0         
        //    7   11:iconst_0        
        //    8   12:putfield        #303 <Field int groupOrder>
        //    9   15:aload_0         
        //   10   16:iconst_0        
        //   11   17:putfield        #305 <Field int groupCheckable>
        //   12   20:aload_0         
        //   13   21:iconst_1        
        //   14   22:putfield        #311 <Field boolean groupVisible>
        //   15   25:aload_0         
        //   16   26:iconst_1        
        //   17   27:putfield        #313 <Field boolean groupEnabled>
        //   18   30:return          
        }

        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        private ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private boolean itemEnabled;
        private int itemIconResId;
        private int itemId;
        private String itemListenerMethodName;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private boolean itemVisible;
        private Menu menu;
        final SupportMenuInflater this$0;

        static ActionProvider access$000(MenuState menustate)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #64  <Field ActionProvider itemActionProvider>
        //    2    4:areturn         
        }
    }


    static 
    {
    //    0    0:iconst_1        
    //    1    1:anewarray       Class[]
    //    2    4:dup             
    //    3    5:iconst_0        
    //    4    6:ldc1            #37  <Class Context>
    //    5    8:aastore         
    //    6    9:putstatic       #39  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
    //    7   12:getstatic       #39  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
    //    8   15:putstatic       #41  <Field Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
    //    9   18:return          
    }

    public SupportMenuInflater(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #45  <Method void MenuInflater(Context)>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #47  <Field Context mContext>
    //    6   10:aload_0         
    //    7   11:aload_1         
    //    8   12:putfield        #49  <Field Object mRealOwner>
    //    9   15:aload_0         
    //   10   16:iconst_1        
    //   11   17:anewarray       Object[]
    //   12   20:dup             
    //   13   21:iconst_0        
    //   14   22:aload_1         
    //   15   23:aastore         
    //   16   24:putfield        #53  <Field Object[] mActionViewConstructorArguments>
    //   17   27:aload_0         
    //   18   28:aload_0         
    //   19   29:getfield        #53  <Field Object[] mActionViewConstructorArguments>
    //   20   32:putfield        #55  <Field Object[] mActionProviderConstructorArguments>
    //   21   35:return          
    }

    static Context access$100(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field Context mContext>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #47  <Field Context mContext>
    //    5    4:areturn         
    }

    static Class[] access$200()
    {
    //    0    0:getstatic       #41  <Field Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #41  <Field Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
    //    3    3:areturn         
    }

    static Object[] access$300(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #55  <Field Object[] mActionProviderConstructorArguments>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #55  <Field Object[] mActionProviderConstructorArguments>
    //    5    4:areturn         
    }

    static Object access$400(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #49  <Field Object mRealOwner>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #49  <Field Object mRealOwner>
    //    5    4:areturn         
    }

    static Class[] access$500()
    {
    //    0    0:getstatic       #39  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #39  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
    //    3    3:areturn         
    }

    static Object[] access$600(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field Object[] mActionViewConstructorArguments>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #53  <Field Object[] mActionViewConstructorArguments>
    //    5    4:areturn         
    }

    private void parseMenu(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
        throws XmlPullParserException, IOException
    {
    //    0    0:new             #73  <Class SupportMenuInflater$MenuState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_3         
    //    4    6:invokespecial   #76  <Method void SupportMenuInflater$MenuState(SupportMenuInflater, Menu)>
    //    5    9:astore          4
    //    6   11:aload_1         
    //    7   12:invokeinterface #82  <Method int XmlPullParser.getEventType()>
    //    8   17:istore          5
    //    9   19:iconst_0        
    //   10   20:istore          6
    //   11   22:aconst_null     
    //   12   23:astore          7
    //   13   25:iload           5
    //   14   27:iconst_2        
    //   15   28:icmpne          131
    //   16   31:aload_1         
    //   17   32:invokeinterface #86  <Method String XmlPullParser.getName()>
    //   18   37:astore          12
    //   19   39:aload           12
    //   20   41:ldc1            #24  <String "menu">
    //   21   43:invokevirtual   #92  <Method boolean String.equals(Object)>
    //   22   46:ifeq            103
    //   23   49:aload_1         
    //   24   50:invokeinterface #95  <Method int XmlPullParser.next()>
    //   25   55:istore          5
    //   26   57:iconst_0        
    //   27   58:istore          8
    //   28   60:iload           8
    //   29   62:ifne            363
    //   30   65:iload           5
    //   31   67:tableswitch     1 3: default 92
    //                   1 353
    //                   2 148
    //                   3 233
    //   32   92:aload_1         
    //   33   93:invokeinterface #95  <Method int XmlPullParser.next()>
    //   34   98:istore          5
    //   35  100:goto            60
    //   36  103:new             #97  <Class RuntimeException>
    //   37  106:dup             
    //   38  107:new             #99  <Class StringBuilder>
    //   39  110:dup             
    //   40  111:invokespecial   #101 <Method void StringBuilder()>
    //   41  114:ldc1            #103 <String "Expecting menu, got ">
    //   42  116:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
    //   43  119:aload           12
    //   44  121:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
    //   45  124:invokevirtual   #110 <Method String StringBuilder.toString()>
    //   46  127:invokespecial   #113 <Method void RuntimeException(String)>
    //   47  130:athrow          
    //   48  131:aload_1         
    //   49  132:invokeinterface #95  <Method int XmlPullParser.next()>
    //   50  137:istore          5
    //   51  139:iload           5
    //   52  141:iconst_1        
    //   53  142:icmpne          25
    //   54  145:goto            57
    //   55  148:iload           6
    //   56  150:ifne            92
    //   57  153:aload_1         
    //   58  154:invokeinterface #86  <Method String XmlPullParser.getName()>
    //   59  159:astore          11
    //   60  161:aload           11
    //   61  163:ldc1            #18  <String "group">
    //   62  165:invokevirtual   #92  <Method boolean String.equals(Object)>
    //   63  168:ifeq            180
    //   64  171:aload           4
    //   65  173:aload_2         
    //   66  174:invokevirtual   #117 <Method void SupportMenuInflater$MenuState.readGroup(AttributeSet)>
    //   67  177:goto            92
    //   68  180:aload           11
    //   69  182:ldc1            #21  <String "item">
    //   70  184:invokevirtual   #92  <Method boolean String.equals(Object)>
    //   71  187:ifeq            199
    //   72  190:aload           4
    //   73  192:aload_2         
    //   74  193:invokevirtual   #120 <Method void SupportMenuInflater$MenuState.readItem(AttributeSet)>
    //   75  196:goto            92
    //   76  199:aload           11
    //   77  201:ldc1            #24  <String "menu">
    //   78  203:invokevirtual   #92  <Method boolean String.equals(Object)>
    //   79  206:ifeq            223
    //   80  209:aload_0         
    //   81  210:aload_1         
    //   82  211:aload_2         
    //   83  212:aload           4
    //   84  214:invokevirtual   #124 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
    //   85  217:invokespecial   #126 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
    //   86  220:goto            92
    //   87  223:iconst_1        
    //   88  224:istore          6
    //   89  226:aload           11
    //   90  228:astore          7
    //   91  230:goto            92
    //   92  233:aload_1         
    //   93  234:invokeinterface #86  <Method String XmlPullParser.getName()>
    //   94  239:astore          9
    //   95  241:iload           6
    //   96  243:ifeq            265
    //   97  246:aload           9
    //   98  248:aload           7
    //   99  250:invokevirtual   #92  <Method boolean String.equals(Object)>
    //  100  253:ifeq            265
    //  101  256:iconst_0        
    //  102  257:istore          6
    //  103  259:aconst_null     
    //  104  260:astore          7
    //  105  262:goto            92
    //  106  265:aload           9
    //  107  267:ldc1            #18  <String "group">
    //  108  269:invokevirtual   #92  <Method boolean String.equals(Object)>
    //  109  272:ifeq            283
    //  110  275:aload           4
    //  111  277:invokevirtual   #129 <Method void SupportMenuInflater$MenuState.resetGroup()>
    //  112  280:goto            92
    //  113  283:aload           9
    //  114  285:ldc1            #21  <String "item">
    //  115  287:invokevirtual   #92  <Method boolean String.equals(Object)>
    //  116  290:ifeq            337
    //  117  293:aload           4
    //  118  295:invokevirtual   #133 <Method boolean SupportMenuInflater$MenuState.hasAddedItem()>
    //  119  298:ifne            92
    //  120  301:aload           4
    //  121  303:invokestatic    #137 <Method ActionProvider SupportMenuInflater$MenuState.access$000(SupportMenuInflater$MenuState)>
    //  122  306:ifnull          329
    //  123  309:aload           4
    //  124  311:invokestatic    #137 <Method ActionProvider SupportMenuInflater$MenuState.access$000(SupportMenuInflater$MenuState)>
    //  125  314:invokevirtual   #142 <Method boolean ActionProvider.hasSubMenu()>
    //  126  317:ifeq            329
    //  127  320:aload           4
    //  128  322:invokevirtual   #124 <Method SubMenu SupportMenuInflater$MenuState.addSubMenuItem()>
    //  129  325:pop             
    //  130  326:goto            92
    //  131  329:aload           4
    //  132  331:invokevirtual   #145 <Method void SupportMenuInflater$MenuState.addItem()>
    //  133  334:goto            92
    //  134  337:aload           9
    //  135  339:ldc1            #24  <String "menu">
    //  136  341:invokevirtual   #92  <Method boolean String.equals(Object)>
    //  137  344:ifeq            92
    //  138  347:iconst_1        
    //  139  348:istore          8
    //  140  350:goto            92
    //  141  353:new             #97  <Class RuntimeException>
    //  142  356:dup             
    //  143  357:ldc1            #147 <String "Unexpected end of document">
    //  144  359:invokespecial   #113 <Method void RuntimeException(String)>
    //  145  362:athrow          
    //  146  363:return          
    }

    public void inflate(int i, Menu menu)
    {
    //    0    0:aload_2         
    //    1    1:instanceof      #151 <Class SupportMenu>
    //    2    4:ifne            14
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:aload_2         
    //    6   10:invokespecial   #153 <Method void MenuInflater.inflate(int, Menu)>
    //    7   13:return          
    //    8   14:aconst_null     
    //    9   15:astore_3        
    // try 16 38 handler(s) 49 78 63
    //   10   16:aload_0         
    //   11   17:getfield        #47  <Field Context mContext>
    //   12   20:invokevirtual   #157 <Method Resources Context.getResources()>
    //   13   23:iload_1         
    //   14   24:invokevirtual   #163 <Method XmlResourceParser Resources.getLayout(int)>
    //   15   27:astore_3        
    //   16   28:aload_0         
    //   17   29:aload_3         
    //   18   30:aload_3         
    //   19   31:invokestatic    #169 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
    //   20   34:aload_2         
    //   21   35:invokespecial   #126 <Method void parseMenu(XmlPullParser, AttributeSet, Menu)>
    //   22   38:aload_3         
    //   23   39:ifnull          13
    //   24   42:aload_3         
    //   25   43:invokeinterface #174 <Method void XmlResourceParser.close()>
    //   26   48:return          
    // catch XmlPullParserException
    //   27   49:astore          6
    // try 51 63 handler(s) 63
    //   28   51:new             #176 <Class InflateException>
    //   29   54:dup             
    //   30   55:ldc1            #178 <String "Error inflating menu XML">
    //   31   57:aload           6
    //   32   59:invokespecial   #181 <Method void InflateException(String, Throwable)>
    //   33   62:athrow          
    // finally
    //   34   63:astore          5
    //   35   65:aload_3         
    //   36   66:ifnull          75
    //   37   69:aload_3         
    //   38   70:invokeinterface #174 <Method void XmlResourceParser.close()>
    //   39   75:aload           5
    //   40   77:athrow          
    // catch IOException
    //   41   78:astore          4
    // try 80 92 handler(s) 63
    //   42   80:new             #176 <Class InflateException>
    //   43   83:dup             
    //   44   84:ldc1            #178 <String "Error inflating menu XML">
    //   45   86:aload           4
    //   46   88:invokespecial   #181 <Method void InflateException(String, Throwable)>
    //   47   91:athrow          
    }

    private static final Class ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE[];
    private static final Class ACTION_VIEW_CONSTRUCTOR_SIGNATURE[];
    private static final String LOG_TAG = "SupportMenuInflater";
    private static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    private final Object mActionProviderConstructorArguments[];
    private final Object mActionViewConstructorArguments[];
    private Context mContext;
    private Object mRealOwner;

    static Context access$100(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #47  <Field Context mContext>
    //    2    4:areturn         
    }

    static Class[] access$200()
    {
    //    0    0:getstatic       #41  <Field Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE>
    //    1    3:areturn         
    }

    static Object[] access$300(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #55  <Field Object[] mActionProviderConstructorArguments>
    //    2    4:areturn         
    }

    static Object access$400(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #49  <Field Object mRealOwner>
    //    2    4:areturn         
    }

    static Class[] access$500()
    {
    //    0    0:getstatic       #39  <Field Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE>
    //    1    3:areturn         
    }

    static Object[] access$600(SupportMenuInflater supportmenuinflater)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field Object[] mActionViewConstructorArguments>
    //    2    4:areturn         
    }
}
