package com.example.actividades

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Heroe(val nombre: String, val nivel: Int, val vida: Int) : Parcelable {

    /**override fun describeContents(): Int = 0
    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(nombre)
        dest.writeInt(nivel)
        dest.writeInt(vida)
    }
    companion object CREATOR : Parcelable.Creator<Heroe>{
        override fun createFromParcel(parcel: Parcel): Heroe = Heroe(
            nombre = parcel.readString() ?: "",
            nivel = parcel.readInt(),
            vida = parcel.readInt()
        )

        override fun newArray(size: Int): Array<Heroe?>  = arrayOfNulls(size)
        }**/

    }

