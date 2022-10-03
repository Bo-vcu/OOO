package domain;

public class CodeerContext {
    private String tekst;
    private CodeerStrategy codeerStrategy;

    public CodeerContext(String tekst) {
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public String codeer(){
        return codeerStrategy.codeer(tekst);
    }
    public String decodeer(){
        return codeerStrategy.decodeer(tekst);
    }
    public void setCodeerStrategy(CodeerStrategy codeerStrategy){
        this.codeerStrategy = codeerStrategy;
    }
}
