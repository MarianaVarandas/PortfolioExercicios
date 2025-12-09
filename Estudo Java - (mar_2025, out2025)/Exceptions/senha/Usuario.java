package Exceptions.senha;

public class Usuario {
    private String nome;
    private String linkFoto;
    private String linkPerfil;

    public Usuario(UsuarioAPI usuarioAPI) {
        this.nome = usuarioAPI.login();
        this.linkFoto = usuarioAPI.avatar_url();
        this.linkPerfil = usuarioAPI.html_url();
    }

    public String getNome() {
        return nome;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public String getLinkPerfil() {
        return linkPerfil;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                " Foto: " + this.getLinkFoto() +
                " Perfil no Github: " + this.getLinkPerfil();
    }
}
