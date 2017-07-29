package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout
  extends FrameLayout
{
  private TypedValue a;
  public final Rect b = new Rect();
  private TypedValue c;
  private TypedValue d;
  private TypedValue e;
  private TypedValue f;
  private TypedValue g;
  private a h;
  
  public ContentFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(Rect paramRect)
  {
    fitSystemWindows(paramRect);
  }
  
  public TypedValue getFixedHeightMajor()
  {
    if (f == null) {
      f = new TypedValue();
    }
    return f;
  }
  
  public TypedValue getFixedHeightMinor()
  {
    if (g == null) {
      g = new TypedValue();
    }
    return g;
  }
  
  public TypedValue getFixedWidthMajor()
  {
    if (d == null) {
      d = new TypedValue();
    }
    return d;
  }
  
  public TypedValue getFixedWidthMinor()
  {
    if (e == null) {
      e = new TypedValue();
    }
    return e;
  }
  
  public TypedValue getMinWidthMajor()
  {
    if (a == null) {
      a = new TypedValue();
    }
    return a;
  }
  
  public TypedValue getMinWidthMinor()
  {
    if (c == null) {
      c = new TypedValue();
    }
    return c;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (h != null) {
      h.a();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = 0;
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int j;
    int i1;
    int i2;
    TypedValue localTypedValue;
    label61:
    int i;
    if (widthPixels < heightPixels)
    {
      j = 1;
      i1 = View.MeasureSpec.getMode(paramInt1);
      i2 = View.MeasureSpec.getMode(paramInt2);
      if (i1 != Integer.MIN_VALUE) {
        break label495;
      }
      if (j == 0) {
        break label353;
      }
      localTypedValue = e;
      if ((localTypedValue == null) || (type == 0)) {
        break label495;
      }
      if (type != 5) {
        break label362;
      }
      i = (int)localTypedValue.getDimension(localDisplayMetrics);
    }
    for (;;)
    {
      label92:
      int m;
      int k;
      if (i > 0)
      {
        m = View.MeasureSpec.makeMeasureSpec(Math.min(i - (b.left + b.right), View.MeasureSpec.getSize(paramInt1)), 1073741824);
        k = 1;
      }
      for (;;)
      {
        i = paramInt2;
        if (i2 == Integer.MIN_VALUE)
        {
          if (j == 0) {
            break label394;
          }
          localTypedValue = f;
          label150:
          i = paramInt2;
          if (localTypedValue != null)
          {
            i = paramInt2;
            if (type != 0)
            {
              if (type != 5) {
                break label403;
              }
              paramInt1 = (int)localTypedValue.getDimension(localDisplayMetrics);
            }
          }
        }
        for (;;)
        {
          label185:
          i = paramInt2;
          if (paramInt1 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(paramInt1 - (b.top + b.bottom), View.MeasureSpec.getSize(paramInt2)), 1073741824);
          }
          super.onMeasure(m, i);
          i2 = getMeasuredWidth();
          m = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
          if ((k == 0) && (i1 == Integer.MIN_VALUE)) {
            if (j != 0)
            {
              localTypedValue = c;
              label266:
              if ((localTypedValue == null) || (type == 0)) {
                break label476;
              }
              if (type != 5) {
                break label444;
              }
              paramInt1 = (int)localTypedValue.getDimension(localDisplayMetrics);
            }
          }
          for (;;)
          {
            label297:
            paramInt2 = paramInt1;
            if (paramInt1 > 0) {
              paramInt2 = paramInt1 - (b.left + b.right);
            }
            if (i2 < paramInt2) {
              paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
            }
            for (paramInt2 = 1;; paramInt2 = n)
            {
              if (paramInt2 != 0) {
                super.onMeasure(paramInt1, i);
              }
              return;
              j = 0;
              break;
              label353:
              localTypedValue = d;
              break label61;
              label362:
              if (type != 6) {
                break label504;
              }
              i = (int)localTypedValue.getFraction(widthPixels, widthPixels);
              break label92;
              label394:
              localTypedValue = g;
              break label150;
              label403:
              if (type != 6) {
                break label490;
              }
              paramInt1 = (int)localTypedValue.getFraction(heightPixels, heightPixels);
              break label185;
              localTypedValue = a;
              break label266;
              label444:
              if (type != 6) {
                break label485;
              }
              paramInt1 = (int)localTypedValue.getFraction(widthPixels, widthPixels);
              break label297;
              label476:
              paramInt1 = m;
            }
            label485:
            paramInt1 = 0;
          }
          label490:
          paramInt1 = 0;
        }
        label495:
        k = 0;
        m = paramInt1;
      }
      label504:
      i = 0;
    }
  }
  
  public void setAttachListener(a parama)
  {
    h = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              android/support/v7/widget/ContentFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */