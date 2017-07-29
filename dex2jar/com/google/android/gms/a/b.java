package com.google.android.gms.a;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class b<T>
  extends a.a
{
  private final T a;
  
  private b(T paramT)
  {
    a = paramT;
  }
  
  public static <T> a a(T paramT)
  {
    return new b(paramT);
  }
  
  public static <T> T a(a parama)
  {
    int j = 0;
    if ((parama instanceof b)) {
      return (T)a;
    }
    IBinder localIBinder = parama.asBinder();
    Field[] arrayOfField = localIBinder.getClass().getDeclaredFields();
    parama = null;
    int k = arrayOfField.length;
    int i = 0;
    if (i < k)
    {
      Field localField = arrayOfField[i];
      if (localField.isSynthetic()) {
        break label169;
      }
      j += 1;
      parama = localField;
    }
    label169:
    for (;;)
    {
      i += 1;
      break;
      if (j == 1)
      {
        if (!parama.isAccessible())
        {
          parama.setAccessible(true);
          try
          {
            parama = parama.get(localIBinder);
            return parama;
          }
          catch (NullPointerException parama)
          {
            throw new IllegalArgumentException("Binder object is null.", parama);
          }
          catch (IllegalAccessException parama)
          {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", parama);
          }
        }
        throw new IllegalArgumentException("IObjectWrapper declared field not private!");
      }
      i = arrayOfField.length;
      throw new IllegalArgumentException(64 + "Unexpected number of IObjectWrapper declared fields: " + i);
    }
  }
}


/* Location:              com/google/android/gms/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */