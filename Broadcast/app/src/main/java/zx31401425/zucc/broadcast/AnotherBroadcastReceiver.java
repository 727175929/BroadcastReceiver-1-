package zx31401425.zucc.broadcast;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 赵轩 on 2017/7/9.
 */

public class AnotherBroadcastReceiver extends BootCompleteReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"received in AnotherBroadcastReceiver",Toast.LENGTH_SHORT).show();
    }
}
