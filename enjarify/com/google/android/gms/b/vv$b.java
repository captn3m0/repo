package com.google.android.gms.b;

import java.io.FilterInputStream;
import java.io.InputStream;

final class vv$b
  extends FilterInputStream
{
  private int a = 0;
  
  private vv$b(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public final int read()
  {
    int i = super.read();
    int j = -1;
    if (i != j)
    {
      j = a + 1;
      a = j;
    }
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    int j = -1;
    if (i != j)
    {
      j = a + i;
      a = j;
    }
    return i;
  }
}


/* Location:              com/google/android/gms/b/vv$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */