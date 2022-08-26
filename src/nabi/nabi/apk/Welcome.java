package nabi.nabi.apk;

import nabi.nabi.apk.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;


public class Welcome extends Activity implements OnClickListener {
	Button met_muqodimah, met_launch, met_about, met_exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_welcome);

		/* Muqodimah */
		met_muqodimah = (Button) findViewById(R.id.met_muqodimah);
		met_muqodimah.setOnClickListener(new View.OnClickListener(){
			
			public void onClick(View Muqodimah) {
				Intent myIntent = new Intent(Muqodimah.getContext(), Muqodimah.class);
				startActivityForResult(myIntent, 0);
			}
		});
		/* Launch */
		met_launch = (Button) findViewById(R.id.met_launch);
		met_launch.setOnClickListener(new View.OnClickListener(){
			
			public void onClick(View Launch) {
				Intent myIntent = new Intent(Launch.getContext(), Launch.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		/* About */
		met_about = (Button) findViewById(R.id.met_about);
		met_about.setOnClickListener(new View.OnClickListener(){

			public void onClick(View About) {
				Intent myIntent = new Intent(About.getContext(), About.class);
				startActivityForResult(myIntent, 0);
			}
		});
	
		/* Exit */
		met_exit = (Button) findViewById(R.id.met_exit);
		met_exit.setOnClickListener(this);
	}

	/* Aktivitas ketika tombol ditekan */
	@Override
	public void onClick(View clicked) {
		// TODO Auto-generated method stub
		switch (clicked.getId()){
		//case R.id.met_about :
		//	aboutdialog();
		//	break;
		case R.id.met_exit :
			exit();
			break;
		}
	}
	/*
	private void aboutdialog() {
		// TODO Auto-generated method stub
		AlertDialog.Builder dialog = new AlertDialog.Builder(this);
		dialog.setTitle("About");
		dialog.setMessage("Aplikasi 25 Nabi Dari Al-Quran\n" +
				"Nama 	: Moh. Nazar Agliyono\n" +
				"NPM	: 54410462\n" +
				"Kelas	: 3IA06")
		.setCancelable(false)
		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
			}
		}).show();
	}
	*/
	private void exit() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Apakah kamu ingin keluar?")
		.setCancelable(false)
		.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				// start the home screen if the back button wasn't pressed already
				finish();
				Intent intent = new Intent(Welcome.this, Wassalaamualaikum.class);
		        Welcome.this.startActivity(intent);
			}
		})
		
		.setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int arg1) {
				// TODO Auto-generated method stub
				dialog.cancel();
				} 
		}).show();
	}
}