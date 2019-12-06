package sample;
import java.sql.*;

public class DbContext {
    //-------------------------------------------//
    private String dbUserName;
    private String dbPass;
    //------------------------------------------//
    private String dbDriver;
    private String dbPath;
    private String dbTable;

    private Connection connection;
//    private String dbUrl;

    public DbContext(String dbDriver, String dbPath, String dbUserName, String dbPass, String dbTable){
        this.dbDriver = dbDriver;
        this.dbPass = dbPass;
        this.dbPath = dbPath;
        this.dbUserName = dbUserName;
        this.dbTable = dbTable;
    }

    public void connectToDB() throws SQLException {
        //Connection connection;
        String dbUrl = "jdbc:" + dbDriver + ":" + dbPath;
        this.connection = DriverManager.getConnection(dbUrl, dbUserName, dbPass);
    }

    public void closeDB() throws SQLException {
        this.connection.close();
    }

    public void createBase(){
        try{
            Statement stm = connection.createStatement();
            String sql = "CREATE TABLE " + this.dbTable +
                    "(Id int not null primary key auto_increment, " +
                    " Fullname VARCHAR(255), " +
                    " Oilfield VARCHAR(255)) ";
            stm.executeUpdate(sql);

            stm.close();
            connection.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public ModelTest readById(int id){
        ModelTest modelTest = new ModelTest();
        try{
            Statement stm = connection.createStatement();
            String sql = "SELECT Fullname, Oilfield FROM " + this.dbTable + " WHERE id=" + id;
            ResultSet resultSet = stm.executeQuery(sql);

            modelTest.setFullname(resultSet.getString("Fullname"));
            modelTest.setOilfield(resultSet.getString("Oilfield"));
            stm.close();

            return modelTest;

        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return modelTest;
    }

    public void insertDB(ModelTest modelTest){
        try{
            Statement stm = connection.createStatement();
            String sql = "INSERT INTO " + this.dbTable + " VALUES (" + modelTest.getFullname() + "," + modelTest.getOilfield() + ")";
            stm.executeUpdate(sql);
            stm.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }


}
