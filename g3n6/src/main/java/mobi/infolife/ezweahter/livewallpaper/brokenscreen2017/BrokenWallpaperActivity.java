package mobi.infolife.ezweahter.livewallpaper.brokenscreen2017;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;

import mobi.infolife.ezweather.livewallpaper.brokenscreen2017.R;

public class BrokenWallpaperActivity extends PreferenceActivity {

//    private Intent intent;
    /*- ********************************************************************************** */
/*- *********** OVERRIDE ************* */
/*- ********************************************************************************** */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
//	    intent=new Intent(this,BrokenWallpaperService.class);
//        startService(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
/*- ********************************************************************************** */
/*- *********** PRIVATE ************* */
/*- ********************************************************************************** */



}
