import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;

import java.util.jar.Attributes;

public class vazirtextviw extends AppCompatTextView {
    public vazirtextviw(Context context){
        super(context);
    }
    public vazirtextviw(Context context, AttributeSet attributeset){
        super(context,attributeset);
        Typeface vazir=Typeface.createFromAsset(context.getAssets(),"vazir.ttf");
        this.setTypeface(vazir);
    }
}
