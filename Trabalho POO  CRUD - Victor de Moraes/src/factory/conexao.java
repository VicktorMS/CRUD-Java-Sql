
package factory;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class conexao {
    
    public Connection getConnection(){
        
        try{
         
            //Conectado com o banco de dados do meu computador e alterado o use time para brasieliro
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useTimezone=true&serverTimezone=UTC","root","");

    
} catch(SQLException excecao){
    
    throw new RuntimeException(excecao);
    
}
    }
}
    
   
     
                
    
    
    
    