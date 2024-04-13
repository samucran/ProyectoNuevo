package com.iud.proyectonuevo;
public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mi_base_de_datos";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE_USUARIOS = "CREATE TABLE usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, correo TEXT)";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USUARIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
