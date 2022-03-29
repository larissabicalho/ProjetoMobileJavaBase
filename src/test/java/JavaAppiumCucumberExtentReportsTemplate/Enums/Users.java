package JavaAppiumCucumberExtentReportsTemplate.Enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.File;
import java.io.IOException;

@NoArgsConstructor(force = true)
public class Users {
    @NonNull
    @JsonProperty("user")
    private String user;

    @NonNull
    @JsonProperty("senha")
    private String senha;

    @NonNull
    @JsonProperty("userErrado")
    private String userErrado;

    @NonNull
    @JsonProperty("senhaErrada")
    private String senhaErrada;


    public static Users get(String arquivo) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(arquivo), Users.class);
    }

    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

    public String getSenhaErrada() {
        return senhaErrada;
    }

    public String getUserErrado() {
        return userErrado;
    }

}