package edu.aku.hassannaqvi.chese.models

import android.database.Cursor
import android.provider.BaseColumns
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class HealthFacilities {
    var dist_id: String = ""
    var tehsilId: String = ""
    var uc_Id: String = ""
    var hfcode: String = ""
    var hf_name: String = ""

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): HealthFacilities {
        dist_id = jsonObject.getString(TableHealthFacilities.COLUMN_DISTRICT_CODE)
        tehsilId = jsonObject.getString(TableHealthFacilities.COLUMN_TEHSIL_ID)
        uc_Id = jsonObject.getString(TableHealthFacilities.COLUMN_UC_ID)
        hfcode = jsonObject.getString(TableHealthFacilities.COLUMN_HF_CODE)
        hf_name = jsonObject.getString(TableHealthFacilities.COLUMN_HF_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): HealthFacilities {
        dist_id =
            cursor.getString(cursor.getColumnIndex(TableHealthFacilities.COLUMN_DISTRICT_CODE))
        tehsilId = cursor.getString(cursor.getColumnIndex(TableHealthFacilities.COLUMN_TEHSIL_ID))
        uc_Id = cursor.getString(cursor.getColumnIndex(TableHealthFacilities.COLUMN_UC_ID))
        hfcode = cursor.getString(cursor.getColumnIndex(TableHealthFacilities.COLUMN_HF_CODE))
        hf_name = cursor.getString(cursor.getColumnIndex(TableHealthFacilities.COLUMN_HF_NAME))

        return this
    }

    object TableHealthFacilities : BaseColumns {
        const val TABLE_NAME = "public_hf"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_DISTRICT_CODE = "dist_id"
        const val COLUMN_TEHSIL_ID = "tehsil_id"
        const val COLUMN_UC_ID = "uc_id"
        const val COLUMN_HF_CODE = "hfcode"
        const val COLUMN_HF_NAME = "hf_name"
    }
}