package javaapplication17;


    
public class Usuario {
    private String usuario;
    private String senha;

    public Usuario() {
        usuario = "binhoo";
        senha   = "123";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean validarUsuario(String usuarioP, String senhaP){
        boolean resp = false;
        
        if(usuario.equalsIgnoreCase(usuarioP) &&
                senha.equalsIgnoreCase(senhaP)){
                resp = true;
        }
        
        return resp;
    }
}