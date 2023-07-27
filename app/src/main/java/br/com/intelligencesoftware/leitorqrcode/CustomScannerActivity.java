package br.com.intelligencesoftware.leitorqrcode;

import com.google.zxing.integration.android.IntentIntegrator;
import com.journeyapps.barcodescanner.CaptureActivity;

public class CustomScannerActivity extends CaptureActivity {
    @Override
    public void onBackPressed() {
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setOrientationLocked(false);
        integrator.initiateScan();
    }
}
