package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract interface sq
  extends IInterface
{
  public abstract void a(a parama);
  
  public abstract void a(a parama, int paramInt);
  
  public abstract void a(a parama, ss paramss);
  
  public abstract void b(a parama);
  
  public abstract void b(a parama, int paramInt);
  
  public abstract void c(a parama);
  
  public abstract void d(a parama);
  
  public abstract void e(a parama);
  
  public abstract void f(a parama);
  
  public abstract void g(a parama);
  
  public static abstract class a
    extends Binder
    implements sq
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }
    
    public static sq a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if ((localIInterface != null) && ((localIInterface instanceof sq))) {
        return (sq)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        a(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        a(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        b(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        c(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        d(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        e(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        a locala = a.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (ss)ss.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(locala, paramParcel1);
          paramParcel2.writeNoException();
          return true;
        }
      case 8: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        f(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        b(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      g(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    
    private static final class a
      implements sq
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      /* Error */
      public final void a(a parama)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   34: iconst_1
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 46 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 49	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	parama	a
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
      
      /* Error */
      public final void a(a parama, int paramInt)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +50 -> 66
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: iload_2
        //   33: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   36: aload_0
        //   37: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   40: iconst_2
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 46 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 49	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 52	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 52	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aconst_null
        //   67: astore_1
        //   68: goto -42 -> 26
        //   71: astore_1
        //   72: aload 4
        //   74: invokevirtual 52	android/os/Parcel:recycle	()V
        //   77: aload_3
        //   78: invokevirtual 52	android/os/Parcel:recycle	()V
        //   81: aload_1
        //   82: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	83	0	this	a
        //   0	83	1	parama	a
        //   0	83	2	paramInt	int
        //   3	75	3	localParcel1	Parcel
        //   7	66	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	71	finally
        //   19	26	71	finally
        //   26	56	71	finally
      }
      
      /* Error */
      public final void a(a parama, ss paramss)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +61 -> 77
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_2
        //   32: ifnull +50 -> 82
        //   35: aload_3
        //   36: iconst_1
        //   37: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   40: aload_2
        //   41: aload_3
        //   42: iconst_0
        //   43: invokevirtual 64	com/google/android/gms/b/ss:writeToParcel	(Landroid/os/Parcel;I)V
        //   46: aload_0
        //   47: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   50: bipush 7
        //   52: aload_3
        //   53: aload 4
        //   55: iconst_0
        //   56: invokeinterface 46 5 0
        //   61: pop
        //   62: aload 4
        //   64: invokevirtual 49	android/os/Parcel:readException	()V
        //   67: aload 4
        //   69: invokevirtual 52	android/os/Parcel:recycle	()V
        //   72: aload_3
        //   73: invokevirtual 52	android/os/Parcel:recycle	()V
        //   76: return
        //   77: aconst_null
        //   78: astore_1
        //   79: goto -53 -> 26
        //   82: aload_3
        //   83: iconst_0
        //   84: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   87: goto -41 -> 46
        //   90: astore_1
        //   91: aload 4
        //   93: invokevirtual 52	android/os/Parcel:recycle	()V
        //   96: aload_3
        //   97: invokevirtual 52	android/os/Parcel:recycle	()V
        //   100: aload_1
        //   101: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	102	0	this	a
        //   0	102	1	parama	a
        //   0	102	2	paramss	ss
        //   3	94	3	localParcel1	Parcel
        //   7	85	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	90	finally
        //   19	26	90	finally
        //   26	31	90	finally
        //   35	46	90	finally
        //   46	67	90	finally
        //   82	87	90	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
      
      /* Error */
      public final void b(a parama)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   34: iconst_3
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 46 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 49	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	parama	a
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
      
      /* Error */
      public final void b(a parama, int paramInt)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +51 -> 67
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: iload_2
        //   33: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   36: aload_0
        //   37: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   40: bipush 9
        //   42: aload_3
        //   43: aload 4
        //   45: iconst_0
        //   46: invokeinterface 46 5 0
        //   51: pop
        //   52: aload 4
        //   54: invokevirtual 49	android/os/Parcel:readException	()V
        //   57: aload 4
        //   59: invokevirtual 52	android/os/Parcel:recycle	()V
        //   62: aload_3
        //   63: invokevirtual 52	android/os/Parcel:recycle	()V
        //   66: return
        //   67: aconst_null
        //   68: astore_1
        //   69: goto -43 -> 26
        //   72: astore_1
        //   73: aload 4
        //   75: invokevirtual 52	android/os/Parcel:recycle	()V
        //   78: aload_3
        //   79: invokevirtual 52	android/os/Parcel:recycle	()V
        //   82: aload_1
        //   83: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	84	0	this	a
        //   0	84	1	parama	a
        //   0	84	2	paramInt	int
        //   3	76	3	localParcel1	Parcel
        //   7	67	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	72	finally
        //   19	26	72	finally
        //   26	57	72	finally
      }
      
      /* Error */
      public final void c(a parama)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   34: iconst_4
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 46 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 49	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	parama	a
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
      
      /* Error */
      public final void d(a parama)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   34: iconst_5
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 46 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 49	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 52	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 52	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 52	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 52	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	parama	a
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
      
      /* Error */
      public final void e(a parama)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +43 -> 58
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   34: bipush 6
        //   36: aload_2
        //   37: aload_3
        //   38: iconst_0
        //   39: invokeinterface 46 5 0
        //   44: pop
        //   45: aload_3
        //   46: invokevirtual 49	android/os/Parcel:readException	()V
        //   49: aload_3
        //   50: invokevirtual 52	android/os/Parcel:recycle	()V
        //   53: aload_2
        //   54: invokevirtual 52	android/os/Parcel:recycle	()V
        //   57: return
        //   58: aconst_null
        //   59: astore_1
        //   60: goto -35 -> 25
        //   63: astore_1
        //   64: aload_3
        //   65: invokevirtual 52	android/os/Parcel:recycle	()V
        //   68: aload_2
        //   69: invokevirtual 52	android/os/Parcel:recycle	()V
        //   72: aload_1
        //   73: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	74	0	this	a
        //   0	74	1	parama	a
        //   3	66	2	localParcel1	Parcel
        //   7	58	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	63	finally
        //   18	25	63	finally
        //   25	49	63	finally
      }
      
      /* Error */
      public final void f(a parama)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +43 -> 58
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   34: bipush 8
        //   36: aload_2
        //   37: aload_3
        //   38: iconst_0
        //   39: invokeinterface 46 5 0
        //   44: pop
        //   45: aload_3
        //   46: invokevirtual 49	android/os/Parcel:readException	()V
        //   49: aload_3
        //   50: invokevirtual 52	android/os/Parcel:recycle	()V
        //   53: aload_2
        //   54: invokevirtual 52	android/os/Parcel:recycle	()V
        //   57: return
        //   58: aconst_null
        //   59: astore_1
        //   60: goto -35 -> 25
        //   63: astore_1
        //   64: aload_3
        //   65: invokevirtual 52	android/os/Parcel:recycle	()V
        //   68: aload_2
        //   69: invokevirtual 52	android/os/Parcel:recycle	()V
        //   72: aload_1
        //   73: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	74	0	this	a
        //   0	74	1	parama	a
        //   3	66	2	localParcel1	Parcel
        //   7	58	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	63	finally
        //   18	25	63	finally
        //   25	49	63	finally
      }
      
      /* Error */
      public final void g(a parama)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +43 -> 58
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/sq$a$a:a	Landroid/os/IBinder;
        //   34: bipush 10
        //   36: aload_2
        //   37: aload_3
        //   38: iconst_0
        //   39: invokeinterface 46 5 0
        //   44: pop
        //   45: aload_3
        //   46: invokevirtual 49	android/os/Parcel:readException	()V
        //   49: aload_3
        //   50: invokevirtual 52	android/os/Parcel:recycle	()V
        //   53: aload_2
        //   54: invokevirtual 52	android/os/Parcel:recycle	()V
        //   57: return
        //   58: aconst_null
        //   59: astore_1
        //   60: goto -35 -> 25
        //   63: astore_1
        //   64: aload_3
        //   65: invokevirtual 52	android/os/Parcel:recycle	()V
        //   68: aload_2
        //   69: invokevirtual 52	android/os/Parcel:recycle	()V
        //   72: aload_1
        //   73: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	74	0	this	a
        //   0	74	1	parama	a
        //   3	66	2	localParcel1	Parcel
        //   7	58	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	63	finally
        //   18	25	63	finally
        //   25	49	63	finally
      }
    }
  }
}


/* Location:              com/google/android/gms/b/sq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */