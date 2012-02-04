package com.ideasandroid.itreader;


import android.app.TabActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TabHost;
import android.widget.TextView;

public class AboutActivity extends TabActivity {

	private TextView mbtAbout=null;
	private WebView googleAdsWebView=null;
	TabHost mTabHost=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		googleAdsWebView=(WebView)findViewById(R.id.googleAdsWebView);
		mTabHost = getTabHost();
	    mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator(getText(R.string.mbt_tab_about),getResources().getDrawable(R.drawable.tab_icon_about)).setContent(R.id.mbtAbout));
	    mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator(getText(R.string.mbt_tab_cooperation),getResources().getDrawable(R.drawable.tab_icon_partner)).setContent(R.id.mbtPartner));
	    mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator(getText(R.string.mbt_tab_thanks),getResources().getDrawable(R.drawable.tab_icon_thinks)).setContent(R.id.mbtThinks));
	    
	    mTabHost.setCurrentTab(getIntent().getIntExtra("tabIndex", 0));
	    
		mbtAbout=(TextView)findViewById(R.id.mbtAbout);
		mbtAbout.setText(R.string.mbt_about);
		//mbtAbout.setMovementMethod(LinkMovementMethod.getInstance());
		TextView mbtPartner=(TextView)findViewById(R.id.mbtPartner);
		mbtPartner.setText(R.string.mbt_partner);
		//mbtPartner.setMovementMethod(LinkMovementMethod.getInstance());
		TextView mbtThinks=(TextView)findViewById(R.id.mbtThinks);
		mbtThinks.setText(R.string.mbt_thanks);
		googleAdsWebView.getSettings().setJavaScriptEnabled(true);
		googleAdsWebView.loadUrl("http://ideasapi.sinaapp.com/ad/googleads.html");
		//mbtThinks.setMovementMethod(LinkMovementMethod.getInstance());
	}

}
