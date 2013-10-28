package eu.deustotech.internet.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;

public class BarcodeActivity extends Activity {

	private static final String BS_PACKAGE = "com.google.zxing.client.android";
	private static final int QR_CODE_REQUEST_CODE = 5678;
	private static final int MARKET_REQUEST_CODE = 4932;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_barcode);
		getBarcodeScanner();
	}

	private void getBarcodeScanner() {
		Intent bsIntent = new Intent(BarcodeActivity.BS_PACKAGE + ".SCAN");
		bsIntent.putExtra("SCAN_MODE", "QR_CODE_MODE");
		startActivityForResult(bsIntent, BarcodeActivity.QR_CODE_REQUEST_CODE);
	}
	
	@Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == MARKET_REQUEST_CODE) {
            getBarcodeScanner();
        } else if (requestCode == QR_CODE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                String QRURI = data.getStringExtra("SCAN_RESULT");

                try {

                    //applyTemplate(QRURI);

                    Intent intent = new Intent(this, DataActivity.class);
                    intent.putExtra("URI", QRURI);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();

                    //Context context = getApplicationContext();
                    //int duration = Toast.LENGTH_LONG;
                    //Toast toast = Toast.makeText(context, R.string.qr_error, duration);
                    //toast.show();
                    //TODO: cambiar
                    //UIUtils.goHome(this);
                }
            } else {
                //TODO: cambiar
                //UIUtils.goHome(this);
            }
        }
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.barcode, menu);
		return true;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (!this.getIntent().getBooleanExtra("getBarcode", false)) {
			this.startActivity(new Intent(this, MainActivity.class));
		}
	}

}
