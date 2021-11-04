package edu.aku.hassannaqvi.chese.models

import android.database.Cursor
import android.provider.BaseColumns
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class LHW {
    var district_code: String = ""
    var tehsil_code: String = ""
    var tehsil_name: String = ""
    var uc_code: String = ""
    var uc_name: String = ""
    var hf_code: String = ""
    var hf_name: String = ""
    var lhw_code: String = ""
    var lhw_name: String = ""
    var lhw_cnic: String = ""
    var lhw_supervisor: String = ""

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): LHW {
        district_code = jsonObject.getString(LHWTable.COLUMN_DISTRICT_CODE)
        tehsil_code = jsonObject.getString(LHWTable.COLUMN_TEHSIL_CODE)
        tehsil_name = jsonObject.getString(LHWTable.COLUMN_TEHSIL_NAME)
        uc_code = jsonObject.getString(LHWTable.COLUMN_UC_CODE)
        uc_name = jsonObject.getString(LHWTable.COLUMN_UC_NAME)
        hf_code = jsonObject.getString(LHWTable.COLUMN_HF_CODE)
        hf_name = jsonObject.getString(LHWTable.COLUMN_HF_NAME)
        lhw_code = jsonObject.getString(LHWTable.COLUMN_LHW_CODE)
        lhw_name = jsonObject.getString(LHWTable.COLUMN_LHW_NAME)
        lhw_cnic = jsonObject.getString(LHWTable.COLUMN_LHW_CNIC)
        lhw_supervisor = jsonObject.getString(LHWTable.COLUMN_LHW_SUPERVISOR)
        return this
    }

    fun hydrate(cursor: Cursor): LHW {
        district_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_DISTRICT_CODE))
        tehsil_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_TEHSIL_CODE))
        tehsil_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_TEHSIL_NAME))
        uc_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_UC_CODE))
        uc_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_UC_NAME))
        hf_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_HF_CODE))
        hf_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_HF_NAME))
        lhw_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_CODE))
        lhw_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_NAME))
        lhw_cnic = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_CNIC))
        lhw_supervisor = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_SUPERVISOR))

        return this
    }

    fun hydrateTehsil(cursor: Cursor): LHW {
        tehsil_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_TEHSIL_CODE))
        tehsil_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_TEHSIL_NAME))
        return this
    }

    fun hydrateUC(cursor: Cursor): LHW {
        uc_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_UC_CODE))
        uc_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_UC_NAME))
        return this
    }

    fun hydrateHF(cursor: Cursor): LHW {
        hf_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_HF_CODE))
        hf_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_HF_NAME))
        return this
    }

    fun hydrateLHW(cursor: Cursor): LHW {
        lhw_code = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_CODE))
        lhw_name = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_NAME))
        lhw_supervisor = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_SUPERVISOR))
        return this
    }

    object LHWTable : BaseColumns {
        const val TABLE_NAME = "lhw"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_DISTRICT_CODE = "dist_id"
        const val COLUMN_TEHSIL_CODE = "tehsil_id"
        const val COLUMN_TEHSIL_NAME = "tehsil"
        const val COLUMN_UC_CODE = "uc_id"
        const val COLUMN_UC_NAME = "uc_name"
        const val COLUMN_HF_CODE = "hfcode"
        const val COLUMN_HF_NAME = "hf_name"
        const val COLUMN_LHW_CODE = "lhw_code"
        const val COLUMN_LHW_NAME = "lhw_name"
        const val COLUMN_LHW_CNIC = "lhw_cnic"
        const val COLUMN_LHW_SUPERVISOR = "lhw_supervisor"
    }
}