package edu.aku.hassannaqvi.chese.models

import android.database.Cursor
import android.provider.BaseColumns
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 10/31/2016.
 * @update ali.azaz
 */
class Districts {
    var provinceCode: String = ""
    var provinceName: String = ""
    var districtCode: String = ""
    var districtName: String = ""

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Districts {
        provinceCode = jsonObject.getString(TableDistricts.COLUMN_PROVINCE_CODE)
        provinceName = jsonObject.getString(TableDistricts.COLUMN_PROVINCE_NAME)
        districtCode = jsonObject.getString(TableDistricts.COLUMN_DISTRICT_CODE)
        districtName = jsonObject.getString(TableDistricts.COLUMN_DISTRICT_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): Districts {
        provinceCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_PROVINCE_CODE))
        provinceName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_PROVINCE_NAME))
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_CODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_NAME))
        return this
    }

    object TableDistricts : BaseColumns {
        const val TABLE_NAME = "District"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_PROVINCE_CODE = "pro_id"
        const val COLUMN_PROVINCE_NAME = "province"
        const val COLUMN_DISTRICT_CODE = "district_code"
        const val COLUMN_DISTRICT_NAME = "district_name"
    }
}