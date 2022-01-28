package Logica;

import BaseDatos.BDconexion;
import Datos.Semilla;
import java.sql.*;

public class ControlSemilla {

    public void agregarSemilla(Semilla mSemilla) throws SQLException {
        String SQL = "insert into semilla values "
                + "(null,'?1','?2','?3')";
        SQL = SQL.replace("?1", mSemilla.getNombre_semilla());
        SQL = SQL.replace("?2", mSemilla.getDescripcion());
        SQL = SQL.replace("?3", String.valueOf(mSemilla.getPrecio_kg()));

        BDconexion mConexion = new BDconexion();
        mConexion.conectar();
        mConexion.ejecutarActualizacion(SQL);

    }

    public void eliminarSemilla(Semilla mSemilla) throws SQLException {
        String SQL = "delete from semilla where idsemilla='?1'";
        SQL = SQL.replace("?1", String.valueOf(mSemilla.getIdsemilla()));
        BDconexion mConexion = new BDconexion();
        mConexion.conectar();
        mConexion.ejecutarActualizacion(SQL);
    }

    public void modificarSemilla(Semilla mSemilla) throws SQLException {
        String SQL = "update semilla set "
                + "nombre_semilla='?1',"
                + "descripcion='?2',"
                + "precio_kg='?3' "
                + " where idsemilla='?4'";
        SQL = SQL.replace("?1", mSemilla.getNombre_semilla());
        SQL = SQL.replace("?2", mSemilla.getDescripcion());
        SQL = SQL.replace("?3", String.valueOf(mSemilla.getPrecio_kg()));
        SQL = SQL.replace("?4", String.valueOf(mSemilla.getIdsemilla()));
        BDconexion mConexion = new BDconexion();
        mConexion.conectar();
        mConexion.ejecutarActualizacion(SQL);

    }

    public ResultSet consultarTodasSemillas() {
        String SQL = "select * from semilla";
        ResultSet ListaSemillas;
        BDconexion mConexion = new BDconexion();
        mConexion.conectar();
        ListaSemillas = mConexion.ejecutarConsulta(SQL);

        return ListaSemillas;
    }
}
