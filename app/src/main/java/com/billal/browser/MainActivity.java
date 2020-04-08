package com.billal.browser;

// Lu Mau Ngapain Anjg??
// Buat Sendiri Lah goblok
// Susah payah aing coding
// Buat Yang Recode FUCEK, F-U-C-E-K, FUCEK
import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends Activity 
{
	
	private Button btn;
	private EditText url;
	private WebView webku;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		url = (EditText)findViewById(R.id.url);
		btn = (Button)findViewById(R.id.submit);
		btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view){
				webku = (WebView)findViewById(R.id.webku);
				webku.setWebViewClient(new WebViewClient());
				WebSettings webset = webku.getSettings();
				webku.loadUrl(url.getText().toString());
			}
			
		});
    }
}
