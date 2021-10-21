
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Riswan Agam
 * @NIM 191011400122
 * @Tugas UAS
 */
public class RiswanAgam_Database {
    /*
        Inisialisasi url, user, password 
        digunakan untuk masuk ke dalam database.
    
        @url  : sesuaikan dengan url database di komputer masing-masing.
        @user : sesuaikan dengan user database di komputer masing-masing.
        @password : sesuaikan dengan password database di komputer masing-masing.
    */
    private final String url = "jdbc:mysql://localhost:3306/database_riswanagam";
    private final String user = "root";
    private final String password = "password"; 
    public RiswanAgam_Database() {} 
    /*
       Connection = menghubungkan ke database.
       Statement = untuk execute syntax dari SQL.
       ResultSet = mengambil hasil dari statment.
    */
    private Connection conn;
    private Statement stat;
    private ResultSet result;
    public void setResult(ResultSet result) {
        this.result = result;
    }
    public Connection getConn() {
        return conn;
    }
    public Statement getStat() {
        return stat;
    }
    public ResultSet getResult() {
        return result;
    }
    public String getUrl() {
        return url;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    } 
    public void connection() {
        try {
          Class.forName("com.mysql.cj.jdbc.Driver"); /* Memanggil class Driver
                pada library.
            @param url  : sesuaikan dengan url database di komputer masing-masing.
            @param user : sesuaikan dengan user database di komputer masing-masing.
            @param password : sesuaikan dengan password database di komputer masing-masing.
          */
          conn = DriverManager.getConnection(url, user, password); // Menghubungkan aplikasi dengan database
          stat = conn.createStatement();
        } catch(ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "RiswanAgam_Database{" + "url=" + url + ", user=" + user + ", password=" + password + '}';
    }
}
