package org.telegram.integration;

import org.telegram.android.StelsActivity;
import net.hockeyapp.android.UpdateManager;

/**
 * Created by ex3ndr on 22.11.13.
 */
public class TestIntegration {
    public static void initActivity(StelsActivity activity) {
        UpdateManager.register(activity, "112e895eb272d29e8af43ebff16f5565");
    }
}