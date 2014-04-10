// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.*;

// Referenced classes of package com.nineoldandroids.animation:
//            Animator, ValueAnimator, ObjectAnimator, AnimatorListenerAdapter

public final class AnimatorSet extends Animator
{
    private class AnimatorSetListener
        implements Animator.AnimatorListener
    {

        AnimatorSetListener(AnimatorSet animatorset1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field AnimatorSet this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #16  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #18  <Field AnimatorSet mAnimatorSet>
        //    8   14:return          
        }

        public void onAnimationCancel(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field AnimatorSet this$0>
        //    2    4:getfield        #26  <Field boolean AnimatorSet.mTerminated>
        //    3    7:ifne            51
        //    4   10:aload_0         
        //    5   11:getfield        #13  <Field AnimatorSet this$0>
        //    6   14:invokestatic    #30  <Method ArrayList AnimatorSet.access$2(AnimatorSet)>
        //    7   17:invokevirtual   #36  <Method int ArrayList.size()>
        //    8   20:ifne            51
        //    9   23:aload_0         
        //   10   24:getfield        #13  <Field AnimatorSet this$0>
        //   11   27:getfield        #40  <Field ArrayList AnimatorSet.mListeners>
        //   12   30:ifnull          51
        //   13   33:aload_0         
        //   14   34:getfield        #13  <Field AnimatorSet this$0>
        //   15   37:getfield        #40  <Field ArrayList AnimatorSet.mListeners>
        //   16   40:invokevirtual   #36  <Method int ArrayList.size()>
        //   17   43:istore_2        
        //   18   44:iconst_0        
        //   19   45:istore_3        
        //   20   46:iload_3         
        //   21   47:iload_2         
        //   22   48:icmplt          52
        //   23   51:return          
        //   24   52:aload_0         
        //   25   53:getfield        #13  <Field AnimatorSet this$0>
        //   26   56:getfield        #40  <Field ArrayList AnimatorSet.mListeners>
        //   27   59:iload_3         
        //   28   60:invokevirtual   #44  <Method Object ArrayList.get(int)>
        //   29   63:checkcast       #6   <Class Animator$AnimatorListener>
        //   30   66:aload_0         
        //   31   67:getfield        #18  <Field AnimatorSet mAnimatorSet>
        //   32   70:invokeinterface #46  <Method void Animator$AnimatorListener.onAnimationCancel(Animator)>
        //   33   75:iinc            3  1
        //   34   78:goto            46
        }

        public void onAnimationEnd(Animator animator)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:invokevirtual   #53  <Method void Animator.removeListener(Animator$AnimatorListener)>
        //    3    5:aload_0         
        //    4    6:getfield        #13  <Field AnimatorSet this$0>
        //    5    9:invokestatic    #30  <Method ArrayList AnimatorSet.access$2(AnimatorSet)>
        //    6   12:aload_1         
        //    7   13:invokevirtual   #57  <Method boolean ArrayList.remove(Object)>
        //    8   16:pop             
        //    9   17:aload_0         
        //   10   18:getfield        #18  <Field AnimatorSet mAnimatorSet>
        //   11   21:invokestatic    #61  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //   12   24:aload_1         
        //   13   25:invokevirtual   #66  <Method Object HashMap.get(Object)>
        //   14   28:checkcast       #68  <Class AnimatorSet$Node>
        //   15   31:iconst_1        
        //   16   32:putfield        #71  <Field boolean AnimatorSet$Node.done>
        //   17   35:aload_0         
        //   18   36:getfield        #13  <Field AnimatorSet this$0>
        //   19   39:getfield        #26  <Field boolean AnimatorSet.mTerminated>
        //   20   42:ifne            127
        //   21   45:aload_0         
        //   22   46:getfield        #18  <Field AnimatorSet mAnimatorSet>
        //   23   49:invokestatic    #74  <Method ArrayList AnimatorSet.access$4(AnimatorSet)>
        //   24   52:astore_3        
        //   25   53:iconst_1        
        //   26   54:istore          4
        //   27   56:aload_3         
        //   28   57:invokevirtual   #36  <Method int ArrayList.size()>
        //   29   60:istore          5
        //   30   62:iconst_0        
        //   31   63:istore          6
        //   32   65:iload           6
        //   33   67:iload           5
        //   34   69:icmplt          128
        //   35   72:iload           4
        //   36   74:ifeq            127
        //   37   77:aload_0         
        //   38   78:getfield        #13  <Field AnimatorSet this$0>
        //   39   81:getfield        #40  <Field ArrayList AnimatorSet.mListeners>
        //   40   84:ifnull          119
        //   41   87:aload_0         
        //   42   88:getfield        #13  <Field AnimatorSet this$0>
        //   43   91:getfield        #40  <Field ArrayList AnimatorSet.mListeners>
        //   44   94:invokevirtual   #78  <Method Object ArrayList.clone()>
        //   45   97:checkcast       #32  <Class ArrayList>
        //   46  100:astore          7
        //   47  102:aload           7
        //   48  104:invokevirtual   #36  <Method int ArrayList.size()>
        //   49  107:istore          8
        //   50  109:iconst_0        
        //   51  110:istore          9
        //   52  112:iload           9
        //   53  114:iload           8
        //   54  116:icmplt          155
        //   55  119:aload_0         
        //   56  120:getfield        #18  <Field AnimatorSet mAnimatorSet>
        //   57  123:iconst_0        
        //   58  124:invokestatic    #82  <Method void AnimatorSet.access$5(AnimatorSet, boolean)>
        //   59  127:return          
        //   60  128:aload_3         
        //   61  129:iload           6
        //   62  131:invokevirtual   #44  <Method Object ArrayList.get(int)>
        //   63  134:checkcast       #68  <Class AnimatorSet$Node>
        //   64  137:getfield        #71  <Field boolean AnimatorSet$Node.done>
        //   65  140:ifne            149
        //   66  143:iconst_0        
        //   67  144:istore          4
        //   68  146:goto            72
        //   69  149:iinc            6  1
        //   70  152:goto            65
        //   71  155:aload           7
        //   72  157:iload           9
        //   73  159:invokevirtual   #44  <Method Object ArrayList.get(int)>
        //   74  162:checkcast       #6   <Class Animator$AnimatorListener>
        //   75  165:aload_0         
        //   76  166:getfield        #18  <Field AnimatorSet mAnimatorSet>
        //   77  169:invokeinterface #84  <Method void Animator$AnimatorListener.onAnimationEnd(Animator)>
        //   78  174:iinc            9  1
        //   79  177:goto            112
        }

        public void onAnimationRepeat(Animator animator)
        {
        //    0    0:return          
        }

        public void onAnimationStart(Animator animator)
        {
        //    0    0:return          
        }

        private AnimatorSet mAnimatorSet;
        final AnimatorSet this$0;
    }

    public class Builder
    {

        Builder(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field AnimatorSet this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_1         
        //    7   11:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //    8   14:aload_2         
        //    9   15:invokevirtual   #27  <Method Object HashMap.get(Object)>
        //   10   18:checkcast       #29  <Class AnimatorSet$Node>
        //   11   21:putfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   12   24:aload_0         
        //   13   25:getfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   14   28:ifnonnull       68
        //   15   31:aload_0         
        //   16   32:new             #29  <Class AnimatorSet$Node>
        //   17   35:dup             
        //   18   36:aload_2         
        //   19   37:invokespecial   #34  <Method void AnimatorSet$Node(Animator)>
        //   20   40:putfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   21   43:aload_1         
        //   22   44:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //   23   47:aload_2         
        //   24   48:aload_0         
        //   25   49:getfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   26   52:invokevirtual   #38  <Method Object HashMap.put(Object, Object)>
        //   27   55:pop             
        //   28   56:aload_1         
        //   29   57:invokestatic    #42  <Method ArrayList AnimatorSet.access$6(AnimatorSet)>
        //   30   60:aload_0         
        //   31   61:getfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   32   64:invokevirtual   #48  <Method boolean ArrayList.add(Object)>
        //   33   67:pop             
        //   34   68:return          
        }

        public Builder after(long l)
        {
        //    0    0:iconst_2        
        //    1    1:newarray        float[]
        //    2    3:dup             
        //    3    4:iconst_0        
        //    4    5:fconst_0        
        //    5    6:fastore         
        //    6    7:dup             
        //    7    8:iconst_1        
        //    8    9:fconst_1        
        //    9   10:fastore         
        //   10   11:invokestatic    #56  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
        //   11   14:astore_3        
        //   12   15:aload_3         
        //   13   16:lload_1         
        //   14   17:invokevirtual   #60  <Method ValueAnimator ValueAnimator.setDuration(long)>
        //   15   20:pop             
        //   16   21:aload_0         
        //   17   22:aload_3         
        //   18   23:invokevirtual   #63  <Method AnimatorSet$Builder after(Animator)>
        //   19   26:pop             
        //   20   27:aload_0         
        //   21   28:areturn         
        }

        public Builder after(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AnimatorSet this$0>
        //    2    4:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //    3    7:aload_1         
        //    4    8:invokevirtual   #27  <Method Object HashMap.get(Object)>
        //    5   11:checkcast       #29  <Class AnimatorSet$Node>
        //    6   14:astore_2        
        //    7   15:aload_2         
        //    8   16:ifnonnull       53
        //    9   19:new             #29  <Class AnimatorSet$Node>
        //   10   22:dup             
        //   11   23:aload_1         
        //   12   24:invokespecial   #34  <Method void AnimatorSet$Node(Animator)>
        //   13   27:astore_2        
        //   14   28:aload_0         
        //   15   29:getfield        #12  <Field AnimatorSet this$0>
        //   16   32:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //   17   35:aload_1         
        //   18   36:aload_2         
        //   19   37:invokevirtual   #38  <Method Object HashMap.put(Object, Object)>
        //   20   40:pop             
        //   21   41:aload_0         
        //   22   42:getfield        #12  <Field AnimatorSet this$0>
        //   23   45:invokestatic    #42  <Method ArrayList AnimatorSet.access$6(AnimatorSet)>
        //   24   48:aload_2         
        //   25   49:invokevirtual   #48  <Method boolean ArrayList.add(Object)>
        //   26   52:pop             
        //   27   53:new             #65  <Class AnimatorSet$Dependency>
        //   28   56:dup             
        //   29   57:aload_2         
        //   30   58:iconst_1        
        //   31   59:invokespecial   #68  <Method void AnimatorSet$Dependency(AnimatorSet$Node, int)>
        //   32   62:astore          5
        //   33   64:aload_0         
        //   34   65:getfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   35   68:aload           5
        //   36   70:invokevirtual   #72  <Method void AnimatorSet$Node.addDependency(AnimatorSet$Dependency)>
        //   37   73:aload_0         
        //   38   74:areturn         
        }

        public Builder before(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AnimatorSet this$0>
        //    2    4:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //    3    7:aload_1         
        //    4    8:invokevirtual   #27  <Method Object HashMap.get(Object)>
        //    5   11:checkcast       #29  <Class AnimatorSet$Node>
        //    6   14:astore_2        
        //    7   15:aload_2         
        //    8   16:ifnonnull       53
        //    9   19:new             #29  <Class AnimatorSet$Node>
        //   10   22:dup             
        //   11   23:aload_1         
        //   12   24:invokespecial   #34  <Method void AnimatorSet$Node(Animator)>
        //   13   27:astore_2        
        //   14   28:aload_0         
        //   15   29:getfield        #12  <Field AnimatorSet this$0>
        //   16   32:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //   17   35:aload_1         
        //   18   36:aload_2         
        //   19   37:invokevirtual   #38  <Method Object HashMap.put(Object, Object)>
        //   20   40:pop             
        //   21   41:aload_0         
        //   22   42:getfield        #12  <Field AnimatorSet this$0>
        //   23   45:invokestatic    #42  <Method ArrayList AnimatorSet.access$6(AnimatorSet)>
        //   24   48:aload_2         
        //   25   49:invokevirtual   #48  <Method boolean ArrayList.add(Object)>
        //   26   52:pop             
        //   27   53:aload_2         
        //   28   54:new             #65  <Class AnimatorSet$Dependency>
        //   29   57:dup             
        //   30   58:aload_0         
        //   31   59:getfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   32   62:iconst_1        
        //   33   63:invokespecial   #68  <Method void AnimatorSet$Dependency(AnimatorSet$Node, int)>
        //   34   66:invokevirtual   #72  <Method void AnimatorSet$Node.addDependency(AnimatorSet$Dependency)>
        //   35   69:aload_0         
        //   36   70:areturn         
        }

        public Builder with(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field AnimatorSet this$0>
        //    2    4:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //    3    7:aload_1         
        //    4    8:invokevirtual   #27  <Method Object HashMap.get(Object)>
        //    5   11:checkcast       #29  <Class AnimatorSet$Node>
        //    6   14:astore_2        
        //    7   15:aload_2         
        //    8   16:ifnonnull       53
        //    9   19:new             #29  <Class AnimatorSet$Node>
        //   10   22:dup             
        //   11   23:aload_1         
        //   12   24:invokespecial   #34  <Method void AnimatorSet$Node(Animator)>
        //   13   27:astore_2        
        //   14   28:aload_0         
        //   15   29:getfield        #12  <Field AnimatorSet this$0>
        //   16   32:invokestatic    #21  <Method HashMap AnimatorSet.access$3(AnimatorSet)>
        //   17   35:aload_1         
        //   18   36:aload_2         
        //   19   37:invokevirtual   #38  <Method Object HashMap.put(Object, Object)>
        //   20   40:pop             
        //   21   41:aload_0         
        //   22   42:getfield        #12  <Field AnimatorSet this$0>
        //   23   45:invokestatic    #42  <Method ArrayList AnimatorSet.access$6(AnimatorSet)>
        //   24   48:aload_2         
        //   25   49:invokevirtual   #48  <Method boolean ArrayList.add(Object)>
        //   26   52:pop             
        //   27   53:aload_2         
        //   28   54:new             #65  <Class AnimatorSet$Dependency>
        //   29   57:dup             
        //   30   58:aload_0         
        //   31   59:getfield        #31  <Field AnimatorSet$Node mCurrentNode>
        //   32   62:iconst_0        
        //   33   63:invokespecial   #68  <Method void AnimatorSet$Dependency(AnimatorSet$Node, int)>
        //   34   66:invokevirtual   #72  <Method void AnimatorSet$Node.addDependency(AnimatorSet$Dependency)>
        //   35   69:aload_0         
        //   36   70:areturn         
        }

        private Node mCurrentNode;
        final AnimatorSet this$0;
    }

    private static class Dependency
    {

        public Dependency(Node node1, int i)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #18  <Field AnimatorSet$Node node>
        //    5    9:aload_0         
        //    6   10:iload_2         
        //    7   11:putfield        #20  <Field int rule>
        //    8   14:return          
        }

        static final int AFTER = 1;
        static final int WITH;
        public Node node;
        public int rule;
    }

    private static class DependencyListener
        implements Animator.AnimatorListener
    {

        public DependencyListener(AnimatorSet animatorset, Node node, int i)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #17  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #19  <Field AnimatorSet mAnimatorSet>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #21  <Field AnimatorSet$Node mNode>
        //    8   14:aload_0         
        //    9   15:iload_3         
        //   10   16:putfield        #23  <Field int mRule>
        //   11   19:return          
        }

        private void startIfReady(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field AnimatorSet mAnimatorSet>
        //    2    4:getfield        #31  <Field boolean AnimatorSet.mTerminated>
        //    3    7:ifeq            11
        //    4   10:return          
        //    5   11:aload_0         
        //    6   12:getfield        #21  <Field AnimatorSet$Node mNode>
        //    7   15:getfield        #37  <Field ArrayList AnimatorSet$Node.tmpDependencies>
        //    8   18:invokevirtual   #43  <Method int ArrayList.size()>
        //    9   21:istore_2        
        //   10   22:iconst_0        
        //   11   23:istore_3        
        //   12   24:aconst_null     
        //   13   25:astore          4
        //   14   27:iload_3         
        //   15   28:iload_2         
        //   16   29:icmplt          87
        //   17   32:aload_0         
        //   18   33:getfield        #21  <Field AnimatorSet$Node mNode>
        //   19   36:getfield        #37  <Field ArrayList AnimatorSet$Node.tmpDependencies>
        //   20   39:aload           4
        //   21   41:invokevirtual   #47  <Method boolean ArrayList.remove(Object)>
        //   22   44:pop             
        //   23   45:aload_0         
        //   24   46:getfield        #21  <Field AnimatorSet$Node mNode>
        //   25   49:getfield        #37  <Field ArrayList AnimatorSet$Node.tmpDependencies>
        //   26   52:invokevirtual   #43  <Method int ArrayList.size()>
        //   27   55:ifne            10
        //   28   58:aload_0         
        //   29   59:getfield        #21  <Field AnimatorSet$Node mNode>
        //   30   62:getfield        #51  <Field Animator AnimatorSet$Node.animation>
        //   31   65:invokevirtual   #56  <Method void Animator.start()>
        //   32   68:aload_0         
        //   33   69:getfield        #19  <Field AnimatorSet mAnimatorSet>
        //   34   72:invokestatic    #60  <Method ArrayList AnimatorSet.access$2(AnimatorSet)>
        //   35   75:aload_0         
        //   36   76:getfield        #21  <Field AnimatorSet$Node mNode>
        //   37   79:getfield        #51  <Field Animator AnimatorSet$Node.animation>
        //   38   82:invokevirtual   #63  <Method boolean ArrayList.add(Object)>
        //   39   85:pop             
        //   40   86:return          
        //   41   87:aload_0         
        //   42   88:getfield        #21  <Field AnimatorSet$Node mNode>
        //   43   91:getfield        #37  <Field ArrayList AnimatorSet$Node.tmpDependencies>
        //   44   94:iload_3         
        //   45   95:invokevirtual   #67  <Method Object ArrayList.get(int)>
        //   46   98:checkcast       #69  <Class AnimatorSet$Dependency>
        //   47  101:astore          5
        //   48  103:aload           5
        //   49  105:getfield        #72  <Field int AnimatorSet$Dependency.rule>
        //   50  108:aload_0         
        //   51  109:getfield        #23  <Field int mRule>
        //   52  112:icmpne          139
        //   53  115:aload           5
        //   54  117:getfield        #75  <Field AnimatorSet$Node AnimatorSet$Dependency.node>
        //   55  120:getfield        #51  <Field Animator AnimatorSet$Node.animation>
        //   56  123:aload_1         
        //   57  124:if_acmpne       139
        //   58  127:aload           5
        //   59  129:astore          4
        //   60  131:aload_1         
        //   61  132:aload_0         
        //   62  133:invokevirtual   #79  <Method void Animator.removeListener(Animator$AnimatorListener)>
        //   63  136:goto            32
        //   64  139:iinc            3  1
        //   65  142:goto            24
        }

        public void onAnimationCancel(Animator animator)
        {
        //    0    0:return          
        }

        public void onAnimationEnd(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field int mRule>
        //    2    4:iconst_1        
        //    3    5:icmpne          13
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:invokespecial   #83  <Method void startIfReady(Animator)>
        //    7   13:return          
        }

        public void onAnimationRepeat(Animator animator)
        {
        //    0    0:return          
        }

        public void onAnimationStart(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field int mRule>
        //    2    4:ifne            12
        //    3    7:aload_0         
        //    4    8:aload_1         
        //    5    9:invokespecial   #83  <Method void startIfReady(Animator)>
        //    6   12:return          
        }

        private AnimatorSet mAnimatorSet;
        private Node mNode;
        private int mRule;
    }

    private static class Node
        implements Cloneable
    {

        public Node(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #22  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aconst_null     
        //    4    6:putfield        #24  <Field ArrayList dependencies>
        //    5    9:aload_0         
        //    6   10:aconst_null     
        //    7   11:putfield        #26  <Field ArrayList tmpDependencies>
        //    8   14:aload_0         
        //    9   15:aconst_null     
        //   10   16:putfield        #28  <Field ArrayList nodeDependencies>
        //   11   19:aload_0         
        //   12   20:aconst_null     
        //   13   21:putfield        #30  <Field ArrayList nodeDependents>
        //   14   24:aload_0         
        //   15   25:iconst_0        
        //   16   26:putfield        #32  <Field boolean done>
        //   17   29:aload_0         
        //   18   30:aload_1         
        //   19   31:putfield        #34  <Field Animator animation>
        //   20   34:return          
        }

        public void addDependency(Dependency dependency)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field ArrayList dependencies>
        //    2    4:ifnonnull       29
        //    3    7:aload_0         
        //    4    8:new             #38  <Class ArrayList>
        //    5   11:dup             
        //    6   12:invokespecial   #39  <Method void ArrayList()>
        //    7   15:putfield        #24  <Field ArrayList dependencies>
        //    8   18:aload_0         
        //    9   19:new             #38  <Class ArrayList>
        //   10   22:dup             
        //   11   23:invokespecial   #39  <Method void ArrayList()>
        //   12   26:putfield        #28  <Field ArrayList nodeDependencies>
        //   13   29:aload_0         
        //   14   30:getfield        #24  <Field ArrayList dependencies>
        //   15   33:aload_1         
        //   16   34:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
        //   17   37:pop             
        //   18   38:aload_0         
        //   19   39:getfield        #28  <Field ArrayList nodeDependencies>
        //   20   42:aload_1         
        //   21   43:getfield        #49  <Field AnimatorSet$Node AnimatorSet$Dependency.node>
        //   22   46:invokevirtual   #52  <Method boolean ArrayList.contains(Object)>
        //   23   49:ifne            64
        //   24   52:aload_0         
        //   25   53:getfield        #28  <Field ArrayList nodeDependencies>
        //   26   56:aload_1         
        //   27   57:getfield        #49  <Field AnimatorSet$Node AnimatorSet$Dependency.node>
        //   28   60:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
        //   29   63:pop             
        //   30   64:aload_1         
        //   31   65:getfield        #49  <Field AnimatorSet$Node AnimatorSet$Dependency.node>
        //   32   68:astore_3        
        //   33   69:aload_3         
        //   34   70:getfield        #30  <Field ArrayList nodeDependents>
        //   35   73:ifnonnull       87
        //   36   76:aload_3         
        //   37   77:new             #38  <Class ArrayList>
        //   38   80:dup             
        //   39   81:invokespecial   #39  <Method void ArrayList()>
        //   40   84:putfield        #30  <Field ArrayList nodeDependents>
        //   41   87:aload_3         
        //   42   88:getfield        #30  <Field ArrayList nodeDependents>
        //   43   91:aload_0         
        //   44   92:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
        //   45   95:pop             
        //   46   96:return          
        }

        public Node clone()
        {
        // try 0 19 handler(s) 21
        //    0    0:aload_0         
        //    1    1:invokespecial   #59  <Method Object Object.clone()>
        //    2    4:checkcast       #2   <Class AnimatorSet$Node>
        //    3    7:astore_2        
        //    4    8:aload_2         
        //    5    9:aload_0         
        //    6   10:getfield        #34  <Field Animator animation>
        //    7   13:invokevirtual   #64  <Method Animator Animator.clone()>
        //    8   16:putfield        #34  <Field Animator animation>
        //    9   19:aload_2         
        //   10   20:areturn         
        // catch CloneNotSupportedException
        //   11   21:astore_1        
        //   12   22:new             #66  <Class AssertionError>
        //   13   25:dup             
        //   14   26:invokespecial   #67  <Method void AssertionError()>
        //   15   29:athrow          
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #69  <Method AnimatorSet$Node clone()>
        //    2    4:areturn         
        }

        public Animator animation;
        public ArrayList dependencies;
        public boolean done;
        public ArrayList nodeDependencies;
        public ArrayList nodeDependents;
        public ArrayList tmpDependencies;
    }


    public AnimatorSet()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #28  <Method void Animator()>
    //    2    4:aload_0         
    //    3    5:new             #30  <Class ArrayList>
    //    4    8:dup             
    //    5    9:invokespecial   #31  <Method void ArrayList()>
    //    6   12:putfield        #33  <Field ArrayList mPlayingSet>
    //    7   15:aload_0         
    //    8   16:new             #35  <Class HashMap>
    //    9   19:dup             
    //   10   20:invokespecial   #36  <Method void HashMap()>
    //   11   23:putfield        #38  <Field HashMap mNodeMap>
    //   12   26:aload_0         
    //   13   27:new             #30  <Class ArrayList>
    //   14   30:dup             
    //   15   31:invokespecial   #31  <Method void ArrayList()>
    //   16   34:putfield        #40  <Field ArrayList mNodes>
    //   17   37:aload_0         
    //   18   38:new             #30  <Class ArrayList>
    //   19   41:dup             
    //   20   42:invokespecial   #31  <Method void ArrayList()>
    //   21   45:putfield        #42  <Field ArrayList mSortedNodes>
    //   22   48:aload_0         
    //   23   49:iconst_1        
    //   24   50:putfield        #44  <Field boolean mNeedsSort>
    //   25   53:aload_0         
    //   26   54:aconst_null     
    //   27   55:putfield        #46  <Field AnimatorSet$AnimatorSetListener mSetListener>
    //   28   58:aload_0         
    //   29   59:iconst_0        
    //   30   60:putfield        #48  <Field boolean mTerminated>
    //   31   63:aload_0         
    //   32   64:iconst_0        
    //   33   65:putfield        #50  <Field boolean mStarted>
    //   34   68:aload_0         
    //   35   69:lconst_0        
    //   36   70:putfield        #52  <Field long mStartDelay>
    //   37   73:aload_0         
    //   38   74:aconst_null     
    //   39   75:putfield        #54  <Field ValueAnimator mDelayAnim>
    //   40   78:aload_0         
    //   41   79:ldc2w           #55  <Long -1L>
    //   42   82:putfield        #58  <Field long mDuration>
    //   43   85:return          
    }

    static ArrayList access$2(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #33  <Field ArrayList mPlayingSet>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #33  <Field ArrayList mPlayingSet>
    //    5    4:areturn         
    }

    static HashMap access$3(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field HashMap mNodeMap>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #38  <Field HashMap mNodeMap>
    //    5    4:areturn         
    }

    static ArrayList access$4(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field ArrayList mSortedNodes>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #42  <Field ArrayList mSortedNodes>
    //    5    4:areturn         
    }

    static void access$5(AnimatorSet animatorset, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #50  <Field boolean mStarted>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:putfield        #50  <Field boolean mStarted>
    //    7    5:return          
    }

    static ArrayList access$6(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field ArrayList mNodes>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #40  <Field ArrayList mNodes>
    //    5    4:areturn         
    }

    private void sortNodes()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field boolean mNeedsSort>
    //    2    4:ifeq            283
    //    3    7:aload_0         
    //    4    8:getfield        #42  <Field ArrayList mSortedNodes>
    //    5   11:invokevirtual   #70  <Method void ArrayList.clear()>
    //    6   14:new             #30  <Class ArrayList>
    //    7   17:dup             
    //    8   18:invokespecial   #31  <Method void ArrayList()>
    //    9   21:astore          8
    //   10   23:aload_0         
    //   11   24:getfield        #40  <Field ArrayList mNodes>
    //   12   27:invokevirtual   #74  <Method int ArrayList.size()>
    //   13   30:istore          9
    //   14   32:iconst_0        
    //   15   33:istore          10
    //   16   35:iload           10
    //   17   37:iload           9
    //   18   39:icmplt          91
    //   19   42:new             #30  <Class ArrayList>
    //   20   45:dup             
    //   21   46:invokespecial   #31  <Method void ArrayList()>
    //   22   49:astore          11
    //   23   51:aload           8
    //   24   53:invokevirtual   #74  <Method int ArrayList.size()>
    //   25   56:ifgt            138
    //   26   59:aload_0         
    //   27   60:iconst_0        
    //   28   61:putfield        #44  <Field boolean mNeedsSort>
    //   29   64:aload_0         
    //   30   65:getfield        #42  <Field ArrayList mSortedNodes>
    //   31   68:invokevirtual   #74  <Method int ArrayList.size()>
    //   32   71:aload_0         
    //   33   72:getfield        #40  <Field ArrayList mNodes>
    //   34   75:invokevirtual   #74  <Method int ArrayList.size()>
    //   35   78:icmpeq          298
    //   36   81:new             #76  <Class IllegalStateException>
    //   37   84:dup             
    //   38   85:ldc1            #78  <String "Circular dependencies cannot exist in AnimatorSet">
    //   39   87:invokespecial   #81  <Method void IllegalStateException(String)>
    //   40   90:athrow          
    //   41   91:aload_0         
    //   42   92:getfield        #40  <Field ArrayList mNodes>
    //   43   95:iload           10
    //   44   97:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //   45  100:checkcast       #87  <Class AnimatorSet$Node>
    //   46  103:astore          22
    //   47  105:aload           22
    //   48  107:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //   49  110:ifnull          124
    //   50  113:aload           22
    //   51  115:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //   52  118:invokevirtual   #74  <Method int ArrayList.size()>
    //   53  121:ifne            132
    //   54  124:aload           8
    //   55  126:aload           22
    //   56  128:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //   57  131:pop             
    //   58  132:iinc            10  1
    //   59  135:goto            35
    //   60  138:aload           8
    //   61  140:invokevirtual   #74  <Method int ArrayList.size()>
    //   62  143:istore          12
    //   63  145:iconst_0        
    //   64  146:istore          13
    //   65  148:iload           13
    //   66  150:iload           12
    //   67  152:icmplt          176
    //   68  155:aload           8
    //   69  157:invokevirtual   #70  <Method void ArrayList.clear()>
    //   70  160:aload           8
    //   71  162:aload           11
    //   72  164:invokevirtual   #98  <Method boolean ArrayList.addAll(Collection)>
    //   73  167:pop             
    //   74  168:aload           11
    //   75  170:invokevirtual   #70  <Method void ArrayList.clear()>
    //   76  173:goto            51
    //   77  176:aload           8
    //   78  178:iload           13
    //   79  180:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //   80  183:checkcast       #87  <Class AnimatorSet$Node>
    //   81  186:astore          14
    //   82  188:aload_0         
    //   83  189:getfield        #42  <Field ArrayList mSortedNodes>
    //   84  192:aload           14
    //   85  194:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //   86  197:pop             
    //   87  198:aload           14
    //   88  200:getfield        #101 <Field ArrayList AnimatorSet$Node.nodeDependents>
    //   89  203:ifnull          226
    //   90  206:aload           14
    //   91  208:getfield        #101 <Field ArrayList AnimatorSet$Node.nodeDependents>
    //   92  211:invokevirtual   #74  <Method int ArrayList.size()>
    //   93  214:istore          16
    //   94  216:iconst_0        
    //   95  217:istore          17
    //   96  219:iload           17
    //   97  221:iload           16
    //   98  223:icmplt          232
    //   99  226:iinc            13  1
    //  100  229:goto            148
    //  101  232:aload           14
    //  102  234:getfield        #101 <Field ArrayList AnimatorSet$Node.nodeDependents>
    //  103  237:iload           17
    //  104  239:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //  105  242:checkcast       #87  <Class AnimatorSet$Node>
    //  106  245:astore          18
    //  107  247:aload           18
    //  108  249:getfield        #104 <Field ArrayList AnimatorSet$Node.nodeDependencies>
    //  109  252:aload           14
    //  110  254:invokevirtual   #107 <Method boolean ArrayList.remove(Object)>
    //  111  257:pop             
    //  112  258:aload           18
    //  113  260:getfield        #104 <Field ArrayList AnimatorSet$Node.nodeDependencies>
    //  114  263:invokevirtual   #74  <Method int ArrayList.size()>
    //  115  266:ifne            277
    //  116  269:aload           11
    //  117  271:aload           18
    //  118  273:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //  119  276:pop             
    //  120  277:iinc            17  1
    //  121  280:goto            219
    //  122  283:aload_0         
    //  123  284:getfield        #40  <Field ArrayList mNodes>
    //  124  287:invokevirtual   #74  <Method int ArrayList.size()>
    //  125  290:istore_1        
    //  126  291:iconst_0        
    //  127  292:istore_2        
    //  128  293:iload_2         
    //  129  294:iload_1         
    //  130  295:icmplt          299
    //  131  298:return          
    //  132  299:aload_0         
    //  133  300:getfield        #40  <Field ArrayList mNodes>
    //  134  303:iload_2         
    //  135  304:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //  136  307:checkcast       #87  <Class AnimatorSet$Node>
    //  137  310:astore_3        
    //  138  311:aload_3         
    //  139  312:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  140  315:ifnull          347
    //  141  318:aload_3         
    //  142  319:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  143  322:invokevirtual   #74  <Method int ArrayList.size()>
    //  144  325:ifle            347
    //  145  328:aload_3         
    //  146  329:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  147  332:invokevirtual   #74  <Method int ArrayList.size()>
    //  148  335:istore          4
    //  149  337:iconst_0        
    //  150  338:istore          5
    //  151  340:iload           5
    //  152  342:iload           4
    //  153  344:icmplt          358
    //  154  347:aload_3         
    //  155  348:iconst_0        
    //  156  349:putfield        #110 <Field boolean AnimatorSet$Node.done>
    //  157  352:iinc            2  1
    //  158  355:goto            293
    //  159  358:aload_3         
    //  160  359:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  161  362:iload           5
    //  162  364:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //  163  367:checkcast       #112 <Class AnimatorSet$Dependency>
    //  164  370:astore          6
    //  165  372:aload_3         
    //  166  373:getfield        #104 <Field ArrayList AnimatorSet$Node.nodeDependencies>
    //  167  376:ifnonnull       390
    //  168  379:aload_3         
    //  169  380:new             #30  <Class ArrayList>
    //  170  383:dup             
    //  171  384:invokespecial   #31  <Method void ArrayList()>
    //  172  387:putfield        #104 <Field ArrayList AnimatorSet$Node.nodeDependencies>
    //  173  390:aload_3         
    //  174  391:getfield        #104 <Field ArrayList AnimatorSet$Node.nodeDependencies>
    //  175  394:aload           6
    //  176  396:getfield        #116 <Field AnimatorSet$Node AnimatorSet$Dependency.node>
    //  177  399:invokevirtual   #119 <Method boolean ArrayList.contains(Object)>
    //  178  402:ifne            418
    //  179  405:aload_3         
    //  180  406:getfield        #104 <Field ArrayList AnimatorSet$Node.nodeDependencies>
    //  181  409:aload           6
    //  182  411:getfield        #116 <Field AnimatorSet$Node AnimatorSet$Dependency.node>
    //  183  414:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //  184  417:pop             
    //  185  418:iinc            5  1
    //  186  421:goto            340
    }

    public void cancel()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #48  <Field boolean mTerminated>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #124 <Method boolean isStarted()>
    //    5    9:ifeq            99
    //    6   12:aload_0         
    //    7   13:getfield        #127 <Field ArrayList mListeners>
    //    8   16:astore_1        
    //    9   17:aconst_null     
    //   10   18:astore_2        
    //   11   19:aload_1         
    //   12   20:ifnull          50
    //   13   23:aload_0         
    //   14   24:getfield        #127 <Field ArrayList mListeners>
    //   15   27:invokevirtual   #131 <Method Object ArrayList.clone()>
    //   16   30:checkcast       #30  <Class ArrayList>
    //   17   33:astore_2        
    //   18   34:aload_2         
    //   19   35:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   20   38:astore          5
    //   21   40:aload           5
    //   22   42:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   23   47:ifne            100
    //   24   50:aload_0         
    //   25   51:getfield        #54  <Field ValueAnimator mDelayAnim>
    //   26   54:ifnull          119
    //   27   57:aload_0         
    //   28   58:getfield        #54  <Field ValueAnimator mDelayAnim>
    //   29   61:invokevirtual   #145 <Method boolean ValueAnimator.isRunning()>
    //   30   64:ifeq            119
    //   31   67:aload_0         
    //   32   68:getfield        #54  <Field ValueAnimator mDelayAnim>
    //   33   71:invokevirtual   #147 <Method void ValueAnimator.cancel()>
    //   34   74:aload_2         
    //   35   75:ifnull          94
    //   36   78:aload_2         
    //   37   79:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   38   82:astore          4
    //   39   84:aload           4
    //   40   86:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   41   91:ifne            164
    //   42   94:aload_0         
    //   43   95:iconst_0        
    //   44   96:putfield        #50  <Field boolean mStarted>
    //   45   99:return          
    //   46  100:aload           5
    //   47  102:invokeinterface #150 <Method Object Iterator.next()>
    //   48  107:checkcast       #152 <Class Animator$AnimatorListener>
    //   49  110:aload_0         
    //   50  111:invokeinterface #156 <Method void Animator$AnimatorListener.onAnimationCancel(Animator)>
    //   51  116:goto            40
    //   52  119:aload_0         
    //   53  120:getfield        #42  <Field ArrayList mSortedNodes>
    //   54  123:invokevirtual   #74  <Method int ArrayList.size()>
    //   55  126:ifle            74
    //   56  129:aload_0         
    //   57  130:getfield        #42  <Field ArrayList mSortedNodes>
    //   58  133:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   59  136:astore_3        
    //   60  137:aload_3         
    //   61  138:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   62  143:ifeq            74
    //   63  146:aload_3         
    //   64  147:invokeinterface #150 <Method Object Iterator.next()>
    //   65  152:checkcast       #87  <Class AnimatorSet$Node>
    //   66  155:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   67  158:invokevirtual   #161 <Method void Animator.cancel()>
    //   68  161:goto            137
    //   69  164:aload           4
    //   70  166:invokeinterface #150 <Method Object Iterator.next()>
    //   71  171:checkcast       #152 <Class Animator$AnimatorListener>
    //   72  174:aload_0         
    //   73  175:invokeinterface #164 <Method void Animator$AnimatorListener.onAnimationEnd(Animator)>
    //   74  180:goto            84
    }

    public volatile Animator clone()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #168 <Method AnimatorSet clone()>
    //    2    4:areturn         
    }

    public AnimatorSet clone()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #170 <Method Animator Animator.clone()>
    //    2    4:checkcast       #2   <Class AnimatorSet>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:iconst_1        
    //    6   10:putfield        #44  <Field boolean mNeedsSort>
    //    7   13:aload_1         
    //    8   14:iconst_0        
    //    9   15:putfield        #48  <Field boolean mTerminated>
    //   10   18:aload_1         
    //   11   19:iconst_0        
    //   12   20:putfield        #50  <Field boolean mStarted>
    //   13   23:aload_1         
    //   14   24:new             #30  <Class ArrayList>
    //   15   27:dup             
    //   16   28:invokespecial   #31  <Method void ArrayList()>
    //   17   31:putfield        #33  <Field ArrayList mPlayingSet>
    //   18   34:aload_1         
    //   19   35:new             #35  <Class HashMap>
    //   20   38:dup             
    //   21   39:invokespecial   #36  <Method void HashMap()>
    //   22   42:putfield        #38  <Field HashMap mNodeMap>
    //   23   45:aload_1         
    //   24   46:new             #30  <Class ArrayList>
    //   25   49:dup             
    //   26   50:invokespecial   #31  <Method void ArrayList()>
    //   27   53:putfield        #40  <Field ArrayList mNodes>
    //   28   56:aload_1         
    //   29   57:new             #30  <Class ArrayList>
    //   30   60:dup             
    //   31   61:invokespecial   #31  <Method void ArrayList()>
    //   32   64:putfield        #42  <Field ArrayList mSortedNodes>
    //   33   67:new             #35  <Class HashMap>
    //   34   70:dup             
    //   35   71:invokespecial   #36  <Method void HashMap()>
    //   36   74:astore_2        
    //   37   75:aload_0         
    //   38   76:getfield        #40  <Field ArrayList mNodes>
    //   39   79:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   40   82:astore_3        
    //   41   83:aload_3         
    //   42   84:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   43   89:ifne            113
    //   44   92:aload_0         
    //   45   93:getfield        #40  <Field ArrayList mNodes>
    //   46   96:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   47   99:astore          16
    //   48  101:aload           16
    //   49  103:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   50  108:ifne            310
    //   51  111:aload_1         
    //   52  112:areturn         
    //   53  113:aload_3         
    //   54  114:invokeinterface #150 <Method Object Iterator.next()>
    //   55  119:checkcast       #87  <Class AnimatorSet$Node>
    //   56  122:astore          4
    //   57  124:aload           4
    //   58  126:invokevirtual   #173 <Method AnimatorSet$Node AnimatorSet$Node.clone()>
    //   59  129:astore          5
    //   60  131:aload_2         
    //   61  132:aload           4
    //   62  134:aload           5
    //   63  136:invokevirtual   #177 <Method Object HashMap.put(Object, Object)>
    //   64  139:pop             
    //   65  140:aload_1         
    //   66  141:getfield        #40  <Field ArrayList mNodes>
    //   67  144:aload           5
    //   68  146:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //   69  149:pop             
    //   70  150:aload_1         
    //   71  151:getfield        #38  <Field HashMap mNodeMap>
    //   72  154:aload           5
    //   73  156:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   74  159:aload           5
    //   75  161:invokevirtual   #177 <Method Object HashMap.put(Object, Object)>
    //   76  164:pop             
    //   77  165:aload           5
    //   78  167:aconst_null     
    //   79  168:putfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //   80  171:aload           5
    //   81  173:aconst_null     
    //   82  174:putfield        #180 <Field ArrayList AnimatorSet$Node.tmpDependencies>
    //   83  177:aload           5
    //   84  179:aconst_null     
    //   85  180:putfield        #101 <Field ArrayList AnimatorSet$Node.nodeDependents>
    //   86  183:aload           5
    //   87  185:aconst_null     
    //   88  186:putfield        #104 <Field ArrayList AnimatorSet$Node.nodeDependencies>
    //   89  189:aload           5
    //   90  191:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   91  194:invokevirtual   #184 <Method ArrayList Animator.getListeners()>
    //   92  197:astore          9
    //   93  199:aload           9
    //   94  201:ifnull          83
    //   95  204:aconst_null     
    //   96  205:astore          10
    //   97  207:aload           9
    //   98  209:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   99  212:astore          11
    //  100  214:aload           11
    //  101  216:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //  102  221:ifne            265
    //  103  224:aload           10
    //  104  226:ifnull          83
    //  105  229:aload           10
    //  106  231:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //  107  234:astore          14
    //  108  236:aload           14
    //  109  238:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //  110  243:ifeq            83
    //  111  246:aload           9
    //  112  248:aload           14
    //  113  250:invokeinterface #150 <Method Object Iterator.next()>
    //  114  255:checkcast       #152 <Class Animator$AnimatorListener>
    //  115  258:invokevirtual   #107 <Method boolean ArrayList.remove(Object)>
    //  116  261:pop             
    //  117  262:goto            236
    //  118  265:aload           11
    //  119  267:invokeinterface #150 <Method Object Iterator.next()>
    //  120  272:checkcast       #152 <Class Animator$AnimatorListener>
    //  121  275:astore          12
    //  122  277:aload           12
    //  123  279:instanceof      #186 <Class AnimatorSet$AnimatorSetListener>
    //  124  282:ifeq            214
    //  125  285:aload           10
    //  126  287:ifnonnull       299
    //  127  290:new             #30  <Class ArrayList>
    //  128  293:dup             
    //  129  294:invokespecial   #31  <Method void ArrayList()>
    //  130  297:astore          10
    //  131  299:aload           10
    //  132  301:aload           12
    //  133  303:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //  134  306:pop             
    //  135  307:goto            214
    //  136  310:aload           16
    //  137  312:invokeinterface #150 <Method Object Iterator.next()>
    //  138  317:checkcast       #87  <Class AnimatorSet$Node>
    //  139  320:astore          17
    //  140  322:aload_2         
    //  141  323:aload           17
    //  142  325:invokevirtual   #189 <Method Object HashMap.get(Object)>
    //  143  328:checkcast       #87  <Class AnimatorSet$Node>
    //  144  331:astore          18
    //  145  333:aload           17
    //  146  335:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  147  338:ifnull          101
    //  148  341:aload           17
    //  149  343:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  150  346:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //  151  349:astore          19
    //  152  351:aload           19
    //  153  353:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //  154  358:ifeq            101
    //  155  361:aload           19
    //  156  363:invokeinterface #150 <Method Object Iterator.next()>
    //  157  368:checkcast       #112 <Class AnimatorSet$Dependency>
    //  158  371:astore          20
    //  159  373:aload           18
    //  160  375:new             #112 <Class AnimatorSet$Dependency>
    //  161  378:dup             
    //  162  379:aload_2         
    //  163  380:aload           20
    //  164  382:getfield        #116 <Field AnimatorSet$Node AnimatorSet$Dependency.node>
    //  165  385:invokevirtual   #189 <Method Object HashMap.get(Object)>
    //  166  388:checkcast       #87  <Class AnimatorSet$Node>
    //  167  391:aload           20
    //  168  393:getfield        #193 <Field int AnimatorSet$Dependency.rule>
    //  169  396:invokespecial   #196 <Method void AnimatorSet$Dependency(AnimatorSet$Node, int)>
    //  170  399:invokevirtual   #200 <Method void AnimatorSet$Node.addDependency(AnimatorSet$Dependency)>
    //  171  402:goto            351
    }

    public void end()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #48  <Field boolean mTerminated>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #124 <Method boolean isStarted()>
    //    5    9:ifeq            126
    //    6   12:aload_0         
    //    7   13:getfield        #42  <Field ArrayList mSortedNodes>
    //    8   16:invokevirtual   #74  <Method int ArrayList.size()>
    //    9   19:aload_0         
    //   10   20:getfield        #40  <Field ArrayList mNodes>
    //   11   23:invokevirtual   #74  <Method int ArrayList.size()>
    //   12   26:icmpeq          50
    //   13   29:aload_0         
    //   14   30:invokespecial   #203 <Method void sortNodes()>
    //   15   33:aload_0         
    //   16   34:getfield        #42  <Field ArrayList mSortedNodes>
    //   17   37:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   18   40:astore_3        
    //   19   41:aload_3         
    //   20   42:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   21   47:ifne            127
    //   22   50:aload_0         
    //   23   51:getfield        #54  <Field ValueAnimator mDelayAnim>
    //   24   54:ifnull          64
    //   25   57:aload_0         
    //   26   58:getfield        #54  <Field ValueAnimator mDelayAnim>
    //   27   61:invokevirtual   #147 <Method void ValueAnimator.cancel()>
    //   28   64:aload_0         
    //   29   65:getfield        #42  <Field ArrayList mSortedNodes>
    //   30   68:invokevirtual   #74  <Method int ArrayList.size()>
    //   31   71:ifle            91
    //   32   74:aload_0         
    //   33   75:getfield        #42  <Field ArrayList mSortedNodes>
    //   34   78:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   35   81:astore_2        
    //   36   82:aload_2         
    //   37   83:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   38   88:ifne            173
    //   39   91:aload_0         
    //   40   92:getfield        #127 <Field ArrayList mListeners>
    //   41   95:ifnull          121
    //   42   98:aload_0         
    //   43   99:getfield        #127 <Field ArrayList mListeners>
    //   44  102:invokevirtual   #131 <Method Object ArrayList.clone()>
    //   45  105:checkcast       #30  <Class ArrayList>
    //   46  108:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   47  111:astore_1        
    //   48  112:aload_1         
    //   49  113:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   50  118:ifne            191
    //   51  121:aload_0         
    //   52  122:iconst_0        
    //   53  123:putfield        #50  <Field boolean mStarted>
    //   54  126:return          
    //   55  127:aload_3         
    //   56  128:invokeinterface #150 <Method Object Iterator.next()>
    //   57  133:checkcast       #87  <Class AnimatorSet$Node>
    //   58  136:astore          4
    //   59  138:aload_0         
    //   60  139:getfield        #46  <Field AnimatorSet$AnimatorSetListener mSetListener>
    //   61  142:ifnonnull       158
    //   62  145:aload_0         
    //   63  146:new             #186 <Class AnimatorSet$AnimatorSetListener>
    //   64  149:dup             
    //   65  150:aload_0         
    //   66  151:aload_0         
    //   67  152:invokespecial   #206 <Method void AnimatorSet$AnimatorSetListener(AnimatorSet, AnimatorSet)>
    //   68  155:putfield        #46  <Field AnimatorSet$AnimatorSetListener mSetListener>
    //   69  158:aload           4
    //   70  160:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   71  163:aload_0         
    //   72  164:getfield        #46  <Field AnimatorSet$AnimatorSetListener mSetListener>
    //   73  167:invokevirtual   #210 <Method void Animator.addListener(Animator$AnimatorListener)>
    //   74  170:goto            41
    //   75  173:aload_2         
    //   76  174:invokeinterface #150 <Method Object Iterator.next()>
    //   77  179:checkcast       #87  <Class AnimatorSet$Node>
    //   78  182:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   79  185:invokevirtual   #212 <Method void Animator.end()>
    //   80  188:goto            82
    //   81  191:aload_1         
    //   82  192:invokeinterface #150 <Method Object Iterator.next()>
    //   83  197:checkcast       #152 <Class Animator$AnimatorListener>
    //   84  200:aload_0         
    //   85  201:invokeinterface #164 <Method void Animator$AnimatorListener.onAnimationEnd(Animator)>
    //   86  206:goto            112
    }

    public ArrayList getChildAnimations()
    {
    //    0    0:new             #30  <Class ArrayList>
    //    1    3:dup             
    //    2    4:invokespecial   #31  <Method void ArrayList()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:getfield        #40  <Field ArrayList mNodes>
    //    6   12:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //    7   15:astore_2        
    //    8   16:aload_2         
    //    9   17:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   10   22:ifne            27
    //   11   25:aload_1         
    //   12   26:areturn         
    //   13   27:aload_1         
    //   14   28:aload_2         
    //   15   29:invokeinterface #150 <Method Object Iterator.next()>
    //   16   34:checkcast       #87  <Class AnimatorSet$Node>
    //   17   37:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   18   40:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //   19   43:pop             
    //   20   44:goto            16
    }

    public long getDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field long mDuration>
    //    2    4:lreturn         
    }

    public long getStartDelay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field long mStartDelay>
    //    2    4:lreturn         
    }

    public boolean isRunning()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field ArrayList mNodes>
    //    2    4:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //    6   14:ifne            19
    //    7   17:iconst_0        
    //    8   18:ireturn         
    //    9   19:aload_1         
    //   10   20:invokeinterface #150 <Method Object Iterator.next()>
    //   11   25:checkcast       #87  <Class AnimatorSet$Node>
    //   12   28:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   13   31:invokevirtual   #217 <Method boolean Animator.isRunning()>
    //   14   34:ifeq            8
    //   15   37:iconst_1        
    //   16   38:ireturn         
    }

    public boolean isStarted()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #50  <Field boolean mStarted>
    //    2    4:ireturn         
    }

    public Builder play(Animator animator)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          19
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #44  <Field boolean mNeedsSort>
    //    5    9:new             #221 <Class AnimatorSet$Builder>
    //    6   12:dup             
    //    7   13:aload_0         
    //    8   14:aload_1         
    //    9   15:invokespecial   #224 <Method void AnimatorSet$Builder(AnimatorSet, Animator)>
    //   10   18:areturn         
    //   11   19:aconst_null     
    //   12   20:areturn         
    }

    public void playSequentially(List list)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          43
    //    2    4:aload_1         
    //    3    5:invokeinterface #229 <Method int List.size()>
    //    4   10:ifle            43
    //    5   13:aload_0         
    //    6   14:iconst_1        
    //    7   15:putfield        #44  <Field boolean mNeedsSort>
    //    8   18:aload_1         
    //    9   19:invokeinterface #229 <Method int List.size()>
    //   10   24:iconst_1        
    //   11   25:icmpne          44
    //   12   28:aload_0         
    //   13   29:aload_1         
    //   14   30:iconst_0        
    //   15   31:invokeinterface #230 <Method Object List.get(int)>
    //   16   36:checkcast       #4   <Class Animator>
    //   17   39:invokevirtual   #232 <Method AnimatorSet$Builder play(Animator)>
    //   18   42:pop             
    //   19   43:return          
    //   20   44:iconst_0        
    //   21   45:istore_2        
    //   22   46:iload_2         
    //   23   47:iconst_m1       
    //   24   48:aload_1         
    //   25   49:invokeinterface #229 <Method int List.size()>
    //   26   54:iadd            
    //   27   55:icmpge          43
    //   28   58:aload_0         
    //   29   59:aload_1         
    //   30   60:iload_2         
    //   31   61:invokeinterface #230 <Method Object List.get(int)>
    //   32   66:checkcast       #4   <Class Animator>
    //   33   69:invokevirtual   #232 <Method AnimatorSet$Builder play(Animator)>
    //   34   72:aload_1         
    //   35   73:iload_2         
    //   36   74:iconst_1        
    //   37   75:iadd            
    //   38   76:invokeinterface #230 <Method Object List.get(int)>
    //   39   81:checkcast       #4   <Class Animator>
    //   40   84:invokevirtual   #235 <Method AnimatorSet$Builder AnimatorSet$Builder.before(Animator)>
    //   41   87:pop             
    //   42   88:iinc            2  1
    //   43   91:goto            46
    }

    public transient void playSequentially(Animator aanimator[])
    {
    //    0    0:aload_1         
    //    1    1:ifnull          23
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #44  <Field boolean mNeedsSort>
    //    5    9:aload_1         
    //    6   10:arraylength     
    //    7   11:iconst_1        
    //    8   12:icmpne          24
    //    9   15:aload_0         
    //   10   16:aload_1         
    //   11   17:iconst_0        
    //   12   18:aaload          
    //   13   19:invokevirtual   #232 <Method AnimatorSet$Builder play(Animator)>
    //   14   22:pop             
    //   15   23:return          
    //   16   24:iconst_0        
    //   17   25:istore_2        
    //   18   26:iload_2         
    //   19   27:iconst_m1       
    //   20   28:aload_1         
    //   21   29:arraylength     
    //   22   30:iadd            
    //   23   31:icmpge          23
    //   24   34:aload_0         
    //   25   35:aload_1         
    //   26   36:iload_2         
    //   27   37:aaload          
    //   28   38:invokevirtual   #232 <Method AnimatorSet$Builder play(Animator)>
    //   29   41:aload_1         
    //   30   42:iload_2         
    //   31   43:iconst_1        
    //   32   44:iadd            
    //   33   45:aaload          
    //   34   46:invokevirtual   #235 <Method AnimatorSet$Builder AnimatorSet$Builder.before(Animator)>
    //   35   49:pop             
    //   36   50:iinc            2  1
    //   37   53:goto            26
    }

    public void playTogether(Collection collection)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          36
    //    2    4:aload_1         
    //    3    5:invokeinterface #241 <Method int Collection.size()>
    //    4   10:ifle            36
    //    5   13:aload_0         
    //    6   14:iconst_1        
    //    7   15:putfield        #44  <Field boolean mNeedsSort>
    //    8   18:aconst_null     
    //    9   19:astore_2        
    //   10   20:aload_1         
    //   11   21:invokeinterface #242 <Method Iterator Collection.iterator()>
    //   12   26:astore_3        
    //   13   27:aload_3         
    //   14   28:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   15   33:ifne            37
    //   16   36:return          
    //   17   37:aload_3         
    //   18   38:invokeinterface #150 <Method Object Iterator.next()>
    //   19   43:checkcast       #4   <Class Animator>
    //   20   46:astore          4
    //   21   48:aload_2         
    //   22   49:ifnonnull       62
    //   23   52:aload_0         
    //   24   53:aload           4
    //   25   55:invokevirtual   #232 <Method AnimatorSet$Builder play(Animator)>
    //   26   58:astore_2        
    //   27   59:goto            27
    //   28   62:aload_2         
    //   29   63:aload           4
    //   30   65:invokevirtual   #245 <Method AnimatorSet$Builder AnimatorSet$Builder.with(Animator)>
    //   31   68:pop             
    //   32   69:goto            27
    }

    public transient void playTogether(Animator aanimator[])
    {
    //    0    0:aload_1         
    //    1    1:ifnull          25
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #44  <Field boolean mNeedsSort>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:iconst_0        
    //    8   12:aaload          
    //    9   13:invokevirtual   #232 <Method AnimatorSet$Builder play(Animator)>
    //   10   16:astore_2        
    //   11   17:iconst_1        
    //   12   18:istore_3        
    //   13   19:iload_3         
    //   14   20:aload_1         
    //   15   21:arraylength     
    //   16   22:icmplt          26
    //   17   25:return          
    //   18   26:aload_2         
    //   19   27:aload_1         
    //   20   28:iload_3         
    //   21   29:aaload          
    //   22   30:invokevirtual   #245 <Method AnimatorSet$Builder AnimatorSet$Builder.with(Animator)>
    //   23   33:pop             
    //   24   34:iinc            3  1
    //   25   37:goto            19
    }

    public volatile Animator setDuration(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokevirtual   #250 <Method AnimatorSet setDuration(long)>
    //    3    5:areturn         
    }

    public AnimatorSet setDuration(long l)
    {
    //    0    0:lload_1         
    //    1    1:lconst_0        
    //    2    2:lcmp            
    //    3    3:ifge            16
    //    4    6:new             #252 <Class IllegalArgumentException>
    //    5    9:dup             
    //    6   10:ldc1            #254 <String "duration must be a value of zero or greater">
    //    7   12:invokespecial   #255 <Method void IllegalArgumentException(String)>
    //    8   15:athrow          
    //    9   16:aload_0         
    //   10   17:getfield        #40  <Field ArrayList mNodes>
    //   11   20:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   12   23:astore_3        
    //   13   24:aload_3         
    //   14   25:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   15   30:ifne            40
    //   16   33:aload_0         
    //   17   34:lload_1         
    //   18   35:putfield        #58  <Field long mDuration>
    //   19   38:aload_0         
    //   20   39:areturn         
    //   21   40:aload_3         
    //   22   41:invokeinterface #150 <Method Object Iterator.next()>
    //   23   46:checkcast       #87  <Class AnimatorSet$Node>
    //   24   49:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   25   52:lload_1         
    //   26   53:invokevirtual   #257 <Method Animator Animator.setDuration(long)>
    //   27   56:pop             
    //   28   57:goto            24
    }

    public void setInterpolator(Interpolator interpolator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field ArrayList mNodes>
    //    2    4:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //    6   14:ifne            18
    //    7   17:return          
    //    8   18:aload_2         
    //    9   19:invokeinterface #150 <Method Object Iterator.next()>
    //   10   24:checkcast       #87  <Class AnimatorSet$Node>
    //   11   27:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   12   30:aload_1         
    //   13   31:invokevirtual   #261 <Method void Animator.setInterpolator(Interpolator)>
    //   14   34:goto            8
    }

    public void setStartDelay(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:putfield        #52  <Field long mStartDelay>
    //    3    5:return          
    }

    public void setTarget(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field ArrayList mNodes>
    //    2    4:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //    6   14:ifne            18
    //    7   17:return          
    //    8   18:aload_2         
    //    9   19:invokeinterface #150 <Method Object Iterator.next()>
    //   10   24:checkcast       #87  <Class AnimatorSet$Node>
    //   11   27:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   12   30:astore_3        
    //   13   31:aload_3         
    //   14   32:instanceof      #2   <Class AnimatorSet>
    //   15   35:ifeq            49
    //   16   38:aload_3         
    //   17   39:checkcast       #2   <Class AnimatorSet>
    //   18   42:aload_1         
    //   19   43:invokevirtual   #267 <Method void setTarget(Object)>
    //   20   46:goto            8
    //   21   49:aload_3         
    //   22   50:instanceof      #269 <Class ObjectAnimator>
    //   23   53:ifeq            8
    //   24   56:aload_3         
    //   25   57:checkcast       #269 <Class ObjectAnimator>
    //   26   60:aload_1         
    //   27   61:invokevirtual   #270 <Method void ObjectAnimator.setTarget(Object)>
    //   28   64:goto            8
    }

    public void setupEndValues()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field ArrayList mNodes>
    //    2    4:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //    6   14:ifne            18
    //    7   17:return          
    //    8   18:aload_1         
    //    9   19:invokeinterface #150 <Method Object Iterator.next()>
    //   10   24:checkcast       #87  <Class AnimatorSet$Node>
    //   11   27:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   12   30:invokevirtual   #273 <Method void Animator.setupEndValues()>
    //   13   33:goto            8
    }

    public void setupStartValues()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field ArrayList mNodes>
    //    2    4:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //    6   14:ifne            18
    //    7   17:return          
    //    8   18:aload_1         
    //    9   19:invokeinterface #150 <Method Object Iterator.next()>
    //   10   24:checkcast       #87  <Class AnimatorSet$Node>
    //   11   27:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   12   30:invokevirtual   #276 <Method void Animator.setupStartValues()>
    //   13   33:goto            8
    }

    public void start()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #48  <Field boolean mTerminated>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #50  <Field boolean mStarted>
    //    6   10:aload_0         
    //    7   11:invokespecial   #203 <Method void sortNodes()>
    //    8   14:aload_0         
    //    9   15:getfield        #42  <Field ArrayList mSortedNodes>
    //   10   18:invokevirtual   #74  <Method int ArrayList.size()>
    //   11   21:istore_1        
    //   12   22:iconst_0        
    //   13   23:istore_2        
    //   14   24:iload_2         
    //   15   25:iload_1         
    //   16   26:icmplt          168
    //   17   29:new             #30  <Class ArrayList>
    //   18   32:dup             
    //   19   33:invokespecial   #31  <Method void ArrayList()>
    //   20   36:astore_3        
    //   21   37:iconst_0        
    //   22   38:istore          4
    //   23   40:iload           4
    //   24   42:iload_1         
    //   25   43:icmplt          275
    //   26   46:aload_0         
    //   27   47:getfield        #52  <Field long mStartDelay>
    //   28   50:lconst_0        
    //   29   51:lcmp            
    //   30   52:ifgt            475
    //   31   55:aload_3         
    //   32   56:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //   33   59:astore          17
    //   34   61:aload           17
    //   35   63:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //   36   68:ifne            439
    //   37   71:aload_0         
    //   38   72:getfield        #127 <Field ArrayList mListeners>
    //   39   75:ifnull          107
    //   40   78:aload_0         
    //   41   79:getfield        #127 <Field ArrayList mListeners>
    //   42   82:invokevirtual   #131 <Method Object ArrayList.clone()>
    //   43   85:checkcast       #30  <Class ArrayList>
    //   44   88:astore          14
    //   45   90:aload           14
    //   46   92:invokevirtual   #74  <Method int ArrayList.size()>
    //   47   95:istore          15
    //   48   97:iconst_0        
    //   49   98:istore          16
    //   50  100:iload           16
    //   51  102:iload           15
    //   52  104:icmplt          531
    //   53  107:aload_0         
    //   54  108:getfield        #40  <Field ArrayList mNodes>
    //   55  111:invokevirtual   #74  <Method int ArrayList.size()>
    //   56  114:ifne            167
    //   57  117:aload_0         
    //   58  118:getfield        #52  <Field long mStartDelay>
    //   59  121:lconst_0        
    //   60  122:lcmp            
    //   61  123:ifne            167
    //   62  126:aload_0         
    //   63  127:iconst_0        
    //   64  128:putfield        #50  <Field boolean mStarted>
    //   65  131:aload_0         
    //   66  132:getfield        #127 <Field ArrayList mListeners>
    //   67  135:ifnull          167
    //   68  138:aload_0         
    //   69  139:getfield        #127 <Field ArrayList mListeners>
    //   70  142:invokevirtual   #131 <Method Object ArrayList.clone()>
    //   71  145:checkcast       #30  <Class ArrayList>
    //   72  148:astore          11
    //   73  150:aload           11
    //   74  152:invokevirtual   #74  <Method int ArrayList.size()>
    //   75  155:istore          12
    //   76  157:iconst_0        
    //   77  158:istore          13
    //   78  160:iload           13
    //   79  162:iload           12
    //   80  164:icmplt          553
    //   81  167:return          
    //   82  168:aload_0         
    //   83  169:getfield        #42  <Field ArrayList mSortedNodes>
    //   84  172:iload_2         
    //   85  173:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //   86  176:checkcast       #87  <Class AnimatorSet$Node>
    //   87  179:astore          20
    //   88  181:aload           20
    //   89  183:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //   90  186:invokevirtual   #184 <Method ArrayList Animator.getListeners()>
    //   91  189:astore          21
    //   92  191:aload           21
    //   93  193:ifnull          228
    //   94  196:aload           21
    //   95  198:invokevirtual   #74  <Method int ArrayList.size()>
    //   96  201:ifle            228
    //   97  204:new             #30  <Class ArrayList>
    //   98  207:dup             
    //   99  208:aload           21
    //  100  210:invokespecial   #279 <Method void ArrayList(Collection)>
    //  101  213:invokevirtual   #135 <Method Iterator ArrayList.iterator()>
    //  102  216:astore          22
    //  103  218:aload           22
    //  104  220:invokeinterface #140 <Method boolean Iterator.hasNext()>
    //  105  225:ifne            234
    //  106  228:iinc            2  1
    //  107  231:goto            24
    //  108  234:aload           22
    //  109  236:invokeinterface #150 <Method Object Iterator.next()>
    //  110  241:checkcast       #152 <Class Animator$AnimatorListener>
    //  111  244:astore          23
    //  112  246:aload           23
    //  113  248:instanceof      #281 <Class AnimatorSet$DependencyListener>
    //  114  251:ifne            262
    //  115  254:aload           23
    //  116  256:instanceof      #186 <Class AnimatorSet$AnimatorSetListener>
    //  117  259:ifeq            218
    //  118  262:aload           20
    //  119  264:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //  120  267:aload           23
    //  121  269:invokevirtual   #284 <Method void Animator.removeListener(Animator$AnimatorListener)>
    //  122  272:goto            218
    //  123  275:aload_0         
    //  124  276:getfield        #42  <Field ArrayList mSortedNodes>
    //  125  279:iload           4
    //  126  281:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //  127  284:checkcast       #87  <Class AnimatorSet$Node>
    //  128  287:astore          5
    //  129  289:aload_0         
    //  130  290:getfield        #46  <Field AnimatorSet$AnimatorSetListener mSetListener>
    //  131  293:ifnonnull       309
    //  132  296:aload_0         
    //  133  297:new             #186 <Class AnimatorSet$AnimatorSetListener>
    //  134  300:dup             
    //  135  301:aload_0         
    //  136  302:aload_0         
    //  137  303:invokespecial   #206 <Method void AnimatorSet$AnimatorSetListener(AnimatorSet, AnimatorSet)>
    //  138  306:putfield        #46  <Field AnimatorSet$AnimatorSetListener mSetListener>
    //  139  309:aload           5
    //  140  311:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  141  314:ifnull          328
    //  142  317:aload           5
    //  143  319:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  144  322:invokevirtual   #74  <Method int ArrayList.size()>
    //  145  325:ifne            353
    //  146  328:aload_3         
    //  147  329:aload           5
    //  148  331:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //  149  334:pop             
    //  150  335:aload           5
    //  151  337:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //  152  340:aload_0         
    //  153  341:getfield        #46  <Field AnimatorSet$AnimatorSetListener mSetListener>
    //  154  344:invokevirtual   #210 <Method void Animator.addListener(Animator$AnimatorListener)>
    //  155  347:iinc            4  1
    //  156  350:goto            40
    //  157  353:aload           5
    //  158  355:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  159  358:invokevirtual   #74  <Method int ArrayList.size()>
    //  160  361:istore          7
    //  161  363:iconst_0        
    //  162  364:istore          8
    //  163  366:iload           8
    //  164  368:iload           7
    //  165  370:icmplt          392
    //  166  373:aload           5
    //  167  375:aload           5
    //  168  377:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  169  380:invokevirtual   #131 <Method Object ArrayList.clone()>
    //  170  383:checkcast       #30  <Class ArrayList>
    //  171  386:putfield        #180 <Field ArrayList AnimatorSet$Node.tmpDependencies>
    //  172  389:goto            335
    //  173  392:aload           5
    //  174  394:getfield        #90  <Field ArrayList AnimatorSet$Node.dependencies>
    //  175  397:iload           8
    //  176  399:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //  177  402:checkcast       #112 <Class AnimatorSet$Dependency>
    //  178  405:astore          9
    //  179  407:aload           9
    //  180  409:getfield        #116 <Field AnimatorSet$Node AnimatorSet$Dependency.node>
    //  181  412:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //  182  415:new             #281 <Class AnimatorSet$DependencyListener>
    //  183  418:dup             
    //  184  419:aload_0         
    //  185  420:aload           5
    //  186  422:aload           9
    //  187  424:getfield        #193 <Field int AnimatorSet$Dependency.rule>
    //  188  427:invokespecial   #287 <Method void AnimatorSet$DependencyListener(AnimatorSet, AnimatorSet$Node, int)>
    //  189  430:invokevirtual   #210 <Method void Animator.addListener(Animator$AnimatorListener)>
    //  190  433:iinc            8  1
    //  191  436:goto            366
    //  192  439:aload           17
    //  193  441:invokeinterface #150 <Method Object Iterator.next()>
    //  194  446:checkcast       #87  <Class AnimatorSet$Node>
    //  195  449:astore          18
    //  196  451:aload           18
    //  197  453:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //  198  456:invokevirtual   #289 <Method void Animator.start()>
    //  199  459:aload_0         
    //  200  460:getfield        #33  <Field ArrayList mPlayingSet>
    //  201  463:aload           18
    //  202  465:getfield        #160 <Field Animator AnimatorSet$Node.animation>
    //  203  468:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
    //  204  471:pop             
    //  205  472:goto            61
    //  206  475:aload_0         
    //  207  476:iconst_2        
    //  208  477:newarray        float[]
    //  209  479:dup             
    //  210  480:iconst_0        
    //  211  481:fconst_0        
    //  212  482:fastore         
    //  213  483:dup             
    //  214  484:iconst_1        
    //  215  485:fconst_1        
    //  216  486:fastore         
    //  217  487:invokestatic    #293 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
    //  218  490:putfield        #54  <Field ValueAnimator mDelayAnim>
    //  219  493:aload_0         
    //  220  494:getfield        #54  <Field ValueAnimator mDelayAnim>
    //  221  497:aload_0         
    //  222  498:getfield        #52  <Field long mStartDelay>
    //  223  501:invokevirtual   #296 <Method ValueAnimator ValueAnimator.setDuration(long)>
    //  224  504:pop             
    //  225  505:aload_0         
    //  226  506:getfield        #54  <Field ValueAnimator mDelayAnim>
    //  227  509:new             #298 <Class AnimatorSet$1>
    //  228  512:dup             
    //  229  513:aload_0         
    //  230  514:aload_3         
    //  231  515:invokespecial   #301 <Method void AnimatorSet$1(AnimatorSet, ArrayList)>
    //  232  518:invokevirtual   #302 <Method void ValueAnimator.addListener(Animator$AnimatorListener)>
    //  233  521:aload_0         
    //  234  522:getfield        #54  <Field ValueAnimator mDelayAnim>
    //  235  525:invokevirtual   #303 <Method void ValueAnimator.start()>
    //  236  528:goto            71
    //  237  531:aload           14
    //  238  533:iload           16
    //  239  535:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //  240  538:checkcast       #152 <Class Animator$AnimatorListener>
    //  241  541:aload_0         
    //  242  542:invokeinterface #306 <Method void Animator$AnimatorListener.onAnimationStart(Animator)>
    //  243  547:iinc            16  1
    //  244  550:goto            100
    //  245  553:aload           11
    //  246  555:iload           13
    //  247  557:invokevirtual   #85  <Method Object ArrayList.get(int)>
    //  248  560:checkcast       #152 <Class Animator$AnimatorListener>
    //  249  563:aload_0         
    //  250  564:invokeinterface #164 <Method void Animator$AnimatorListener.onAnimationEnd(Animator)>
    //  251  569:iinc            13  1
    //  252  572:goto            160
    }

    private ValueAnimator mDelayAnim;
    private long mDuration;
    private boolean mNeedsSort;
    private HashMap mNodeMap;
    private ArrayList mNodes;
    private ArrayList mPlayingSet;
    private AnimatorSetListener mSetListener;
    private ArrayList mSortedNodes;
    private long mStartDelay;
    private boolean mStarted;
    boolean mTerminated;

    static ArrayList access$2(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #33  <Field ArrayList mPlayingSet>
    //    2    4:areturn         
    }

    static HashMap access$3(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field HashMap mNodeMap>
    //    2    4:areturn         
    }

    static ArrayList access$4(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #42  <Field ArrayList mSortedNodes>
    //    2    4:areturn         
    }

    static void access$5(AnimatorSet animatorset, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #50  <Field boolean mStarted>
    //    3    5:return          
    }

    static ArrayList access$6(AnimatorSet animatorset)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field ArrayList mNodes>
    //    2    4:areturn         
    }

    // Unreferenced inner class com/nineoldandroids/animation/AnimatorSet$1

