package cl.bci.clase10oct2.service;

public class LanguajeFactory {

    private static LanguajeInterfaceSrv interfaceSrv;

    public LanguajeInterfaceSrv crear1(String lang){
        return lang.equals("english")? new EnglishSrv() : new SpanishSrv();
    }

    public static LanguajeInterfaceSrv crear(String lang){
        return lang.equals("english")? new EnglishSrv() : new SpanishSrv();
    }

    //Singleton
    public static LanguajeInterfaceSrv crear3(String lang){
        if (interfaceSrv==null){
            return lang.equals("english")? new EnglishSrv() : new SpanishSrv();
        }
        return interfaceSrv;
    }
}
