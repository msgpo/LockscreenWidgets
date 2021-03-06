package tk.zwander.lockscreenwidgets.prefs

import android.content.Context
import android.util.AttributeSet
import androidx.preference.ListPreference

class AutoSummaryListPreference(context: Context, attrs: AttributeSet) : ListPreference(context, attrs) {
    override fun setValue(value: String) {
        super.setValue(value)

        summary = entries[entryValues.indexOf(value)]
    }
}