/* anonymous class */
    class _cls1 extends AnimatorListenerAdapter
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field AnimatorSet this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field ArrayList val$nodesToStart>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void AnimatorListenerAdapter()>
        //    8   14:aload_0         
        //    9   15:iconst_0        
        //   10   16:putfield        #25  <Field boolean canceled>
        //   11   19:return          
        }

        public void onAnimationCancel(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:iconst_1        
        //    2    2:putfield        #25  <Field boolean canceled>
        //    3    5:return          
        }

        public void onAnimationEnd(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field boolean canceled>
        //    2    4:ifne            22
        //    3    7:aload_0         
        //    4    8:getfield        #21  <Field ArrayList val$nodesToStart>
        //    5   11:invokevirtual   #34  <Method int ArrayList.size()>
        //    6   14:istore_2        
        //    7   15:iconst_0        
        //    8   16:istore_3        
        //    9   17:iload_3         
        //   10   18:iload_2         
        //   11   19:icmplt          23
        //   12   22:return          
        //   13   23:aload_0         
        //   14   24:getfield        #21  <Field ArrayList val$nodesToStart>
        //   15   27:iload_3         
        //   16   28:invokevirtual   #38  <Method Object ArrayList.get(int)>
        //   17   31:checkcast       #40  <Class AnimatorSet$Node>
        //   18   34:astore          4
        //   19   36:aload           4
        //   20   38:getfield        #44  <Field Animator AnimatorSet$Node.animation>
        //   21   41:invokevirtual   #47  <Method void Animator.start()>
        //   22   44:aload_0         
        //   23   45:getfield        #19  <Field AnimatorSet this$0>
        //   24   48:invokestatic    #51  <Method ArrayList AnimatorSet.access$2(AnimatorSet)>
        //   25   51:aload           4
        //   26   53:getfield        #44  <Field Animator AnimatorSet$Node.animation>
        //   27   56:invokevirtual   #55  <Method boolean ArrayList.add(Object)>
        //   28   59:pop             
        //   29   60:iinc            3  1
        //   30   63:goto            17
        }

        boolean canceled;
        final AnimatorSet this$0;
        private final ArrayList val$nodesToStart;
    }

}
