package JavaAppiumCucumberExtentReportsTemplate.Utils;

import JavaAppiumCucumberExtentReportsTemplate.Enums.Users;

import java.io.FileNotFoundException;
import java.io.IOException;

    public class Arquivos {
        public static Users getJsonUsers() throws FileNotFoundException{
            try{
                return Users.get("./dadosAutenticacao.json");

            } catch (FileNotFoundException ex) {
                throw new FileNotFoundException("Não foi feita a leitura do arquivo json");
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

}
