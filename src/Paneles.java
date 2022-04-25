public class Paneles {
    
    private MenuAsociados menuAsociados;
    private Inicio iniciarSesion;
    private Registro registrarse;
    private Principal menuPrincipal;
    private Eliminar eliminarRegistro;
    private Asociado asociadoSesion;
    private Perfil menuPerfil;
    private Transacciones menuTransacciones;
    private Dividendos menuDividendos;
    
    public Paneles(){
        menuAsociados = new MenuAsociados(this);
        iniciarSesion = new Inicio(this);
        registrarse = new Registro(this);
        menuPrincipal = new Principal(this);
        eliminarRegistro = new Eliminar(this);
        asociadoSesion = new Asociado(this);
        menuPerfil = new Perfil(this);
        menuTransacciones = new Transacciones(this);
        menuDividendos = new Dividendos(this);
        menuAsociados.showPanel(menuPrincipal);
        menuAsociados.setVisible(true);
    }
    
    public MenuAsociados getMenuAso(){
        return menuAsociados;
    }
    
    public Inicio getInicioSesion(){
        return iniciarSesion;
    }
    
    public Registro getRegistrarse(){
        return registrarse;
    }
    
    public Principal getMenuPrincipal(){
        return menuPrincipal;
    }
    
    public Eliminar getEliminarAsociado(){
        return eliminarRegistro;
    }
    
    public Asociado getAsociadoMenu(){
        return asociadoSesion;
    }
    
    public Perfil getMenuPerfil(){
        return menuPerfil;
    }
    
    public Transacciones getMenuTransacciones(){
        return menuTransacciones;
    }
    
    public Dividendos getMenuDividendos(){
        return menuDividendos;
    }
    
}
