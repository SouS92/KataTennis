package io.codiying.tenniskata.BackKataTennis;

/**
 * @author Tonys
 * 21/02/2019
 * @project Back-KataTennis
 */
public enum ScorePoint {

    LOVE("Love"),FIFTEEN("15"),THIRTY("30"),FORTY("40"),DEUCE("DEU"),ADV("ADV"),WIN("WIN");

    private String score;

    private ScorePoint(String o){
        this.score = o;
    }


    public String getScore(){
        return this.score;
    }



}
