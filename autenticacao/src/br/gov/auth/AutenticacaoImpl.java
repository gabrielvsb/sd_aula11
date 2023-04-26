package br.gov.auth;

public class AutenticacaoImpl implements Autenticacao {
    
    @Override
    public Usuario logar(String login, String senha){
        Usuario usuario;
        if(login.equals("root") && senha.equals("1234")){
            usuario = new Usuario(login, senha);
            return usuario;
        }
        return null;
    }
}
