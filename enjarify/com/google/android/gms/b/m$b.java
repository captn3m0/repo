package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.c.b;
import com.google.android.gms.common.api.n;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class m$b
  implements com.google.android.gms.c.a
{
  public final void a(b paramb)
  {
    Object localObject1 = a.d;
    ((Lock)localObject1).lock();
    Object localObject4;
    Object localObject5;
    Object localObject6;
    try
    {
      localObject1 = a;
      bool1 = g;
      if (!bool1)
      {
        localObject1 = a.d;
        ((Lock)localObject1).unlock();
        return;
      }
      bool1 = paramb.a();
      if (bool1)
      {
        localObject1 = a;
        localObject4 = new android/support/v4/g/a;
        localObject5 = a;
        localObject5 = b;
        int i = ((Map)localObject5).size();
        ((android.support.v4.g.a)localObject4).<init>(i);
        i = ((Map)localObject4);
        localObject1 = a;
        localObject1 = b;
        localObject1 = ((Map)localObject1).values();
        localObject4 = ((Collection)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject4).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject4).next();
          localObject1 = (l)localObject1;
          localObject5 = a;
          localObject5 = i;
          localObject1 = b;
          localObject6 = com.google.android.gms.common.a.a;
          ((Map)localObject5).put(localObject1, localObject6);
        }
      }
      localObject3 = paramb.b();
    }
    finally
    {
      a.d.unlock();
    }
    Object localObject3;
    boolean bool1 = localObject3 instanceof com.google.android.gms.common.api.m;
    if (bool1)
    {
      localObject3 = paramb.b();
      localObject3 = (com.google.android.gms.common.api.m)localObject3;
      localObject4 = a;
      boolean bool2 = f;
      if (bool2)
      {
        localObject4 = a;
        localObject5 = new android/support/v4/g/a;
        localObject6 = a;
        localObject6 = b;
        int j = ((Map)localObject6).size();
        ((android.support.v4.g.a)localObject5).<init>(j);
        i = ((Map)localObject5);
        localObject4 = a;
        localObject4 = b;
        localObject4 = ((Map)localObject4).values();
        localObject5 = ((Collection)localObject4).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject5).hasNext();
          if (!bool2) {
            break;
          }
          localObject4 = ((Iterator)localObject5).next();
          localObject4 = (l)localObject4;
          localObject6 = b;
          com.google.android.gms.common.a locala = ((com.google.android.gms.common.api.m)localObject3).a((n)localObject4);
          m localm = a;
          bool2 = m.a(localm, (l)localObject4, locala);
          if (bool2)
          {
            localObject4 = a;
            localObject4 = i;
            locala = new com/google/android/gms/common/a;
            int k = 16;
            locala.<init>(k);
            ((Map)localObject4).put(localObject6, locala);
          }
          else
          {
            localObject4 = a;
            localObject4 = i;
            ((Map)localObject4).put(localObject6, locala);
          }
        }
      }
      localObject4 = a;
      localObject3 = a;
    }
    for (i = ((Map)localObject3);; i = ((Map)localObject4))
    {
      localObject3 = a;
      bool1 = ((m)localObject3).c();
      if (bool1)
      {
        localObject3 = a;
        localObject3 = h;
        localObject4 = a;
        localObject4 = i;
        ((Map)localObject3).putAll((Map)localObject4);
        localObject3 = a;
        localObject3 = m.a((m)localObject3);
        if (localObject3 == null)
        {
          localObject3 = a;
          m.b((m)localObject3);
          localObject3 = a;
          m.c((m)localObject3);
          localObject3 = a;
          localObject3 = e;
          ((Condition)localObject3).signalAll();
        }
      }
      localObject3 = a.d;
      ((Lock)localObject3).unlock();
      break;
      localObject3 = "ConnectionlessGAC";
      localObject4 = "Unexpected availability exception";
      localObject5 = paramb.b();
      Log.e((String)localObject3, (String)localObject4, (Throwable)localObject5);
      localObject3 = a;
      localObject4 = Collections.emptyMap();
    }
  }
}


/* Location:              com/google/android/gms/b/m$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */